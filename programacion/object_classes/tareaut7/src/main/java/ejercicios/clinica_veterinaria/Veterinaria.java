/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.clinica_veterinaria;

import java.util.ArrayList;

/**
 * Clinica veterinaria para animales
 * @author s6x
 */
public class Veterinaria {
    /**
     * un listado de animales
     */
    private ArrayList <Animal> coleccionAnimales;
    
    /**
     * Crea una clinica veteninaria para animales.
     */
    public Veterinaria() {
        this.coleccionAnimales=new ArrayList<>();
    }
    
    /**
     * Obtiene el numero de animales que hay en la clinica.
     * @return el numero de animales en clinica
     */
    public int getNumColeccionAnimales() {
        return coleccionAnimales.size();
    }
    
    /**
     * Establece el tipo de animal que se ingresara en la clinica.
     * @param animal el animal a ingresar
     */
    public void anadirAnimal(Animal animal){
        if(animal != null && !this.buscarAnimal(animal.getNombre())){
            coleccionAnimales.add(animal);
            System.out.println("\n\t\t\t**************  ANIMAL INSCRITO CORRECTAMENTE  **************");
        }else{
            System.out.println("\n\t\t\t**************  ERRROR : FALLO EN EL PROCESO DE INSCRIPCION  **************");
        }  
    }

    /**
     * Busca entre los ingresados el animal con dicho nombre.
     * @param nombre nombre del animal
     * @return devuelve true o false segun se halla el animal en la veterinaria 
     */
    public boolean buscarAnimal(String nombre){
        for (Animal coleccionAnimale : coleccionAnimales) {
            if (coleccionAnimale.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        
        return false;
    }
    
    /**
     * Establece un comentario para el animal con dicho nombre.
     * @param nombre nombre del animal a comentar
     * @param comentario comentario a realizar
     */
    public void modifComentarioAnimal(String nombre, String comentario){
        for (Animal coleccionAnimale : coleccionAnimales) {
            if (buscarAnimal(nombre)) {
                coleccionAnimale.setComentario(comentario);
            }
        }
    }
    
    /**
     * Muestra que animales se encuentra en la veterinaria
     */
    public void mostrarAnimales(){
        int count=0;
        for (Animal coleccionAnimale : coleccionAnimales) {
            if (coleccionAnimale != null) {
                System.out.println("__________________________________________________");
                System.out.print(coleccionAnimale);
                System.out.println("\n|__________________________________________________\n");
                count++;
            }
        }
        
        if(this.getNumColeccionAnimales() == 0){
            System.out.println("NO NINGUA ANIMAL REGISTRADO EN ESTA VETENINARIA AUN.");
            System.out.println("\n|_______________________________________|");
        }
    }
    
    /**
     * Obtiene un informe acerca de los animales registrados en la veterinaria.
     * @return devuelve una cadena de caracteres con informacion de todos los animales en la veterinaria
     */
    @Override
    public String toString() {
          return this.coleccionAnimales.toString();
    }
    
    

    
  
}
