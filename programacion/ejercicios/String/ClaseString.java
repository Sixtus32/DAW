
public class ClaseString{
  public static void main(String [] args){

    String cadenaSinEspacios = " dabale arroz a la zorra el abad".trim().replace(" ","");

    System.out.println( "\nEs el original : "+ cadenaSinEspacios);
    StringBuilder str = new StringBuilder(cadenaSinEspacios);
    System.out.println("\nEs el falso : " + str);
    String palindromo = str.reverse().toString();

    if (cadenaSinEspacios.equals(palindromo)) System.out.println("\nSi es un palindromo");
    else System.out.println("\nNo son palindrom.");

  }

}

