///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */

package class_clientela;

/**
 *
 * @author DAW
 */
public class Ventana {
    private boolean abierta;

    public Ventana() {
        this.abierta=false;
    }

    public Ventana(boolean abierta) {
        this.abierta = abierta;
        
    }
    
    public boolean isAbierta() {
        return abierta;
    }

    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }
    
    public boolean estaAbierta(){
        return this.abierta;
    }
    public void abrir(){
        this.abierta=true;
    }
    public void cerrar(){
        this.abierta=false;
    }
    @Override
    public String toString() {
        String info=(abierta) ? "Abierta" : "Cerrada";
        return info;
    }
    
    
}
