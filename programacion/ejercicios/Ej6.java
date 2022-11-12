import java.util.Scanner;

public class Ej6{
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);

    try{
      int n1 = input.nextInt();
      int n2 = input.nextInt();

      System.out.println(n1 + n2);

    }catch(Exception e){
      System.out.println("hay un error: " + e);
    }

  }
}
