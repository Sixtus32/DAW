/*
 * 12) Dado un array de números de 5 posiciones con los siguiente valores {1,2,3,4,5}, guardar los valores de este array en otro array distinto pero con los valores invertidos, es decir, que el segundo array debera tener los valores {5,4,3,2,1}.
 * */

public class Array12{
  public static void main(String [] args){
    int [] arrValues = {1,2,3,4,5};
    int [] arrValuesRev = new int[arrValues.length];

  for(int i = arrValues.length - 1, j = 0; i >= 0; i--, j++){
      arrValuesRev[j] = arrValues[i];
      System.out.println(arrValuesRev[i]);
    }


   }
}
