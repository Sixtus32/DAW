/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package class_clientela;

/**
 *
 * @author DAW
 */
public class Motor {
    
    private boolean parado;
    
    public Motor() {
        this.parado=true;
    }

    public void setParado(boolean parado) {
        this.parado = parado;
    }

    public boolean isParado() {
        return parado;
    }
    
    public boolean estaParado(){
        return this.parado;
    }
    
    public void arrancar(){
        this.parado=false;
    }
    
    public void parar(){
        this.parado=true;
    }

    @Override
    public String toString() {
        return (this.parado) ? "Parado" : "En Marcha";
    }

    
}
