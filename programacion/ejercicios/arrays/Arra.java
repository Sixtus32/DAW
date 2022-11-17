import java.util.Scanner;

public class Arra{
  public static void main(String [] args){
    char [] array = new char[26];

    for (int i = 65, j = 0; i <= 90; i++, j++){
      array[j] = (char) i;
      System.out.println(array[j]);
    }
  }
}
