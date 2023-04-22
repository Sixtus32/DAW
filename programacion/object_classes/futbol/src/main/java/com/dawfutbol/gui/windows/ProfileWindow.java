/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawfutbol.gui.windows;

import com.dawfutbol.main.UserInfo;
import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author s6x
 */
public final class ProfileWindow extends JDesktopPane {

    private static final long serialVersionUID = 1L;
    
    private JInternalFrame internalWindow;
    
    public ProfileWindow() {
        this.internalWindow=new JInternalFrame();
        this.internalWindow.setFocusable(false);
        this.internalWindow.setBorder(null);
        this.internalWindow.setBackground(Color.CYAN);
        this.internalWindow.setSize(380, 450);
//        this.internalWindow.
        this.internalWindow.setResizable(false);
//        this.internalWindow.setUI(null);
        this.internalWindow.setVisible(true);
        
        add(internalWindow);      
    }
    
    
    
}
