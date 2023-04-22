/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawfutbol.components.field;

import com.dawfutbol.main.Field;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 * This abstract class allow us to collect the attributes shared by the parts 
 * that make up the soccer field
 * @author s6x
 */
public abstract class FieldComponent {
    private final Field fieldGround;

    public FieldComponent(Field field) {
        this.fieldGround=field;
    }
    
    /**
     * Draw a specific part of the soccer field
     */
    public abstract void drawFieldComponent();
}
