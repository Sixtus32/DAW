import java.util.Scanner;
import java.util.Arrays;

/* 1.	Ejercicio 01.

Usando la clase Arrays, crea un programa que solicite el tamaño con el que se creará un array
de números enteros. A continuación, se solicitará al usuario los números con los que se
rellenará dicho array. Posteriormente se mostrará un menú recurrente con las opciones
siguientes: ordenar, buscar elemento, copiar, mostrar, rellenar, salir. Todas ellas se resolverán
empleando métodos de la clase Arrays (excepto salir).

 Opción ordenar: ordenará el array ascendentemente.

 Opción buscar elemento: solicitará al usuario un número a buscar en el array. Se indicará en pantalla si se encuentra o no en el array. Obsérvese que para utilizar esta función el array deberá estar previamente ordenado.

 Copiar: copiará el array en un segundo array cuya longitud pediremos al usuario (podrá ser
mayor o menor).

 Mostrar: mostrará en pantalla el array y su copia si no está vacía. Usar el método toString de Arrays.

 Rellenar: solicitará al usuario un número con el que se rellenará una parte del array.

 Salir: finalizará la ejecución del programa.

 * */

public class Ejercicio1{
  public static void main(String [] args){

    Scanner input = new Scanner(System.in);
    int op;

    int [] array = createArrayInt();
    int [] arrayNew = new int[0];

    fillInitialArray(array); 

    do{
      menuOptions();
      op = input.nextInt();
      switch(op){
	case 1 : 
	  	 System.out.println("\n");
	         orderAsc(array); 
		 break;

	case 2 : 
		 if (findInArray(array)) {
		   System.out.println("El número introducido se encuentra en el array.\n");
		 }else {
                   System.out.println("NO se encontró el número introducido.\n");
		 }
		 break;

	case 3 : 
		 arrayNew = copyNewArray(array);
		 break;

	case 4 : System.out.println(showArray(array));
		 if (arrayNew.length > 0){
		   System.out.println("\nCopia del array orignal. \n"+Arrays.toString(arrayNew) + "\n");
		 }else{
		   System.out.println("\nNo copia de este array.aún.");
		 }
		 break;
		 
	case 5 : 
		 fillArrWithSpef(array);
		 break;

	case 6 : System.out.println("Salir del programa.");
		break;

       default : System.out.println("Intentelo de nuevo.");
      }
    }while( op != 6);
  }

  // Opción 1.	Ordenará el array ascendentemente
  public static void orderAsc(int [] arr){
    Arrays.sort(arr);
  }

  //Opción 2. Buscar un valor en el Array (previamente ordenado);
  public static boolean findInArray(int [] arr){
    int [] arr2 = arr;
    Arrays.sort(arr2);
    System.out.println("Introduzca el nº a buscar : ");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    int findArr = Arrays.binarySearch(arr2,number);
    if (findArr >= 0 ){
      return true;
    }
    return false;
  }
  // Opción 3. Copiar el array en uno nuevo.
  public static int [] copyNewArray(int [] arr){
    Scanner input = new Scanner(System.in);
    int [] secondArr = arr;
    System.out.println("Introduzca la longitud deseada : ");
    int longitude = input.nextInt();
    return Arrays.copyOf(secondArr,longitude);
  }

  // Opción 4. Mostrar array y su copia(si esta existe)
  public static String showArray(int [] arr){
    System.out.println("Array Original: ");
     return Arrays.toString(arr);
  }

  // Opción 5. Rellenar el array.
  public static void fillArrWithSpef(int [] arr){
     Scanner input = new Scanner(System.in);
     System.out.println("Rellenar con : ");
     int numberToFill = input.nextInt();
     System.out.println("Desde que índice a que indice deseas rellanarlo.");
     System.out.println("Desde el índice : ");
     int p1 = input.nextInt();
     System.out.println("Al índice... :  (Índice exclusive)");
     int p2 = input.nextInt();
     Arrays.fill(arr,p1,p2,numberToFill);
     System.out.println("El programa ya lo relleno siguiendo tus parámetros.");
  }

  // MENU A MOSTRAR.
  public static void menuOptions(){
    System.out.println("[1]. Ordenar ASC.");
    System.out.println("[2]. Buscar.");
    System.out.println("[3]. Copiar.");
    System.out.println("[4]. Mostrar.");
    System.out.println("[5]. Rellenar.");
    System.out.println("[6]. Salir.");
  }
  //Asignar tamaño del array y crear array. 
  public static int [] createArrayInt(){
   Scanner input = new Scanner(System.in);
   System.out.println("\nTamaño del Array: ");
   int tam = input.nextInt();
   int [] array = new int[tam];
   return array;
  }

  //Asignar valores al array.
  public static void fillInitialArray(int [] arr){
    System.out.println("\nVamos a ir rellenando el array ...");

    Scanner input = new Scanner(System.in);
    for (int i = 0; i  < arr.length; i++){
      System.out.println("El valor en el indice " + i + " es de : \n");
      int val = input.nextInt();
      arr[i]  = val;
    }

    System.out.println("\nValores asignados al array.");
  }



}

