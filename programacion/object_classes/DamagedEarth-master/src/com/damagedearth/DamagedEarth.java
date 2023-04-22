/*******************************************************************************
 * This is a free program developed and managed by The Predators Development Team. This
 * source code should have a copy of the GNU General Public License. If it does not,
 * please see <http://www.gnu.org/licenses/>. The Predators Development Team forums is
 * located at <http://thepredators.endofinternet.net/index.php>.
 ******************************************************************************/

package com.damagedearth;

import com.damagedearth.Gui.Components.GuiScreen;
import com.damagedearth.Gui.GuiMainMenu;
import com.damagedearth.Gui.GuiOverlay;
import com.damagedearth.Utilities.FontRenderer;
import com.damagedearth.Utilities.H1FontRenderer;
import com.damagedearth.Utilities.H2FontRenderer;
import com.damagedearth.Utilities.PlayerFileManager;
import com.damagedearth.Worlds.AbstractWorld;
import com.damagedearth.Worlds.CrystalForest;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

import static org.lwjgl.opengl.GL11.*;

public class DamagedEarth
{
    /**
     * TODO: Quest chains
     * TODO: NPC image(s)
     * TODO: Levels
     */

    public int width;
    public int height;

    public static FontRenderer fontRenderer;
    public static H1FontRenderer h1FontRenderer;
    public static H2FontRenderer h2FontRenderer;

    public GuiScreen currentScreen;
    public AbstractWorld currentWorld;

    //An instance of the player manager. Records all information related to the player
    public PlayerFileManager plyrManager;

    private GuiOverlay guiOverlay;

    public DamagedEarth(int width, int height)
    {
        this.width = width;
        this.height = height;
        this.plyrManager = new PlayerFileManager("player-location", "player-quests", "player-class", this);
        this.guiOverlay = new GuiOverlay(this);
    }

    public void startGame()
    {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~GAME START INITIATED~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //Loads the CrystalForest world on start up.
        this.loadWorld(new CrystalForest(100, 900, this));
        this.loadDisplay();

        //This is the game update. Rendering is done here along with other tasks that need to be called repeatedly
        while (!Display.isCloseRequested())
        {
            this.update();
            Display.update();
            //Cuts off un-necessary FPS. Reduces CPU Power needed to run this game
            Display.sync(60);
        }

        //Quits the game
        Display.destroy();
        System.out.println("~~~~~~~~~~~~~~~~~");
        System.out.println("~~~GAME ENDING~~~");
        System.out.println("~~~~~~~~~~~~~~~~~");
        System.exit(0);
    }

    //Loads the display
    public void loadDisplay()
    {
        try
        {
            Display.setDisplayMode(new DisplayMode(width, height));
            Display.setResizable(false);
            Display.create();
            glEnable(GL11.GL_COLOR_MATERIAL);
            glDisable(GL11.GL_DITHER);
            glEnable(GL11.GL_NORMALIZE);
            glHint(GL11.GL_PERSPECTIVE_CORRECTION_HINT, GL11.GL_NICEST);
            glHint(GL11.GL_POLYGON_SMOOTH_HINT, GL11.GL_NICEST);
            glViewport(0, 0, (int) this.width, (int) this.height);
            glMatrixMode(GL_PROJECTION);
            glLoadIdentity();
            glOrtho(0, width, 0, height, 0, 25);
            glMatrixMode(GL_MODELVIEW);
            fontRenderer = new FontRenderer();
            h1FontRenderer = new H1FontRenderer();
            h2FontRenderer = new H2FontRenderer();
            //This switches to the main menu on startGame up
            this.switchScreen(new GuiMainMenu(this, "DamagedEarth"));
        }
        catch (LWJGLException e)
        {
            e.printStackTrace();
        }
    }

    /*
    Main game update
     */
    public void update()
    {
        glClear(GL_COLOR_BUFFER_BIT);

        if (this.currentScreen == null)
        {
            this.guiOverlay.update();
            glTranslated(-AbstractWorld.TRANSLATE_MODIFIER_X, -AbstractWorld.TRANSLATE_MODIFIER_Y, 0);

            AbstractWorld.TRANSLATE_MODIFIER_X = 0;
            AbstractWorld.TRANSLATE_MODIFIER_Y = 0;

            //This will update and (re)render the current world
            this.currentWorld.updateAndRender();
        }
        else
        {
            //This will update the current screen
            this.currentScreen.updateScreen();
        }
    }

    public void switchScreen(GuiScreen screen)
    {
        /*
        Switches the current gui screen.
         */
        try
        {
            if (screen == null)
            {
                this.currentScreen = null;
                return;
            }
            this.currentScreen = screen;
            this.currentScreen.setUpGUI();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void loadWorld(AbstractWorld world)
    {
        /*
        This loads the world and all entities within it. This will not switch to the world until you call switchScreen(null)
         */
        System.out.println("Loading world: " + world.getClass().getName());
        this.currentWorld = world;
        this.currentWorld.loadWorld();
        System.out.println("Loaded world: " + world.getClass().getName());
    }
}
