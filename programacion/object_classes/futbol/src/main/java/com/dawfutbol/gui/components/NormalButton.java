/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawfutbol.gui.components;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author s6x
 */
public final class NormalButton extends JButton{

    private static final long serialVersionUID = 1L;
    
    private final String btnIconFilename;
    private final String btnTitle;
    
    private static final Color BORDER_COLOR=Color.BLACK;
    private static final Color BTN_COLOR=Color.BLUE;

    public NormalButton(String btnIconFilename, String btnTitle) {
        super(btnTitle, new ImageIcon(btnIconFilename));
        this.btnIconFilename=btnIconFilename;
        this.btnTitle=btnTitle;

    }
    
    
}
