import java.util.Scanner;

/*Leer 30 letras y visualizar cuantas aes, es, ies, oes, ues hay.
 * */

public class Ejercicio_12{
  public static void main(String [] args){

    evaluteWords();

  }
  
  static void evaluteWords(){
    Scanner inputKey = new Scanner(System.in);

    int numA=0, numE = 0, numI = 0, numO = 0, numU = 0;

    for (int i = 0; i < 30; i++){
      System.out.println("Enter a vowel : ");

      char word = inputKey.nextLine().charAt(0);

      word = Character.toLowerCase(word);

      if (word == 'a' || word == 'A') numA++;
      else if (word == 'e' || word == 'E') numE++;
      else if (word == 'i' || word == 'I') numI++;
      else if (word == 'o' || word == 'O') numO++;
      else if (word == 'u' || word == 'U') numU++;
      else  {
	System.out.println("Incorrect word . It isnt a vowel");
	i--;
      }

    }

    System.out.println("Number of a : " + numA);
    System.out.println("Number of e : " + numE);
    System.out.println("Number of i : " + numI);
    System.out.println("Number of o : " + numO);
    System.out.println("Number of u : " + numU);
    
  }
}
