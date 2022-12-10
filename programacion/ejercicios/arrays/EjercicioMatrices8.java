
import java.util.Scanner;

public class EjercicioMatrices8{
  public static void main(String [] args){

  String[][] nombresGolosinas = {{"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},{"Kinder Malo", "Bolsa variada Haribo", "Chetoos", "Twix"},{"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},{"Lacasitos", "Crunch", "Milkybar", "KitKat"}};
  double[][] precio = {{1.1, 0.8, 1.5, 0.9},{1.8, 1, 1.2, 1},{1.8, 1.3, 1.2, 0.8},{1.5, 1.1, 1.1, 1.1}};

    menu(nombresGolosinas);
  }

  public static int [][] rellenarGolosinas(String [][] golosinas){
    int newArr [][] = new int [golosinas.length][golosinas[0].length];
    int initGol = numeroInicialGolosinas();
    for (int i = 0; i < newArr.length; i++){
      for (int j = 0; j  < newArr[i].length; j++){
	newArr[i][j] = initGol;
      } 
    }
    return newArr;
  }

  public static boolean estaRellenado(int [][] candidad){
    if (candidad != null){
      return true;
    }
    return false;
  }

  public static int numeroInicialGolosinas(){
    Scanner sc = new Scanner(System.in); 
    System.out.println("Cantidad inicial para cada golosina : ");
    int cantidadInicial = sc.nextInt();
    return cantidadInicial;
  }

  public static void mostrarGolosinas(String [][] golosinas, int [][] cantidad,int [][] cod, boolean st){

    for (int i = 0; i < golosinas.length; i++){
      for (int j = 0; j  < golosinas[i].length; j++){
	System.out.print( " cod." + cod[i][j] + " " + golosinas[i][j] +"  [ " + cantidad[i][j] + " ] |");
      }   
	System.out.println("\n");
    }

  }

  public static void menu(String [][] misGolosinas){

    Scanner sc = new Scanner(System.in);
    int opcion;

    do{
      System.out.println("[1]. Pedir golosinas.");
      System.out.println("[2]. Mostrar golosinas.");
      System.out.println("[3]. Rellenar golosinas.");
      System.out.println("[4]. Apagar máquina.");
      opcion = sc.nextInt();

      switch(opcion){
	case 1:   peticionDeGolosina();
	  break;
	case 2:   //mostrarGolosinas(misGolosinas, codExpGolosina(misGolosinas));
		  ;
	  break;
	case 3:	  rellenarGolosinas(misGolosinas);
	  break;
	case 4:	  System.out.println("Cierre del programa.");
	  break;
	 default :
	  System.out.println("Elección desconocida.");
      }
    }while(opcion != 4); 

  }

  public static int [][] codExpGolosina(String [][] golosinas){
    int [][] cod = new int[golosinas.length][golosinas[0].length];
    int codValue = 1;
    for(int i = 0; i < cod.length; i++){
      for(int j = 0; j < cod[i].length; j++){
	cod[i][j] = codValue;
	codValue++;
      }
    }
    return cod;
  }

  public static void peticionDeGolosina(){
    formaPago();
    Scanner sc = new Scanner(System.in);
    int codGolosina;
    boolean st = true;

    do {
    System.out.println("Código de la golosina : ");
    codGolosina = sc.nextInt();

    	if (codGolosina >= 0 && codGolosina <= 16){
      		System.out.println(" Su elección es correcta.");
    	}else {
      		System.out.println("Código incorrecto. \nVuelva a intertarlo.");
      		st = false;
    	}
    
   }while (st);
  }

  public static void formaPago(){

    Scanner sc = new Scanner (System.in);
    boolean estado = true;
    int forma;

    do{
      System.out.println("\nComo desea pagar : \n");
      System.out.println(" \t[ 1 ]. Monedas. ");
      System.out.println(" \t[ 2 ]. Targeta. ");
      System.out.println(" \t[ 3 ]. Salir. \n");
      forma = sc.nextInt();
      
      switch(forma){
	case 1: System.out.println("\nIntroduzca las monedas : ");
		break;
	case 2: System.out.println("\nIntroduzca la targeta : ");
		break;
	case 3: System.out.println("\n Gracias por su timpo.");
		System.exit(0);
	default: System.out.println("\nError. Introduzca una opción válida.");
      }
    }while(estado);
  }

}

