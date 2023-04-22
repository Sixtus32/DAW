/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawfutbol.gui.components;

import com.dawfutbol.gui.Layer;
import com.dawfutbol.gui.windows.ProfileWindow;
import com.dawfutbol.interfaces.Designable;
import com.dawfutbol.main.UserInfo;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JButton;

/**
 *
 * @author s6x
 */
public final class UserInfoButton extends JButton implements Designable{

    private static final long serialVersionUID = 1L;
    private final UserInfo userInfo;
    
    private final Color GB_COLOR_BLUE=new Color(94, 211, 219);
    private final Color GB_COLOR_GREEN=new Color(102, 231, 160);
    
    private Rectangle2D backLayer; // Solventar problemilla con el boton.
    
    private Path2D pathBlueDiagonalLine;
    private Path2D pathNewBtn;
    
    private Ellipse2D shieldEllipse;
    private Rectangle2D userNameRect;
    private Rectangle2D userTeamNameRect;
    private Rectangle2D userStarsRect;
    
    
    private static final int DEFAULT_WIDTH=280;
    private static final int DEFAULT_HEIGHT=90;
    
  
    public UserInfoButton(UserInfo userInfo, Layer layer) {
        initComponentShapes();
        setOpaque(false);
        setContentAreaFilled(false);
        setFocusable(false);
        setFocusPainted(false);
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setBorderPainted(false);
        
        this.userInfo=userInfo;
        
        addActionListener((e) -> {
//            layer.add(new ProfileWindow());
//            layer.invalidate();
        });
    }
    
    /**
     * Overridden method to draw on the button 
     * @param g the Graphics context in which to paint
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2d=(Graphics2D) g;
        
        
        /**
         * Clean up the button background
         */    
       g2d.setComposite(AlphaComposite.Clear);
       g2d.fillRect(0, 0, getWidth(), getHeight());
       g2d.setComposite(AlphaComposite.SrcOver);
        
        
        /**
         * Call a default method of "Designable" to render everything
         */
        cleverRender(g2d);
        /**
         * Draw the shapes on the button
         */
//        drawDiagonalLine();
//        g2d.setStroke(new BasicStroke(10.0f));
//        g2d.setColor(new Color(102, 231, 160));
//        g2d.fill(pathBlueDiagonalLine);
        
        
        drawPathBlueDiagonalLine(g2d);
        drawShieldRect(g2d);
        drawPathNewBtn(g2d);
//        
//       
        drawUserNameRect(g2d);
        drawUserTeamNameRect(g2d);

        drawUserStarRect(g2d);
        g2d.dispose();
    }
    
    private void drawDiagonalLine(){
        pathBlueDiagonalLine.moveTo(0, 0);
        pathBlueDiagonalLine.lineTo(this.getWidth() - (this.getWidth() * 0.8), 
                                    this.getHeight());
    }
    private void drawBackLayer(Graphics2D g2d){
        g2d.setColor(new Color(102, 231, 160));
        g2d.fill(backLayer);
    }
    private void drawPathNewBtn(Graphics2D g2d){
        pathNewBtn.moveTo(0, 0);
        pathNewBtn.lineTo(this.getWidth(), 0);
        pathNewBtn.lineTo(this.getWidth(), this.getHeight());
        pathNewBtn.lineTo(this.getWidth() - (this.getWidth() * 0.8), 
                          this.getHeight());
        pathNewBtn.closePath();
        g2d.setStroke(new BasicStroke(0.025f));
        g2d.setColor(new Color(102, 231, 160));
        g2d.fill(pathNewBtn);
    }
    
    private final int PATH_BLUE_DL_X=0;
    private final int PATH_BLUE_DL_Y=0;
//    private final int 
    private void drawPathBlueDiagonalLine(Graphics2D g2d){
        pathBlueDiagonalLine.moveTo(PATH_BLUE_DL_X, PATH_BLUE_DL_Y);
        pathBlueDiagonalLine.lineTo(this.getWidth() - (this.getWidth() * 0.8f), 
                                    this.getHeight());
        g2d.setStroke(new BasicStroke(8.5f));
        g2d.setPaint(new GradientPaint( this.getX(), 
                                        this.getY(), 
                                        GB_COLOR_BLUE, 
                                        (float)(this.getWidth() - (this.getWidth() * 0.8)), 
                                        this.getHeight(), GB_COLOR_GREEN));
        g2d.draw(pathBlueDiagonalLine);
    }
    private void drawUserNameRect(Graphics2D g2d){
        g2d.setColor(new Color(0, true)); // Color para diferenciar [Cuadro Nombre Usuario]
        g2d.fill(userNameRect);
        g2d.setColor(Color.white);
        g2d.setFont(new Font("Consolas", Font.BOLD, 16));
        g2d.drawString(this.userInfo.getUserName().toUpperCase(), 
                (float)(userNameRect.getCenterX() - 62), 
                (float)(userNameRect.getCenterY() + 7));
    }
    private void drawUserTeamNameRect(Graphics2D g2d){
        g2d.setColor(new Color(0, true)); // Color para diferenciar [Cuadro Nombre Del Equipo del Usuario]
        g2d.fill(userTeamNameRect);
        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font("Consolas", Font.PLAIN, 16));
        g2d.drawString(this.userInfo.getTeamName().toUpperCase(), 
                       (float) (userTeamNameRect.getCenterX() - 62), 
                       (float) (userTeamNameRect.getCenterY() + 6));
    }
    private void drawUserStarRect(Graphics2D g2d){
        g2d.setColor(new Color(0, true));
        g2d.fill(userStarsRect);
        int dist=0;
        for (int i = 0; i < userInfo.getNumberOfStars(); i++) {
            drawStar(g2d, userStarsRect,dist);
            dist+=20;
        }
        
    }
    private void drawShieldRect(Graphics2D g2d){
        g2d.setColor(new Color(102, 231, 160));
        g2d.fill(shieldEllipse);
        g2d.setColor(Color.WHITE);
        g2d.setStroke(new BasicStroke(2.5f));
        g2d.draw(shieldEllipse);
    } 
    
    /**
     * Overriden method to initialize the shapes to draw on the button
     */
    @Override
    public void initComponentShapes() {
        // Crear una instancia de Path2D para la linea a trazar.
        this.pathBlueDiagonalLine=new Path2D.Double();
        
        this.pathNewBtn=new Path2D.Double();
        
        this.backLayer=new Rectangle2D.Float(50, 0, this.getWidth(), this.getHeight());
        
        this.shieldEllipse=new Ellipse2D.Float(50, 
                                            12, 
                                            getWidth() * 0.283636f, 
                                            getHeight() * 0.75f);
        int distanceBtwX=10;
        int distanceBtwY= 24;
        this.userNameRect=new Rectangle2D.Float((float) (shieldEllipse.getX() + 85f), 
                                                (float) (shieldEllipse.getY()), 
                                                136f, 
                                                24f);
        this.userTeamNameRect=new Rectangle2D.Float((float) userNameRect.getX() + distanceBtwX, 
                                                    (float) (shieldEllipse.getY() + distanceBtwY), 
                                                    122f, 
                                                    22f);
        this.userStarsRect=new Rectangle2D.Float((float) userTeamNameRect.getX() + distanceBtwX,
                                                 (float) shieldEllipse.getY() + distanceBtwY + 24, 
                                                 112f, 
                                                 20f);
    }  
    private void drawStar(Graphics2D g2d,Rectangle2D rect, int dist){
        int val=10; 
        int centerX=(int) ((rect.getWidth() - 40) / 2);
        int centerY=(int) ((rect.getHeight() - 20) / 2);
        int radius=8; // Radio de la estrella 
        
        // Dibujar la estrella de mar
        int [] xPoints=new int[val];
        int [] yPoints=new int[val];
        
        for (int i = 0; i < val; i++) {
            double x, y;
            if(i % 2 == 0){
                x=centerX+radius*Math.cos(2 * Math.PI * i / 10 - Math.PI / 2);
                y=centerY+radius*Math.sin(2*Math.PI * i / 10 - Math.PI / 2);               
            }else {
                x=centerX+radius/2*Math.cos(2 * Math.PI * i / 10 - Math.PI / 2);
                y=centerY+radius/2*Math.sin(2*Math.PI * i / 10 - Math.PI / 2);        
            }
            xPoints[i]=(int) ((int) x + rect.getX() - 28 + dist);
            yPoints[i]=(int) ((int) y + rect.getY() + 10);     
        }
        

        
        g2d.setColor(Color.YELLOW);
        g2d.fillPolygon(xPoints, yPoints, val);
        g2d.setColor(new Color(102, 231, 160));
        g2d.setStroke(new BasicStroke(0.075f));
        g2d.drawPolygon(xPoints, yPoints, val);  

    }

    public UserInfo getUserInfo() {
        return userInfo;
    }
    
    
    
    
    
    
}
