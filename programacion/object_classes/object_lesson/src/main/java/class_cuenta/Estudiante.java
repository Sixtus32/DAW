/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programing;

/**
 *
 * @author DAW
 */
public class Estudiante {
    int a;
    static int b;

    public Estudiante() {
        b++;
        a++;
        
    }
   
    public void showData(){
        System.out.println("Valor de a : " + a);
        System.out.println("Valor de b : " + b);
    }
}
