/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ut09.ejercicio4;

import java.util.Comparator;

/**
 *
 * @author s6x
 */
public class ComparadorApellido implements Comparator<Persona>{

    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getApellido().compareTo(o2.getApellido());
    }
    
}
