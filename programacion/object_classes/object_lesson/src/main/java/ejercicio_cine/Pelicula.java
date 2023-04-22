/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_cine;

/**
 *
 * @author sixtu
 */
public class Pelicula {
    
    private String titulo;
    private int duracion;
    private byte edad_minima; // cambio realizado
    private String director;

    public Pelicula(String titulo, int duracion, byte edad_minima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edad_minima = edad_minima;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public byte getEdad_minima() {
        return edad_minima;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", duracion=" + duracion + ", edad_minima=" + edad_minima + ", director=" + director + '}';
    }
    
    
    
    
    
}
