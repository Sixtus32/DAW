/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointerface.ejercicio7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Sixtus32 <https://github.com/Sixtus32>
 */
public class AppPrincipal{
    public static void main(String[] args) {
        Linea linea1=new Linea(0,0,3,4);
        Linea linea2=new Linea(0,0,6,8);
        
        System.out.println(linea1);
        System.out.println(linea2);
        
        if(linea1.esMayor(linea2)){
            System.out.println("La linea 1 es mayor que la linea 2.");
        }else if(linea1.esMenor(linea2)){
            System.out.println("La linea 1 es menor que la linea 2.");
        }else {
            System.out.println("La linea 1 y la linea 2 son iguales.");
        }
        
        ArrayList<Linea> lineas=new ArrayList<>();
        lineas.add(linea1);
        lineas.add(linea2);
    
        Collections.sort(lineas);
        System.out.println("\nLista de lineas ordenadas por longitud : ");
        for (Linea linea : lineas) {
//            lineas.sort(linea.compareTo(linea));
            System.out.println(linea);
        }
    }
    
    
}
