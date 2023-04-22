/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawfutbol.gui;

import javax.swing.JPanel;

/**
 *
 * @author s6x
 */
public abstract class Layer extends JPanel{  
    private static final long serialVersionUID = 1L;

    public Layer() {
    }
    
    protected abstract void initComponents();
}
