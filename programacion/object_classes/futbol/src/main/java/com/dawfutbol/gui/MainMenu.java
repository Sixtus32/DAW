/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawfutbol.gui;

import com.dawfutbol.main.FolderManeger;
import com.dawfutbol.main.UserInfo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author s6x
 */
public class MainMenu extends Layer {

    private static final long serialVersionUID = 1L;
    private final MainMenuHeader mainMenuHeader;
    private final MainMenuSection mainMenuSection;
    private final MainMenuFooter mainMenuFooter;

    public MainMenu(UserInfo userInfo) {

        
        setBackground(new Color(0, true));
        this.mainMenuHeader=new MainMenuHeader(userInfo,this);    
        this.mainMenuSection=new MainMenuSection(this);
        this.mainMenuFooter=new MainMenuFooter();
        
        setLayout(new BorderLayout());
        this.add(mainMenuHeader, BorderLayout.NORTH);
        this.add(mainMenuSection, BorderLayout.CENTER);
        this.add(mainMenuFooter, BorderLayout.SOUTH);
    }

    @Override
    protected void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
 
        Graphics2D g2d=(Graphics2D) g.create();
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        
        GradientPaint gradient = new GradientPaint(getX(), getY(),
                                                    new Color(151,240,124), getWidth(), getX(), 
                                                    new Color(94, 211, 219));
        g2d.setPaint(gradient);
        g2d.fill(new Rectangle2D.Float(getX(), getY(), getWidth(), getHeight()));
//        
//        Image imgBg=null;
//        try {
//            imgBg=ImageIO.read(new File(FolderManeger.EXTRA_FOLDER + "lewy.png"));
//            imgBg=imgBg.getScaledInstance(880, 760, Image.SCALE_SMOOTH);
//        } catch (IOException ex) {
//            System.out.println("Image not Found.");
//        }
//        
//        g2d.drawImage(imgBg, getWidth() - 720, getY() + 40, null);
        g2d.dispose();
    }
    
    
    
    
    
}
