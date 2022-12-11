import java.util.Scanner;

public class EjercicioMatrices2{
  public static void main(String [] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Escoge una opción.");
    int opcion; 
    boolean matrizRellena = false;
    int matriz [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

    do{

      System.out.println("1. Suma una fila");
      System.out.println("2. Suma una columna");
      System.out.println("3. Suma diagonal principal");
      System.out.println("4. Suma diagonal inversa");
      System.out.println("5. Calcular media");
      System.out.println("6. Salir");
      
      opcion = sc.nextInt();

      switch(opcion){

	case 1:
	  System.out.println("Suma de filas");
	  break;
	case 2:
	  System.out.println("Suma de columnas.");
	  break;
	case 3:
	  System.out.println("\n\nSuma de diagonal principal."); 
	  System.out.println("\n\t"+sumarDiagonalPrincipal(matriz));
	  break;
	case 4:
	  System.out.println("\n\nSuma de diagonal inversa."); 
	  System.out.println("\n\t"+sumarDiagonalInversa(matriz));
	  break;
	case 5:
	  System.out.println("\n\nMedia Total. "); 
	  System.out.println("\n\t" + mediaTotal(matriz));
	  break;
	case 6: System.out.println("Adios");
		break;
	default: 
		System.out.println("Opción incorrecta.");
      }

    }while(opcion != 6);

  }
  /*
  public static int sumarColumna(int [][] matriz, int columna){
    int suma = 0;
    if (columna >= 0 && columna < matriz[0].length){
      for(int i = 0; i < matriz.length; i++){
	suma += matriz[i][columna];
      }
    }
  }*/

  //Suma de diagonal principal.
  public static int sumarDiagonalPrincipal(int [][] matriz){
	int suma = 0;
    for(int i = 0, j = 0; i < matriz.length; i++, j++){
	  suma += matriz[i][j];
    }
    return suma;
  }

  //Suma de diagonal inversa.
  public static int sumarDiagonalInversa(int [][] matriz){
    int suma = 0;

    for(int i = 0, j = matriz.length - 1; i < matriz.length; i++, j--){
      suma += matriz[i][j];
    }

    return suma;
  }

  //Calcular la media.
  public static double mediaTotal (int [][] matriz){
    double sumaTotal = 0;

    for (int i = 0; i < matriz.length; i++){
      for (int j = 0; i < matriz[i].length; i++){
	sumaTotal += matriz[i][j];
      }
    }
    return sumaTotal/(matriz.length * matriz[0].length);
  }

  
}

