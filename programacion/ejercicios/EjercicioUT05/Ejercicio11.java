import java.util.Scanner;

public class Ejercicio11{
  public static void main(String [] args){
    System.out.println("Introduzca una cadena");
    Scanner input = new Scanner(System.in);
    String word = input.nextLine();

    StringBuilder cadena = new StringBuilder(word);
    StringBuilder cadenaRev = new StringBuilder(word).reverse();
    String unidos = cadena.append(cadenaRev.substring(1,cadena.toString().length())).toString();
    System.out.println("\n"+unidos);


  }

}

