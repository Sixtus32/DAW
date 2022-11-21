
import java.util.Scanner;

/*
 * 11) Crea una aplicación que pida un numero por teclado y después comprobaremos si el numero introducido es capicua, es decir, que se lee igual sin importar la dirección. Por ejemplo, si introducimos 30303 es capicua, si introducimos 30430 no es capicua. Piensa como puedes dar la vuelta al número. Una forma de pasar un número a un array es esta Character.getNumericValue(cadena.charAt(posicion)).
 * */

public class Array11{
  public static void main(String [] args){

    Scanner inputData = new Scanner(System.in);
    String number = inputData.nextLine();
    inputData.close();
    String number2 = "";

    for(int i = number.length() - 1; i >= 0; i--){
      number2 += number.charAt(i);
    }

    int num1 = Integer.parseInt(number);
    int num2 = Integer.parseInt(number2);

    if(num1 != num2){
      System.out.println("\nEl número " + num1 + " y el número "+ num2 +".\nNo son capicua.");
    }else {

      System.out.println("\nEl número " + num1 + " y el número "+ num2 +".\nSon capicua.");
    }
  }
}
