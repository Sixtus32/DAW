import java.util.Scanner;

public class Array2{
  public static void main(String [] args){

    int tam = 5;
    int [] numeros = new int[tam];
    inicializar(numeros);
    imprimir(numeros);


  }

  public static void inicializar(int [] array){
    Scanner sc = new Scanner(System.in);

    for(int i = 0; i < array.length; i++){
      System.out.println("Introduce un número : ");
      array[i] = sc.nextInt();
    }

  }

  public static void imprimir (int [] array){
    for (int i = 0; i < array.length; i++){
      System.out.println("Si indice es : " + i + ". Su dato es : " + array[i]);
    }
  }

}
