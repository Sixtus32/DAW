/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercio_1;

import java.util.Scanner;

/**
 *
 * @author sixtu
 */
public class Ejercicio {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce texto : ");
        
        String str = input.nextLine();
        
        System.out.println("Este es el texto que has introduce : " + str);       
    }
}
