/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.dawfutbol.main;

import com.dawfutbol.gui.components.FooterButton;
import com.dawfutbol.gui.components.NotificationNoticeComponent;
import com.dawfutbol.gui.components.OptionDisplayButton;
import com.dawfutbol.gui.components.ShopButton;
import com.dawfutbol.gui.components.StylishButton;
import com.dawfutbol.gui.components.UserInfoButton;
import com.dawfutbol.gui.windows.ProfileWindow;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;


/**
 *
 * @author s6x
 */
public class ViewTest {
    
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("View Texting");
        frame.setPreferredSize(new Dimension(1200, 750));
        frame.setLocation(280, 90);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JInternalFrame win = new JInternalFrame();
//        win.setClosable(f);
        win.setResizable(false);
        win.setBorder(null);
        System.out.println(win.getUI());
        
        win.setVisible(true);
        win.setSize(new Dimension(500, 250));
//        win.setLocation(200, 150);
        win.setBackground(Color.CYAN);
        win.setLayout(new BorderLayout());
        
        JButton btnClose = new JButton(new ImageIcon(FolderManeger.ICON_FOLDER + "038-close.png"));
        btnClose.setFocusable(false);
        btnClose.addActionListener((e) -> {
            win.dispose();
        });
        
        win.add(btnClose, BorderLayout.NORTH);
        
        Dimension deskSize = frame.getSize();
        Dimension internalFrame = win.getSize();
        
        int x = deskSize.width / 2;
        int y = deskSize.height / 2;
        
        win.setLocation(x + 100, y + 100);
        
        JDesktopPane desk = new JDesktopPane();
        desk.setBorder(null);
//        desk.setUI(null);
        desk.setName("Avion");
        
        desk.add(win);
        
        frame.add(desk);
        frame.setVisible(true);
        frame.pack();
        
    }
    
}
