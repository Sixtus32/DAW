/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointerface.explicacion_interface;

/**
 *
 * @author s6x
 */
public interface Retenible {
    
    void atrapar();
    void liberar();
    
    default void retener(){
        atrapar();
        liberar();
    }
}
