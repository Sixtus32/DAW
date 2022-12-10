public class EjercicioMatrices{
  public static void main(String [] args){
    final int FILAS = 3;
    final int COLUMNAS = 4;

    // Declarar matrices

    int [] [] m1 = new int[FILAS][COLUMNAS];
    int [] [] m2 = new int[FILAS][COLUMNAS];
    int [] [] m3 = new int[FILAS][COLUMNAS];

    for (int i = 0; i < FILAS; i++){
      System.out.println("Matriz : " + i + ".");
      for(int j = 0; j < COLUMNAS; j++){
	m1[i][j] = (int) (Math.random() * 20 + 1);
	System.out.print(m1[i][j] + " + ");
	
	m2[i][j] = (int) (Math.random() * 20 + 1);
	System.out.print(m2[i][j] + " = ");

	m3[i][j] = m1[i][j] + m2[i][j];
	System.out.println(m3[i][j]);
	System.out.println(" ");

      }
    }
   
  }
}

