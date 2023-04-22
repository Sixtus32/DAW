/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ut09.ejercicio2;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s6x
 */
public class Principal {
    public static void main(String[] args) {
        LinkedList<Estudiante> estudiantes=new LinkedList<>();
        // Añade a lista los siguientes estudiantes.
        Estudiante e1=new Estudiante("Maria Pedraza", 1234567, 22 );
        
        estudiantes.add(e1);
        estudiantes.add(new Estudiante("Alvaro Rico", 765432121, 23));
        estudiantes.add(new Estudiante("Diana Paola", 7654321, 20));
        estudiantes.add(null);
        estudiantes.add(null);
        estudiantes.add(new Estudiante("Alvaro Rico", 5671234, 21));
        // Añade al final este estudiante.
        estudiantes.addLast(new Estudiante("Miguel Bernardeau", 4535467, 18));
        // Añade al inicio este estudiante.
        estudiantes.addFirst(new Estudiante("Jaime Lorente", 1112222, 20));
        
        /*Muestra el contenido de la colección enviando a la consola 
        de salida directamente*/
        System.out.println("-------------Primer listado------------------");
        System.out.println(estudiantes);
        
            
        // Muestra la colección con un bucle foreach
//        System.out.println("-------------Segundo listado------------------");
//        for (Estudiante estudiante : estudiantes) {
//           System.out.println(estudiantes);
//        }
        
        
        
        // Elimina a "Diana Paola" de la colección  
        String nombreBuscado="Diana Paola";
//        Iterator<Estudiante> itEs=estudiantes.iterator();
//        
//        while (itEs.hasNext()) {
//            Estudiante estudiante=itEs.next();
//            if (estudiante != null && estudiante.getNombre().equals(nombreBuscado)) {
//                itEs.remove();
//            }
//        }
        
//        System.out.println("-------------- Tercera listado (Diana eliminada) ----------------");
//        System.out.println(estudiantes);

        
        // Busca en la lista el nombre de "Maria Pedraza"
        if (estudiantes.contains(e1)) {
            System.out.println("\nSe ha encontrado al estudiante al nombre de " + e1.getNombre() + "\n");
        }else{
            System.out.println("No se ha encontrado.");
        }
        
        
        // Ordenar la colección alfabéticamente.
//        Collections.sort(estudiantes, new Estudiante.OrdenAlpha());
//        System.out.println("----------------- Cuarto listado (orden alfabeticamente) --------------");
//        System.out.println(estudiantes);
        

        // Clona uno de los elementos que quedan en la colección y añádelo. Muestra el resultado.
        Iterator<Estudiante> it=estudiantes.iterator();      
        while (it.hasNext()) {
            Estudiante estudiante=it.next();
            if(estudiante != null && estudiantes.contains(estudiante)){
                try {
                    Estudiante estudianteClonado=(Estudiante) estudiante.clone();
                    System.out.println("\nDatos del estudiante (clonado) : " + estudianteClonado.toString());
                    System.out.println("Eliminando...(el objeto original clonado)");
                    estudiantes.remove(estudiante);
                    estudiantes.add(estudianteClonado);
                } catch (CloneNotSupportedException ex) {
                    System.out.println("\nFallo en la clonacion.");
                }
            }
        }
        

                
                
               
                
                
    }
}
