/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

import herencia.Persona.Persona;
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
        Scanner entradaDato=new Scanner(System.in);
        try{
            System.out.println("Introduce nombre : ");
            String nom=entradaDato.nextLine();
            System.out.println("Introduce edad");
            byte edad=entradaDato.nextByte();
            System.out.println("Introduce sexo : ");
            char sex=entradaDato.next().charAt(0);
            System.out.println(new Persona(nom,edad,sex));
        }catch(Exception e){
            System.out.println("Error. En tipo de dato introducido");
        }
        
    }
    
}
