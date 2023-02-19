/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios06.ejercicio8;

import java.time.LocalDate;

/**
 *
 * @author DAW
 */
public class Reserva {
    
    private String codReserva;  // Será generada cod.Reserva.
    private final String usuarioReserva; // [fijar. CONSTRUCTOR]Identifica quien realizo la reserva.
    private final int nPlazasReserva; // Entero número de reservas.
    private final LocalDate fechaReserva; // [fijar. CONSTRUCTOR] Fecha actual.

    public Reserva(String usuarioReserva, int nPlazasReserva){
        generarCodReserva();
        this.fechaReserva=LocalDate.now();
        this.usuarioReserva=usuarioReserva;
        this.nPlazasReserva=nPlazasReserva;
    }

    // MÉTODOS GETTER
    public int getnPlazas() {
        return this.nPlazasReserva;
    }

    public String getCodReserva() {
        return this.codReserva;
    }

    public String getUsuario() {
        return this.usuarioReserva;
    }

    public LocalDate getFecha() {
        return this.fechaReserva;
    }
    
    
    
    // MÉTODOS  AUXILIARES
    private void generarCodReserva(){
        this.codReserva=java.util.UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        String info = "";
        info += "\t\tCodigo Reserva : " + this.codReserva;
        info += "\n\t\t\tUsuario : " + this.usuarioReserva;
        info += "\n\t\t\tNumero Plazas Reservadas : " + this.nPlazasReserva;
        info += "\n\t\t\tFecha de la Reserva : " + this.fechaReserva;       
        return info;
    }
    
    
}
