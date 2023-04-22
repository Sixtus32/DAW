/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointerface.ejercicio4;

import ejerciciointerface.ejercicio3.Fraccion;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Sixtus32 <https://github.com/Sixtus32>
 */
public class UsaFraccion2 {
    public static void main(String[] args) {
        ArrayList<Fraccion> listaFracciones=new ArrayList<>();
        listaFracciones.add(new Fraccion(1, 2));
        listaFracciones.add(new Fraccion(3, 4));
        listaFracciones.add(new Fraccion(1, 4));
        listaFracciones.add(new Fraccion(5, 8));
        listaFracciones.add(new Fraccion(7, 16));
        listaFracciones.add(new Fraccion(4, 6));
        
        
        Collections.sort(listaFracciones);
        
        System.out.println("Lista de fracciones ordenadas de menor a mayor : ");
        listaFracciones.forEach(listaFraccione -> System.out.println(listaFraccione));
        
    }
            
}
