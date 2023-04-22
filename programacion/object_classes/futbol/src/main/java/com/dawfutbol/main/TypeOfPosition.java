/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.dawfutbol.main;

import java.awt.Color;

/**
 *
 * @author s6x
 */
public enum TypeOfPosition {
    ATTACKER(Color.red),
    MIDFIELDER(Color.yellow),
    DEFENDER(Color.green),
    GOALIE(Color.blue);
    
    private TypeOfPosition(Color positionColor) {   
        this.positionColor=positionColor;
    }

    public Color getPositionColor() {
        return positionColor;
    }
    
    private final Color positionColor;
}
