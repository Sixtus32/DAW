/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointerface.ejercicio10;

//import org.w3c.dom.Entity;

/**
 *
 * @author Sixtus32 <https://github.com/Sixtus32>
 */
public interface Modificable {
    void aumentar(int n);
    void disminuir(int n);
    
    default String nombreClase(){
        String clase=getClass().toString();
        int posicion=clase.lastIndexOf(".");
        return clase.substring(posicion + 1);
    }
}
