/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointerface;

/**
 *
 * @author s6x
 */
public class Rana extends Anfibio implements Depredador, Presa{

    @Override
    public void cazar() {
        System.out.println("Caza moscas.");
    }

    @Override
    public void perseguir() {
        System.out.println("Persigue Juanes.");
    }

    @Override
    public void observa() {
        System.out.println("");
    }

    @Override
    public void huir() {
        System.out.println("");
    }
    
}
