/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioweb.ejercicio_14;

/**
 *
 * @author sixtu
 */
public class BebidaAzucarada extends Bebida{
    private double porcentajeAzucar;
    private boolean tienePromocion;

    public BebidaAzucarada(int identificador, double litro, double precio, String marca, double porcentajeAzucar, boolean tienePromocion) {
        super(identificador, litro, precio, marca);
        this.porcentajeAzucar = porcentajeAzucar;
        this.tienePromocion = tienePromocion;
    }

    public double getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    public boolean tienePromocion() {
        return tienePromocion;
    }

    @Override
    public String toString() {
        
        String info="BebidaAzucarada.\n" + super.toString() + "\n\t\tPorcentajeAzucar : " + Math.round(porcentajeAzucar) + " % ";
        info+=tienePromocion ? "\n\t\t\t\tCon Promocion.\n" : "\n\t\t\t\tSin Promocion.\n";
        return info;
    }
    
    
}
