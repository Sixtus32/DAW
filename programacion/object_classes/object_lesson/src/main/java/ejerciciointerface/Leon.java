/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointerface;

/**
 *
 * @author s6x
 */
public class Leon extends Felino implements Depredador{

    @Override
    public void cazar() {
        System.out.println("Caza anfibios.");
    }

    @Override
    public void perseguir() {
        System.out.println("Persigue animales.");
    }
}
