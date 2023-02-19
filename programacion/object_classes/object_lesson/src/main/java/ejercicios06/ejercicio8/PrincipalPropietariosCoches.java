/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios06.ejercicio8;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author sixtu
 */
public class PrincipalPropietariosCoches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // 1. Crea los siguientes viajes cuyo propietario sea “José Antonio” y coche “Seat León”:
        Viaje v1=new Viaje("Jose Antonio", "Seat Leon", "Murcia-Cartagena", LocalDate.of(2020, 6, 9));
        Selectivo s1=new Selectivo(v1.getPropietario(), v1.getModeloCoche(), "Murcia-Campus", LocalDate.of(2020, 6, 10), 4);
        s1.agregarUsuarioVetado("Beatriz");
        Premium p1=new Premium(v1.getPropietario(), v1.getModeloCoche(), "Murcia-Barcelona", LocalDate.of(2020, 6, 10), 6);
        
        
        //2.  Realiza las siguientes reservas y muestra el resultado de cada paso en la consola.
        Reserva reserva1=v1.realizarReserva("Alberto", 2);
        Reserva reserva2=s1.realizarReserva("Enrique", 3);
        Reserva reserva3=s1.realizarReserva("Beatriz", 1);
        Reserva reserva4=p1.realizarReserva("Ana", 2);
//        p1.cancelarReserva(reserva4.getCodReserva());

        
        
       
        // 3. Recorre el conjunto de viajes
        ArrayList <Viaje> viaje=new ArrayList<>();
        viaje.add(v1);
        viaje.add(s1);
        viaje.add(p1);
        
        // 4. Recorre el conjunto de viajes
        for (Viaje viaje1 : viaje) {
            if (viaje1 instanceof Selectivo select){
                select.eliminarUsuarioVetado("Beatriz");
            }
            System.out.println(viaje1);
        }
        
        Reserva a=new Reserva("Diego Peña Nieto", 2);
        
        System.out.println(a.toString());
    }
    
}
