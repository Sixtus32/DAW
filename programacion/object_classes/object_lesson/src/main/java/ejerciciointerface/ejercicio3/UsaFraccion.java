/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointerface.ejercicio3;

/**
 * @version 1.0
 * @author Sixtus32 <https://github.com/Sixtus32>
 * @see Fraccion
 * @see Relaciones
 */
public class UsaFraccion {
    /**
     * Ejecuca la clase
     * @param args 
     */
    public static void main(String[] args) {
        Fraccion fracc1=new Fraccion(5, 9); 
        Fraccion fracc2=new Fraccion(4, 9);
        
        System.out.println(fracc1.esIgual(fracc2));
        System.out.println(fracc1.esIgual(fracc1));
        System.out.println(fracc1.esMayor(fracc2));
        System.out.println(fracc1.esMenor(fracc2));
        System.out.println(fracc1.restaDeFracciones(fracc2));
    }
            
}
