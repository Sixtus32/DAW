/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.dawfutbol.main;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author s6x
 */
public enum Awards {
    GOLD(FolderManeger.ICON_FOLDER+"059-medal-2.png"),
    SILVER(FolderManeger.ICON_FOLDER+"060-medal-3.png"),
    BRONZE(FolderManeger.ICON_FOLDER+"061-medal-4.png");
    
    private Awards(String awardsFilename) {
        this.awardsFilename=awardsFilename;
        try {
            this.awardsImage=ImageIO.read(new File(awardsFilename));
        } catch (IOException ex) {
            Logger.getLogger(Awards.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getAwardsFilename() {
        return awardsFilename;
    }

    public Image getAwardsImage() {
        return awardsImage;
    }
    
    
    
    private final String awardsFilename;
    private Image awardsImage;
}
