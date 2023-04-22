/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioweb.ejercicio_14;

/**
 *
 * @author sixtu
 */
public class AguaMineral extends Bebida {
    private String origen;

    public AguaMineral(int identificador, double litro, double precio, String marca, String origen) {
        super(identificador, litro, precio, marca);
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    @Override
    public String toString() {
        return "AguaMineral.\n" + super.toString() + "\n\t\tOrigen : " + origen + ".\n";
    }
    
    
}
