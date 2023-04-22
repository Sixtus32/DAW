/*******************************************************************************
 * This is a free program developed and managed by The Predators Development Team. This
 * source code should have a copy of the GNU General Public License. If it does not,
 * please see <http://www.gnu.org/licenses/>. The Predators Development Team forums is
 * located at <http://thepredators.endofinternet.net/index.php>.
 ******************************************************************************/

package com.damagedearth.Utilities;

import com.damagedearth.DamagedEarth;
import com.damagedearth.Entities.EntityPlayerController;
import com.damagedearth.Entities.EnumPlayerClass;
import com.damagedearth.Gameplay.Quests.BasicQuest;
import com.damagedearth.Gameplay.Quests.SlayingQuest;
import com.damagedearth.Utilities.Components.FileConfiguration;

import java.io.IOException;

public class PlayerFileManager
{
    /**
     * This file is for managing all file configuration that has to do with the player
     */
    private String locationsName;
    private String questsName;
    private String className;

    private FileConfiguration locationConfiguration;
    private FileConfiguration questsConfiguration;
    private FileConfiguration classConfiguration;

    private DamagedEarth damagedEarth;

    public PlayerFileManager(String locationsName, String questsName, String className, DamagedEarth damagedEarth)
    {
        this.locationsName = locationsName;
        this.questsName = questsName;
        this.className = className;
        this.locationConfiguration = new FileConfiguration(this.locationsName + ".txt");
        this.questsConfiguration = new FileConfiguration(this.questsName + ".txt");
        this.classConfiguration = new FileConfiguration(this.className + ".txt");
        this.damagedEarth = damagedEarth;
    }

    public void update(EntityPlayerController thePlayer)
    {
        this.updateQuests(thePlayer);
        this.updateLocation(thePlayer);
    }

    public boolean load(EntityPlayerController thePlayer)
    {
        return this.loadLocation(thePlayer) && this.loadQuests(thePlayer);
    }

    /**
     * Updates the players location to a file and encodes it
     * TODO: Save the current world the player is in along with his/her location
     *
     * @param thePlayer An instance of a player to use for saving location
     */
    public void updateLocation(EntityPlayerController thePlayer)
    {
        try
        {
            if (locationConfiguration.getFile().exists())
            {
                locationConfiguration.decode();
            }
            locationConfiguration.writeln(String.format("loc:%s:%s", thePlayer.getX(), thePlayer.getY()), false);

            locationConfiguration.encode();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Decodes the file and loads the players location into xCord and yCord. Teleports the player to the proper location.
     *
     * @param thePlayer An instance of the player
     * @return True if the file successfully loads without any errors (aka. If the file exists)
     */
    public boolean loadLocation(EntityPlayerController thePlayer)
    {
        try
        {
            locationConfiguration.decode();
            double xCord = Double.parseDouble(locationConfiguration.getLineValue("loc:").split(":")[1]);
            double yCord = Double.parseDouble(locationConfiguration.getLineValue("loc:").split(":")[2]);
            thePlayer.teleport(xCord, yCord);
            locationConfiguration.encode();
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public void updateQuests(EntityPlayerController thePlayer)
    {
        try
        {
            //If the file exists then we will decode it and then clear it
            if (questsConfiguration.getFile().exists())
            {
                //questsConfiguration.decode();
                //Reset the file to we can rewrite
                questsConfiguration.clear();
            }
            //Loop through each quests and append the name and value to the end of the line
            for (BasicQuest quest : thePlayer.getOwnedQuests())
            {
                if (quest instanceof SlayingQuest)
                {
                    questsConfiguration.writeln(String.format("%s:%s", quest.getQuestName(), quest.getSlayingQuestInstance().getAmount()), true);
                }
            }
            //questsConfiguration.encode();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public boolean loadQuests(EntityPlayerController thePlayer)
    {
        try
        {
            //questsConfiguration.decode();

            //Loops through every line and gets the corresponding quest for the data that line contains. Eventually adds the quest to the player's current quests.
            for (int i = 1; i <= questsConfiguration.getLastLine(); i++)
            {
                if (!questsConfiguration.getLineValue(i).isEmpty())
                {
                    String currentQuestName = questsConfiguration.getLineValue(i).split(":")[0];
                    int currentAmount = Integer.parseInt(questsConfiguration.getLineValue(i).split(":")[1]);

                    BasicQuest currentQuest = damagedEarth.currentWorld.getCorrespondingQuest(currentQuestName);
                    currentQuest.getSlayingQuestInstance().setAmount(currentAmount);
                    if (currentQuest.getSlayingQuestInstance().getAmount() <= 0) currentQuest.setComplete(true);
                    thePlayer.acceptQuest(currentQuest);
                }
            }

            //questsConfiguration.encode();
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    public void rewriteClass(EnumPlayerClass enumPlayerClass)
    {
        try
        {
            classConfiguration.writeln(enumPlayerClass.toString(), false);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public boolean loadClass(EntityPlayerController thePlayer)
    {
        if (hasChosenClass())
        {
            try
            {
                thePlayer.setPlayerClass(EnumPlayerClass.getClassByString(classConfiguration.getLineValue(1)));
                return true;
            }
            catch (IOException e)
            {
                e.printStackTrace();
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    public boolean hasChosenClass()
    {
        return classConfiguration.getFile().exists();
    }
}
