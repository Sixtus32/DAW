import java.util.Scanner;

/*
 *9) Calcula la letra de un DNI, pediremos el DNI por teclado y nos devolverá el DNI completo.

Para calcular la letra, cogeremos el resto de dividir nuestro dni entre 23, el resultado debe estar entre 0 y 22. Haz un método donde según el resultado de la anterior formula busque en un array de caracteres la posición que corresponda a la letra. Esta es la tabla de caracteres:

 * */

public class Array9{
  public static void main(String [] args){
    char [] letra ={'T','R','W', 'A','G', 'M', 'Y', 'F', 'P', 'D','X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    Scanner input = new Scanner(System.in);
    System.out.println("Introduce el dni: ");

    int dniData = input.nextInt();

    System.out.println(dniData);

    int result = dniData % 23;

    for (int i = 0; i < letra.length;i++){
      if(result == i){
	System.out.println("El DNI " + dniData + " cuyo resultado sera de " + result + ", correponde a la letra : " + letra[i] + ".");
      }
    }
    input.close();

  }
}
