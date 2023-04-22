/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_cine;

/**
 *
 * @author sixtu
 */
public class Asiento {

    //atributos
    /*private int filas;
    private int columnas;*/
    private char letra;
    private int numero;
    private Espectador especatador;
    
    public Asiento (char letra, int numero){
        this.letra=letra;
        this.numero=numero;
        this.especatador=null;
    }
    // Hay espacio libre o no 
    public boolean estaOcupado(){
        return especatador != null;
    }
    
    public boolean asignarEspectador(Espectador e){
        if(!estaOcupado()){
            especatador = e;
            return true;
        }else{
            return false;
        }
        
    }
    
    public char getLetra(){
        return letra;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public Espectador getEspectador(){
        return this.especatador;
    }
    
    public void desocupar(){
        this.especatador=null;
    }


    @Override
    public String toString() {
        return this.numero + "" + this.letra + " ";
    }
    
    

}
