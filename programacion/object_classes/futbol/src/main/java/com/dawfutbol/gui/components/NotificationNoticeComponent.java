/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawfutbol.gui.components;

import com.dawfutbol.main.FolderManeger;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JButton;
import javax.swing.JComponent;

/**
 *
 * @author s6x
 */
public class NotificationNoticeComponent extends JButton{

    private static final long serialVersionUID = 1L;
    private final static String WARNING_IMAGE_PATH=FolderManeger.ICON_FOLDER+"032-warning.png";
    private final JButton btn;
    
    public NotificationNoticeComponent(JButton button, String o) {
        super(o);
        setPreferredSize(new Dimension((int) (button.getWidth() + (button.getWidth() * 0.2)), HEIGHT));
        setBackground(Color.PINK);
        this.btn=button;
        setLayout(new BorderLayout());
        add(btn, BorderLayout.CENTER);
        addActionListener((e) -> {
            System.out.println("Hola Mundo");
        });
    }
      
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g); 

    }  
}
