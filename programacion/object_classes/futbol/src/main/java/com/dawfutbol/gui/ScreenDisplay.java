/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawfutbol.gui;

//import java.awt.HeadlessException;
import com.dawfutbol.main.FolderManeger;
import com.dawfutbol.main.UserInfo;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author s6x
 */
public class ScreenDisplay extends JFrame {
    private static final long serialVersionUID = 1L;
    public static final int HEIGHT=800;
    public static final int WIDTH=1200;
    private static final String APP_TITLE="DawGames Football 1.0.0v";
    private static final String APP_DESCRIPTION="Un juego de futbol.";
    
//    private Thread thread;
//    private volatile boolean running=false;
//    
    public ScreenDisplay(){
        initComponents();
    }
    
    private void initComponents(){
        
        setTitle(APP_TITLE);
//        setUndecorated(true);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        try {
            //        setSize(new Dimension(WIDTH, HEIGHT));
            setIconImage(ImageIO.read(new File(FolderManeger.EXTRA_FOLDER+"minaturaApp.png")));
        } catch (IOException ex) {
//            Logger.getLogger(ScreenDisplay.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error. Para mostrar la imagen.");
        }
        UserInfo userInfo=new UserInfo("KYLE KYIKUDA", "Barcelona FC", 55f, 2000, 0);
        MainMenu main=new MainMenu(userInfo); 
        add(main);
        setLocation(180, 16);
        setResizable(false);
        getAccessibleContext().setAccessibleName(APP_TITLE);
        getAccessibleContext().setAccessibleDescription(APP_DESCRIPTION);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }   
}
