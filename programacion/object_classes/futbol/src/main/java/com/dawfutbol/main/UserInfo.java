/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawfutbol.main;

import java.awt.Image;

/**
 *
 * @author s6x
 */
public class UserInfo {
    private String userName;
    private String teamName;
    private float teamAssessment;
    private int stadiumCapacity;
    private int numberOfStars;
    
    private int numberOfGoldAward;
    private int numberOfSilverAward;
    private int numberOfBronzeAward;
    
    private Country userCountry;
    private String [] emojis;
    private UserRecord record;
    private short  coinAmount;
    private short diamondAmount;
    
   private Image shieldImage;

    public UserInfo(String userName, String teamName, float teamAssessment, int stadiumCapacity, int numberOfStars) {
        this.userName = userName;
        this.teamName = teamName;
        this.teamAssessment = teamAssessment;
        this.stadiumCapacity = stadiumCapacity;
        this.numberOfStars = numberOfStars;
        
        
    }
    
    

    public String getUserName() {
        return userName;
    }

    public String getTeamName() {
        return teamName;
    }

    public float getTeamAssessment() {
        return teamAssessment;
    }

    public int getStadiumCapacity() {
        return stadiumCapacity;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public int getNumberOfGoldAward() {
        return numberOfGoldAward;
    }

    public int getNumberOfSilverAward() {
        return numberOfSilverAward;
    }

    public int getNumberOfBronzeAward() {
        return numberOfBronzeAward;
    }

    public Country getUserCountry() {
        return userCountry;
    }

    public String[] getEmojis() {
        return emojis;
    }

    public UserRecord getRecord() {
        return record;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setTeamAssessment(float teamAssessment) {
        this.teamAssessment = teamAssessment;
    }

    public void setStadiumCapacity(int stadiumCapacity) {
        this.stadiumCapacity = stadiumCapacity;
    }

    public void setNumberOfStars(int numberOfStars) {
        if(numberOfStars < 5){
            this.numberOfStars = numberOfStars;
        }else{
            this.numberOfStars=1;
        }
        
    }

    public void setNumberOfGoldAward(int numberOfGoldAward) {
        this.numberOfGoldAward = numberOfGoldAward;
    }

    public void setNumberOfSilverAward(int numberOfSilverAward) {
        this.numberOfSilverAward = numberOfSilverAward;
    }

    public void setNumberOfBronzeAward(int numberOfBronzeAward) {
        this.numberOfBronzeAward = numberOfBronzeAward;
    }

    public void setUserCountry(Country userCountry) {
        this.userCountry = userCountry;
    }

    public void setEmojis(String[] emojis) {
        this.emojis = emojis;
    }

    public void setRecord(UserRecord record) {
        this.record = record;
    }

    public void setShieldImage(Image shieldImage) {
        this.shieldImage = shieldImage;
    }
    
    public void increaseStart(){
        if(this.numberOfStars < 5){
            this.numberOfStars++;
        }else{
            System.out.println("No puedes incrementarlo mas.");
        }
    }
    

    @Override
    public String toString() {
        return "UserInfo{" + "userName=" + userName + ", teamName=" + teamName + ", teamAssessment=" + teamAssessment + ", stadiumCapacity=" + stadiumCapacity + ", numberOfStars=" + numberOfStars + ", numberOfGoldAward=" + numberOfGoldAward + ", numberOfSilverAward=" + numberOfSilverAward + ", numberOfBronzeAward=" + numberOfBronzeAward + ", userCountry=" + userCountry + ", emojis=" + emojis + ", record=" + record + ", shieldImage=" + shieldImage + '}';
    }
    
    
    
    
}
