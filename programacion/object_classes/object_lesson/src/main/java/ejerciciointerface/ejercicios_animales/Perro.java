/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointerface.ejercicios_animales;

import java.time.LocalDate;

/**
 * Clase Perro.
 * @author s6x
 */
public class Perro extends Animal{
    /**
     * raza del perro
     */
    private final Raza raza;
    /**
     * poseerdor de un chip o no
     */
    private boolean chip;
    
    /**
     * Crea un objeto perro con las espeficaciones establecidas.
     * @param nombre - nombre del perro
     * @param fechaNac - fecha de nacimiento del perro
     * @param peso - peso del perro
     * @param raza - raza del perro 
     * @param chip - espeficica si el perro posee chip o no
     */
    public Perro(String nombre, LocalDate fechaNac, byte peso, Raza raza, boolean chip) {
        super(nombre, fechaNac, peso);
        this.raza = raza;
        this.chip = chip;
    }
    /**
     * Obtiene la raza del perro.
     * @return devuelve la raza del perro
     */
    public Raza getRaza() {
        return raza;
    }
    
    /**
     * Indica si el perro trae un chip o no.
     * @return devuelve true o false segun lleve chip o no 
     */
    public boolean isChip() {
        return chip;
    }
    
    /**
     * Obtiene un informe detallado del perro.
     * @return devuelve una cadena de caracteres con todo respecto al perro.
     */
    @Override
    public String toString() {
        String info="|\t_Perro____________________________________"  + "\t\t\t\t";
        info+=" \n|\t|Nombre : " + this.getNombre() + "\t\t";
        info+="\t\n|\t|Fecha de nacimiento : " + this.getFechaNac()  + "";
        info+=" \t\n|\t|Peso : " + this.getPeso() + "kg"  + "\t\t";
        info+="\n\t|Raza : "+ this.getRaza();
        info+=isChip() ? "\n\t|LLEVA CHIP " : "\n\t|NO LLEVA CHIP " + "\t\t";
        info+="\n\n\tComentario : ";
        info+=this.getComentario() == null ? "SIN COMENTARIOS." : this.getComentario();
        return info;
    }


    
    
    
}
