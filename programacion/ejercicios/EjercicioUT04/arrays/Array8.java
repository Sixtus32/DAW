import java.util.Scanner;

/*
 8) Crea un array de números de un tamaño pasado por teclado, el array contendrá números aleatorios entre 1 y 300 y mostrar aquellos números que acaben en un dígito que nosotros le indiquemos por teclado (debes controlar que se introduce un numero correcto), estos deben guardarse en un nuevo array.

Por ejemplo, en un array de 10 posiciones e indicamos mostrar los números acabados en 5, podría salir 155, 25, etc.* */

public class Array8{
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Introduce tamaño por teclado : ");
    int tam = input.nextInt();
    int [] arr = new int[tam];
    int [] arr2 = new int[tam];

    aleatorio(arr);

    mostrarAcabadosEn(arr);
  }

  public static void aleatorio(int [] array){
    for (int i = 0; i < array.length; i++){
      array[i] = (int) (Math.random() * 300 + 1);
    }
  }
  
  public static void mostrarAcabadosEn(int [] arr){
    
    Scanner sc = new Scanner(System.in);
    int value;

    do {
      System.out.println("Los números acabados en : ");
      value = sc.nextInt();
      
      for(int i = 0; i < arr.length; i++){
      if (arr[i] % 10 == value){
	System.out.println(arr[i]);
      }

     }

    }while(value < 0 || value > 9);

   
  }


}
