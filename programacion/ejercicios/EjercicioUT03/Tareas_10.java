import java.util.Scanner;

/*Programa que muestre un menú sencillo utilizando la estructura while …. El menú mostrará en pantalla las siguientes opciones:

1. Saludar

2. Despedirse

3. Salir

    Si el usuario introduce un 1, el programa le pedirá el nombre y lo saludará: “Hola Pepito”, por ejemplo.
    Si el usuario introduce un 2, el programa se despedirá: Adiós.
    Si el usuario introduce un 3, el programa terminará.
 *
 * */

public class Tareas_10{
  public static void main (String [] args){
    showMenuOption();
  }

  static void showMenuOption(){
    Scanner inputOption = new Scanner(System.in);
    boolean programState = true;


    Scanner inputName = new Scanner(System.in);

    while (programState){
      menu();
      int option = inputOption.nextInt();

      if (option == 1){
	System.out.println("Enter your name : " );
	String userName = inputName.nextLine();
	System.out.println("Hello " + userName);
      }else if (option == 2){
	System.out.println("Goodbye my friend.");
      }else if (option == 3){
	System.out.println("Program STOP!!!");
	programState = false;
      }else {
	System.out.println("That is not an option.");
      }
    }
  }

  static void menu(){
    System.out.println("1."+"\t"+"Greet.");
    System.out.println("2."+"\t"+"Say Goodbye.");
    System.out.println("3."+"\t"+"Get out.");
  }
}


