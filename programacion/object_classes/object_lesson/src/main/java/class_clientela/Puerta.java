/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_clientela;

/**
 *
 * @author DAW
 */
public class Puerta {
    private boolean abierta;
    private Ventana ventana;

    public Puerta() {
        this.abierta=false;
    }

    public Puerta(Ventana ventanilla) {
        this.abierta=false;
        this.ventana = ventanilla;
    }

    public boolean isAbierta() {
        return abierta;
    }

    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }

    public Ventana getVentana() {
        return ventana;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }
    
    public void abrir (){
        this.abierta=true;
    }
    
    public void cerrar(){
        this.abierta=false;
    }

    @Override
    public String toString() {
        String info=(this.abierta) ? "  Abierta  ": "  Cerrada ";
        return info;
    }
    
    
    
}
