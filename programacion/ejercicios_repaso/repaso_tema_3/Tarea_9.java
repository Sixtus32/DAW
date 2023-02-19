import java.util.Scanner;

public class Tarea_9{
  public static void main(String [] args){
    Scanner inputData=new Scanner(System.in);
    int option=0;
    while(option != 3){
      menu();
      option=inputData.nextInt(); 
      switch(option){
	case 1:
	  inputData.nextLine();
	  String name=inputData.nextLine();
          System.out.println("Hola " + name);
	  break;
	case 2:
          System.out.println("adiós.");
	  break;
	case 3:
          System.out.println("el programa ha terminado.");
	  break;
	default:
          System.out.println("El valor introducido no es válido.");

      }
    }
  }

  public static void menu() {
    System.out.println("1. Saludar");
    System.out.println("2. Despedirse"); 
    System.out.println("3. Salir"); 
  }

}

