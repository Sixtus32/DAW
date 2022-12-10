
public class CompararArray{
  public static void main(String [] args){

    int [] array = {1,0,0,1};
    boolean distintos = true;

    int size = array.length;
    for(int i = 0, j = size - 1; i <= j && distintos; i++, j++){
      System.out.println(i);
      if (array[i]!=array[j]){
	distintos = false;

      }
    }
    if (distintos){
      System.out.println("Es capicua.");
    }else {
      System.out.println("No es capicua.");
    }

  }
}

