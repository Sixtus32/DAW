/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawfutbol.gui;

import com.dawfutbol.gui.components.FooterButton;
import com.dawfutbol.interfaces.Designable;
import com.dawfutbol.main.FolderManeger;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import static java.awt.image.ImageObserver.WIDTH;

/**
 *
 * @author s6x
 */
public final class MainMenuFooter extends Layer {

    private static final long serialVersionUID = 1L;
    
    private Rectangle2D rectBtnBox;
    
    private FooterButton footerBtn_1;
    private FooterButton footerBtn_2;
    private FooterButton footerBtn_3;
    private FooterButton footerBtn_4;
    
    public MainMenuFooter() {
        setBackground(new Color(0, true));
        setPreferredSize(new Dimension(WIDTH, 170));
        initComponents();
        addComponents();
    }

    @Override
    protected void initComponents() {
        
        this.footerBtn_1=new FooterButton(260,
                                            155,
                                            "desafíos\n",
                                            "desafios diarios    "+2+"/5",
                                            "objetivos de |carrera             "+3+"/5",
                                            FolderManeger.EXTRA_FOLDER+"010-trophy.png");
        
        //
        //
        
        this.footerBtn_2=new FooterButton(260,
                                            155,
                                            "equipo\n",
                                            "Leo",
                                            "Messi |dc",
                                            FolderManeger.EXTRA_FOLDER+"008-messi.png");
        this.footerBtn_3=new FooterButton(260,
                                            155,
                                            "traspasos",
                                            "mejora la",
                                            "valoración de tu|equipo para atraer|a mejores|jugadores",
                                            FolderManeger.ICON_FOLDER+"coin_icon.png");
        this.footerBtn_4=new FooterButton(260,
                                            155,
                                            "mi club",
                                            "⭐⭐⭐⭐⭐",
                                            "estadio|personalizar|entrenamiento",
                                            FolderManeger.ICON_FOLDER+"063-strategy.png");
    }
    
    private void addComponents(){
        setLayout(new FlowLayout(FlowLayout.LEADING,30,30));
        add(footerBtn_1);
        add(footerBtn_2);
        add(footerBtn_3);
        add(footerBtn_4);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d=(Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        rectBtnBox=new Rectangle2D.Float(getX() + 10, getY() + 10, getWidth() - 10, getHeight() - 10);
        g2d.setColor(Color.cyan);
        g2d.fill(rectBtnBox);
        g2d.dispose();
    }
    
    
    
}
