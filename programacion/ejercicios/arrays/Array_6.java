import java.util.Scanner;

/*6. Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres. Puedes hacer con o sin métodos de String.
 */

public class Array_6{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce una frase : ");

    String word = sc.nextLine();

    char [] wordArr;
    for (int i = 0; i < word.length(); i++){
      wordArr = new char [word.length()];
      wordArr[i] += word.charAt(i);
      System.out.println("En el indice : " + i + ", esta la letra : "+ wordArr[i]);
    }
  }
}
