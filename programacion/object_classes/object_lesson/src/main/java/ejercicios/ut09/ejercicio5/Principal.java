/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ut09.ejercicio5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * / ejercicio 5 y 6
 * @author s6x
 */
public class Principal {
    public static void main(String[] args) {
        app();
        
    }
    
    
    
    

    
    private static void menu(Map<String,Integer> comercio, Scanner sc){
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
    
    public static void app(){
        //HASHMAP para el ejercicio 5.
        HashMap <String, Integer> comercio=new HashMap<>();
        // TREEMAP para el ejercicio 6.
//        TreeMap <String,Integer> comercio=new TreeMap<>();
        Scanner sc=new Scanner(System.in);
        menu(comercio, sc);
        sc.close();
    }
    
    private static void modificarCantidad(Map <String,Integer> comercio,Scanner sc){
        System.out.println("Introduce el nombre del producto a modificar :");
        String nombreProducto=sc.nextLine().trim();
        System.out.println("Introduce la nueva cantidad : ");
        int cantidadProducto=sc.nextInt();
        if(comercio.containsKey(nombreProducto)){
            comercio.put(nombreProducto, cantidadProducto);
        }
        
                
    }
    
    private static void eliminarProducto(Map <String,Integer> comercio,Scanner sc){
        System.out.println("Introduce el nombre del producto a eliminar : ");
        String nomProducto=sc.nextLine().trim();
        if (comercio.containsKey(nomProducto)) {
            comercio.remove(nomProducto);
        }
    }
    
    private static void mostrarProductos(Map <String,Integer> comercio){
        Iterator<String> itProdNom=comercio.keySet().iterator();
        Iterator<Integer> itProCant=comercio.values().iterator();
        
        while (itProdNom.hasNext() && itProCant.hasNext()) {
            System.out.println("\n\t" + itProdNom.next() + "\t\t" + itProCant.next() +"\n\n");    
        }
    }
    private static void introducirProducto(Scanner sc, Map <String, Integer> comercio){
        System.out.println("Introduce el nombre del producto : " + "\n");
        String producto=sc.nextLine().trim();
        System.out.println("Introduce la cantidad a anadir del producto  ->>>  " + producto +"\n");
        int cantidadProducto=sc.nextInt();
        comercio.put(producto, cantidadProducto);
        System.out.println("El producto " + producto + " se ha anadido correctamenta.\n");
    }
        
    
    public static void opcionesMenu(){
        System.out.println("Escoge una opcion : \n\n");
        
        
        System.out.println("1. Introducir producto.");
        System.out.println("2. Modificar cantidad");
        System.out.println("3. Mostrar productos.");
        System.out.println("4. Eliminar producto.");
        System.out.println("5. Salir.");
    }
}
