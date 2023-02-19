/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios06.ejercicio7;

import java.time.LocalDate;

/**
 *
 * @author sixtu
 */
public class Prestamo {
    private LocalDate fechaAlta;
    private LocalDate fechaDevolucion;
    private Socio socio;
    private Multimedia alquila;

//    public Prestamo() {
//    }
//    
//    
//    
    public  Prestamo(LocalDate fechaAlta, LocalDate fechaDevolucion){
        this.fechaAlta=fechaAlta;
        this.fechaDevolucion=fechaDevolucion;
    }

    public Prestamo(LocalDate fechaAlta, LocalDate fechaDevolucion, Socio socio, Multimedia alquila) {
        this.fechaAlta = fechaAlta;
        this.fechaDevolucion = fechaDevolucion;
        this.socio = socio;
        this.alquila = alquila;
    }


    //añadido
    public void devolver(){
        /* Aqui se compara la fecha actual con la fecha de devolción.
        segun la API de java [ isAfter ] Comprueba si esta fecha es 
        posterior a la fecha especificada.*/
        LocalDate hoy=LocalDate.now();
        if(hoy.isAfter(this.fechaDevolucion)){
            this.alquila=null;
//            this.fechaAlta=null;
//            this.fechaDevolucion=null;
            System.out.println("Se producirá la devolución.");
        }
        
    }

    /* lo que creo que solicita el ejercicio ...*/
    @Override
    public boolean equals(Object obj) {
        if(this.getClass() == obj.getClass()){
            Prestamo p=(Prestamo) obj;           
           return true;
        }
        return false; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    // lo que al parecer se solicita
    public boolean equals(){
        return false;
    }
    
    
    
    
}
