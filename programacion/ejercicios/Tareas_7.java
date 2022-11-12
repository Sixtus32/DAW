import java.util.Scanner;

/*
 * Haz un programa que pida al usuario un valor N y después vaya sumando los N números que se vayan introduciendo por teclado.
 *
 * */
public class Tareas_7{
  public static void main(String [] args){
    sumOfNumberOfValues();
  }


  static void sumOfNumberOfValues(){

    Scanner inputData = new Scanner(System.in);
    int sumOfPairs = 0;
    int sumOfOdd = 0;

    System.out.println("Enter how may numbers to process: ");

    int numberOfProcess = inputData.nextInt();

    for (int i = 0; i < numberOfProcess; i++){

      Scanner inputNumber = new Scanner(System.in);
      System.out.println("Enter number : ");
      int number = inputNumber.nextInt();

      if (number % 2 == 0){
	sumOfPairs+=number;
      }else {
	sumOfOdd+=number;
      }
      
    }

    System.out.println("Result : ");
    System.out.println("\t"+"The sum of the pairs is : " + sumOfPairs + ".");
    System.out.println("\t"+"The sum of odd is : " + sumOfOdd + ".");
    
  }
}
