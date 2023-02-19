/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programing;

/**
 *
 * @author DAW
 */
public class Cafetera {
    private final float capacidadMaxima;
    private float cantidadActual;

    public Cafetera() {
        this.capacidadMaxima=1000f;
        this.cantidadActual=0;
    }

    public Cafetera(float capacidadMaxima) {
        this.capacidadMaxima=capacidadMaxima;
        this.cantidadActual=capacidadMaxima;
    }

    public Cafetera(float capacidadMaxima, float cantidadActual) {
        if(cantidadActual > capacidadMaxima){
            this.capacidadMaxima=capacidadMaxima;
            this.cantidadActual=capacidadMaxima;
        }else{
            this.capacidadMaxima=capacidadMaxima;
            this.cantidadActual=capacidadMaxima;
        }
    }

    public float getCantidadActual() {
        return cantidadActual;
    }
    
    public float getCapacidadMaxima(){
        return this.capacidadMaxima;
    }
    
    public void llenarCafetera(){
        this.cantidadActual=this.capacidadMaxima;
    }
    
//  Operad. Relaciones
//            < <= > >= != == 
//  Expresión relacional
//            x > y
    
    public void servirTaza(float capacidadTaza){
        if(this.cantidadActual > capacidadTaza){
            this.cantidadActual-=capacidadTaza;
        }else{
            this.cantidadActual=0;
        }
    }
    
    public void vaciarCafetera(){
        this.cantidadActual=0;
    }
    
    public void agregarCafe(float cantidad){
        if ((cantidad + this.cantidadActual) > this.capacidadMaxima){
            this.cantidadActual=this.cantidadActual+cantidad;
        }else{
            this.cantidadActual=this.capacidadMaxima;
        }
    }

    @Override
    public String toString() {
        
        return "Info. Cafetera : \n\tCapacidad Máxima : " 
                            + this.capacidadMaxima + " ml."
                + " \n\tCapacidad Actual : "
                            + this.cantidadActual + " ml.";
    }
    
    
       
}
