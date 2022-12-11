public class Factorial{
  public static void main(String [] args){
   System.out.println(factorial(5));
  }

  public static int factorial(int n){
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

  public static int factorialRecursiva (int n){
    if (n == 0){
      return 1;
    }else return factorial(n-1) * n;
  }
}

