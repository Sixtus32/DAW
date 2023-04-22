/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_cine;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author sixtu
 */
public class MyCine {
    private Pelicula pelicula;
    private double precioEntrada;
    private Asiento [][] asiento;
    private ArrayList<Espectador> espectador; // AGREGADO PARA MEJORAR APP

    public MyCine(Pelicula pelicula, double precioEntrada, int numFilas, int numColumnas ){
        this.pelicula=pelicula;
        this.precioEntrada=precioEntrada;
        this.asiento=new Asiento[numFilas][numColumnas];
        this.espectador=new ArrayList<>();
        
        // Inicializar todos los asientos como disponibles
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                char letra=(char)('A' + j);
                int numero=numFilas-i;
                this.asiento[i][j]=new Asiento(letra, numero);
            }
        }
        
    }
    
    public void mostrarAsientos(){
        for (int i = 0; i < this.asiento.length; i++) {
            for (int j = 0; j < this.asiento[i].length; j++) {
                System.out.print(this.asiento[i][j]);
            }
            System.out.println("\n");
        }
    }
    
    public void mostrarAsientosOcupados(){
        System.out.println("\n\n\tASIENTOS OCUPADOS : \n");
        
        for (Asiento[] asiento1 : this.asiento) {
            for (Asiento asiento11 : asiento1) {
                if (asiento11.estaOcupado()) {
                    System.out.print(asiento11);
                } else {
                    System.out.print(" ? ");
                }
            }
            System.out.println("\n");
        }
    }
    
    public void mostrarAsientosNoOcupados(){
        System.out.println("\tASIENTOS NO OCUPADOS : \n");
        
        for (Asiento[] asiento1 : this.asiento) {
            for (Asiento asiento11 : asiento1) {
                if (!asiento11.estaOcupado()) {
                    System.out.print(" ? ");
                } else {
                    System.out.print(asiento11);
                }
            }
            System.out.println("\n");
        }
    }
    
    
    // Si tiene el dinero sufiente.
    public boolean tieneSufienteDinero(Espectador e){
        return e.getDinero() > this.precioEntrada;
    }
    // Hay espacio libre 
    // Si tiene la edad mínima.
    public boolean tieneEdadMinima(Espectador e){
        return e.getEdad() > this.pelicula.getEdad_minima();
    }
    
    public void venderEntradas(Espectador e){
        // PAGA LO DEBIDO.
        if (tieneSufienteDinero(e) && tieneEdadMinima(e)){
            boolean ocuparAsiento=false;
            while(!ocuparAsiento){
                int filas=(int)(Math.random() * this.asiento.length);
                int columnas=(int)(Math.random() * this.asiento[0].length);
                Asiento a = this.asiento[filas][columnas];
                if (!a.estaOcupado()){
                    a.asignarEspectador(e);
                    ocuparAsiento=true;
                    System.out.println("A " + e.getNombre() + " se le ha asignado el asiento " + a.getNumero()+ a.getLetra());
                    espectador.add(e);
                }else{
                    System.out.println("El asiento " + a.getNumero()+ a.getLetra()+ " para " + e.getNombre() + " .\n\tSe encuentra ocupado "+
                            "por  : " + a.getEspectador().getNombre() + "."
                            + " \n\tTrasladando a otro asiento ...");
                }
                    
            }
        }
    }

    public ArrayList<Espectador> getEspectador() {
        return espectador;
    }
    
    
    
    public Asiento[][] getAsiento() {
        return asiento;
    }
     
    // NOS INTERESA CONOCER PELICULA.
    public Pelicula getPelicula() {
        return this.pelicula;
    }
    
    // NOS INTERESA CONOCER PRECIO DE LA ENTRADA.
    public double getPrecioEntrada() {
        return precioEntrada;
    }

    @Override
    public String toString() {
        return "MyCine{" + "pelicula=" + pelicula + ", precioEntrada=" + precioEntrada + '}';
    }

    
    
}
