/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learn;

import java.io.File;

/**
 *
 * @author s6x
 */
public class UsoCarpetas {
    public static void main(String[] args) {
        
        
        /**
         * Crear una carpeta con 'mkdir()' o 'mkdirs()'
         */
        File carpetaRaiz = new File("carpetaRaiz");
        File carpeta1 = new File(carpetaRaiz, "carpeta1");

        if(carpeta1.mkdirs()) {
            System.out.println("Carpetas creadas exitosamente.");
        } else {
            System.out.println("No se pudieron crear las carpetas.");
        }
    }
}
