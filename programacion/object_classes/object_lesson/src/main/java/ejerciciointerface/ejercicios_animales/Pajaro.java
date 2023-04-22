/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointerface.ejercicios_animales;

import java.time.LocalDate;

/**
 * Clase Pajaro.
 * @author s6x
 */
public class Pajaro extends Animal {
    /**
     * especie del pajaro
     */
    private EspeciePajaro especie;
    /**
     * cantor o no cantor
     */
    private boolean cantor;
    
    /**
     * Crea un objeto pajaro con las espeficaciones establecidas.
     * @param nombre - nombre del ave
     * @param fechaNac - fecha de nacimiento del ave
     * @param peso - peso del ave
     * @param especie - especie al que pertenece el ave
     * @param cantor - espeficica si el pajaro es cantor o no
     */
    public Pajaro(String nombre, LocalDate fechaNac, byte peso,EspeciePajaro especie, boolean cantor) {
        super(nombre, fechaNac, peso);
        this.cantor=cantor;
        this.especie=especie;
    }
    
    /**
     * Obtiene la especie al que corresponede al pajaro.
     * @return devuelve la especie del pajaro
     */
    public EspeciePajaro getEspecie() {
        return especie;
    }
    /**
     * Indica si el pajaro es cantor o no.
     * @return devuelve true o false segun sea cantor o no
     */
    public boolean isCantor() {
        return cantor;
    }  
    
    /**
     * Obtiene un informe detallado del animal.
     * @return devuelve una cadena de caracteres con todo respecto al animal
     */
    @Override
    public String toString() {
        String info="|\t_Pajaro___________________________________"  + "\t\t\t\t";
        info+=" \n|\t|Nombre : " + this.getNombre() + "\t\t";
        info+="\t\n|\t|Fecha de nacimiento : " + this.getFechaNac()  + "";
        info+="\t\n|\t|Peso : " + this.getPeso() + "kg"  + "\t\t";
        info+="|\n\t|Especie : "+ this.getEspecie()  + "\t\t";
        info+=isCantor() ? "\n|\t|ES CANTOR " : "\n|\t|NO ES CANTOR"  + "\t\t";
        info+="\n\n\tComentario : ";
        info+=this.getComentario() == null ? "SIN COMENTARIOS." : this.getComentario();
        return info;
    }

    
    
}
