/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointerface.ejercicio11;

import ejerciciointerface.ejercicio3.Fraccion;
import ejerciciointerface.ejercicio3.Relaciones;
import ejerciciointerface.ejercicio7.Linea;

/**
 *
 * @author Sixtus32 <https://github.com/Sixtus32>
 */
public class Principal {
    public static void main(String[] args) {
        
        // PARA COMPARABLE -> PARA HACER USO DEL ORDEN NATURAL.
        
        Relaciones [] relaciones=new Relaciones[10];
        
        relaciones[0]=new Linea(0, 0, 1, 1);
        relaciones[1]=new Fraccion(1, 2);
        relaciones[2]=null;
        relaciones[3]=new Fraccion(3, 4);
        relaciones[4]=new Linea(2, 3, 4, 5);
        
        for (Relaciones relacione : relaciones) {
            if (!Relaciones.isNull(relacione)) {
                System.out.println(relacione);
            }
        }
    }
            
}
