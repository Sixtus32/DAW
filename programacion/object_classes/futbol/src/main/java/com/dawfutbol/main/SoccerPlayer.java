/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawfutbol.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Ellipse2D;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * The SoccerPlayer class is to create a soccer player who will play on a soccer team.
 * @author s6x
 * @version 1.0.0
 * @since  1.0
 * @see Field
 * @see Energy
 * @see Country
 * @see SkilledLeg
 * @see PlayerPosition
 */
public class SoccerPlayer extends Entity implements Drawable{
    /**
     * The player's ID 
     */
    private int playerID;
    /**
     * The player's name
     */
    private String playerName;
    /**
     * The player's image
     */
    private Image playerImage;
    /**
     * The player's country of origin
     */
    private Country playerCountry;
    /**
     * The player's bib number
     */
    private byte playerNumber;
    /**
     * The dimensions that the player will occupy on the field
     */
    private final Dimension PLAYER_DIMENSION;
    /**
     * The player's energy 
     */
    private Energy playerEnergy;
    /**
     * The player skills
     */
    private float [] playerSkills;
    /**
     * Position of the player on the field
     */
    private PlayerPosition playerPosition;
    /**
     * The player's skilled leg
     */
    private SkilledLeg playerSkilledLeg;
    /**
     * The player's level based on their skills
     */
    private float playerPersonalRating;
    /**
     * Call for a match
     */
    private boolean summoned;
    /**
     * Physical state of the player
     */
    private boolean injured;
    
    /**
     * Number of skills availble to the player
     */
    private static final int NUMBER_SKILLS=8;
    
    private int positionX;
    private int positionY;
    
    /**
     * Creates an instance of SoccerPlayer establishing the number
     * of skills that the player will have as well as the energy, 
     * the dimension that he will occupay on the field of play.
     * Each SoccerPlayer instance is initially NOT summoned or injured.
     */
    public SoccerPlayer() {
        this.playerSkills=new float[NUMBER_SKILLS];
        this.PLAYER_DIMENSION=new Dimension(100, 100);
        this.playerEnergy=new Energy();
        this.summoned=false;
        this.injured=false;
    }
    /**
     * Creates a SoccerPlayer and initializes it with a series of specified parameters.
     * @param playerID the player's specified ID
     * @param playerName the player's specified name
     * @param playerImagePathname the player's image pathname
     * @param playerCountry the player's specified country of origin 
     * @param playerNumber the number of the player
     * @param playerPosition the position in the field occupied by the player
     * @param playerSkilledLeg the player's well-specified leg
     * @param playerSkills the player's specific skills
     */
    public SoccerPlayer(int playerID, 
                        String playerName,
                        String playerImagePathname,
                        Country playerCountry, 
                        byte playerNumber, 
                        PlayerPosition playerPosition, 
                        SkilledLeg playerSkilledLeg, 
                        float[] playerSkills) {
        this();
        this.playerID=playerID;
        this.playerName=playerName;
        this.playerCountry=playerCountry;
        this.playerNumber=playerNumber;
        this.playerSkilledLeg=playerSkilledLeg;
        this.playerPosition=playerPosition;
        this.playerSkills = playerSkills;
        playerLevelCalculation();
//        this.playerEnergy.consumeEnergy(this);

        //We look in the resources folder within player for the existence of a '.png' image.
        File folder=new File("res/image/player/");
        File [] files=folder.listFiles();
        // if folder exist do this... if not create it.
        if (folder.exists()){
            for (File file : files) {
            if(file.getName().equals(playerImagePathname)){
                System.out.println("The image of the player " + this.playerName + 
                                   " has been successfully found");
                try {
                    playerImage=ImageIO.read(new File(folder.getPath() + playerImagePathname));
                    System.out.println("Image assignment successful.");
                } catch (IOException ex) {
                    System.out.println("Failed image assignment.");
                }
                break;
            }
        }
        }else {
            File folderRoot1=new File("res");
            File folder1=new File(folderRoot1, "playerImage");
            if(folder1.mkdirs()){
                System.out.println("Folders created successfully."); 
            }  
            System.out.println("The folders could not ");
            
        }
        
//        playerImage=Toolkit.getDefaultToolkit().createImage("res/image/player/"+playerImagePathname.toLowerCase()+".png");
    }    
    /**
     * Calculate the total level of the player based on their skills
     */
    private void playerLevelCalculation(){
        float sumOfSkills=0;
        for (int i = 0; i < playerSkills.length; i++) {
            sumOfSkills+=playerSkills[i];       
        }
        this.playerPersonalRating=sumOfSkills/NUMBER_SKILLS;
    }   
    /**
     * Indicates if the player was called up to the match
     * @return true if this soccer player was summoned; false otherwise
     */
    public boolean isSummoned() {
        return summoned;
    }
    /**
     * Determine if the soccer player will be summoned
     * @param summoned convocation status
     */
    public void setSummoned(boolean summoned) {
        this.summoned = summoned;
    }
    /**
     * Indicates if the player was injured
     * @return true if this player was injured; false otherwise
     */
    public boolean isInjured() {
        return injured;
    }
    /**
     * Establishes an injury to the player; to be used in the Match 
     * class or actions that takes places in this class
     * @param injured injured status
     */
    public void setInjured(boolean injured) {
        this.injured = injured;
    }
    /**
     * Returns a string representation of the values of this SoccerPlayer
     * object's fields. This method is intended to be used for debugging 
     * purposes only and for performing certain queries.
     * @return a string representation of this SoccerPlayer info
     */
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void draw(Graphics2D g2d) {
        Ellipse2D playerDraw=new Ellipse2D.Double(playerID, playerID, PLAYER_DIMENSION.width, PLAYER_DIMENSION.height);
//        g2d.setFont(new Font("serif", Font.BOLD, 12));
        g2d.setFont(new Font("Consolas", Font.PLAIN, 24));
        g2d.drawString(""+this.playerNumber, 10, 10);
        g2d.setColor(Color.red);
        g2d.fill(playerDraw);
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }
    
    public void setPlayerPosition(int x, int y){
        this.positionX=x;
        this.positionY=y;
    }
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
