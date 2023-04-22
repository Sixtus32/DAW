/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learn;

import java.awt.GraphicsEnvironment;
import javax.swing.JOptionPane;

/**
 *
 * @author s6x
 */
public class PruebasLetras {
    public static void main(String[] args) {
        
        String fuente=JOptionPane.showInputDialog("Introduce fuente : ");
        boolean estalafuente=false;
        
        String [] nombresDeFuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String nombresDeFuente : nombresDeFuentes) {
//            System.out.println(nombresDeFuente);
            if (nombresDeFuente.equals(fuente)){
                estalafuente=true;
            }
        }
        
        if(estalafuente){
            System.out.println("Fuente instalada.");
            
            
        }else{
            System.out.println("No esta instalada.");
        }
    }
}
