// Generar números aleatorios (con Random)
import java.util.Random;
public class UsandoRandom{
  public static void main(String [] args){
    // 1. Primer tipo de constructor.
    Random rnd = new Random();
    // Generar números aleatorios enteros.
    int randomNumber = (int) (rnd.nextDouble() * (6 - 5 + 1) + 5);

    // 2. Segundo constructor.
    Random rnd2 = new Random(23);
    
    System.out.println(randomNumber);
  }
}

