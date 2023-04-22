/*******************************************************************************
 * This is a free program developed and managed by The Predators Development Team. This
 * source code should have a copy of the GNU General Public License. If it does not,
 * please see <http://www.gnu.org/licenses/>. The Predators Development Team forums is
 * located at <http://thepredators.endofinternet.net/index.php>.
 ******************************************************************************/

package com.damagedearth.Entities;

import com.damagedearth.Entities.Components.Entity;
import com.damagedearth.Entities.Components.EntityEnemy;
import com.damagedearth.Entities.Components.EntityNPC;
import com.damagedearth.Gameplay.Quests.BasicQuest;
import com.damagedearth.Gameplay.StaticObjects.Structure;
import com.damagedearth.Utilities.*;
import com.damagedearth.Worlds.AbstractWorld;
import org.lwjgl.input.Keyboard;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EntityPlayerController
{
    /**
     * @variable x   The x coordinates of the player
     * @variable y   The y coordinates of the player
     * @variable width   The width of the player
     * @variable height   The height of the plater
     * @variable health   The current health of the player
     * @variable level   The current level of the player
     * @variable xp   The XP of the player currently has (resets with every new level)
     * @variable isDead   Is the player dead?
     * @variable targetedEntity   The current entity the player has targeted
     * @variable playerClass   The gameplay class the player has chosen
     * @variable currentWorld   The current world which the player is at
     * @variable ownedQuests   All the quests the player currently has
     * @variable averageDamage   The average damage the player deals to enemies
     * @variable damageModifier   The greatest possible random damage a player can deal to enemies
     * @variable keyStates   Used for keyboard
     * @variable speed   The speed of the player
     * @variable currentPlayerImage   The image the player currently has rendered
     * @variable lastDirection   The last direction the player faced
     */
    private double x, y, width, height;
    private int health;
    private int level;
    private int xp;
    private boolean isDead;
    private Entity targetedEntity;
    private EnumPlayerClass playerClass;
    private AbstractWorld currentWorld;
    private List<BasicQuest> ownedQuests = new ArrayList<BasicQuest>();
    private int averageDamage;
    private int damageModifier;
    private boolean keyStates[];
    private float speed;
    private BufferedImage currentPlayerImage = ImageLoader.loadImage("res/Player/Soldier/soldier.png");
    /*
    0 = starting position
    1 = right
    2 = left
    3 = up
    4 = down
     */
    private int lastDirection;

    /**
     * @param width        The width of the player
     * @param height       The height of the player
     * @param currentWorld The world the player currently is
     */
    public EntityPlayerController(double width, double height, AbstractWorld currentWorld)
    {
        currentPlayerImage = ImageLoader.loadImage("res/Player/Soldier/soldier.png");

        this.width = width;
        this.height = height;
        this.speed = 1.5F;
        this.currentWorld = currentWorld;
        this.keyStates = new boolean[256];
        this.lastDirection = 0;
        this.averageDamage = 3;
        this.health = 55;
        this.damageModifier = 6;
        this.isDead = false;
        targetedEntity = null;
    }

    /*
     * Updates the player (handles input, renders player, and checks if (s)he's dead)
     */
    public void onLivingUpdate()
    {
        if (!isDead)
        {
            this.handleInput();
            this.renderPlayer();
            this.checkDeath();
        }
    }

    private void checkDeath()
    {
        if (health <= 0)
        {
            isDead = true;
        }
    }

    private boolean checkKey(int i)
    {
        return Keyboard.isKeyDown(i) != keyStates[i] && (keyStates[i] = !keyStates[i]);
    }

    /**
     * This renders the player according to his x and y coordinates
     */
    private void renderPlayer()
    {
        Tesselator tesselator = new Tesselator();
        tesselator.set(x, y, x + width, y - height);
        tesselator.drawTextQuad(currentPlayerImage);
    }

    /**
     * @param x The x offset the player should move by
     * @param y The y offset the player should move by
     */
    public void move(double x, double y)
    {
        this.x += x;
        this.y += y;
    }

    public void teleport(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * @param quest The quest the player will accept
     */
    public void acceptQuest(BasicQuest quest)
    {
        this.ownedQuests.add(quest);
        //quest.getQuestGiver().getCurrentQuests().remove(quest);
        System.out.println("[Player] Accepted quest: " + quest.getQuestName());
    }

    public void abandonQuest(BasicQuest quest)
    {
        this.ownedQuests.remove(quest);
    }

    public void finishQuest(BasicQuest quest)
    {
        this.ownedQuests.remove(quest);
        //Remove the quest from the NPC after the player turns it in
        quest.getQuestGiver().getCurrentQuests().remove(quest);
        System.out.println("[Player] Player has turned in quest (" + quest.getQuestName() + ") to NPC (" + quest.getQuestGiver().getEntityName() + ")");
    }

    /*
    This method will attack an enemy
     */
    public void attackEnemy(EntityEnemy entityEnemy)
    {
        if (Math.sqrt(MathHelper.getDistanceSq(this.x, this.y, entityEnemy.getX(), entityEnemy.getY())) < 150)
        {
            try
            {
                int randomDamageModifier = new Random().nextInt(this.damageModifier);
                int finalDamage = this.averageDamage + randomDamageModifier;

                entityEnemy.damage(finalDamage);
            }
            catch (NullPointerException e)
            {
                System.out.println("[Player] You cannot attack that target");
            }
        }
        else
        {
            System.out.println("[Player] Not close enough to the target");
        }
    }

    private void handleInput()
    {
        this.keyInput();
        this.handleMouseInput();
    }

    private void handleMouseInput()
    {
        if (MouseHelper.getMouseClick(0))
        {
            for (Entity e : this.currentWorld.getEntityList())
            {
                if (MouseHelper.insideArea(e.getX(), e.getY(), e.getWidth(), e.getHeight()))
                {
                    this.setTargetedEntity(e);
                    System.out.println("Entity targeted: " + e.getEntityName());
                }
            }
        }
    }

    private void handleMovement(int direction, float x, float y)
    {
        double testLocX = this.x + x;
        double testLocY = this.y + y;

        double leftSidePlyr = testLocX;
        double rightSidePlyr = testLocX + currentWorld.thePlayer.getWidth();
        double topPlyr = testLocY;
        double bottomPlyr = testLocY - currentWorld.thePlayer.getHeight();

        //The closest building to the player
        Structure structure = currentWorld.getStructureList().get(0);

        //Sets structure to the closest building
        for (Structure s : currentWorld.getStructureList())
        {
            double currentDistance = Math.sqrt(MathHelper.getDistanceSq(s.getX(), s.getY(), testLocX, testLocY));

            if (currentDistance < Math.sqrt(MathHelper.getDistanceSq(structure.getX(), structure.getY(), testLocX, testLocY)))
            {
                structure = s;
            }
        }

        //Left wall cords
        int leftSideWall1 = structure.getX();
        int rightSideWall1 = structure.getX() + structure.getDoorWidth();
        int topWall1 = structure.getY();
        int bottomWall1 = structure.getY() - structure.getHeight();

        //TODO: Walls are decided by door positions, but the door position might be on the top or bottom.
        //Right wall cords
        int leftSideWall2 = structure.getX() + structure.getWidth() - structure.getDoorWidth();
        int rightSideWall2 = structure.getX() + structure.getWidth();
        int topWall2 = structure.getY();
        int bottomWall2 = structure.getY() - structure.getHeight();

        //Top wall cords
        int leftSideWall3 = structure.getX();
        int rightSideWall3 = structure.getX() + structure.getWidth();
        int topWall3 = structure.getY();
        double bottomWall3 = structure.getY() - (structure.getDoorPosition().equalsIgnoreCase("top") ? structure.getDoorHeight() : structure.getHeight() / 3.55);

        int leftSideWall4 = structure.getX();
        int rightSideWall4 = structure.getX() + structure.getWidth();
        double topWall4 = structure.getY() - structure.getHeight() + (structure.getDoorPosition().equalsIgnoreCase("bottom") ? structure.getDoorHeight() : structure.getHeight() / 3.55);
        int bottomWall4 = structure.getY() - structure.getHeight();

        //Door cords
        int leftSideDoor = structure.getDoorX();
        int rightSideDoor = structure.getDoorX() + structure.getDoorWidth();
        //Offset the door's coordinates by 12 (the player's left-over space above his head), so he collides correctly)
        int topDoor = structure.getDoorY() + 12;
        int bottomDoor = structure.getDoorY() - structure.getDoorHeight();
        String doorPosition = structure.getDoorPosition();

        if (rightSidePlyr >= leftSideWall1 && rightSidePlyr <= rightSideWall1 && ((topPlyr <= topWall1 && topPlyr >= bottomWall1) || (bottomPlyr >= bottomWall1 && bottomPlyr <= topWall1)))
        {
            if (doorPosition.equalsIgnoreCase("left"))
            {
                if (!(((rightSidePlyr >= leftSideDoor && rightSidePlyr <= rightSideDoor) || (leftSidePlyr <= rightSideDoor && leftSidePlyr >= leftSideDoor)) && (topPlyr <= topDoor && topPlyr >= bottomDoor && bottomPlyr >= bottomDoor && bottomPlyr <= topDoor)))
                {
                    return;
                }
            }
            else
            {
                return;
            }
        }

        //Checks if the player collides with the right wall
        if (leftSidePlyr <= rightSideWall2 && leftSidePlyr >= leftSideWall2 && ((topPlyr <= topWall2 && topPlyr >= bottomWall2) || (bottomPlyr >= bottomWall2 && bottomPlyr <= topWall2)))
        {
            if (doorPosition.equalsIgnoreCase("right"))
            {
                //Check if the player is colliding with the door only if the door is on the right side.
                if (!(((leftSidePlyr <= rightSideDoor && leftSidePlyr >= leftSideDoor) || (rightSidePlyr >= leftSideDoor && rightSidePlyr <= rightSideDoor)) && (topPlyr <= topDoor && topPlyr >= bottomDoor && bottomPlyr >= bottomDoor && bottomPlyr <= topDoor)))
                {
                    return;
                }
            }
            else
            {
                return;
            }
        }

        if (bottomPlyr <= topWall3 && bottomPlyr >= bottomWall3 && ((rightSidePlyr >= leftSideWall3 && rightSidePlyr <= rightSideWall3) || (leftSidePlyr <= rightSideWall3 && leftSidePlyr >= leftSideWall3)))
        {
            return;
        }

        if (topPlyr >= bottomWall4 && topPlyr <= topWall4 && ((rightSidePlyr >= leftSideWall4 && rightSidePlyr <= rightSideWall4) || (leftSidePlyr <= rightSideWall4 && leftSidePlyr >= leftSideWall4)))
        {
            return;
        }

        this.move(x, y);
    }

    private void keyInput()
    {
        int direction = 0;

        try
        {
            if (Keyboard.isKeyDown(Keyboard.KEY_LEFT))
            {
                direction = Keyboard.KEY_LEFT;
                handleMovement(direction, -speed, 0);
                currentPlayerImage = ImageLoader.loadImage("res/Player/Soldier/soldier-left.png");
            }
            if (Keyboard.isKeyDown(Keyboard.KEY_DOWN))
            {
                direction = Keyboard.KEY_DOWN;
                handleMovement(direction, 0, -speed);
                currentPlayerImage = ImageLoader.loadImage("res/Player/Soldier/soldier.png");
            }
            if (Keyboard.isKeyDown(Keyboard.KEY_RIGHT))
            {
                direction = Keyboard.KEY_RIGHT;
                handleMovement(direction, speed, 0);
                currentPlayerImage = ImageLoader.loadImage("res/Player/Soldier/soldier-right.png");
            }
            if (Keyboard.isKeyDown(Keyboard.KEY_UP))
            {
                direction = Keyboard.KEY_UP;
                handleMovement(direction, 0, speed);
                currentPlayerImage = ImageLoader.loadImage("res/Player/Soldier/soldier-back.png");
            }
            if (this.checkKey(Keyboard.KEY_1))
            {
                this.attackEnemy(this.targetedEntity.getEnemyInstance());
            }
            if (this.checkKey(Keyboard.KEY_S))
            {
                System.out.println("[Player] Saving the players data...");
                this.currentWorld.damagedEarth.plyrManager.update(this);
                System.out.println("[Player] Saved the players data.");

                for (Entity e : this.currentWorld.getEntityList())
                {
                    if (e instanceof EntityNPC)
                    {
                        e.getNPCInstance().saveData();
                    }
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void damage(int health)
    {
        if (!isDead)
        {
            this.health -= health;
        }
    }

    /**
     * Checks if the player less then 70 pixels away from a entity
     *
     * @return Returns true if the player is less than 70 pixels away
     */
    public boolean nearEntity(Entity entity)
    {
        return Math.sqrt(MathHelper.getDistanceSq(this.x, this.y, entity.getX(), entity.getY())) <= 70;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public boolean isDead()
    {
        return isDead;
    }

    public void setDead(boolean dead)
    {
        isDead = dead;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public int getHealth()
    {
        return health;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }

    public int getDamageModifier()
    {
        return damageModifier;
    }

    public void setDamageModifier(int damageModifier)
    {
        this.damageModifier = damageModifier;
    }

    public int getAverageDamage()
    {
        return averageDamage;
    }

    public void setAverageDamage(int averageDamage)
    {
        this.averageDamage = averageDamage;
    }

    public float getSpeed()
    {
        return speed;
    }

    public void setSpeed(float speed)
    {
        this.speed = speed;
    }

    public int getXp()
    {
        return xp;
    }

    public void setXp(int xp)
    {
        this.xp = xp;
    }

    public void addXp(int xp)
    {
        this.xp += xp;
    }

    public void removeXp(int xp)
    {
        this.xp -= xp;
    }

    public List<BasicQuest> getOwnedQuests()
    {
        return ownedQuests;
    }

    public EnumPlayerClass getPlayerClass()
    {
        return playerClass;
    }

    public void setPlayerClass(EnumPlayerClass playerClass)
    {
        this.playerClass = playerClass;
    }

    public Entity getTargetedEntity()
    {
        return targetedEntity;
    }

    public void setTargetedEntity(Entity targetedEntity)
    {
        this.targetedEntity = targetedEntity;
    }

    public PlayerFileManager getPlyManager()
    {
        return currentWorld.damagedEarth.plyrManager;

    }
}