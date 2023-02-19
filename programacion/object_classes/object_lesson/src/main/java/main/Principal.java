/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//package com.daw.programing;
package main;

import class_clientela.*;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche c1=new Coche();
        
        
        Motor m=new Motor();
        m.arrancar();
        
        
        
        Rueda r=new Rueda ();
        r.inflar();
        
        Puerta p=new Puerta();
        p.cerrar();
        
        c1.setMotor(m);
        c1.setRuedas(r,0);
        c1.setRuedas(r,1);
        c1.setRuedas(r,2);
        c1.setRuedas(r,3);
        c1.setPuerta(p, 0);
        c1.setPuerta(p, 1);
        
        
        
        System.out.println(c1);
        /*********************************************/
        Coche c2=new Coche();
        
        
        
        System.out.println(c2);
        
        
        
        
    }
}
