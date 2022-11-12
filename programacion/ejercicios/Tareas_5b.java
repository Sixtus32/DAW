public class Tareas_5b{
  public static void main(String [] args){
    // 122 - 97
    int number = (int) (Math.random() * (123 - 97) + 97);
    char word = (char)number;

    System.out.println("The random word is : " + word);
    if (word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u'){
      System.out.println("It is vowel. ");
    }else {
      System.out.println("It is a consonant. ");
    }
  }
}
