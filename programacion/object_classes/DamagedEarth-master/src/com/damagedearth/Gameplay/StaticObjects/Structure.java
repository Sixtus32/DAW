/*******************************************************************************
 * This is a free program developed and managed by The Predators Development Team. This
 * source code should have a copy of the GNU General Public License. If it does not,
 * please see <http://www.gnu.org/licenses/>. The Predators Development Team forums is
 * located at <http://thepredators.endofinternet.net/index.php>.
 ******************************************************************************/

package com.damagedearth.Gameplay.StaticObjects;

import com.damagedearth.Utilities.Tesselator;
import com.damagedearth.Worlds.AbstractWorld;
import org.lwjgl.opengl.GL11;

import java.awt.image.BufferedImage;

public class Structure
{
    private BufferedImage outerImage, innerImage;
    private int x, y, width, height, doorX, doorY, doorWidth, doorHeight;
    private String doorPosition;
    private boolean containsPlayer = false;
    private AbstractWorld currentWorld;

    public Structure(String outerImage, String innerImage, int x, int y, int width, int height, String position, AbstractWorld currentWorld)
    {
        //this.outerImage = TextureLoader.loadImage(outerImage);
        //this.innerImage = TextureLoader.loadImage(innerImage);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        this.doorPosition = position;
        if (position.equalsIgnoreCase("top"))
        {
            this.doorWidth = width / 2;
            this.doorHeight = 20;
            this.doorX = x + ((((x + width) - x) / 2) - doorWidth / 2);
            this.doorY = y;
        }
        else if (position.equalsIgnoreCase("bottom"))
        {
            this.doorWidth = width / 2;
            this.doorHeight = 20;
            this.doorX = x + ((((x + width) - x) / 2) - doorWidth / 2);
            this.doorY = y - height + doorHeight;
        }
        else if (position.equalsIgnoreCase("right"))
        {
            this.doorWidth = 20;
            this.doorHeight = height / 2;
            this.doorX = x + width - doorWidth;
            this.doorY = y - height / 2 + doorHeight / 2;
        }
        else
        {
            this.doorWidth = 20;
            this.doorHeight = height / 2;
            this.doorX = x;
            this.doorY = y - height / 2 + doorHeight / 2;
        }
        this.currentWorld = currentWorld;
    }

    public void update()
    {
        render();
        checkPlayer();
    }

    private void render()
    {
        Tesselator tesselator = new Tesselator();
        tesselator.set(x, y, x + width, y - height);
        tesselator.setColor(1, 0, 0);
        if (this.containsPlayer)
        {
            tesselator.setAlpha(0.3F);
        }
        else
        {
            tesselator.setAlpha(1);
        }
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        tesselator.drawQuad();
        GL11.glDisable(GL11.GL_BLEND);
        tesselator = new Tesselator();
        //Render door
        tesselator.set(doorX, doorY, doorX + doorWidth, doorY - doorHeight);
        tesselator.setColor(1, 1, 1, 1);
        tesselator.drawQuad();
    }

    private void checkPlayer()
    {
        double leftSidePlyr = currentWorld.thePlayer.getX();
        double rightSidePlyr = currentWorld.thePlayer.getX() + currentWorld.thePlayer.getWidth();
        double topPlyr = currentWorld.thePlayer.getY();
        double bottomPlyr = currentWorld.thePlayer.getY() - currentWorld.thePlayer.getHeight();

        int leftSide = this.x;
        int rightSide = this.x + this.width;
        int top = this.y;
        int bottom = this.y - this.height;

        containsPlayer = rightSidePlyr >= leftSide && leftSidePlyr <= rightSide && topPlyr >= bottom && bottomPlyr <= top;
    }

    public AbstractWorld getCurrentWorld()
    {
        return currentWorld;
    }

    public void setCurrentWorld(AbstractWorld currentWorld)
    {
        this.currentWorld = currentWorld;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public boolean containsPlayer()
    {
        return containsPlayer;
    }

    public int getDoorHeight()
    {
        return doorHeight;
    }

    public void setDoorHeight(int doorHeight)
    {
        this.doorHeight = doorHeight;
    }

    public int getDoorX()
    {
        return doorX;
    }

    public void setDoorX(int doorX)
    {
        this.doorX = doorX;
    }

    public int getDoorY()
    {
        return doorY;
    }

    public void setDoorY(int doorY)
    {
        this.doorY = doorY;
    }

    public int getDoorWidth()
    {
        return doorWidth;
    }

    public void setDoorWidth(int doorWidth)
    {
        this.doorWidth = doorWidth;
    }

    public String getDoorPosition()
    {
        return doorPosition;
    }

    public void setDoorPosition(String doorPosition)
    {
        this.doorPosition = doorPosition;
    }
}
