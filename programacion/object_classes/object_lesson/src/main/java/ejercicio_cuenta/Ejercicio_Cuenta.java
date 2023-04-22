/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio_cuenta;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author DAW
 */
public class Ejercicio_Cuenta {

    public static void main(String[] args) {
        
        Alumnos a1=new Alumnos(123, 9.5);
        Alumnos a2=new Alumnos(234, 7.5);
        Alumnos a3=new Alumnos(23, 5.5);
        Alumnos a4=new Alumnos(34, 7.5);
        
        ArrayList<Alumnos> listaAlumnos=new ArrayList<>();
        listaAlumnos.add(a1);
        listaAlumnos.add(a2);
        listaAlumnos.add(a3);
        listaAlumnos.add(a4);
        
        Collections.sort(listaAlumnos);
        
        for (Alumnos listaAlumno : listaAlumnos) {
            System.out.println(listaAlumno);
        }
        if (a1.compareTo(a2)>1) {
            System.out.println("El alumno 1 es mayor");
        }
         
    }
}
