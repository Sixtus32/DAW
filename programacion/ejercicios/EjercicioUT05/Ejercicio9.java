import java.util.Scanner;

public class Ejercicio9{
  public static void main(String [] args){

  System.out.println("Introduzca la palabra cifrar : ");
        
        //a.  Todo mensaje debe estar en letras mayúsculas.
        Scanner input = new Scanner(System.in);
        String word = input.nextLine(); 
        String mayus = word.toUpperCase();
        //b.  y c.
        char [] abc = new char[26];
        String s = "";
        int z = 0;
        for (int i = 0; i < mayus.length(); i++) {
             int n = mayus.charAt(i); 
             if (n == 65){
                 n = 90;
                 s += (char) (n);
             }else if (n == 90){
                 n = 65;
                 s += (char) (n);
             }else if (n == 48){
                 n = 57;
                 s += (char) (n);
             }else if (n == 57){
                 n = 48;
                 s += (char) (n);
             }else {
                 s += (char) (n + 1);
             }
             
        }
        System.out.println(s);
  }
}

