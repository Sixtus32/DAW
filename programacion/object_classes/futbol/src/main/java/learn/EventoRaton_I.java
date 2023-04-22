/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learn;

import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author s6x
 */
public class EventoRaton_I {
    public static void main(String[] args) {
        new RatonUso();
    }
}

class RatonUso extends JFrame{

    private static final long serialVersionUID = 1L;

    public RatonUso() throws HeadlessException {
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        JButton boton=new JButton("Guapo");
        
        add(boton);
        EventosDeRaton er=new EventosDeRaton();
        this.addMouseListener(er);
        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Hola : " + boton.getText());
        
            }
        });
    }
}


class EventosDeRaton extends MouseAdapter {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("has hecho click.");
        if(e.getButton() == e.BUTTON1){
            System.out.println("Derecho");
        }else if(e.getButton() == e.BUTTON2){
            System.out.println("Izquierdo");
        }else if (e.getButton() == e.BUTTON3){
            System.out.println("Rueda.");
        }
    }
    
    
}
