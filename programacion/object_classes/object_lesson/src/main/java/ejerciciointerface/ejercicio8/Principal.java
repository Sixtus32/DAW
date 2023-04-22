/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointerface.ejercicio8;

import ejerciciointerface.ejercicio3.Fraccion;
import ejerciciointerface.ejercicio3.Relaciones;
import ejerciciointerface.ejercicio7.Linea;
import java.util.ArrayList;

/**
 *
 * @author Sixtus32 <https://github.com/Sixtus32>
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Relaciones> relaciones=new ArrayList<>();
        relaciones.add(new Linea(0, 0, 4, 8));
        relaciones.add(new Fraccion(8, 9));
        
        relaciones.forEach(relacione -> System.out.println("\n\tNombre de la clase : " + relacione.nombreClase() +relacione));
        
    }
}
