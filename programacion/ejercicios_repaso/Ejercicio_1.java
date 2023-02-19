/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ANTONIOESPIN;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Aqui meto el metodo Scanner y defino las variables
        Scanner sc = new Scanner(System.in);
        //Estas variables son constantes ya que no deben cambiar
        final int cria = 3, adulto = 2;//El identificador de las constantes se escribe en mayúsculas
        //Aqui defino las demas variables
        float sumacrias = 0, sumaadultos = 0;
        int contviejos = 0, contpesos = 0;
        float peso;
        //Aqui tengo un bucle en el que leo el peso y segun el que sea se ve si es cria, adulto o viejo
        while (contpesos < 5) {
            System.out.println("Inserte el peso del conejo");
            peso = sc.nextFloat();
            //Este if sirve para ver si el peso esta en el rango debido, si no lo esta no cuenta la repeticion, solo se aumenta el contpesos si esta entre 0 y 20
            if (peso >= 0 && peso <= 20) {
                contpesos++;
                if (peso > 0 && peso <= 2) {
                    sumacrias += cria;
                } else if (peso > 2 && peso <= 8) {
                    sumaadultos += (peso * adulto);
                } else {
                    contviejos++;
                }
            } else {
                System.out.println("Peso no valido, debe estar entre 0 y 20");
            }
        }
        //Aqui se enseñan los resultados
        System.out.println("Se ganaran " + sumacrias + "€ con la venta de crias");
        System.out.println("Se ganaran " + sumaadultos + "€ con la venta de adultos");
        System.out.println("Y se tienen " + contviejos + " conejos viejos en la granja");
    }

}
