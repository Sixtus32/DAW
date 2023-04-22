/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawfutbol.gui.components;

import com.dawfutbol.interfaces.Designable;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;

/**
 *
 * @author s6x
 */
public final class FooterButton extends JButton implements Designable{

    private static final long serialVersionUID = 1L;
    

    private Rectangle2D rectBaseLayer;
    private Rectangle2D rectTitle;
    private Rectangle2D rectInfo;
    private Rectangle2D rectImageBox;
    
    private static final int DEFAULT_WIDTH=300;
    private static final int DEFAULT_HEIGHT=168;
    
    private static final int DEFAULT_TITLE_FONT_SIZE=34;
    
    private static final String DEFAULT_FONT_NAME="Consolas";
    
    private static final Color DEFAULT_GD_PAINT_COLOR_1=new Color(151,240,124);
    private static final Color DEFAULT_GD_PAINT_COLOR_2=new Color(94, 211, 219);
    
    private static final float DEFAULT_TITLE_POSITION_INCREASE_X=8.5f; //8.5f
    private static final float DEFAULT_TITLE_POSITION_INCREASE_Y=38f;//38f
    
    
    private String btnTitle;
    private String btnInfo;
    private String descrip;
    
    private Image btnImage;
    private String btnImageFilename;

    public FooterButton() {
        this(DEFAULT_WIDTH, DEFAULT_HEIGHT,null,null, null,null);
    }
    
    
    public FooterButton(int w, int h, String btnTitle, String btnInfo,String descrip, String imageFilename) {
        setBorderPainted(false);
        setBackground(new Color(0, true));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setPreferredSize(new Dimension(w, h));
        setFocusable(false); 
        this.btnTitle=btnTitle.toUpperCase();
        this.btnInfo=btnInfo.toUpperCase();
        this.btnImageFilename=imageFilename;
        this.descrip=descrip.toUpperCase();
        this.btnImage=null;
        
        addActionListener((e) -> {
            System.out.println("You pressed : " + this.btnTitle);
        });
        
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); 
        Graphics2D g2d=(Graphics2D) g;
        cleverRender(g2d);
        initComponentShapes();
        drawRectBaseLayer(g2d);
        drawRectTitle(g2d);
        drawRectInfo(g2d);
        drawRectImageBox(g2d);
        g2d.dispose();
    }
    private void drawRectImageBox(Graphics2D g2d){
        g2d.setColor(new Color(0, true));
        g2d.fill(rectImageBox);
        try {
            this.btnImage=ImageIO.read(new File(this.btnImageFilename));
            this.btnImage=btnImage.getScaledInstance((int)rectImageBox.getWidth() -8, (int)rectImageBox.getHeight() - 28, Image.SCALE_AREA_AVERAGING);
        } catch (IOException ex) {
            System.out.println("Image Not Found.");
        }
        g2d.drawImage(btnImage, (int) ((int) rectImageBox.getX() - 7.5), 
                (int) rectImageBox.getY() - 8,
                null);
//        g2d.dispose();
    }
    private void drawRectInfo(Graphics2D g2d){
        g2d.setColor(new Color(0, true));
        g2d.fill(rectInfo);
        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font("Consolas", Font.BOLD, 12));
        g2d.drawString(btnInfo, (float)rectInfo.getX() + 10.5f, (float)rectInfo.getY() + 32f);
        StringTokenizer str=new StringTokenizer(descrip);
        int n=0;
        while(str.hasMoreElements()){
            g2d.drawString(str.nextToken("|"), (float)rectInfo.getX() + 10.5f, (float)rectInfo.getY() + (64f)+ n);
            n+=20;
        }
//        g2d.dispose();
    }
    
    private void drawRectTitle(Graphics2D g2d){
        g2d.setColor(new Color(0, true));
        g2d.fill(rectTitle);
         GradientPaint gradient=new GradientPaint((float)rectTitle.getX() + 8.5f,
                                                   (float) rectTitle.getY() + 32f,
                                                    DEFAULT_GD_PAINT_COLOR_2, 
                                                    (float)rectTitle.getWidth() - 158, 
                                                    (float) rectTitle.getX() + 8.5f, 
                                                    DEFAULT_GD_PAINT_COLOR_1);
        g2d.setPaint(gradient);
        g2d.setFont(new Font(DEFAULT_FONT_NAME, 
                            Font.BOLD, 
                            DEFAULT_TITLE_FONT_SIZE));
        g2d.drawString(btnTitle, 
                      (float)rectTitle.getX() + DEFAULT_TITLE_POSITION_INCREASE_X, 
                      (float)rectTitle.getY() + DEFAULT_TITLE_POSITION_INCREASE_Y);
    }
    
    private void drawRectBaseLayer(Graphics2D g2d){
        GradientPaint gradient1 = new GradientPaint((float)rectBaseLayer.getX(),
                                                    (float) rectBaseLayer.getY(),
                                                    new Color(25,25,28), 
                                                    (float)rectBaseLayer.getWidth(), 
                                                    (float) rectBaseLayer.getX(), 
                                                    new Color(51, 51, 51));
        g2d.setPaint(gradient1);
        g2d.fill(rectBaseLayer);
        g2d.setStroke(new BasicStroke(8f));
        GradientPaint gradient=new GradientPaint((float)rectBaseLayer.getX(),
                                                            (float) rectBaseLayer.getY(),
                                                    new Color(151,240,124), 
                                                    (float)rectBaseLayer.getWidth(), 
                                                    (float) rectBaseLayer.getX(), 
                                                    new Color(94, 211, 219));
        g2d.setPaint(gradient);
        g2d.draw(rectBaseLayer);
    }
    
    @Override
    public void initComponentShapes() {
        rectBaseLayer=new Rectangle2D.Float(0, 0, getWidth(), getHeight());  
        
        rectTitle=new Rectangle2D.Float(3f, 3f, (float)rectBaseLayer.getWidth() - 6f, (float)rectBaseLayer.getHeight()* 0.25f);
        
        rectInfo=new Rectangle2D.Float( (float)rectTitle.getX(), 
                                        (float)rectTitle.getHeight() + 2f, 
                                        (float)rectBaseLayer.getWidth() * 0.6f, 
                                        (float) rectBaseLayer.getHeight() * 0.72f);
        rectImageBox=new Rectangle2D.Float((float) rectInfo.getWidth(), 
                                        (float)rectTitle.getHeight() + 2f,
                                        (float)rectBaseLayer.getWidth() * 0.39f, 
                                        (float) rectBaseLayer.getHeight() * 0.72f);
    }
    
}
