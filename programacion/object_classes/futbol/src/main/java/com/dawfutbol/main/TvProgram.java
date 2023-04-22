/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawfutbol.main;

import com.dawfutbol.gui.ScreenDisplay;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 * The TvProgram class has a series of Layers, 
 * one of them TheMatch class. 
 * These layers will show a series of effects 
 * as well as what happens in the game.
 * @author s6x
 */
public class TvProgram extends JPanel {
    private static final long serialVersionUID = 1L;
    private final ScreenDisplay display; 
    
    public TvProgram(ScreenDisplay display) {
        this.display=display;
        this.setBackground(Color.yellow);
        this.setSize(500, 700);
//        this.setLocationRelativeTo(null);
    }
    
    

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); 
        RenderingHints renderingHint=new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        Graphics2D graphics=(Graphics2D) g;
        graphics.setRenderingHints(renderingHint);
        // display the players that are playing.
        new Field().draw(graphics);              
    }
    
    
}
