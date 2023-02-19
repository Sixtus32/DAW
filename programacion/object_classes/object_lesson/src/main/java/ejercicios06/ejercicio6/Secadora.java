/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios06.ejercicio6;

/**
 *
 * @author sixtu
 */
public class Secadora extends AparatoElectronico{
    private byte carga;

    public Secadora() {
        this.carga=5;
    }

    public Secadora(float precio, byte peso) {      
        super(precio, peso);
        this.carga = 5;
    }

    public Secadora(byte carga) {
        super();
    }

    public byte getCarga() {
        return carga;
    }

    public void setCarga(byte carga) {
        this.carga = carga;
    }
    
    
    @Override
    public float precioFinal() {       
        if(this.carga > 30) {
            return super.precioFinal() + 50; 
        }else {
            return super.precioFinal();
        }
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }     
}
