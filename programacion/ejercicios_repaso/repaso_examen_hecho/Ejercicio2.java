import java.util.Scanner;

public class Ejercicio2{
  public static void main(String [] args){
    Scanner entradaDato=new Scanner(System.in);
    int [] arr={ 11, 20, 3, 15, 9, 4, 12, 1, 7, 13, 5, 14, 19, 2};
    for(int a: arr){
       System.out.println(a + " , "); 
    }
    System.out.println("Número a introducir : "); 
    int numero=entradaDato.nextInt();
    System.out.println("Posición donde introducir : ");
    int posicion=entradaDato.nextInt();
    insertaElemento(arr,numero,posicion);
  }

  public static void insertaElemento(int [] array, int num, int pos){
    int posAux=array.length - 1;
    for(int i=0; i<array.length; i++){
      array[i]=
    }
  }
}

