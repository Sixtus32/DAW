/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawfutbol.main;

import java.awt.Color;

/**
 * The Energy class encapsulates the maximum and minumum
 * energy that a player can have. And it collects the state 
 * of coloration of the player's energy before an injury.
 * @author s6x
 * @since 1.0
 * @see SoccerPlayer
 */
public class Energy {
    /**
     * The maximum amount of energy a player can have
     */
    private static final float MAXIMUM_CAPACITY=100;
    /**
     * The minimum amount of energy a player can have; 
     * own of having suffered an injury
     */
    private static final float MINUMUM_CAPACITY=0.0f;
    /**
     * The amount of current energy available
     */
    private float currentEnergy;
    
    // energy color states.
    
    /**
     * Full energy bar color
     */
    private final Color fullEnergyColor;
    /**
     * Color of the energy bar in medium state 
     */
    private final Color mediumEnergyColor;
    /**
     * Low energy bar color
     */
    private final Color lowEnergyColor;
    /**
     * Energy bar color emptied
     */
    private final Color weakEnergyColor;
    
    /**
     * Builds a player's energy bar in an initially full state
     */
    public Energy() {
        this.currentEnergy=MAXIMUM_CAPACITY;
        this.fullEnergyColor=Color.GREEN;
        this.mediumEnergyColor=Color.ORANGE;
        this.lowEnergyColor=Color.RED;
        this.weakEnergyColor=Color.WHITE;
    }
    /**
     * Fill up the energy bar
     */
    public void fullChargeEnergy(){
        this.currentEnergy=MAXIMUM_CAPACITY;
    }
    /**
     * Empty the energy bar 
     */
    public void emptyEnergy(){
        this.currentEnergy=MINUMUM_CAPACITY;
    }
    /**
     * Indicates if the energy bar is empty 
     * @return true if the energy bar is empty; false otherwise
     */
    public boolean isEmpty(){
        return this.currentEnergy == 0;
    }
    /**
     * Consumes the energy bar of the chosen player is which is playing
     * @param player the chosen player
     */
    public void consumeEnergy(SoccerPlayer player){
        while(!isEmpty() && !player.isInjured() && player.isSummoned()){
            this.currentEnergy-=0.01f;
        }
        System.out.println("SE QUEDO SIN ENERGÍA POR LO QUE ESTA LESIONADO.");
    }
    /**
     * Return the current amount of remaining energy
     * @return the current amount of energy
     */
    public float getCurrentEnergy() {
        return currentEnergy;
    }   
    /**
     * Return a specific color based on the amount of energy available 
     * @return a color based on the amount of current power remaining
     */
    public Color energyColor() {     
        if (this.currentEnergy <= 100 && this.currentEnergy >= 80){
            return this.fullEnergyColor;
        }else if (this.currentEnergy < 80 && this.currentEnergy >= 50){
            return this.mediumEnergyColor;
        }else if (this.currentEnergy < 50 && this.currentEnergy >= 25){
            return this.lowEnergyColor;
        }else {
            return weakEnergyColor;
        }
    }

}
