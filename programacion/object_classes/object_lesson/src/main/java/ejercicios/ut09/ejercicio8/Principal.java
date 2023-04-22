/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ut09.ejercicio8;

import static ejercicios.ut09.ejercicio5.Principal.opcionesMenu;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author s6x
 */
public class Principal {
    public static void main(String[] args) {
        app();
    }
    
    static void app(){
        TreeMap<String,Integer> comercio=new TreeMap<>();
        Scanner sc=new Scanner(System.in);
        menu(comercio, sc);
        sc.close();
    }
    static void menu(Map<String,Integer> comercio, Scanner sc){
        int opt;
        do {            
            opcionesMenu();
            opt=sc.nextInt();
            sc.nextLine();
            switch(opt){
                case 1:
                    introducirProducto(sc, comercio);
                    sc.reset();
                break;
                case 2:
                    modificarCantidad(comercio, sc);
                    sc.reset();
                break;
                case 3:
                    mostrarProductos(comercio);
                break;
                case 4:
                    eliminarProducto(comercio, sc);
                    sc.reset();
                break;
                case 5:
                    System.out.println("Cerrar Programa.");
                    
                break;
                default:
                    System.out.println("Error. Opcion desconocida.\n\n\t");
            }
        } while (opt!=5);
    }
    
    static void eliminarProducto(Map <String,Integer> comercio,Scanner sc){
        System.out.println("Introduce el nombre del producto a eliminar : ");
        String nomProducto=sc.nextLine().trim();
        if (comercio.containsKey(nomProducto)) {
            comercio.remove(nomProducto);
        }
    }
    
    static void introducirProducto(Scanner sc, Map <String, Integer> comercio){
        System.out.println("Introduce el nombre del producto : " + "\n");
        String producto=sc.nextLine().trim();
        System.out.println("Introduce la cantidad a anadir del producto  ->>>  " + producto +"\n");
        int cantidadProducto=sc.nextInt();
        // NO ENTIENDO SI ES ESTO SOLO LO QUE PIDE QUE CAMBIA.
        Producto prod=new Producto(producto, cantidadProducto);
        comercio.put(prod.getNombreProducto(), prod.getCantidadProducto());
        System.out.println("El producto " + producto + " se ha anadido correctamenta.\n");
    }
    
    static void mostrarProductos(Map <String,Integer> comercio){
        Iterator<String> itProdNom=comercio.keySet().iterator();
        Iterator<Integer> itProCant=comercio.values().iterator();
        
        while (itProdNom.hasNext() && itProCant.hasNext()) {
            System.out.println("\n\t" + itProdNom.next() + "\t\t" + itProCant.next() +"\n\n");    
        }
    }
    
    static void modificarCantidad(Map <String,Integer> comercio,Scanner sc){
        System.out.println("Introduce el nombre del producto a modificar :");
        String nombreProducto=sc.nextLine().trim();
        System.out.println("Introduce la nueva cantidad : ");
        int cantidadProducto=sc.nextInt();
        if(comercio.containsKey(nombreProducto)){
            comercio.put(nombreProducto, cantidadProducto);
        }
        
                
    }
    
    static void opcionesMenu(){
        System.out.println("Escoge una opcion : \n\n");
        
        
        System.out.println("1. Introducir producto.");
        System.out.println("2. Modificar cantidad");
        System.out.println("3. Mostrar productos.");
        System.out.println("4. Eliminar producto.");
        System.out.println("5. Salir.");
    }
}
