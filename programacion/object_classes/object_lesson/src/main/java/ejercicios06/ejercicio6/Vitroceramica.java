/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios06.ejercicio6;

/**
 *
 * @author sixtu
 */
public class Vitroceramica extends AparatoElectronico{
    private boolean induccion;

    public Vitroceramica() {
        this.induccion=false;
    }

//    public Vitroceramica(float precio, byte peso) {
//        super(precio, peso);
//        this.induccion = false;
//    }
    

    public Vitroceramica(boolean induccion) {
        super();
        this.induccion = induccion;
    }

   

//    public boolean isInduccion() {
//        return induccion;
//    }

    public void setInduccion(boolean induccion) {
        this.induccion = induccion;
    }

//    @Override
//    public String toString() {
//        return super.toString(); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    
    public byte getResolucion(){
        return 45;
    }
    
    public String getSintonizadorTDT(){
        return "Sintonizador TDT.";
    }

//    @Override
//    public float precioFinal() {
//        return super.precioFinal() + (super.precioFinal() * 0.3f); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public float precioFinal() {
        return super.precioFinal(); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
    
    
    
    
    
    
    
    
    
    
}
