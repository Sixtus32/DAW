/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_cine;

/**
 *
 * @author sixtu
 */
public class Espectador {
    
    private String nombre;
    private byte edad;
    private double dinero;

    public Espectador(String nombre, byte edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public double getDinero() {
        return dinero;
    }

    @Override
    public String toString() {
        return "Espectador.\n" + "\n\tNombre : " + nombre + "\n\tEdad : " + edad + "\n\tDinero : " + Math.round(this.dinero)+ " euros .";
    }
    
    
    
    
}
