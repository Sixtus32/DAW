import java.util.Scanner;

public class Ejercicio_18b{

  public static void main (String [] args){

    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    if (t > 0 ){
      int horas = t / 3600;
      int minutos = (t % 3600) / 60;
      int segundos = (t % 3600) % 60;

      System.out.println(horas + "horas, " + minutos + "minutos", + segundos + "segundos.");
    } else {
      System.out.println("Error");
    }
  }
}
