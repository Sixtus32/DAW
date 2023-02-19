/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author DAW
 */
public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public double area(){
        return Math.PI * Math.pow(this.radio, 2);
    }
    public double perimetro(){
        return 2 * Math.PI * this.radio;
    }
    
    public double volumen(){
        return (4/3)*Math.PI*Math.pow(this.radio, 3);
    }

    public double getRadio(){
        return this.radio;
    }
}
