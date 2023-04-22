/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ut09.ejercicio4;

import java.time.LocalDate;

/**
 *
 * @author s6x
 */
public class Persona implements Comparable<Persona>{
    private final String nombre;
    private final String apellido;
    private final LocalDate fechaNacimiento;
    private final int edad;

    public Persona(String nombre, String apellido, LocalDate fechaNacimiento, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }
    
    @Override
        public int compareTo(Persona otraPersona) {
            return this.apellido.compareTo(otraPersona.apellido);
        }
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad + '}';
    }
    
    
}
