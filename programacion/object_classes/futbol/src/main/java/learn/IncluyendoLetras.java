/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learn;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author s6x
 */
public class IncluyendoLetras {
    public static void main(String[] args) {
        MarcoConFuentes f=new MarcoConFuentes();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
                
    }
            
}

class MarcoConFuentes extends JFrame{

    public MarcoConFuentes()  {
        setTitle("Prueba con Fuentes");
        setSize(1000,800);
        setLocationRelativeTo(null);
        add(new LaminaConFuentes());
    }
    
}


class LaminaConFuentes extends JPanel{

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d=(Graphics2D) g;
        Font miFuente=new Font("Consolas", Font.BOLD, 24);
        
        g2d.setFont(miFuente);
        g2d.setColor(Color.red);
        g2d.drawString(""+5, 100, 100);
        
    }
    
}
