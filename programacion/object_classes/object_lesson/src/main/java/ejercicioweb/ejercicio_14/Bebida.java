/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioweb.ejercicio_14;

/**
 *
 * @author sixtu
 */
public abstract class Bebida {
    private final int identificador;
    private double litro;
    private double precio;
    private String marca;

    public Bebida(int identificador, double litro, double precio, String marca) {
        this.identificador = identificador;
        this.litro = litro;
        this.precio = precio;
        this.marca = marca;
    }

    public int getIdentificador() {
        return identificador;
    }
    
    
    public double getLitro() {
        return litro;
    }

    public void setLitro(double litro) {
        this.litro = litro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "\n\t\tIdentificador : " + identificador + 
                "\n\t\tLitro : " + litro + 
                "\n\t\tPrecio : " + precio + 
                "\n\t\tMarca : " + marca + "\n";
    }
    
    
    
    
}
