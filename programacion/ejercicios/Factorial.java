import java.util.Scanner;

public class Factorial{
  public static void main (String [] args){
    Scanner sc = new Scanner(System.in);

    int number = sc.nextInt();
    //System.out.println(factorial(number));
    System.out.println(factorialRecursividad(number));

  }

  static int factorial(int n){
    int factorial = 1;
    if (n == 0){
      return 1; 
     }else {
	for(int i = 1; i <= n; i++){
	  factorial *= i;

	}
	return factorial;
     }
  }

  static int factorialRecursividad(int n){
    int factorial = 1;

    if (n < 1){
      return 1;
    }else {
    int process = factorialRecursividad(n - 1) * factorial;
      return process;
    }
  }

}
