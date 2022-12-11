
import java.util.Scanner;

/*Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las mayúsculas). Después, ve pidiendo posiciones del array por teclado y si la posicion es correcta, se añadira a una cadena que se mostrara al final, se dejará de insertar cuando se introduzca un -1.
 * */

public class Array_5{
  public static void main (String [] args){
    char [] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S','T','U','V','W','X','Y','Z'};
    methodOne(alphabet);
    
    
  }

  public static void methodOne(char [] array){
    Scanner inputData = new Scanner(System.in);

    int programState = 0;
    String result = "";
    int arrayPosition;

    do {
      System.out.println("Introduce un número del 0 a 26.");
     try{
      arrayPosition = inputData.nextInt();
      programState = arrayPosition;

      if (arrayPosition <= 26){
	result += array[arrayPosition];
      }else{
	System.out.println("Error, inserte un número correcto.");
      }
     } catch (Exception e){
       System.out.println("Fin. del programa.");
     }
    }while(programState != -1);
    System.out.println(result);
  }
  public static void methodTwo(){
    Scanner inputData = new Scanner(System.in);
    char [] arrayAscii = new char[26];

    for (int i = 65, j = 0; i <= 90; i++, j++){
	arrayAscii[j] = (char) i;
      }

    String result = "";

    int asciiNumber;

    do {
      asciiNumber = inputData.nextInt();
    }while();
  }
}
