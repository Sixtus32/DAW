/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ut09.ejercicio7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 *Crea una lista de 20 números aleatorios con valores entre 1 y 10.
a) Ordena la lista ascendentemente y descendentemente.
b) A partir de la lista anterior, crea un conjunto sin repeticiones.
c) Idea la forma de obtener cuáles de los números se repitieron y cuáles no en la lista
original. 
 * @author s6x
 */
public class ListadoAleatorio {
    public static void main(String[] args) {
        List <Integer> alea=new ArrayList<>();
        
        for (int i=0; i < 20; i++) {
            alea.add((int) ((Math.random() * 10) + 1));
        }
        
        System.out.println("Orden Ascendente.");
        Collections.sort(alea);
        for (Integer integer : alea) {
            System.out.print(integer + " , ");
        }
        
        System.out.println("\n\nOrden Descendente.");
        Collections.sort(alea, Collections.reverseOrder());
        for (Integer integer : alea) {
            System.out.print(integer + " , ");
        }
        
        
        HashSet<Integer> aleaHash=new HashSet<>();
        aleaHash.addAll(alea);
        
        System.out.println("\n\nConjunto sin repeticiones.");
        Collections.sort(alea);
        for (Integer integer : aleaHash) {
            System.out.print(integer + " , ");
        }
        
       // Los repetidos 
       List<Integer> numRepetidos=new ArrayList<>();
       // Los NO repetidos 
       List<Integer> numNoRepetidos=new ArrayList<>();
       
        for (Integer integer : alea) {
            if(Collections.frequency(alea, integer)> 1){
                if(!numRepetidos.contains(integer)){
                    numRepetidos.add(integer);
                }
            }else{
                numNoRepetidos.add(integer);
            }
        }
        
        System.out.println("\n\n----------- Lista Original (repetidos)---------------");
        System.out.println(numRepetidos);
        
        System.out.println("\n\n----------- Lista NO repetidos -----------------------");
        System.out.println(numNoRepetidos);
    }
}
