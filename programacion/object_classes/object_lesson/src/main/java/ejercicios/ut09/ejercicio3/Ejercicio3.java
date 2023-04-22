/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ut09.ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s6x
 */
public class Ejercicio3 {
    public static void main(String[] args) {
         Set <String> deportes=new HashSet<>();
        deportes.add("Atletismo");
        deportes.add("Esqui");
        deportes.add("Futbol");
        deportes.add("Futbol");
        deportes.add("Patinaje");
        deportes.add("Baloncesto");
        deportes.add("Ciclismo");
        deportes.add("Natacion");
        deportes.add(null);

        
        System.out.println("Deportes a practicas : ");
        for (Object deporte : deportes) {
            System.out.println(deporte);
        }
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el nombre del deporte a eliminar : ");
        String nombreDeporte=sc.nextLine();
        
//        if(deportes.contains(nombreDeporte)){
//            System.out.println("Lo ha eliminado.");
//            deportes.remove(nombreDeporte);
//        }else{
//            System.out.println("No se encontró dicho deporte.");
//        }
        
        if(deportes.remove(nombreDeporte)){
            System.out.println(nombreDeporte + " ha sido eliminado.");
        }else{
            System.out.println("No se encontró dicho deporte.");
        }
        
        // Mostrar el contenido del HashSet despues de la eliminacion.
        System.out.println("Contenido del HashSet tras la eliminacion : ");
        for (String deporte : deportes) {
            System.out.println(deporte);
        }
        sc.close();
        
        // a.
        for (String deporte : deportes) {
            System.out.println(deporte);
        }
        // b.
        Iterator<String> iterator=deportes.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // c. (imprimiendo el conjunto directamente)
        System.out.println(deportes);
        
                
    }
}
