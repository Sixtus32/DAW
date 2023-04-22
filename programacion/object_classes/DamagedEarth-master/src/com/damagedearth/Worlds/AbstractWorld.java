/*******************************************************************************
 * This is a free program developed and managed by The Predators Development Team. This
 * source code should have a copy of the GNU General Public License. If it does not,
 * please see <http://www.gnu.org/licenses/>. The Predators Development Team forums is
 * located at <http://thepredators.endofinternet.net/index.php>.
 ******************************************************************************/

/*******************************************************************************
 * This is a free program developed and managed by The Predators Development Team. This
 * source code should have a copy of the GNU General Public License. If it does not,
 * please see <http://www.gnu.org/licenses/>. The Predators Development Team forums is
 * located at <http://thepredators.endofinternet.net/index.php>.
 ******************************************************************************/

package com.damagedearth.Worlds;

import com.damagedearth.DamagedEarth;
import com.damagedearth.Entities.Components.Entity;
import com.damagedearth.Entities.EntityPlayerController;
import com.damagedearth.Gameplay.Quests.BasicQuest;
import com.damagedearth.Gameplay.StaticObjects.Structure;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractWorld
{
    public static int VIEW_CORDS_X = 0;
    public static int VIEW_CORDS_Y = 0;
    public static double TRANSLATE_MODIFIER_X = 0;
    public static double TRANSLATE_MODIFIER_Y = 0;
    /*
     The sole purpose of this list is for the getCorrespondingQuest() method.
     */
    List<BasicQuest> allWorldQuests = new ArrayList<BasicQuest>();

    protected int spawnX, spawnY;
    public EntityPlayerController thePlayer;
    protected List<Entity> entityList = new ArrayList<Entity>();
    protected List<Structure> structureList = new ArrayList<Structure>();

    public DamagedEarth damagedEarth;

    public AbstractWorld(int spawnX, int spawnY, DamagedEarth damagedEarth)
    {
        this.spawnX = spawnX;
        this.spawnY = spawnY;
        this.damagedEarth = damagedEarth;
        thePlayer = new EntityPlayerController(40, 45, this);
    }

    public abstract void loadWorld();

    /**
     * Updates all entities and objects in the world
     */
    public void updateAndRender()
    {
        this.scrollWorld(this.thePlayer.getX(), this.thePlayer.getY());
        try
        {
            for (Entity entity : this.entityList)
            {
                entity.onLivingUpdate();
            }

            //Draw structures on top of the player so when the structure becomes transparent the player achieves the "inside room" effect
            this.thePlayer.onLivingUpdate();
            for (Structure structure : this.structureList)
            {
                structure.update();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * The viewing area has specific coordinates(bottom left). If the player gets near the end of the viewing area,
     * it will scroll and increase the coordinates of the viewing area to the direction the player is going.
     */
    private void scrollWorld(double playerX, double playerY)
    {
        if (playerX >= (VIEW_CORDS_X + damagedEarth.width) - 300)
        {
            TRANSLATE_MODIFIER_X = 2;
            VIEW_CORDS_X += 2;
        }
        else if (playerX <= (VIEW_CORDS_X) + 300)
        {
            TRANSLATE_MODIFIER_X = -2;
            VIEW_CORDS_X -= 2;
        }

        if (playerY >= (VIEW_CORDS_Y + damagedEarth.height) - 100)
        {
            TRANSLATE_MODIFIER_Y = 2;
            VIEW_CORDS_Y += 2;
        }
        else if (playerY <= (VIEW_CORDS_Y) + 100)
        {
            TRANSLATE_MODIFIER_Y = -2;
            VIEW_CORDS_Y -= 2;
        }
    }

    public BasicQuest getCorrespondingQuest(String questName)
    {
        for (BasicQuest quest : this.allWorldQuests)
        {
            if (quest.getQuestName().equalsIgnoreCase(questName))
            {
                return quest;
            }
        }
        return null;
    }

    public int getSpawnX()
    {
        return spawnX;
    }

    public void setSpawnX(int spawnX)
    {
        this.spawnX = spawnX;
    }

    public int getSpawnY()
    {
        return spawnY;
    }

    public void setSpawnY(int spawnY)
    {
        this.spawnY = spawnY;
    }

    public List<Entity> getEntityList()
    {
        return entityList;
    }

    public List<Structure> getStructureList()
    {
        return structureList;
    }
}
