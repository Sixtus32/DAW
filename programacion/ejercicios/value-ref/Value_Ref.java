
//paso de parámetros por valor → Java funciona con este.
//paso de parámetros por referencia.
// solo es mutable si hablamos de clases (objetos o tipos complejos): array, String, obj...
// si se altera la dirección del objeto inicial este cortar el lazo con el anterior.

public class Value_Ref{
  public static void main(String [] args){
   int x = 5;
   int y = 6;

   int [] xy = {5,6};
   intercambioObj(xy);
   System.out.println(" x : " + xy[0] + ", y : " + xy[1]);
  }
  public static void intercambio(int a, int b){
  System.out.println("a : " + a + ", b : " + b);
  //valor inicial
  int aux = a;
  a = b; 
  b = aux;
  //valor del cambio
  System.out.println("a : " + a + ", b : " + b);
}

  public static void intercambioObj(int [] ab){
    System.out.println("Valor a : " + ab[0] + "\nValor b : " + ab[1]);
    int [] pq = {8,9};
    ab = pq;
    System.out.println("Valor a :" + ab[0] + "\nValor b : " + ab[1]);
  }
}


