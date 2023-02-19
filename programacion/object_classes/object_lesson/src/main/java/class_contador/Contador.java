/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programing;

/**
 *
 * @author DAW
 */
public class Contador {
    //atributo del objeto
    private int cont;
    
    //Constructor por defecto.
    public Contador() {
        this.cont=0;
    }
    
    //Constructor con parámetros
    public Contador(int cont) {
        if(cont < 0){
            this.cont = 0;
        }else {
            this.cont = cont;
        }
    }
    //Getter
    public int getCont() {
        return cont;
    }
    
    //Setter
    public void setCont(int cont) {
        this.cont = cont;
    }
    
    //Método Incrementar.
    public void incrementar(){
        this.cont++;
    }
    
    //Método Decrementar
    public void decrementar(){
        if(this.cont >= 0){
            this.cont--;
        }else{
            this.cont = 0;
        }  
    }
    
}
