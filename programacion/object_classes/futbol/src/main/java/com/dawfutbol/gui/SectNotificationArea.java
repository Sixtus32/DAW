/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawfutbol.gui;

import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author s6x
 */
public class SectNotificationArea extends Layer{

    public SectNotificationArea() {
        setBackground(Color.cyan);
        setPreferredSize(new Dimension(300, 200));
//        setFocusPainted(false);
        setFocusable(false);
//        setContentAreaFilled(false);
        setOpaque(false);
    }
    
    
    @Override
    protected void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
