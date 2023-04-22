package ejerciciointerface.ejercicios_animales;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Principal del ejercicio 1 de la clinica veterinaria.
 * @author s6x
 */
public class PlataformaClinica {
//    private static Veterinaria veterinaria;
    public static void main(String[] args) {
        
        Veterinaria veterinaria=new Veterinaria();
        
        int option = 0;
        do {
            // El menu principal.
            
            menuOpt();
            
            /**
             * private static void menuOpt(){
        System.out.println(" [ 1 ] INSCRIBIR ANIMAL.");
        System.out.println(" [ 2 ] BUSCAR ANIMAL.");
        System.out.println(" [ 3 ] MODIFICAR COMENTARIO.");
        System.out.println(" [ 4 ] MOSTRAR ANIMALES.");
        System.out.println(" [ 5 ] SALIR.");
    }
    
             */
            System.out.println("\n\tEscoge una opcion : ");
            option=sc.nextInt(); 
            sc.reset();
            
            switch (option) {
                case 1 :
                    animalEleccion();
                    sc.nextLine();
                    establecerDatoAnimal();
                    animalOperEstablc();                  
                    if (infoAnimal == 1){
                        veterinaria.anadirAnimal(new Perro(nAnimal, fNac, psAnimal, Raza.valueOf(espefAnimal), (boolAnimal == 'Y') ? true : false));
                    }else if(infoAnimal == 2){
                        veterinaria.anadirAnimal(new Reptil(nAnimal, fNac, psAnimal, Especie.valueOf(espefAnimal), (boolAnimal == 'Y') ? true : false));
                    }else if(infoAnimal == 3){
                        veterinaria.anadirAnimal(new Pajaro(nAnimal, fNac, psAnimal, EspeciePajaro.valueOf(espefAnimal), (boolAnimal == 'Y') ? true : false));
                    }else {
                        System.out.println("ERROR : Pruebe otra vez.");
                    }
                    sc.reset();
                    break;          
                case 2 :
                    sc.nextLine();
                    System.out.println("Introduce el NOMBRE a buscar : ");
                    String nombreAnim=sc.nextLine();
                    System.out.println(veterinaria.buscarAnimal(nombreAnim) ? 
                            "\n\t\t\t**************  DICHO ANIMAL SE ENCUENTRA EN ESTA VETERINARIA  **************" : 
                            "\n\t\t\t**************  NO HALLADO  **************");
                    sc.reset();
                    break;
                case 3 :
                    sc.nextLine();
                    System.out.println("Introduca el nombre del animal que quieres comentar : ");
                    String nombreA=sc.nextLine();
                  
                    System.out.println("Introduzca el comentario que desea realizar : ");
                    String comentario=sc.nextLine();
                    
                    veterinaria.modifComentarioAnimal(nombreA, comentario);
                    break;
                case 4 : 
                    veterinaria.mostrarAnimales();
                    break;
                case 5 : 
                    System.out.println("Adios.");
                    sc.close();
                    break;
                default:
                    System.out.println("ERROR: LA OPCION INTRODUCIDA NO FIGURA EN EL MENU.");
                    
            }
        } while (option != 5);
    }
    
    /**
     * Despliga las opciones del menu
     */
    private static void menuOpt(){
        System.out.println(" [ 1 ] INSCRIBIR ANIMAL.");
        System.out.println(" [ 2 ] BUSCAR ANIMAL.");
        System.out.println(" [ 3 ] MODIFICAR COMENTARIO.");
        System.out.println(" [ 4 ] MOSTRAR ANIMALES.");
        System.out.println(" [ 5 ] SALIR.");
    }
    
    /**
     * Da escoger el tipo de animal a ingresar.
     */
    private static void animalEleccion(){      
        System.out.println("Escoge un tipo de ANIMAL."); 
        System.out.println(" [ 1 ] PERRO.");
        System.out.println(" [ 2 ] REPTIL.");
        System.out.println(" [ 3 ] PAJARO.");
        int animalEscogido=sc.nextInt();
        infoAnimal = (animalEscogido == 1 || animalEscogido == 2 || animalEscogido == 3) ? animalEscogido : 0;
    }
    
    /**
     * Realiza petition para ingresar los datos que comparten todos los animales.
     */
    private static void establecerDatoAnimal(){
        System.out.println("Introduce el NOMBRE del animal : ");
        nAnimal=sc.nextLine();
        System.out.println("Introduce el PESO del animal : ");
        psAnimal=sc.nextByte();
        System.out.println("\n\tIntroduce el FECHA DE NACIMIENTO.\n");
        System.out.println("\nDIA : ");
        dNac=sc.nextInt();
        System.out.println("\nMES : ");
        mNac=sc.nextInt();
        System.out.println("\nANIO : ");
        aNac=sc.nextInt();      
        fNac=LocalDate.of(aNac, mNac, dNac);
    }
    
    private static void animalOperEstablc(){
        if(infoAnimal == 1){
            System.out.println("INRODUZCA LA RAZA DEL PERRO.");
            System.out.println("\nOpciones : " + "\nPASTOR\nALEMAN\nHUSKY\nFOXTERRIER\nDALMATA");
        }else if(infoAnimal == 2){
            System.out.println("INRODUZCA LA ESPECIE DEL REPTIL.");
            System.out.println("\nOpciones : " + "\nTORTUGA\nIGUANA\nDRAGON");
        }else if(infoAnimal == 3){
            System.out.println("INRODUZCA LA ESPECIE DEL PAJARO.");
            System.out.println("\nOpciones : " + "\nCOLORIN\nPERIQUITO\nAGAPONIS");
        } 
        sc.nextLine();
        espefAnimal=sc.nextLine().toUpperCase().trim();
        verificarDetalleAnimal();
        boolAnimal=sc.nextLine().toUpperCase().trim().charAt(0);
    }
    
    private static void verificarDetalleAnimal(){
        if (infoAnimal == 1) {
            System.out.println(" DISPONE DE CHIP O NO [ S / N ] ");
        }else if(infoAnimal == 2){
            System.out.println(" ES VENENOS O NO  [ S / N ] ");
        }else if(infoAnimal == 3){
            System.out.println(" ES CANTOR O NO [ S / N ] ");
        }
    }
    
    
    // Config. para la entrada de datos para la aplicación.
    private static final Scanner sc=new Scanner(System.in);
    // DATOS DE LOS ANIMALES.
    private static String nAnimal;
    private static byte psAnimal;
    private static int dNac, mNac, aNac;
    private static LocalDate fNac;
    private static String espefAnimal;
    /**
     * Almacena el estado de posesion de un caracteristica establecida
     */
    private static char boolAnimal;
    
    // Animales de tu elección.
    private static int infoAnimal;
       
}
