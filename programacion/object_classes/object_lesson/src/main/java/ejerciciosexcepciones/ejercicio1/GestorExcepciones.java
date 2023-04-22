/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosexcepciones.ejercicio1;

/**
 *
 * @author s6x
 */
public class GestorExcepciones extends Exception{
    static Throwable t=new Throwable().getCause();
    
    public GestorExcepciones(String mensaje) {
        super(mensaje, t);
    }
    
}
