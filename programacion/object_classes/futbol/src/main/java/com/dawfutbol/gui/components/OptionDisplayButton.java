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
import java.awt.LinearGradientPaint;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JButton;

/**
 *
 * @author s6x
 */
public final class OptionDisplayButton extends JButton implements Designable{

    private static final long serialVersionUID = 1L;
    
    private Rectangle2D titleRect; // Contendrá el titulo del boton.
    private Rectangle2D contentRect; // Contendrá el contenido (img y más)
    private Path2D pathNewBtn; // Para crear un boton encima del principal.    
    private Rectangle2D commentaryRect; // Para situar los comentarios del boton.
    
    private String btnTitle;
    private int btnTitleSize;
    
    private String btnCommentary;
    private int btnCommentarySize;
    
    private Font btnFont=null;
    
    
    // Colores para el degradado Color1 (verde (151,240,124)) -> Color2 (azul (94, 211, 219))
    // Degradado para el bg del contenido. ( gris (49,49,49)) -> (negro (33,33,33))
    
    private final static int DEFAULT_TITLE_FONT_SIZE=22;
    private static final int DEFAULT_COMMENT_FONT_SIZE=12;

    public OptionDisplayButton(String btnTitle, String btnComment, int w, int h, int titleFontSize, int commentFontSize) {
        this(btnTitle, btnComment, w, h);
        this.btnTitleSize=titleFontSize;
        this.btnCommentarySize=commentFontSize;
    }


    public OptionDisplayButton(String btnTitle, String btnComment, int w, int h) {
        setFocusable(true);
        setFocusPainted(true);
        setBorderPainted(false);
        
        setOpaque(false);
        this.btnTitle=btnTitle.toUpperCase();
        this.btnCommentary=btnComment.toUpperCase();
        
        
        setBackground(new Color(0, true));
        setPreferredSize(new Dimension(w, h));
        
        
        this.btnTitleSize=DEFAULT_TITLE_FONT_SIZE;
        this.btnCommentarySize=DEFAULT_COMMENT_FONT_SIZE;
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        

//        setOpaque(false);

        addActionListener((e) -> {
            System.out.println("You pressed : " + this.btnTitle);
        });
        setContentAreaFilled(false);
    }
    
    

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2d=(Graphics2D) g.create();
        cleverRender(g2d);
        
        initComponentShapes();
        drawPathNewBtn(g2d);
        drawTitleRect(g2d);
        drawContentRect(g2d);
        drawCommentRect(g2d);
        g2d.dispose();
    }
    
    @Override
    public void initComponentShapes() {
        //Trazado para dibujar el Boton final.
        this.pathNewBtn=new Path2D.Float(Path2D.WIND_EVEN_ODD);
        this.titleRect=new Rectangle2D.Float(8f, 8f, getWidth() - 16f, getHeight() * 0.20f);
        this.contentRect=new Rectangle2D.Float(8f, getHeight() * 0.23f, getWidth() - 16f, getHeight() * 0.74f);
        this.commentaryRect=new Rectangle2D.Float(8f, getHeight() - (getHeight() * 0.18f), getWidth() - 95f, (float) (getHeight() * 0.15));
    }
    
    private void drawTitleRect(Graphics2D g2d){
        GradientPaint gradient = new GradientPaint((float)titleRect.getX(),
                                                    (float) titleRect.getY(),
                                                    new Color(151,240,124), 
                                                    (float)titleRect.getWidth(), 
                                                    (float) titleRect.getX(), 
                                                    new Color(94, 211, 219));
        g2d.setPaint(gradient);
        g2d.fill(titleRect);
        // Dibujar el texto centrado en el rectángulo del bóton.
        int h=30;
        g2d.setColor(Color.BLACK);
        this.btnFont=new Font("Consolas", Font.BOLD, this.btnTitleSize);
        g2d.setFont(btnFont);
        g2d.drawString(btnTitle, (int) titleRect.getX() + 6, (int) titleRect.getY() +h);
    }
    
    private void drawCommentRect(Graphics2D g2d){
        g2d.setColor(new Color(0, true));
        g2d.fill(commentaryRect);
        g2d.setColor(Color.WHITE);
        this.btnFont=new Font("Consolas", Font.BOLD, this.btnCommentarySize);
        g2d.setFont(btnFont);
        g2d.drawString(btnCommentary, (int) commentaryRect.getX() + 4, (int) commentaryRect.getY() + 20);
    }
    
    
    private void drawContentRect(Graphics2D g2d){
        g2d.setColor(new Color(0, true));
        g2d.fill(contentRect);
    }
    private void drawPathNewBtn(Graphics2D g2d){
        pathNewBtn.moveTo(0, 0);
        pathNewBtn.lineTo(getWidth(), 0);
        pathNewBtn.lineTo(getWidth(), ((getHeight()) * 0.8));
        pathNewBtn.lineTo(((getWidth()) * 0.9), getHeight());
        pathNewBtn.lineTo(0, getHeight());
        pathNewBtn.lineTo(0, 0);
//        
//        pathNewBtn.moveTo(8, 8);
//        pathNewBtn.lineTo(getWidth() - 8, 8);
//        pathNewBtn.lineTo(getWidth() - 8, ((getHeight() - 8) * 0.8));
//        pathNewBtn.lineTo(((getWidth() - 8) * 0.9), getHeight() - 8);
//        pathNewBtn.lineTo(8, getHeight() - 8);
//        pathNewBtn.lineTo(8, 8);
        
        pathNewBtn.closePath();
        
        g2d.setColor(new Color(12, 12, 12));
        g2d.setStroke(new BasicStroke(9.25f));
        g2d.draw(pathNewBtn);
        
        int x1=getX() + 8;
        int y1=getY() + 8;
        int x2=(int) (float) ((getWidth()) * Math.cos(Math.toRadians(35)));
        int y2=(int) (float) ((getHeight()) * Math.sin(Math.toRadians(35)));
        
//        int step=15;
        
        Color [] colors={new Color(52, 50, 49), new Color(30, 30, 30)};
        float [] fract={0.0f, 1.0f};
        
        LinearGradientPaint gradient=new LinearGradientPaint(x1, y1, x2, y2, fract,colors);
        g2d.setPaint(gradient);
        g2d.fill(pathNewBtn);       
    }

    public String getBtnTitle() {
        return btnTitle;
    }

    public void setBtnTitle(String btnTitle) {
        this.btnTitle = btnTitle;
    }

    public int getBtnTitleSize() {
        return btnTitleSize;
    }

    public void setBtnTitleSize(int btnTitleSize) {
        this.btnTitleSize = btnTitleSize;
    }

    public String getBtnCommentary() {
        return btnCommentary;
    }

    public void setBtnCommentary(String btnCommentary) {
        this.btnCommentary = btnCommentary;
    }

    public int getBtnCommentarySize() {
        return btnCommentarySize;
    }

    public void setBtnCommentarySize(int btnCommentarySize) {
        this.btnCommentarySize = btnCommentarySize;
    }

    public Font getBtnFont() {
        return btnFont;
    }

    public void setBtnFont(Font btnFont) {
        this.btnFont = btnFont;
    }
    
    
    
}
