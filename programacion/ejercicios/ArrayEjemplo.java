import java.util.Scanner;

//

public class ArrayEjemplo {
  public static void main(String [] args){
    Scanner inputData = new Scanner(System.in);
    int size = inputData.nextInt();

    int [] num = new int[size];
    int sumNegative = 0, countNegetive = 0;
    int sumPositive = 0, countPositive = 0;

    for(int i = 0; i < num.length; i++){
      num [i] = (int)(Math.random() * (100 - (-100) + 1)) + (-100);
    }

    for(int i = 0; i < num.length; i++){
      if (num[i] > 0){
	countPositive++;
	sumPositive += num[i];
      }else {
	countNegetive++;
  	sumNegative += num[i]; 
      }
    }

    int mediaPositiva = sumPositive/countPositive;
    int mediaNegativa = sumNegative/countNegetive;

    System.out.println("La media de positivos es : " + mediaPositiva);
    System.out.println("La media de negativos es : " + mediaNegativa);
    System.out.println("La suma total : " + (mediaPositiva + mediaNegativa));

  

  }
}
