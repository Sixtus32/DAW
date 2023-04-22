/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learn;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Uso de la clase Adapter Classes.
 * @author s6x
 */
public class EventoVentana_II {
    public static void main(String[] args) {
        
    }
}

class VentanaAdapta extends WindowAdapter {

    @Override
    public void windowClosed(WindowEvent e) {
        super.windowClosed(e); //To change body of generated methods, choose Tools | Templates.
    }
}
