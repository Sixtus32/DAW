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
import com.damagedearth.Entities.Components.EntityEnemy;
import com.damagedearth.Entities.Components.EntityNPC;
import com.damagedearth.Gameplay.Quests.BasicQuest;
import com.damagedearth.Gameplay.Quests.SlayingQuest;
import com.damagedearth.Gameplay.StaticObjects.Structure;
import com.damagedearth.Utilities.ImageLoader;
import com.damagedearth.Utilities.Tesselator;

import java.awt.*;
import java.util.Iterator;

public class CrystalForest extends AbstractWorld
{
    /*
    All entity's in this world
     */
    Entity npcDumbbottom;
    Entity enemyTreegiant1;
    Entity enemyTreegiant2;
    Entity enemyTreegiant3;
    Entity enemyGoblin1;
    Entity enemyGoblin2;

    /*
    All quests that correspond to the NPC's in this world: @npcName@questName@chainNumber
     */
    BasicQuest dumbottomTraining1;
    BasicQuest dumbottomTraining2;

    /*
    All the structures that belong to the world
     */
    Structure structure1;

    public CrystalForest(int spawnX, int spawnY, DamagedEarth damagedEarth)
    {
        super(spawnX, spawnY, damagedEarth);
    }

    /*
    Initiate all entities, quests, and structures.
     */
    @Override
    public void loadWorld()
    {
        //Initialize all NPC's and their quests
        this.npcDumbbottom = new EntityNPC("Dumbottom", thePlayer, 205, 880, 50, 50, damagedEarth, null, null, null, null);
        this.dumbottomTraining1 = new SlayingQuest(thePlayer, "Training1", (EntityNPC) this.npcDumbbottom, "Treegiant", 3);
        this.dumbottomTraining2 = new SlayingQuest(thePlayer, "Training2", (EntityNPC) this.npcDumbbottom, "Goblin", 2);

        ((EntityNPC) this.npcDumbbottom).addGui();

        this.enemyTreegiant1 = new EntityEnemy("Treegiant", thePlayer, 50, 500, 900, 50, 60, damagedEarth, new Point(700, 100), new Point(500, 100), null, null, 1.5, 3);
        this.enemyTreegiant2 = new EntityEnemy("Treegiant", thePlayer, 50, 200, 700, 50, 60, damagedEarth, new Point(500, 900), new Point(200, 700), null, null, 1.5, 3);
        this.enemyTreegiant3 = new EntityEnemy("Treegiant", thePlayer, 50, 500, 1000, 50, 60, damagedEarth, new Point(700, 1000), new Point(500, 1000), null, null, 1.5, 3);
        this.enemyGoblin1 = new EntityEnemy("Goblin", thePlayer, 30, 300, 100, 50, 60, damagedEarth, new Point(500, 100), new Point(1000, 100), new Point(1000, -200), new Point(300, 100), 1.5, 5);
        this.enemyGoblin2 = new EntityEnemy("Goblin", thePlayer, 30, -300, 100, 50, 60, damagedEarth, new Point(0, 100), new Point(0, -100), new Point(0, 0), new Point(-300, 100), 1.5, 5);

        this.structure1 = new Structure("", "", 150, 940, 150, 120, "left", this);

        this.entityList.add(npcDumbbottom);
        this.entityList.add(enemyTreegiant1);
        this.entityList.add(enemyTreegiant2);
        this.entityList.add(enemyTreegiant3);
        this.entityList.add(enemyGoblin1);
        this.entityList.add(enemyGoblin2);

        this.structureList.add(structure1);

        //Loads every NPC's data from the file. This MUST be called here.
        Iterator<Entity> eItr = this.entityList.iterator();
        while (eItr.hasNext())
        {
            Entity entity = eItr.next();

            if (entity instanceof EntityNPC)
            {
                entity.getNPCInstance().loadData();
            }
        }
        //This is for the file FW
        this.allWorldQuests.add(this.dumbottomTraining1);

        //This loads the player into the world with all proper data. This method MUST be called here
        if (!damagedEarth.plyrManager.load(thePlayer))
        {
            thePlayer.teleport(this.getSpawnX(), this.getSpawnY());
            System.out.println("[Player] Error loading the player data file: loaded default values instead");
        }
    }
}
