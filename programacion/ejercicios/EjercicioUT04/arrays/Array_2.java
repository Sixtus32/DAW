import java.util.Scanner;

public class Array_2{
  public static void main(String [] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce tamaño del array");
    int tam = sc.nextInt();
    int [] numerosPrimos = new int[tam];
    System.out.println("\nIntroduce los limites del rango de números a generar : ");
    int inf = sc.nextInt();
    int sup = sc.nextInt();
    rellenarConPrimos(numerosPrimos, inf, sup);
    imprimirArray(numerosPrimos);
    int mayor = calcularMayor(numerosPrimos);
    System.out.println("\nEl mayor es " + mayor);

    /*mostrar el mayor 
   mayor = numerosPrimos[0];
   for(int j = 0; j < numerosPrimos; j++){
     if (numerosPrimos[j] + "");
   }*/


  }
  public static boolean esPrimos(int num){
    boolean primo = true;
    int i=2;
    while(i < num && primo){
      if (num % i == 0){
	primo = false;
      }
      i++;
    }

    return primo;
  }

  //mostrar numeros aleatorios
  private static byte aleatorio(int inf, int sup){
    byte n = (byte) (Math.random() * (sup -  inf + 1) + inf);
    return n;
  }

  //rellarconprimos
  public static void rellenarConPrimos(int [] numeros, int inf, int sup){
    int i = 0; 
    while (i < numeros.length){
      int num = aleatorio(inf, sup);
      if(esPrimos(num)){
	numeros[i] = num;
	i++;
      }
    }
  }
  //imprimir Array
    public static void imprimirArray( int [] array){
    for (int j = 0; j < array.length; j++){
      System.out.println(array[j] + " ");
    }
  }

  public static int calcularMayor(int [] numeros){
    int mayor = numeros[0];
    for(int j = 0; j < numeros.length; j++){
      if (numeros[j] > mayor){
	mayor = numeros[j];
      }
    }
    return mayor;
  }

}
