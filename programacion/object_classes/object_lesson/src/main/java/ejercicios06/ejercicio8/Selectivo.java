/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios06.ejercicio8;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author DAW
 */
public class Selectivo extends Viaje {
    private ArrayList <String> usuarioVetados;

    public Selectivo(String propietario, String modeloCoche, String ruta, LocalDate fechaSalida) {
        super(propietario, modeloCoche, ruta, fechaSalida);
        this.usuarioVetados = new ArrayList<>();
    }

    public Selectivo(ArrayList<String> usuarioVetados, String propietario, String modeloCoche, String ruta, LocalDate fechaSalida, int numeroPlazas) {
        super(propietario, modeloCoche, ruta, fechaSalida, numeroPlazas);
        this.usuarioVetados = new ArrayList<>();
    }
    
    

    public Selectivo(String propietario, String modeloCoche, String ruta, LocalDate fechaSalida, int numeroPlazas) {
        super(propietario, modeloCoche, ruta, fechaSalida, numeroPlazas);
        this.usuarioVetados = new ArrayList<>();
    }
    
    
    
    public void agregarUsuarioVetado(String usuarioReserva){
        if(!this.usuarioVetados.contains(usuarioReserva)){
            usuarioVetados.add(usuarioReserva);
        }
    }
    
    public void eliminarUsuarioVetado(String usuarioReserva){
        if(this.usuarioVetados.contains(usuarioReserva)){
            usuarioVetados.remove(usuarioReserva);
        }
    }
    
    
    // NO SE ACEPTARÁ UNA RESERVA SI EL USUARIO QUE LA REALIZA ESTA VETADO.
    @Override
    public Reserva realizarReserva(String usuarioReserva, int numeroReservar) {
        if(estadoReserva(usuarioReserva)){
            return super.realizarReserva(usuarioReserva, numeroReservar); //To change body of generated methods, choose Tools | Templates.
        }else{
            return null;
        }

    }
    
    // COMPROBARÁ SI ESTA VETADO O NO UN USUARIO.
    public boolean estadoReserva(String usuarioReserva){
        if(this.usuarioVetados.contains(usuarioReserva)){
            // el usuario está vetado
            return false;
        }else {
            //realizar la y retornar true
            return true;
        }
    }
    
    
}
