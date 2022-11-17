import java.util.Scanner;

public class Array3{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("El tamaño de la array : ");
    int tam = sc.nextInt();
    byte [] numeros = new byte[tam];
    imprimir(numeros);
  }

  private static byte aleatorio(int inf, int sup){
    return (byte) (Math.random() * (sup - inf) + inf);
  }

  public static void inicializar(byte [] array, int inf, int sup){
    for(int i=0; i < array.length; i++){
      array[i] = aleatorio(inf,sup);
    }
  }
  public static void imprimir(byte [] array){
    byte suma = 0;
    for(int i = 0; i < array.length; i++){
      suma += array[i];
      System.out.println("En el indice : " + i array[i]);
    }
  }

}
