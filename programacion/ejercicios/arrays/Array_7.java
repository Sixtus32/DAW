
import java.util.Scanner;

/*
 * 7) Crea dos arrays de números con una posición pasado por teclado.

Uno de ellos estará rellenado con números aleatorios y el otro apuntara al array anterior, después crea un nuevo array con el primer array (usa de nuevo new con el primer array) con el mismo tamaño que se ha pasado por teclado, rellenalo de nuevo con números aleatorios.

Después, crea un método que tenga como parámetros, los dos arrays y devuelva uno nuevo con la multiplicación de la posición 0 del array1 con el del array2 y así sucesivamente. Por último, muestra el contenido de cada array.

Llama al final al recolector de basura.
 * */

public class Array_7{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un tamaño");

    int tamanio = sc.nextInt();

    //creamos los arrays 
    int array1[] = new int [tamanio];
    int array2[];

    //rellenos el array1
    rellenarNumAleatorioArray(array1,10, 100);
    //apuntamos el array2 al array1 
    array2=array1;

    //creamos un nuevo array, usando el array1. Array1 tendra una nueva dirección.
    array1 = new int[tamanio];

    //lo volvemos a rellenar, ya que al crear el array de nuevo NO contiene los números anteriores.
    rellenarNumAleatorioArray(array1, 10, 100);

    //Contiene el array con el resultado de multiplicar los valores de los arrays
    int array3[] = multiplicador(array1, array2);

    System.out.println("Array1");
    mostrarArray(array1);

    System.out.println("Array2");
    mostrarArray(array2);

    System.out.println("Array3");
    mostrarArray(array3);

    System.gc();

    //apuntamos el array2 al array1


  }
  public static void rellenarNumAleatorioArray(int lista[], int a, int b){
    for(int i = 0; i < lista.length; i++)
       lista[i]=((int) (Math.random()*(a-b)+b));
  }

  public static void mostrarArray(int lista []){
    for(int e : lista){
      System.out.println("En el indice " + e + "esta el valor " + e );
    }
  }

  public static int[] multiplicador(int array1[], int array2[]){
    int array3 [] = new int [array1.length];
    for (int i = 0; i < array1.length; i++){
      array3[i] = array1[i]*array2[i];
    }
    return array3;
  }
}
