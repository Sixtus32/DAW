/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ut09.ejercicio2;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author s6x
 */
public class Estudiante implements Cloneable, Comparable<Estudiante>{
    private final String nombre;
    private final int NRE;
    private final int edad;

    public Estudiante(String nombre, int NRE, int edad) {
        this.nombre = nombre;
        this.NRE = NRE;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNRE() {
        return NRE;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estudiante other = (Estudiante) obj;
        if (this.NRE != other.NRE) {
            return false;
        }
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "\tnombre : " + nombre + 
                "\n\tedad :" + edad +
                "\n\tNRE : " + NRE +"\n\n";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            return super.clone(); //To change body of generated methods, choose Tools | Templates
        } catch (Exception e) {
            System.out.println("No se podra clonar.");
        }
        return null;
    }

    @Override
    public int compareTo(Estudiante o) {
        return this.nombre.compareTo(o.nombre);
    }
    
    static class OrdenAlpha implements Comparator<Estudiante>{

        @Override
        public int compare(Estudiante o1, Estudiante o2) {
            return o1.nombre.compareTo(o2.nombre);
        }


    }
    
    
    
}
