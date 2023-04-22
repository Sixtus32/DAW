/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learn;

import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;

/**
 *
 * @author s6x
 */
public class EventoTeclado_I {
    public static void main(String[] args) {
        System.out.println("Hola Mundo ");
        new VentanaTeclado();
    }
            
}

class VentanaTeclado extends JFrame{

    private static final long serialVersionUID = 1L;

    public VentanaTeclado() throws HeadlessException {
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        EventoTeclado p=new EventoTeclado();
        this.addKeyListener(p);
        this.addMouseMotionListener(new MouseMotionAdapter() {
            
        });
    }
    
}

class EventoTeclado extends KeyAdapter{

    public EventoTeclado() {
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Letra : " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        char c=e.getKeyChar();
        int i=e.getKeyCode();
        
        System.out.println("Se ha pulsado : " + c + "\n\tCodigo : " + i);
    }
    
    
    
    
    
}
