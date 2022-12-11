
/*
 * Programa que genere una letra aleatoriamente y determine si es vocal o consonante.
 *
 * */

public class Tareas_5{
  public static void main (String [] args){

  genereteRandomlyLetter();
  }

  static void genereteRandomlyLetter(){
   int randomNumber = (int) Math.floor(Math.random() * 27);
   char [] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};


   char word = letters[randomNumber];

    System.out.println("I generate the word " + " [ "+ word + " ]. ");

    switch(word){
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
	System.out.println("The word " + word + " it is a vowel.");
	break;
      default :
	System.out.println("The word " + word + " it is an consonant.");
	break;
	
    }

  }
}
