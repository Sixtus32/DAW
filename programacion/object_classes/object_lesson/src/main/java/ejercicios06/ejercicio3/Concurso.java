/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios06.ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author DAW
 */
public class Concurso {
    //constantes de clase
    private static final int NUM_PROBLEMAS_DEFAULT=5;
    
    //atributos
    private String nombre;
    private final int nProblemas;
    //Arraylist -> colecciones de estructuras dinamicas
    private ArrayList <String> listaEquipo;
    private ArrayList <Envio> listaEnvios;
    
    //constructores.
    public Concurso(String pNombre,int nProblemas) {
        this.nombre=pNombre;
        this.nProblemas = nProblemas;
        this.listaEquipo=new ArrayList<String>();
        this.listaEnvios=new ArrayList<Envio>();
    }
    

    public Concurso(String pNombre) {
        this.nombre=pNombre;
        this.nProblemas=Concurso.NUM_PROBLEMAS_DEFAULT;
        this.listaEquipo=new ArrayList<>();
        this.listaEnvios=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getnProblemas() {
        return nProblemas;
    }

    public ArrayList<String> getListaEquipo() {
        return listaEquipo;
    }

    public ArrayList<Envio> getListaEnvios() {
        return listaEnvios;
    }
    
    
    
    public void addEquipo(String ... lista){
        for (String str : lista) { 
            if (!this.contieneEquipo(str)) {
                this.listaEquipo.add(str);
            }    
        }
    }
    
    public void removeEquipo(String ... list){
        for (String string : listaEquipo) {
            if (!this.contieneEquipo(string)){
                this.listaEquipo.remove(string);
            }
        }
    }
    
    public void addEnvios(String nombreE, int nProblema, String resp){
        if (this.contieneEquipo(nombreE) && nProblema >=0 && nProblema < this.nProblemas && resp.length() > 0 && (resp != "" || resp != null)){
            Envio e=new Envio(nombreE, nProblema, resp);
            this.listaEnvios.add(e);
        }else{
            
        }
    }
    
    
    
    public void removeEnvios(){
    
    }
    
    public int numEquipos(){
        return this.listaEquipo.size();
    }
    
    public boolean delEquipo(String equipo){
        if(this.contieneEquipo(equipo)){
            for (Envio e : listaEnvios) {
                if (e.getNombreEquipo().equalsIgnoreCase(equipo)) {
                    this.listaEnvios.remove(e);
                }
            }
            this.listaEquipo.remove(this.listaEquipo);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean contieneEquipo(String equipo){
        for (String eq : listaEquipo) {
            if (eq.equalsIgnoreCase(equipo)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean contieneEnvio(Envio env){
        for(Envio ev : listaEnvios){
            if(ev.equals(env)){
                return true;
            }
        }
        return false;
    }

    
    
    

    
}


// arraylist admite duplicados .
