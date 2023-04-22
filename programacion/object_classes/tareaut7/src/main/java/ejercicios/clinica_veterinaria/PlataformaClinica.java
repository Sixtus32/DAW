/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.clinica_veterinaria;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Ejecuta por consola el menu de la clinica veterinaria con toda sus funcionalidades.
 * @author s6x
 */
public class PlataformaClinica {
    
    private static final Veterinaria veterinaria=new Veterinaria();
    private static String nombreAnimal;
    private static byte pesoAnimal;
    private static String comentario;
    private static int diaNac, mesNac, anioNac;
    private static LocalDate fechaNac;
    private static String especieAnimal;
    private static char caractAnimal;
    
    private static int opcionMenuEscogido;
    private static int opcionAnimalEscogido;
    
    private static final int MENU_OPT_1=1;
    private static final int MENU_OPT_2=2;
    private static final int MENU_OPT_3=3;
    private static final int MENU_OPT_4=4;
    private static final int MENU_OPT_5=5;
    
    private static final int TIPO_ANIMAL_PERRO=1;
    private static final int TIPO_ANIMAL_REPTIL=2;
    private static final int TIPO_ANIMAL_PAJARO=3;
    private static final int TIPO_NONE_ANIMAL=4;
    
    public static void main(String[] args) {
        menu();
    }
    
    private static void menu(){
//        try {
//            menuOpt();
            operacionMenu();
//        } catch (Exception e) {
//            System.out.println("Se produjo un error.\nConsultalo con la esquina s6x.");
//        }       
    }
    
    private static void opcionMenuEscogido(){
        opcionMenuEscogido=sc.nextInt();
        if (opcionMenuEscogido == MENU_OPT_1 || opcionMenuEscogido == MENU_OPT_2 || opcionMenuEscogido == MENU_OPT_3 || opcionMenuEscogido == MENU_OPT_4) {
            opcionMenuEscogido = opcionMenuEscogido;
        }else{
            opcionMenuEscogido = MENU_OPT_5;
        }
    }
    
    private static void ingresarAnimal(){
        if (opcionAnimalEscogido == TIPO_ANIMAL_PERRO){
            veterinaria.anadirAnimal(new Perro(nombreAnimal, fechaNac, pesoAnimal, Raza.valueOf(especieAnimal), (caractAnimal == 'Y') ? true : false));
        }else if(opcionAnimalEscogido == TIPO_ANIMAL_REPTIL){
            veterinaria.anadirAnimal(new Reptil(nombreAnimal, fechaNac, pesoAnimal, Especie.valueOf(especieAnimal), (caractAnimal == 'Y') ? true : false));
        }else if(opcionAnimalEscogido == TIPO_ANIMAL_PAJARO){
            veterinaria.anadirAnimal(new Pajaro(nombreAnimal, fechaNac, pesoAnimal, EspeciePajaro.valueOf(especieAnimal), (caractAnimal == 'Y') ? true : false));
        }else {
            System.out.println("ERROR : Pruebe otra vez.");
        }
    }
    
    private static void opcionAnimalEscogido(){
//        do{
            opcionAnimalEscogido=sc.nextInt();
//            if (!(opcionAnimalEscogido != TIPO_ANIMAL_PERRO || opcionAnimalEscogido != TIPO_ANIMAL_REPTIL || opcionAnimalEscogido != TIPO_ANIMAL_PAJARO))
//                opcionAnimalEscogido = TIPO_NONE_ANIMAL;
//            if(opcionAnimalEscogido == TIPO_NONE_ANIMAL){
//                System.out.println("POR FAVOR, INTENTELO DE NUEVO.");
//                peticionDeOpciones();
//                menuOptAnimal();
//            }
            
//        }while(opcionAnimalEscogido != TIPO_ANIMAL_PERRO || opcionAnimalEscogido != TIPO_ANIMAL_REPTIL || opcionAnimalEscogido != TIPO_ANIMAL_PAJARO);
    }
    
    private static void establecerDatoComplementarioAnimal(){
        if(opcionAnimalEscogido == TIPO_ANIMAL_PERRO){
            System.out.println("INRODUZCA LA RAZA DEL PERRO.");
            System.out.println("\nOpciones : " + "\nPASTOR\nALEMAN\nHUSKY\nFOXTERRIER\nDALMATA");
        }else if (opcionAnimalEscogido == TIPO_ANIMAL_REPTIL){
            System.out.println("INRODUZCA LA ESPECIE DEL REPTIL.");
            System.out.println("\nOpciones : " + "\nTORTUGA\nIGUANA\nDRAGON");
        }else if (opcionAnimalEscogido == TIPO_ANIMAL_PAJARO){
            System.out.println("INRODUZCA LA ESPECIE DEL PAJARO.");
            System.out.println("\nOpciones : " + "\nCOLORIN\nPERIQUITO\nAGAPONIS");
        }
        
        sc.nextLine();
        especieAnimal=sc.nextLine().toUpperCase().trim();
        verificarDetalleAnimal();
        caractAnimal=sc.nextLine().toUpperCase().trim().charAt(0);
    }
    
    private static void verificarDetalleAnimal(){
        if (opcionAnimalEscogido == TIPO_ANIMAL_PERRO) {
            System.out.println(" DISPONE DE CHIP O NO [ S / N ] ");
        }else if(opcionAnimalEscogido == TIPO_ANIMAL_REPTIL){
            System.out.println(" ES VENENOS O NO  [ S / N ] ");
        }else if(opcionAnimalEscogido == TIPO_ANIMAL_PAJARO){
            System.out.println(" ES CANTOR O NO [ S / N ] ");
        }
    }
    
    private static void establecerDatoPrincipalAnimal(){
        opcionAnimalEscogido();
        sc.nextLine();
        System.out.println("Introduce el NOMBRE del animal : ");
        nombreAnimal=sc.nextLine();
        System.out.println("Introduce el PESO del animal : ");
        pesoAnimal=sc.nextByte();
        System.out.println("\n\tIntroduce el FECHA DE NACIMIENTO.\n");
        System.out.println("\nDIA : ");
        diaNac=sc.nextInt();
        System.out.println("\nMES : ");
        mesNac=sc.nextInt();
        System.out.println("\nANIO : ");
        anioNac=sc.nextInt();      
        fechaNac=LocalDate.of(anioNac, mesNac, diaNac);
    }
    /**
     * Solicita la entrada de un numero entero para escoger una opcion.
     */
    private static void peticionDeOpciones(){System.out.println("\n\tEscoge una opcion : ");}   
    /**
     * Muestra las opciones de menu.
     */
    private static void menuOpt(){
        
        System.out.println(" [ 1 ] INSCRIBIR ANIMAL.");
        System.out.println(" [ 2 ] BUSCAR ANIMAL.");
        System.out.println(" [ 3 ] MODIFICAR COMENTARIO.");
        System.out.println(" [ 4 ] MOSTRAR ANIMALES.");
        System.out.println(" [ 5 ] SALIR.");
        
        
        peticionDeOpciones();
        opcionMenuEscogido();
        sc.reset();
    }
    
    private static void menuOptAnimal(){
        System.out.println("\n [ 1 ] PERRO.");
        System.out.println(" [ 2 ] REPTIL.");
        System.out.println(" [ 3 ] PAJARO.");
        peticionDeOpciones();
    }
    
    private static void operacionMenu(){
        
        do{
            menuOpt();
            switch (opcionMenuEscogido){
                case MENU_OPT_1 : optIngresarAnimal();
                    break;
                case MENU_OPT_2 : optBuscarAnimal();
                    break;
                case MENU_OPT_3 : optModifComentario();
                    break;
                case MENU_OPT_4 : optMostrarAnimales();
                    break;
                case MENU_OPT_5 : optCierreMenu();
                    break;
                default : System.out.println("ERROR. LA OPCION INTRODUCIDA NO FIGURA EN EL MENU.\n\t\tIntentelo de nuevo ");
            }
        }while (opcionMenuEscogido != 5);
        
    }
    
    private static void optIngresarAnimal(){
        menuOptAnimal();
        establecerDatoPrincipalAnimal();
        establecerDatoComplementarioAnimal();
        ingresarAnimal();
    }
    private static void optBuscarAnimal(){
        sc.nextLine();
        System.out.println("Introduzca el nombre del animal : ");
        nombreAnimal=sc.nextLine();
        System.out.println(veterinaria.buscarAnimal(nombreAnimal) ? 
                "   EL ANIMAL SE ENCUENTRA EN LA CLINICA.   " : 
                "   EL ANIMAL NO SE ENCUENTRA EN LA CLINICA.    ");
    } 
    private static void optModifComentario(){
        sc.nextLine();
        System.out.println("Introduzca el nombre del animal : ");
        nombreAnimal=sc.nextLine();
        System.out.println("Introduzca un comentario : ");
        comentario=sc.nextLine();
        veterinaria.modifComentarioAnimal(nombreAnimal, comentario);
    }
    private static void optMostrarAnimales(){
        veterinaria.mostrarAnimales();
    }
    private static void optCierreMenu(){
        System.out.println("Adios.\n!Y gracias por usar nuestra plataforma¡");
        sc.close();
    }

    private static final Scanner sc=new Scanner(System.in);
}
