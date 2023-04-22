/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learn;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author s6x
 */
public class Evento_II {
    public static void main(String[] args) {
        MarcoBotones f=new MarcoBotones();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}


class MarcoBotones extends JFrame{

    public MarcoBotones(){
        setTitle("Botones y Eventos");
        setBounds(700,300,500,300);
        setLocationRelativeTo(null);
        add(new LaminaBotones());
    }
    
}

class LaminaBotones extends JPanel {

    private static final long serialVersionUID = 1L;
    private final JButton botonAzul=new JButton("Blue");
    private final JButton botonAmarrillo=new JButton("Yellow");
    private final JButton botonRojo=new JButton("Red");
    
    
    public LaminaBotones() {
        
        add(botonAzul);
        add(botonAmarrillo);
        add(botonRojo);
        
        
        botonAzul.addActionListener(new ColorFondo(Color.blue, this));
        botonAmarrillo.addActionListener(new ColorFondo(Color.yellow, this));
        botonRojo.addActionListener(new ColorFondo(Color.red, this));
//        botonAzul.setActionCommand("Blue");
        
        
    }

    
}


class ColorFondo implements ActionListener {
    private Color colorDeFondo;
    private Component comp;
    
    public ColorFondo(Color c, Component comp) {
        colorDeFondo=c;
        this.comp=comp;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object botonPulsado=e.getSource();
        comp.setBackground(colorDeFondo);
    }
     
}
