/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawfutbol.main;

/**
 *
 * @author s6x
 */
public class Wallet {
    
    private static final short MAXIMUM_CAPACITY=9999;
    private static final short MINUMUM_CAPACITY=0;
    
    private short currentGems;
    private short currentCoin;

    public Wallet() {
        this.currentCoin=MINUMUM_CAPACITY;
        this.currentGems=MINUMUM_CAPACITY;
    }

    public short getCurrentGems() {
        return currentGems;
    }
    
    public short getCurrentCoin() {
        return currentCoin;
    }

    public void increaseCoin(short amount){        
        this.currentCoin = amount >= 0  && (currentCoin + amount) < MAXIMUM_CAPACITY 
              ? currentCoin+=amount 
              : currentCoin;  
    }
    
    public void decreaseCoin(short amount){
        this.currentCoin=amount > 0 && (currentCoin - amount) != MINUMUM_CAPACITY
                ? currentCoin-=amount
                : currentCoin;             
    }
    // for animation propuse
    public void increaseByOneCoin(){
        if(currentCoin < MAXIMUM_CAPACITY ){
            this.currentCoin++;
        }
    }
    
    public void decreaseByOneCoin(){
        if(this.currentCoin > 0){
            this.currentCoin--;
        }
    }
    
    public void increaseGems(short amount){        
        this.currentGems = amount >= 0  && (currentGems + amount) < MAXIMUM_CAPACITY 
              ? currentGems+=amount 
              : amount;  
    }
    
    public void decreaseGems(short amount){
        this.currentGems=amount > 0 && (currentGems - amount) != MINUMUM_CAPACITY
                ? currentGems-=amount
                : currentGems;
    }
    
    // for animation propuse.
    public void increaseByOneGems(){
        if(currentCoin < MAXIMUM_CAPACITY ){
            this.currentCoin++;
        }
    }
    
    public void decreaseByOneGems(){
        if(this.currentGems > 0){
            this.currentGems--;
        }
    }
    
    
}
