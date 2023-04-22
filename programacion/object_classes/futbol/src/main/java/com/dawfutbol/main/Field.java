/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawfutbol.main;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author s6x
 */
public class Field implements Drawable{
//    private Graphics2D graphics2D=new BufferedImage(WIDTH,HEIGHT, BufferedImage.TYPE_INT_RGB).createGraphics();
    private static final int FIELD_WIDTH=1000;
    private static final int FIELD_HEIGHT=700;
    public Field() {
    }

    @Override
    public void draw(Graphics2D g2d) {
//        Rectangle2D field=new Rectangle2D.Double(0, 0, FIELD_WIDTH, FIELD_HEIGHT);
//        g2d.setColor(Color.white);
//        g2d.draw(field);
//        g2d.setColor(Color.green);
//        g2d.fill(field);
        g2d.drawImage(Toolkit.getDefaultToolkit().createImage("res/image/field/grass.png"), 10, 10, null);
    }
    
}
