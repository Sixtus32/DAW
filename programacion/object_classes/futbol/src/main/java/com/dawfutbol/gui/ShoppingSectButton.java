/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawfutbol.gui;

import com.dawfutbol.gui.components.ShopButton;
import com.dawfutbol.gui.components.StylishButton;
import com.dawfutbol.main.FolderManeger;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

/**
 *
 * @author s6x
 */
public final class ShoppingSectButton extends Layer{
    
    private static final long serialVersionUID = 1L;
    private StylishButton shopPromotionButton;
    private ShopButton shopCoinButton;
    private ShopButton shopGemsButton;

    public ShoppingSectButton() {
        setPreferredSize(new Dimension((int)(Menu.MAIN_MENU_HEADER_WIDTH * 0.75), 80));
        setBackground(new Color(0,true));
        initComponents();
        addComponents();
    }

    @Override
    protected void initComponents() {
        shopPromotionButton=new StylishButton(  FolderManeger.ICON_FOLDER+"021-uno.png",
                                                StylishButton.DEFAULT_W,
                                                StylishButton.DEFAULT_H
                                                );
        
        shopGemsButton=new ShopButton(  FolderManeger.ICON_FOLDER+"002-diamond-1.png",
                                        110,40);
        
        shopCoinButton=new ShopButton(FolderManeger.ICON_FOLDER+"008-coin-1.png",
                                        110,40);
    }
    
    private void addComponents(){
        this.setLayout(new FlowLayout(FlowLayout.TRAILING, 20, 20));
        add(shopPromotionButton);
        add(shopGemsButton);
        add(shopCoinButton);
    }
    
    
    
}
