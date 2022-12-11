
import java.util.Scanner;

public class Ejercicio_3 {
  public static void main(String [] args){
    Scanner inputData = new Scanner(System.in);

    System.out.println("Introduce a number : ");
    int number = inputData.nextInt();

    if (number % 2 == 0){
      System.out.println("The number is " + number + " is pair.");
    }else {
      System.out.println("The number is " + number + " is odd.");
    }
  }
}
