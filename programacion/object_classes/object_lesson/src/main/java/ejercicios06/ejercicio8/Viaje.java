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

/*
    Representa una oferta que hace un propietario para compartir su coche.
*/
public class Viaje {
    private final String propietario;  //[fijar. CONSTRUCTOR]
    private final String modeloCoche;    //[fijar. CONSTRUCTOR]
    private final String ruta;           //[fijar. CONSTRUCTOR]
    private final LocalDate fechaSalida; //[fijar. CONSTRUCTOR]
    private final int plazasOfrecidas;  //[fijar. CONSTRUCTOR]
    private ArrayList<Reserva> listaReserva;
    private int numPlazasReservadas; // Suma del número de plazas realizadas.
    private int plazasDisponibles; // Diferencia entre [ plazasOfrecidas - numPlazasReservadas]
    
    //VALOR POR DEFECTO DE LA CLASE.
    private final static int NUMERO_PLAZA_POR_DEFECTO=1;
    
    // PRIMER CONSTRUCTOR.
    public Viaje(String propietario, String modeloCoche, String ruta, LocalDate fechaSalida, int numeroPlazas) {
        this.propietario=propietario;
        this.modeloCoche=modeloCoche;
        this.ruta=ruta;
        this.fechaSalida=fechaSalida;
        this.plazasOfrecidas=numeroPlazas;
        
        listaReserva=new ArrayList<>();
        this.numPlazasReservadas = 0;
        this.plazasDisponibles = NUMERO_PLAZA_POR_DEFECTO;
    }
    
    // SEGUNDO CONSTRUCTOR.
    public Viaje(String propietario, String modeloCoche, String ruta, LocalDate fechaSalida){
        this(propietario, modeloCoche, ruta, fechaSalida, NUMERO_PLAZA_POR_DEFECTO);
    }
    
    //métodos 
    public Reserva realizarReserva(String usuarioReserva, int numeroReservar){
        LocalDate fechaReserva=LocalDate.now();      
        if(/*numeroReservar <= this.plazasDisponibles &&
           fechaReserva.isBefore(this.fechaSalida)*/true){
            Reserva reserva=new Reserva(usuarioReserva, numeroReservar);
            this.listaReserva.add(reserva);
            numPlazasReservadas++;
            this.plazasDisponibles = this.plazasOfrecidas - numeroReservar;
            return reserva;
        }else{
            return null;
        }
         
    }
    public Reserva consultarReserva (String codReserva){
        for (Reserva reserva : this.listaReserva) {
            if(reserva.getCodReserva().equals(codReserva)){
                return reserva;
            }
        }
        return null;
    }
    
    
    // METODOS GETTER 
    
    
    // método para añadir reservas
//    public void addReserva(){}

    public String getPropietario() {
        return propietario;
    }

    public String getModeloCoche() {
        return modeloCoche;
    }

    public String getRuta() {
        return ruta;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public int getPlazasOfrecidas() {
        return plazasOfrecidas;
    }

    public ArrayList<Reserva> getListaReserva() {
        return listaReserva;
    }

    public int getNumPlazasReservadas() {
        int sumReservas=0;
        
        for (Reserva reserva : listaReserva) {
            sumReservas++;
        }
        return sumReservas;
    }

    public int getPlazasDisponibles() {
        return this.plazasDisponibles = this.plazasOfrecidas - this.numPlazasReservadas;
    }

    @Override
    public String toString() {
        String info = "\nVIAJE.\n*********************";
        info += "\n\tPropietario : " + this.propietario;
        info += "\n\tModelo Coche : " + this.modeloCoche;
        info += "\n\tRuta : " + this.ruta;
        info += "\n\tFecha de Salida : " + this.fechaSalida;
        info += "\n\tPlazas Ofrecidas : " + this.plazasOfrecidas;
        info += "\n\n\t\tReservas.\n\t\t---------";
        info = this.listaReserva.stream().map(reserva -> "\n\t" + reserva.toString()).reduce(info, String::concat) + "\n";
        info += "\n\n\tNumero de plazas reservadas : " + this.numPlazasReservadas;
        info += "\n\tPlazas Disponibles : " + this.plazasDisponibles +"\n";
        return info;
    }

    
    
    
    
}
