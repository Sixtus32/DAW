/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioweb.algorit;

import java.util.Scanner;

/**
 *
 * @author sixtu
 */
public class AppBusquedaBinaria {
    
    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
        
        int numeroIntroducido, max, min, resultado;
        boolean resulto=false;
        
        do {            
            
            System.out.println("Introduce el máximo : ");
            max=sc.nextInt();
            
            System.out.println("Introduce el mínimo : ");
            min=sc.nextInt();
            
            System.out.println("Introduce un número entre 1 - 100 : ");
            numeroIntroducido=sc.nextInt();
            
        } while (numeroIntroducido >= min && numeroIntroducido<=max);
        
        while (!resulto) {  
            resultado = max - min;
            
            if(resultado > numeroIntroducido){
                System.out.println("Muy alto.");
            }else if (resultado < numeroIntroducido){
                System.out.println("Muy bajo");
                min = resultado + 1;
            }else{
                resulto=true;
            }
        }
        
        
        
        
        
        
        
        
        
        
    }
           
}
