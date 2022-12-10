import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * Ejercicio 4. Utilizando StringTokenizer, haz un programa que pida al usuario que introduzca una frase y muestra : 
 * */

public class Ejercicio4{
  public static void main(String [] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Introduzca una frase.");
    String word = input.nextLine();
    //a. El número de palabras.
    StringTokenizer text01=new StringTokenizer(word);
    int numberOfWords = text01.countTokens();
    System.out.println("\n[1]. Número de palabras : " + numberOfWords);

    //b. El número de palabras con más de 5 caracteres.
    int numberOfWordsMoreThan5 = 0;
    while(text01.hasMoreTokens()){
      if(text01.nextToken().length() > 5){
	numberOfWordsMoreThan5++;
      }
    }
    System.out.println("\n[2]. Número de palabras +5 : " + numberOfWordsMoreThan5);
    
    //c. Número de palabras que empiezan por mayúsculas.
    int numberOfWordsUppercase = 0;
    StringTokenizer text02=new StringTokenizer(word);
    while(text02.hasMoreTokens()){
      String string = text02.nextToken();
      if (string.charAt(0) == string.toUpperCase().charAt(0)){
	numberOfWordsUppercase++;
      }
    }
    System.out.println("\n[3]. Número de palabras empiezan por Máyuscula : " + numberOfWordsUppercase);


    //d. Muestra cada una de las palabras sin su última letra.
    StringTokenizer text03=new StringTokenizer(word);
    System.out.println("\n[4]. Eliminar última letra.");
    while(text03.hasMoreTokens()){
      String str = text03.nextToken();
      System.out.println(str.substring(0,str.length() - 1));
    }

  }
}


