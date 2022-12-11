/*
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 99 y los almacene en un array. El programa debe crear un nuevo array con los números primos que haya entre esos 20 números. Luego debe mostrar los dos arrays
 * */
public class ArrayPrimos{
  public static void main(String [] args){
    System.out.println(esPrimo(29));
  }

  public static boolean esPrimo(int n){
    if (n == 0 || n == 1 || n == 4) return false;

    for(int i = 2; i <= Math.sqrt(n); i++){
	if(n % i == 0) return false;
	System.out.println(n % i);
    }
    return true;
  }

}

