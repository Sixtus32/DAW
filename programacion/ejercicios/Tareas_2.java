package com.mycompany.ejercio_1;

/*
 *Programa que calcule la longitud en centímetros de una circunferencia de radio 3 metros. 

El radio es una constante. (Fórmula: L=2 *л*r)  (1m = 100 cm)

 * */
import java.lang.Math;

public class Tareas_2 {

  public static void main (String [] args){
    calculate();
  }


  static void calculate(){

    final double RADIO_PI = Math.PI;

    double longitude = 2 * RADIO_PI * 3;

    System.out.println("The longitude in centimeters is : " + longitude + "cm.");

  }
}
