/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.clinica_veterinaria;

import java.time.LocalDate;

/**
 * Clase Reptil.
 * @author s6x
 * @see Animal
 * @see Especie
 */
public class Reptil extends Animal {
    /**
     * especie al que pertenece el reptil
     */
    private final Especie especie;
    /**
     * transmisor de veneno o no
     */
    private final boolean venenoso;
    
    /**
     * Crea un objeto perro con las espeficaciones establecidas.
     * @param nombre  nombre del reptil
     * @param fechaNac  fecha de nacimiento del reptil
     * @param peso  peso del reptil
     * @param especie  especie del reptil
     * @param veneso  espeficica si el reptil es venenoso o no
     */
    public Reptil(String nombre, LocalDate fechaNac, byte peso, Especie especie, boolean veneso) {
        super(nombre, fechaNac, peso);
        this.especie = especie;
        this.venenoso = veneso;
    }
    
    /**
     * Obtiene la especie al que pertenece el reptil.
     * @return devuelve la especie del reptil
     */

    public Especie getEspecie() {
        return especie;
    }
    
    /**
     * Indica si el reptil es venenoso o no.
     * @return devuelve true o false segun sea venenoso o no
     */
    public boolean isVeneso() {
        return venenoso;
    }
    
    /**
     * Obtiene un informe detallado del reptil.
     * @return devuelve una cadena de caracteres con todo respecto al reptil
     */
    @Override
    public String toString() {
        String info="|\t_Reptil___________________________________"  + "\t\t\t\t";
        info+=" \n|\t|Nombre : " + this.getNombre() + "\t\t";
        info+="\t\n|\t|Fecha de nacimiento : " + this.getFechaNac()  + "";
        info+=" \t\n|\t|Peso : " + this.getPeso() + "kg"  + "\t\t";
        info+="\n\t|Especie : "+ this.getEspecie();
        info+=isVeneso() ? "\n\tES VENENOSA" : "\n\tNO ES VENENOSA"  + "\t\t";
        info+="\n\n\tComentario : ";
        info+=this.getComentario() == null ? "SIN COMENTARIOS AÑADIDOS. " : this.getComentario();
        return info;
    }
    
    
    
    
}
