/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawfutbol.gui;

import com.dawfutbol.gui.components.StylishButton;
import com.dawfutbol.main.FolderManeger;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

/**
 *
 * @author s6x
 */
public final class QueriesSectButton extends Layer{
    
    // ESTA CLASE SE COMPONEN DE TRES TIPOS DE BOTONES.
    protected static StylishButton button1;
    protected static StylishButton button2;
    protected static StylishButton button3;

    // id para la clase.
    private static final long serialVersionUID = 1L;
    
    private int type;

    public QueriesSectButton(int defaultType) {
//        setPreferredSize(new Dimension(layer.getWidth(), 80));
        
        this.type=defaultType;
        setBackground(new Color(0,true));
        initComponents();
        addComponents();
    }
    
    @Override
    protected void initComponents() {
        button1=new StylishButton(  FolderManeger.ICON_FOLDER+"004-question.png", 
                                    StylishButton.DEFAULT_W, 
                                    StylishButton.DEFAULT_H
                                    );
        
        button2=new StylishButton(  FolderManeger.ICON_FOLDER+"003-gear.png", 
                                    StylishButton.DEFAULT_W, 
                                    StylishButton.DEFAULT_H
                                    );
        
        button3=new StylishButton(  FolderManeger.ICON_FOLDER+"007-work-in-progress.png", 
                                    StylishButton.DEFAULT_W, 
                                    StylishButton.DEFAULT_H
                                    );
    }
    
    private void addComponents(){
        setLayout(new FlowLayout(FlowLayout.LEADING, 20, 20));
        add(button1);
        add(button2);
        add(button3);
        
    }
    
    
    
}
