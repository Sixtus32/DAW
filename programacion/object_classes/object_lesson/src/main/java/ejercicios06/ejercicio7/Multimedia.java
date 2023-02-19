/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios06.ejercicio7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;


public class Multimedia {
  private String titulo;

  private ArrayList<String> autor;

  private String genero;

  private Boolean disponible;

  private Mediateca mediateca;
  
  private Socio alquila;

    public Multimedia() {
    }


    public Multimedia(String titulo, ArrayList<String> autor, String genero, Boolean disponible, Mediateca mediateca, Socio alquila) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponible = disponible;
        this.mediateca = mediateca;
        this.alquila = alquila;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public ArrayList<String> getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public Mediateca getMediateca() {
        return mediateca;
    }

    public Socio getAlquila() {
        return alquila;
    }
    
    //añadido
    public void prestadoA(Socio s){
        this.alquila=s;
    }
    
    

  public void cambiarDisponibilidad() {
      this.disponible = this.disponible != true;
  }

    // lo solicita el ejercicio.
    @Override
    public boolean equals(Object obj) {
        if (this.getClass() == obj.getClass()){
            Multimedia m=(Multimedia) obj;
            return ((m.titulo == null ? this.titulo == null : m.titulo.equals(this.titulo)) && m.autor == this.autor);
        }else {
            return false;
        }
    }

    // Lo solicito el entorno de desarrollo.
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.titulo);
        hash = 97 * hash + Objects.hashCode(this.autor);
        return hash;
    }
  
  

    @Override
    public String toString() {
        String info="Multimedia.";
        info += "\n******************************\n";
        info +="\n\tTitulo : " + this.titulo;
        info += "\n\tAutor : " + this.autor;
        info += "\n\tGenero : " + this.genero;
        info += this.disponible ? "\n\tESTADO : DISPONIBLE" : "\n\tESTADO : NO DISPONIBLE";
        info += "\n\tMediateca : " + this.mediateca;
        info += "\n\tSocio : " + this.alquila;
        info += "******************************\n";
        return info; //To change body of generated methods, choose Tools | Templates.
    }
  
  
}
