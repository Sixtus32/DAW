/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ut09.ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Ejercicio 1. . Implementa un programa que inserte 20 números aleatorios entre 1 y 100 (incluidos)
 * en colección que admita elementos repetidos. Elimina todos los elementos que valgan 1. 
 * Busca la forma de ordenar la lista en orden inverso. 
 * Muestra la colección antes y después de aplicar cambios. 
 * @author s6x
 */
public class Ejercicio_1 {
    public static void main(String[] args) {
        List<Integer> bancoNumeros=new ArrayList<>();
        
        for (int i = 0; i < 20; i++) {
            bancoNumeros.add((int)(Math.random() * 10 + 1));
        }
             
        // Colección antes de aplicar los cambios.
        System.out.println("Lista original tras eliminar los valores iguales a (1) : ");
        Iterator<Integer> itInt=bancoNumeros.iterator();
        
        while (itInt.hasNext()) {            
            if(itInt.next().equals(1)){
                itInt.remove();
            }
            System.out.print(itInt.toString() + ", ");
        }
                
//        bancoNumeros.forEach(bancoNumero -> {
//            if(bancoNumero == 1){
//                bancoNumeros.remove();
//            }
//            System.out.print(bancoNumero.toString() + ", ");
//        });
        // Colección después de aplicar los cambios. (de menor a mayor)
        System.out.println("\nLista tras aplicar los cambios ");
        Collections.sort(bancoNumeros, Collections.reverseOrder());
        bancoNumeros.forEach(bancoNumero -> {
            System.out.print(bancoNumero.toString() + ", ");
        });
        
   
        
    }
            
}
