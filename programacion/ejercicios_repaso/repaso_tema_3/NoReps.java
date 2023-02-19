public class NoReps{
  public static void main(String [] args){
    int [] arrays=new int[50];
    int contador=0, n;
    while (contador < arrays.length){
      n=(int)(Math.random()*5+1);
      if (noreps(arrays, n)){
	arrays[contador]=n;
	contador++;
      }
    }

    for(int i=0; i < arrays.length; i++){
         System.out.print(arrays[i] + " , ");
    }

  }

  // validar si se repiten
  public static boolean noreps(int [] arrays, int numComprobar){
    for(int i=0; i < arrays.length; i++){
      if(numComprobar == arrays[i]){
	return false;
      }
    }
    return true;
  }
}

