/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawfutbol.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JPanel;

/**
 *
 * @author s6x
 */
public final class MainMenuSection extends Layer {
    
    private SectOptionLayer sectOpt;
    private SectNotificationArea notifArea;
    
    public MainMenuSection(Layer layer) {
        setBackground(new Color(0,true));
        setPreferredSize(new Dimension(700, 350));
        setFocusable(false);
        setFocusCycleRoot(false);
        initComponents();
        addComponents();
        
        
    }

    @Override
    protected void initComponents() {   
        sectOpt=new SectOptionLayer();
        notifArea=new SectNotificationArea();  
    }
    
    private void addComponents(){
        setLayout(new BorderLayout(28, 28));
        JPanel panelHelper=new JPanel();
        panelHelper.setPreferredSize(new Dimension(8, 200));
        panelHelper.setBackground(new Color(0, true));
        add(panelHelper, BorderLayout.WEST);
        add(sectOpt,BorderLayout.CENTER);
        add(notifArea, BorderLayout.EAST);
    }
    
}
