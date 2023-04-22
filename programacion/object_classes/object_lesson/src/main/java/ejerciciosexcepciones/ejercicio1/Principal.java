/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosexcepciones.ejercicio1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author s6x
 */
public class Principal {
    public static void main(String[] args) {
        List<String> lista=new ArrayList<>();
        
        lista.add("Hola Mundo");
        lista.add("Dilo más alto");
        lista.add("El cogote");
        
        Collections.sort(lista);
        
        lista.forEach(string -> System.out.println(string));

         
        
                
    }
}
