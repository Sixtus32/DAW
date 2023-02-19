package com.daw.programing;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAW
 */
public class Cuenta {

    //atributo
    private int codigo;
    private String titular;
    private double saldo;
    private static String tipo="Cuenta Ahorro";
    private static int ultimoCodigo=0;
    
    // Constructor
    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        this.codigo= ++ultimoCodigo;
    }
    

    public Cuenta() {
    }
  
    
    
    //setter y getter
    
    public int getCodigo(){
        return this.codigo;
    }
    

    public void setTitular(String titular){
        this.titular=titular;
    }
    
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    
    public String getTitular(){
        return this.titular;
    }
    
    public double getSaldo(){
        return this.saldo;
    }

    public static String getTipo() {
        return tipo;
    }

    public static void setTipo(String tipo) {
        Cuenta.tipo = tipo;
    }

    //método
    public void reintegro(double cantidad){
        if(saldo>=cantidad){
            saldo-=cantidad;
        }      
    }   
    public void ingreso(double cantidad){
        saldo+=cantidad;
    }

    @Override
    public String toString() {
        String datos="\nDatos cuenta :\n";
        datos+="\tTipo: " + tipo;
        datos+="\n\tCodigo : " + this.codigo;
        datos+="\n\tTiular : " + this.titular;
        datos+="\n\tSaldo : " +this.saldo+"\n";
        return datos;
    }

    
    
    
}
