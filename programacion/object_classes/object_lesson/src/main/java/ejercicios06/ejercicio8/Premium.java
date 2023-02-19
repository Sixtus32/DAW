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
public final class Premium extends Viaje{
    
    private boolean estadoReserva=false; // SI ES TRUE SE CANCELARÁ EL VIAJE, Y ES FALSE NO. 

    public Premium(String propietario, String modeloCoche, String ruta, LocalDate fechaSalida) {
        super(propietario, modeloCoche, ruta, fechaSalida);
    }

    public Premium(String propietario, String modeloCoche, String ruta, LocalDate fechaSalida, int numeroPlazas) {
        super(propietario, modeloCoche, ruta, fechaSalida, numeroPlazas);
    }
    
    
    public boolean cancelarReserva(String codReserva){
        LocalDate hoy=LocalDate.now();
        
        LocalDate fechaCancelacion=super.getFechaSalida().minusDays(1);
        if(hoy.isBefore(fechaCancelacion)){
            estadoReserva=true;
            return estadoReserva;
        }else{
            return estadoReserva;  
        }
    }
    
    // adición propia
    @Override
    public String toString() {
        String info=super.toString();
        info += (this.estadoReserva) ? " \n CANCELADA " : " \n AUTORIZADA";
        return info; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
