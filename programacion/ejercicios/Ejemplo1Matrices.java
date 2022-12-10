public class Ejemplo1Matrices{
  public static void main(String [] args){

    final int FILAS = 3;
    final int COLUMNAS = 4;
    byte [] [] matriz = new byte[FILAS][COLUMNAS];
    int total = 0;

    //Asignar valores
    for(int i = 0; i < FILAS;i++){
      for(int j = 0;j < COLUMNAS; j++){
	matriz[i][j] = (byte)(Math.random() * (10) + 1);
      }
    }
    System.out.println(" ");
    //Mostrar valores
    for(int j=0; j<COLUMNAS; j++){

    int totalFila = 0;
      for(int i=0; i < FILAS; i++){

	System.out.println("Matriz " + "[" + i +"]" + " en " + "[" + j + "]" + " es : " + matriz[i][j]);
	total += matriz[i][j];
	totalFila += matriz[i][j];

      }


      System.out.println("\n\tTotal de la columnas  : " + totalFila +"\n");

      totalFila = 0;
    }
      System.out.println("\nTotal : " + total);
  }
}

