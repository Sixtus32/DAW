/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programing;

/**
 *
 * @author DAW
 */
public class SocioClubPadel {
    private int codigoSocio;
    private String nombre;
    private String apellido;
    private int edad;
    private int telefono;
    private String email;
    private boolean sonSocios;

    public SocioClubPadel() {
    }

    public int getCodigoSocio() {
        return codigoSocio;
    }

    public void setCodigoSocio(int codigoSocio) {
        this.codigoSocio = codigoSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isSonSocios() {
        return sonSocios;
    }

    public void setSonSocios(boolean sonSocios) {
        this.sonSocios = sonSocios;
    }
    
    public void calcularCuota(){
        double cuota=800;
        if(this.edad >= 65){
            cuota=cuota*0.4;
            System.out.println("Couta " + cuota);
        }else if (this.edad < 21) {
            cuota=cuota*0.25;
        }      
    }
}
