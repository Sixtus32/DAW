/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_clientela;

/**
 *
 * @author DAW
 */
public class Rueda {
    
    private double presion;

    public Rueda() {
        this.presion=0;
    }

    public Rueda(double presion) {
        this.presion = presion;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }
    
    public void inflar(){
        this.presion+=5;
    }
    
    public void desinflar(){
        if( this.presion >= 0.5 ){
            this.presion-=5;
        }
    }

    @Override
    public String toString() {
        String info=" (presion) : " + this.presion;
        return info;
    }
            
    
}
