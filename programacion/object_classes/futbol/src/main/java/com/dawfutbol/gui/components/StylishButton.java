/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawfutbol.gui.components;

import com.dawfutbol.interfaces.Designable;
import com.dawfutbol.main.FolderManeger;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import javax.imageio.ImageIO;
import javax.swing.JButton;

/**
 * @@link 
 * @author s6x
 * @version 1.0
 */
public class StylishButton extends JButton implements Designable, Serializable{   
    /**
     * The id of the clase
     */
    private static final long serialVersionUID = 1L;   
    /**
     * Rectangle containing the image of the button 
     */
    private Rectangle2D iconBox;
    /**
     * The image file path for the button
     */
    private String btnIconFilename;
    private Image btnIconImage;
    
    private Color btnBgColor;
    private Color btnFgColor;
    
    private final Font btnFont;
    
    private final static int DEFAULT_ICON_WIDTH=26;
    private final static int DEFAULT_ICON_HEIGHT=26;
    
    // aspecto por defecto del boton.
    private final static Color DEFAULT_BUTTON_BG_COLOR=new Color(20, 20, 20);
    private final static Color DEFAULT_BUTTON_FG_COLOR=new Color(49, 49, 49);
    
    /**
     * The default width of button
     */
    public static final int DEFAULT_W=42;
    /**
     * The default height of the button
     */
    public static final int DEFAULT_H=40;
    

    public StylishButton(String btnFilename, int btnWidth, int btnHeight) {
        doImage(btnFilename);
//        initComponentShapes();
        this.btnBgColor=DEFAULT_BUTTON_BG_COLOR;
        this.btnFgColor=DEFAULT_BUTTON_FG_COLOR; 
        setBackground(btnBgColor);
        setPreferredSize(new Dimension(btnWidth, btnHeight));
        btnFont=new Font("Consolas", Font.BOLD, 16);
        setBorderPainted(false);

        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setFocusPainted(false);
        setFocusable(false); 
//        setContentAreaFilled(false);
        addActionListener((e) -> {
            if(this.btnIconFilename == null ? FolderManeger.ICON_FOLDER+"004-question.png" == null : this.btnIconFilename.equals(FolderManeger.ICON_FOLDER+"004-question.png")){
                this.btnIconFilename=FolderManeger.ICON_FOLDER+"006-home-2.png";
                repaint();
            }
        });
        
        
    }

    
    private void doImage(String btnImageFilename){

        this.btnIconFilename=btnImageFilename;
        try {
            btnIconImage=ImageIO.read(new File(this.btnIconFilename));
            btnIconImage = btnIconImage.getScaledInstance(DEFAULT_ICON_WIDTH, DEFAULT_ICON_HEIGHT, Image.SCALE_SMOOTH);
        } catch (IOException ex) {
            System.err.println("ERROR.  IMAGE NOT FOUND.\n\tFile at : " + btnIconFilename + " wasn't found.");
        }
    }
    
    @Override
    public void initComponentShapes() {
        this.iconBox=new Rectangle2D.Float(3, 3, 
                                    (float) (this.getWidth() - (this.getWidth() * 0.14)), 
                                    (float) (this.getHeight() - (this.getHeight() * 0.14)));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d=(Graphics2D) g;
        cleverRender(g2d);
        initComponentShapes();
        g2d.setColor(this.btnFgColor);
        g2d.setFont(btnFont);
        g2d.fill(iconBox);
        
        g2d.setColor(new Color(5, 5, 5));
        g2d.setStroke(new BasicStroke(1.5f));
        g2d.draw(iconBox);

        g2d.drawImage(this.btnIconImage, 
                      (int)iconBox.getX() + 5, 
                      (int)iconBox.getY() + 4,
                      null);
//        drawNotifily(g2d);
        g2d.dispose();
    }
    
    public void drawNotifily(Graphics2D g2d){
        g2d.setColor(DEFAULT_BUTTON_BG_COLOR);
        g2d.drawOval(this.getWidth(), this.getY(), 20, 20);
    }

    public void setBtnIconFilename(String btnIconFilename) {
        this.btnIconFilename = btnIconFilename;
    }

    public String getBtnIconFilename() {
        return btnIconFilename;
    }

    public Image getBtnIconImage() {
        return btnIconImage;
    }

    public void setBtnIconImage(Image btnIconImage) {
        this.btnIconImage = btnIconImage;
    }

    public Color getBtnBgColor() {
        return btnBgColor;
    }

    public void setBtnBgColor(Color btnBgColor) {
        this.btnBgColor = btnBgColor;
    }

    public Color getBtnFgColor() {
        return btnFgColor;
    }

    public void setBtnFgColor(Color btnFgColor) {
        this.btnFgColor = btnFgColor;
    }
    
    
    
    
    

}
