/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawfutbol.gui;

import com.dawfutbol.gui.components.UserInfoButton;
import com.dawfutbol.main.UserInfo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author s6x
 */
public final class MainMenuHeader extends Layer {

    private static final long serialVersionUID = 1L;
    
    private QueriesSectButton queriesSectButton;
    private ShoppingSectButton shoppingSectButton;
    private UserInfoButton userQueriesSectButton;
    
    private final Layer mainLayer;
    
    private UserInfo userInfo;


    public MainMenuHeader(UserInfo userInfo, Layer layer) {
        setBackground(new Color(0,true));
        this.mainLayer=layer;
        setPreferredSize(new Dimension(Menu.MAIN_MENU_HEADER_WIDTH, 100));
        this.userInfo=userInfo;
        
        initComponents();
        addComponents();
    }

    @Override
    protected void initComponents() {
        this.queriesSectButton=new QueriesSectButton(1);
        this.shoppingSectButton=new ShoppingSectButton();
        this.userQueriesSectButton=new UserInfoButton(this.userInfo,mainLayer);
    }
    
    private void addComponents(){
        setLayout(new BorderLayout(100, 100));
        add(this.queriesSectButton, BorderLayout.WEST);
        add(this.shoppingSectButton, BorderLayout.CENTER);
        add(this.userQueriesSectButton, BorderLayout.EAST);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); 
        Graphics2D g2d=(Graphics2D) g;
        Rectangle2D r=new Rectangle2D.Float(0, 0, getWidth(), (getHeight() - 30));
        g2d.setColor(new Color(13, 13, 13));
        g2d.fill(r);
    }
    
}
