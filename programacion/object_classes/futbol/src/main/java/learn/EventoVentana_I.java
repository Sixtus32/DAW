/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learn;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author s6x
 */
public class EventoVentana_I {
    public static void main(String[] args) {
        Ventana f=new Ventana();
        Ventana f2=new Ventana();
        f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
    }
}

class Ventana extends JFrame{

    public Ventana(){
        setTitle("Eventos Ventanas.");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        
        M_Ventana oyenteVentana=new M_Ventana();
        this.addWindowListener(oyenteVentana);
    }
    
}

class M_Ventana implements WindowListener {

    public M_Ventana() {
    }
    
    
    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Cerrando Ventana.");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Ventana Cerrada.");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana Minizada.");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }
    
    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana Activada.");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Ventana Desactivada.");
    }
    
}
