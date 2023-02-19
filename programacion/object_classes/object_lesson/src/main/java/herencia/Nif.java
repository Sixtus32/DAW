/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author DAW
 */
public class Nif {
    private long numero;
    private char letra;

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
        this.calculaLetra();
    }
    
    private void calculaLetra(){
       this.letra="TRWAGMYFPDXBNJZSQVHLCKE".charAt((int) (this.numero % 23));
    }
    
    public String getNif(){
        return this.numero + "-"+this.letra;
    }

    public Nif(long numero) {
        this.numero = numero;
        this.calculaLetra();
    }
    
    
    
    
}
