/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios06.ejercicio3;

/**
 *
 * @author DAW
 */
public final class Envio {
    private final String nombreEquipo;
    private final int nProblema;
    private final String respuestaProblema;

    public Envio(String nombreEquipo, int nProblema, String respuestaProblema) {
        this.nombreEquipo = nombreEquipo;
        this.nProblema = nProblema;
        this.respuestaProblema = respuestaProblema;
    }
    
    //metodo de registrar
    public void registrar(String nombreEquipo, int nProblema, String respuestaProblema){
        
    }
    
    //metodo de enviar
    public void envios(String nombreEquipo, int nProblema, String respuestaProblema){
        
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public int getnProblema() {
        return nProblema;
    }

    public String getRespuestaProblema() {
        return respuestaProblema;
    }

    @Override
    public String toString() {
        return "Envio{" + "nombreEquipo=" + nombreEquipo + ", nProblema=" + nProblema + ", respuestaProblema=" + respuestaProblema + '}';
    }

    
}
