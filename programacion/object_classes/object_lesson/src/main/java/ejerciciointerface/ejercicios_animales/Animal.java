/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointerface.ejercicios_animales;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Clase abstracta Animal para los constructor de animales.
 * @author s6x
 */
public abstract class Animal {
    
    /**
     * nombre del animal
     */
    private final String nombre;
    /**
     * fecha de nacimiento del animal 
     */
    private final LocalDate fechaNac;
    /**
     * peso del animal
     */
    private byte peso;
    /**
     * comentario realizado acerca del animal
     */
    private String comentario;
    
    /**
     * Constructor de animal basandose en el nombre, fecha de nacimiento, peso y comentario.
     * @param nombre - nombre del animal
     * @param fechaNac - fecha de nacimiento del animal
     * @param peso - peso del animal
     * @param comentario - comentario a realizar sobre el animal
     */
    public Animal(String nombre, LocalDate fechaNac, byte peso, String comentario) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.peso = peso;
        this.comentario = comentario;
    }
    /**
     * Constructor de animal basandose en el nombre, fecha de nacimiento y peso. 
     * @param nombre - nombre del animal 
     * @param fechaNac - fecha de nacimiento del animal
     * @param peso - peso del animal
     */
    public Animal(String nombre, LocalDate fechaNac, byte peso) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.peso = peso;
    }
    /**
     * Obtiene el nombre del animal.
     * @return devuelve el nombre del animal
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Obtiene la fecha de nacimiento del animal.
     * @return devuelve la fecha de nacimiento del animal
     */
    public LocalDate getFechaNac() {
        return fechaNac;
    }
    /**
     * Obtiene el peso del animal.
     * @return devuelve el peso del animal
     */
    public byte getPeso() {
        return peso;
    }
    /**
     * Establece el peso del animal con el peso especificado.
     * @param peso - el peso del animal
     */
    public void setPeso(byte peso) {
        this.peso = peso;
    }
    
    /**
     * Obtiene el comentario realizado.
     * @return devuelve el comentario que se realizo.
     */

    public String getComentario() {
        return comentario;
    }
    /**
     * Establece un comentario especificado para el animal.
     * @param comentario - el comentario que se realiza
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    /**
     * Método sobre-escrito de Object con abstract.
     * @return informacion del animal.
     */
    @Override
    public abstract String toString();
}
