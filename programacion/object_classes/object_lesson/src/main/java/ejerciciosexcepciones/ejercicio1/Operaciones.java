/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosexcepciones.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author s6x
 */
public class Operaciones {

    public Operaciones() {
    }
    
    
    public int sumar(Scanner sc) throws GestorExcepciones{       
        System.out.println("Introduce el primer digito : ");
        int num1=sc.nextInt();
        System.out.println("Introduce el segundo digito : ");
        int num2=sc.nextInt();
        if(num1 < 0 || num2 < 0){
            throw new GestorExcepciones("Digitos inferiores a 0 `[PARA LA SUMA] ");
        }
        
        return num1 + num2;
    }
    
    public int restar(Scanner sc)throws GestorExcepciones{
        System.out.println("Introduce el primer digito : ");
        int num1=sc.nextInt();
        System.out.println("Introduce el segundo digito : ");
        int num2=sc.nextInt();
        
        if(num1 < 0 || num2 < 0){
            throw new GestorExcepciones("Digitos inferiores a 0 [PARA LA RESTA]");
        }
        
        return num1 - num2;
    }
}
