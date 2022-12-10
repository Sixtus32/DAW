import java.util.*;

/* Ejercicio 2. 
 *Escribe una clase con diferentes métodos:

a. Un método al que le pasamos una cadena y devuelva el número de espacios que
contiene esa cadena (tanto al principio y al final, como intercalados). Invocar al método
desde el método principal.

b. Un método al que le pasamos una cadena e indique en pantalla el número de vocales
que hay en la cadena, el número de consonantes, el número de dígitos.

c. Un método al que le pasamos una cadena y elimine los espacios en blanco, devolviendo
la nueva cadena.

d. Un método al que le pasamos una cadena y nos devuelva si la cadena es un palíndromo
(true) o no (false). Un palíndromo es una palabra o frase que se lee igual al revés que al
derecho.

e. Un método al que le pasemos una cadena, un carácter y otro carácter y nos devuelva
otra cadena igual que la primera en la que se ha sustituido el primer carácter por el
segundo carácter.

f. Invoca a todos los métodos desde el programa principal para probarlos.

 * */
public class Ejercicio2{
  public static void main(String [] args){
    Scanner input=new Scanner(System.in);
    System.out.println("\nIntroduzca un texto: \n");
    String text=input.nextLine();
    //a.
    System.out.println("Número de espacios : " + numberOfSpaces(text));
    //b.
    countingAlpha(text);
    //c.
    System.out.println("Texto sin espacios : \n" + textWithoutSpace(text));
    //d.
    System.out.println("Palíndromo : " + palindrome(text));
    //e.
    System.out.println("Introduce los carácteres : ");
    System.out.println(replaceCharacters(text,input.nextLine().charAt(0), input.nextLine().charAt(0)));
  }


  // a.	Contar espacios.
  public static int numberOfSpaces(String text){
    int countSpace = 0;
    for (int i = 0; i < text.length(); i++) if ( text.charAt(i) == ' ') countSpace++;    
    return countSpace;
  }

  //b. Contar vocales, consonantes y dígitos.
  public static void countingAlpha(String text){

    int vocals = 0, consonants = 0, digits = 0;

    for (int i = 0; i < text.length(); i++){
      char character = text.charAt(i);
      if ((character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') && character != ' '){
	vocals++;
      }else if (!(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') && character != ' ' && !(character == '0' || character == '1' || character == '2' || character == '3' || character == '4' || character == '5'|| character == '6' || character == '7' || character == '8' || character == '9')){
	consonants++;
      }else if((character == '0' || character == '1' || character == '2' || character == '3' || character == '4' || character == '5'|| character == '6' || character == '7' || character == '8' || character == '9')){
	digits++;
      }
    }
    System.out.println("El número de VOCALES es : " + vocals);
    System.out.println("El número de CONSONANTES es : " + consonants);
    System.out.println("El número de DÍGITOS es : " + digits);
  }

  // c. Nueva cadena de texto sin espacios en blanco. (Usando un método de String)
  public static String textWithoutSpace(String text){
    return text.replace(" ", "");
  }

  // d. palíndromo → Devuelve true OR false (esto si puede hacer sin métodos)
  public static boolean palindrome(String text){
    //StringBuilder textB = new StringBuilder(text);
    return text.equals(new StringBuilder(text).reverse().toString());
  }

   // e. Sustitución de caracteres  (CON METODO)
  public static String replaceCharacters(String text, char firstChar, char secondChar){
    return text.replace(firstChar,secondChar);
  }

}

