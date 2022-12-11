import java.util.Scanner;

/*
 *Programa para una empresa que desea controlar el stock de almacén. Se dispone inicialmente de 1000 unidades de producto. El encargado de almacén ira sirviendo pedidos de producto según los vayan solicitando (introduciendo las cantidades de pedido por teclado) hasta que el stock de producto baje de 200, en ese caso, se mostrará un mensaje de aviso y terminará el programa.
 * */

public class Tareas_11{
  public static void main(String [] args){
    int initialStock = 1000;

    stockController(initialStock);
    //stockController2(initialStock);
  }

  static void stockController(int initialStock){
    System.out.println("Enter order quantity : ") ;
    Scanner inputQuantity = new Scanner(System.in);

    while (initialStock > 200 && initialStock > 0){
      int orderQuantity = inputQuantity.nextInt();
      initialStock-=orderQuantity;
    }

    System.out.println("Program STOPPED!!!. \nExcess stock number : " + initialStock);

  }

  static void stockController2(int initialStock){
    Scanner inputQuantity = new Scanner(System.in);

    while(initialStock > 200 && initialStock > 0){
      int randomOrderQuantity = (int) (Math.random() * 1000);
      System.out.println("A company requested " + randomOrderQuantity + " of our product.");
      System.out.println("Sent : ");
      int orders = inputQuantity.nextInt();
      if (orders == randomOrderQuantity){
	initialStock-=orders;
      }else {
	System.out.println("That is unacceptable.");

      }
    }
    
    System.out.println("Program STOPPED!!!. \nExcess stock number : " + initialStock);

  }
}
