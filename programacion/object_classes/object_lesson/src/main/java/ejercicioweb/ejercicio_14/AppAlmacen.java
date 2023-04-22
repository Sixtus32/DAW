/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioweb.ejercicio_14;

/**
 *
 * @author sixtu
 */
public class AppAlmacen {
    public static void main(String[] args) {
        Almacen almacenBebidas=new Almacen(5, 5);
        
        almacenBebidas.agregarBebida(new BebidaAzucarada(1, 2, 3, "fanta", 20, true));
        almacenBebidas.agregarBebida(new AguaMineral(2, 3, 4, "Fontella", "Manantial"));
        almacenBebidas.agregarBebida(new AguaMineral(3, 20, 5, "Nopor Manantial", "Mia Khalifa"));
        almacenBebidas.agregarBebida(new BebidaAzucarada(4, 2, 5, "Coca Cola", 30, false));
        almacenBebidas.agregarBebida(new AguaMineral(3, 10, 3, "Nopor Manantial", "Sasha Grey"));
        almacenBebidas.agregarBebida(new BebidaAzucarada(5, 20, 5, "Coca Cola", 20, true));
        
        
//        System.out.println(almacenBebidas);
        almacenBebidas.mostrarInformacion();
        almacenBebidas.eliminarBebida(3);
        almacenBebidas.mostrarInformacion();
        System.out.println("Marca precio : " + almacenBebidas.calcularPrecioTotalMarca("Coca Cola"));
        
    }
}
