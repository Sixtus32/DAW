/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointerface.ejercicio3;

/**
 *
 * @author Sixtus32 <https://github.com/Sixtus32>
 */
public class Principal {
    /**
     * Ejecuta la clase principal para las fracciones.
     * @param args 
     */
    public static void main(String[] args) {
        Fraccion fraccion=new Fraccion(24, 36);
        
        System.out.println(fraccion.simplificar());
    }
}
