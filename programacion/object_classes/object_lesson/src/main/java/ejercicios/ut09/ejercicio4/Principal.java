/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ut09.ejercicio4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.AbstractCollection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * EJERCICIO 4. Crea un programa que almacene datos de personas sin duplicados. 
 * La clase Persona consta de los atributos : nombre, apellido, fecha nacimiento, edad.
 *      
 * @author s6x
 */
public class Principal {
    public static void main(String[] args) {
        
        // El HashSet almacena datos de Persona sin duplicados.
        TreeSet<Persona> personas=new TreeSet<>();
        
        // Personas a añadir son : 
        personas.add(new Persona("Maria", 
                                "Pedraza", 
                                 LocalDate.of(1999, Month.APRIL, 25), 
                                 LocalDate.now().getYear() - LocalDate.of(1999, Month.APRIL, 25).getYear() ));
        personas.add(new Persona("Alvaro", 
                                "Rico", 
                                LocalDate.of(2000, Month.MAY, 10), 
                                LocalDate.now().getYear() - LocalDate.of(2000, Month.MAY, 10).getYear()));
        personas.add(new Persona("Diana",
                                "Paola",
                                LocalDate.of(1998, Month.JANUARY, 1),
                                LocalDate.now().getYear() - LocalDate.of(1998, Month.JANUARY, 1).getYear()));
        personas.add(new Persona("Alvaro", 
                                "Rico", 
                                LocalDate.of(2000, Month.MAY, 10), 
                                LocalDate.now().getYear() - LocalDate.of(2000, Month.MAY, 10).getYear()));
//        personas.add(null); // Me da un error.
        //HASHSET ADMITE DUPLICADOS, PERO NO ADMITE "NULOS" O NULL.
        System.out.println("\nLista de personas : ");
        for (Persona persona : personas) {
            System.out.println(persona.toString());                   
        }
        
        
        TreeSet<Persona> personasTreeApellido=new TreeSet<>(new ComparadorApellido());
        personasTreeApellido.addAll(personas);
        
//      Comprobación de recorrido con TreeSet. (Comparador Mediante el apellido)
        System.out.println("\n\nCambios con TreeSet. Ordenados por el apellido.");
        for (Persona persona : personasTreeApellido) {
            System.out.println(persona.toString());  
        }
        

        
        try {
            personasTreeApellido.add(new Persona("Diego", 
                                    "Velazqués", 
                                    LocalDate.of(1888, Month.AUGUST, 10),
                                    LocalDate.now().getYear() - LocalDate.of(1888, Month.AUGUST, 10).getYear()));
            personasTreeApellido.add(new Persona("Gabriel", 
                                    "Salinas", 
                                    LocalDate.of(2008, Month.AUGUST, 10),
                                    LocalDate.now().getYear() - LocalDate.of(2008, Month.AUGUST, 10).getYear()));
        } catch (NullPointerException e) {
            System.out.println("A cascarla.");
        }
        System.out.println("\n\nCambios con TreeSet. Ordenados por el apellido (Nuevo recorrido)");
        for (Persona persona : personasTreeApellido) {
            System.out.println(persona.toString());  
        }
        
//      Comprobación de recorrido con TreeSet. (Comparador Mediante la edad)
        TreeSet<Persona> personasTreeEdad=new TreeSet<>(new ComparadorEdad());
        personasTreeEdad.addAll(personasTreeApellido);
//        personasTreeApellido.add(null);
        
        System.out.println("\n\nCambios con TreeSet. Ordenados por la edad.");
        for (Persona persona : personasTreeApellido) {
            System.out.println(persona.toString());  
        }
 
    }
    
    private static void cantidadPersonas(Scanner sc){
        System.out.println("Cuantas Personas deseas introducir : ");
        numPersonas=sc.nextInt();
    }
    
    // HashSet TreeSet  (Lanza una excepcion en caso de que el Persona sea null)
    private static void anadirPersonaColeccion(Persona persona, AbstractCollection coleccion) 
            throws NullPointerException{
        if (persona == null) {
            throw new NullPointerException("Error. Persona es null.");
        }
        coleccion.add(persona); 
    }
    private static void menu(){
            System.out.println("Escoga un : ");
            System.out.println("\t1. HashSet [Anadir Personas]");
            System.out.println("\t2. Tree [Anadir Personas]");
            System.out.println("\t3. Mostrar Colecciones");
            System.out.println("\t4. Salir");
    }
    
    private String nombrePersona;
    private String apellidoPersona;
    private int anioNum;
    private int mesNum;
    private int diaNum;
    private static int numPersonas;
}

//
//
//        Scanner sc=new Scanner(System.in);
//        int opt=0;
//        do {            
//            menu();
//            opt=sc.nextInt();
//            cantidadPersonas(sc);
//
//            switch(opt){
//                case 1: 
//                    System.out.println("Estas usando una coleccion [ HashSet ]\n\n");
//                    HashSet<Persona> personas=new HashSet<>();
//                    Persona persona;
//                    
//                    for (int i = 0; i < numPersonas; i++) {
//                        sc.nextLine();
//                        System.out.println("I");
//                        System.out.println("Introduzca el nombre : ");
//                        String nombre=sc.nextLine();
//                        System.out.println("Introduzca el apellido : ");
//                        String apellido=sc.nextLine();
//                        System.out.println("Introduzca el anio de nacimiento : ");
//                        int anio=sc.nextInt();
//                        System.out.println("Introduzca el mes de nacimiento : ");
//                        int mes=sc.nextInt();
//                        System.out.println("Introduzca el dia de nacimiento : ");
//                        int dia=sc.nextInt();
//                        LocalDate fechaNac=LocalDate.of(anio, mes, dia);
//                        int edad=LocalDate.now().getYear() - fechaNac.getYear();
//                        anadirPersonaColeccion(new Persona(nombre, apellido, fechaNac, edad), personas);
//                        System.out.println(nombre + " fue anadido a la coleccion HashSet.\n\n");
//                        sc.reset();
//                    }
//                    // Deseas pasarlos por TreeSet (apellido) y (edad)
//                break;
//                case 2:
//                    System.out.println("Estas usando una coleccion [ TreeSet]\n\t(orden natural)");
//                    System.out.println("Estas usando una coleccion [ TreeSet]\n\t(orden basado en la edad)");
//                break;
//                default:
//                    System.out.println("Cierre del programa.");
//                    
//            }
//        } while (opt != 3);
