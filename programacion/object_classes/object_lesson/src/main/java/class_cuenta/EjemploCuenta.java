/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.daw.programing;

/**
 *
 * @author DAW
 */
public class EjemploCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException  {
        // TODO code application logic here
        Cuenta c1=new Cuenta("Ana Perés", 500);
//        System.out.println(c1);
        Cuenta c2=new Cuenta("Antonio Piñon", 1200);
//        System.out.println(c2);

        Cuenta [] cuentas=new Cuenta[5];            // apuntadores en un principio apuntan a NULL.
        cuentas[0]=new Cuenta("Diego", 283);
        cuentas[1]=c1;
        cuentas[2]=c2;
        cuentas[3]=new Cuenta("Carolina", 368);
        cuentas[4]=new Cuenta("Papo", 789);
        
        for (Cuenta cuenta : cuentas) {
            if(cuenta != null){
                System.out.println(cuenta);
            }
     
        }
       
    }
    
}
