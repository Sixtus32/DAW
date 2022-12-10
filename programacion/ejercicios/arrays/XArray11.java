import java.util.*;

public class XArray11{
  public static void main(String [] args){
    char [] cadena = new char[8];
    int count = 0;
    boolean tocaVocal = true;

    Random entero = new Random();

    while(count<8){
      do{
	cadena[count]=(char)(entero.nextInt(90-65+1)+65);
      }while((tocaVocal && !esVocal(cadena[count])) || (!tocaVocal&&esVocal(cadena[count])));
      tocaVocal=!tocaVocal;
      count++;
    }
    System.out.println(cadena);
  }

  public static boolean esVocal(char c){
    boolean vocal = false;

    if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U') vocal = true;
    return vocal;
  }
}

