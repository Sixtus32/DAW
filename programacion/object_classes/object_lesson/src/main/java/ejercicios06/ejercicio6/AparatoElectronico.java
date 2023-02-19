/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios06.ejercicio6;
/**
 *
 * @author sixtu
 */
public class AparatoElectronico {
    private float precioBase;
    private String color; // blanco, negro, rojo, azul, gris.
    private char consumoEnergetico; // A,B,C,D,E,F
    private byte peso;
    
    // preferencia mia.
    private final static char CONSUMO_POR_DEFECTO='F';
    private final static String COLOR_POR_DEFECTO="BLANCO";

    public AparatoElectronico() {
        this.color="Blanco".toUpperCase();
        this.consumoEnergetico='F';
        this.precioBase=100;
        this.peso=5;
    }
    
    public AparatoElectronico(float precio, byte peso){
        this(precio, COLOR_POR_DEFECTO, CONSUMO_POR_DEFECTO, peso);
        
    }

    public AparatoElectronico(float precioBase, String color, char consumoEnergetico, byte peso) {
        this.precioBase = precioBase;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public byte getPeso() {
        return peso;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public void setPeso(byte peso) {
        this.peso = peso;
    }
    
    
    
    
    
    private void comprobarConsumoEnergetico(char letra){
        if(Character.toUpperCase(letra) == 'A' ||
           Character.toUpperCase(letra) == 'B' ||
           Character.toUpperCase(letra) == 'C' ||
           Character.toUpperCase(letra) == 'E' ||
           Character.toUpperCase(letra) == 'F'){
            this.consumoEnergetico = Character.toUpperCase(letra);
        }else{
            this.consumoEnergetico = 'F';
        }
    }
    
    private void comprobarColor(String color){
        if("BLANCO".equals(color.toUpperCase()) ||
            "NEGRO".equals(color.toUpperCase()) ||
            "ROJO".equals(color.toUpperCase()) ||
            "AZUL".equals(color.toUpperCase())||
            "GRIS".equals(color.toUpperCase())){
            this.color = color.toUpperCase();
        }else {
            this.color = "BLANCO";
        }
    }
    
    public float precioFinal(){
        
        float precio_final;
        float precioPorConsumo;
        float precioPorPeso;
        
        switch(this.consumoEnergetico){
            case 'A':
                precioPorConsumo=100;
            break;
            case 'B':
                precioPorConsumo=80;
            break;
            case 'C':
                precioPorConsumo=60;
            break;
            case 'D':
                precioPorConsumo=50;
            break;
            case 'E':
                precioPorConsumo=30;
            break;
            default:
                precioPorConsumo=10;
        }
        
        if (this.peso >= 0 && this.peso <= 19){
            precioPorPeso=10;
        }else if (this.peso > 19 && this.peso <= 49){
            precioPorPeso=50;
        }else if (this.peso > 49 && this.peso <=79){
            precioPorPeso=80;
        }else {
            precioPorPeso=100;
        }       
        precio_final = this.precioBase + precioPorConsumo + precioPorPeso;
        return precio_final;
    }
    
//    // opcional. NO SOLICITADO, pero...
    @Override
    public String toString() {
        String info="Aparato Electrico.";
//        info += "\n******************************";
        info += "\n\tPrecio Base : " + this.precioBase;
        info += "\n\tColor : " + this.color;
        info += "\n\tConsumo Energetico : " + this.consumoEnergetico;
        info += "\n\tPeso : " + this.peso;
//        info += "\n******************************";
        return info; //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
