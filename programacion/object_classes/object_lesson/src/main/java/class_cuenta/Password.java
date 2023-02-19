/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programing;

/**
 *
 * @author DAW
 */
public class Password {
    private int longitud;
    private String contrasena;

    public Password() {
        this.longitud = 8;
    }

    public Password(int longitud) {
        this.longitud = longitud;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public boolean esFuerte(){
        char [] temp=this.contrasena.toCharArray();
        int contMayus=0;
        int contMinus=0;
        int contNum=0;
        for (int i = 0; i < this.contrasena.length(); i++) {
            if(Character.isUpperCase(temp[i])){
                contMayus++;
            }else if (Character.isLowerCase(temp[i])){
                contMinus++;
            }else if (Character.isDigit(temp[i])){
                contNum++;
            }
        }
        return (contMayus > 2 && contMinus > 1 && contNum > 5);
    }
    
    public void generarPassword(){
        String password="";
        for (int i = 0; i < this.longitud; i++) {
            password += (char)((int) (Math.random() * (121 - 48 + 1) + 48));
        }
        this.contrasena=password;
    }
    
}
