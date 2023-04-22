/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointerface.ejercicio3;

/**
 *  Interface que recoge métodos para relaciones entre fracciones.
 * @author Sixtus32 
 * 
 */
public interface Relaciones {
    
    /**
     * Devuelve true o false según el objeto this sea mayor que b
     * @param b el valor del objecto this.
     * @return 
     *             - true si el objeto this es mayor que b
     *             - false si el objeto this no es mayor que b
     *        
     */
    boolean esMayor(Object b);
    /**
     * Devuelve true o false según el objeto this sea menor que b
     * @param b el valor del objeto this.
     * @return 
     * 
     *  - true si el objeto this es menor que b
     *  - false si el objeto this es no es menor que b
     * 
     */
    boolean esMenor(Object b);
    
    /**
     * Devuelve true o false según el objeto this sea igual o no que b.
     * @param b el valor del objeto this.
     * @return 
     * 
     *      - true si el objeto this es igual que b
     *      - false si el objeto this es no igual que b
     *
     */
    boolean esIgual(Object b);
    
    /**
     * Devuelve el nombre de la clase.
     * @return Retorna el nombre de la clase en formato String.
     */
    default String nombreClase(){
        return this.getClass().getSimpleName();
    }
    
    /**
     * Indica si la relacion es null o no.
     * @param relacion Recibe objetos que implementa la interfaza.
     * @return Devuelve true o false según sean null o no.
     */
    static boolean isNull(Relaciones relacion){
        return relacion == null;
    }
}
