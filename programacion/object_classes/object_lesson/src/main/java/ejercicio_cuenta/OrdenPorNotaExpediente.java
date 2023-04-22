/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_cuenta;

import java.util.Comparator;

/**
 *
 * @author s6x
 */
public class OrdenPorNotaExpediente implements Comparator<Alumnos>{

    @Override
    public int compare(Alumnos o1, Alumnos o2) {
        if (o1.getCalExp() < o2.getCalExp()) {
            return -1;
        } else if(o1.getCalExp() > o2.getCalExp()) {
            return 1;
        } else {
            return 0;
        }
    }
    
}
