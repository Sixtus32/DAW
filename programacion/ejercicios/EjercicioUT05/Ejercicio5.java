import java.util.Scanner;
import java.util.StringTokenizer;
/*
 * Ejercicio 5.
 *
 * Realiza un programa que haga lo siguiente : 
 * */

public class Ejercicio5{
  public static void main(String [] args){
    int count = 0;
    Scanner input = new Scanner(System.in);
    // a. Solicitar al usuario una cadena con varios palabras.
    StringTokenizer st = new StringTokenizer(input.nextLine());
    // b. Mostrar el número de palabras de la frase.
    int num = st.countTokens();
    System.out.println("Número de palabras de la frase: " + num);
    // c. Mostrar cada palabra en una línea diferente.
    String arr [] = new String[num];
    while(st.hasMoreTokens()){
      String s = st.nextToken();
      arr[count] = s;
      System.out.println(s);
      count++;
    }
    //d. Almacenar en una arry de StringBuffer las palabras de la frase.
    StringBuffer [] buffers = new StringBuffer[arr.length];
    for(int i = 0; i < arr.length; i++){
      buffers[i] = new StringBuffer(arr[i]);
    }

    //e. Modificar las StringBuffer del array haciendo que la primera letra pase a ser la última, la segunda la penúltima...etc. Ejemplo: Si la frase es "Hola que tal estás", el array modificado debe contener: [aloH, euq, lat, sátse]
    System.out.println("");

    for(int i = 0; i < arr.length; i++){
      System.out.println(buffers[i].reverse().toString());
    }
  }
}

