/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learn;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author s6x
 */
public class IncluyendoImagenes {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        MarcoImagen f=new MarcoImagen();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
            
}

class MarcoImagen extends JFrame {

    private static final long serialVersionUID = 1L;

    public MarcoImagen() {
        setTitle("Marco con imagen");
        setBounds(750,300,300,200);
        add(new LaminaConImagen());
    }
    
}

class LaminaConImagen extends JPanel {

    private static final long serialVersionUID = 1L;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d=(Graphics2D) g;
        
        File folder=new File("res/image/field/");
        File [] files=folder.listFiles();
        
        for (int i =0; i < files.length; i++ ) {
            System.out.println("Archivo : " + files[i].getName());
        }
        
        File myimagen=new File("res/image/field/grass.png");
        
        try {         
            imagen=ImageIO.read(myimagen);
            
        } catch (IOException ex) {
            System.out.println("La imagen no se encuentra.");
        }
        g2d.drawImage(imagen, 5, 5,null);
        
    }
    
    private Image imagen;

}
