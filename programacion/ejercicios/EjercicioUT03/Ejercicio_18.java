import java.util.Scanner;

public class Ejercicio_18{
  public static void main(String [] args){

    timingSeconds();

  }
  
  static void timingSeconds(){
    Scanner inputSeconds = new Scanner(System.in);
    System.out.println("Enter the time in seconds : ");
    
    int t = inputSeconds.nextInt();

    int hours=0,minute=0,seconds=0;
    // Para quede más chulo.
    //String ssStr = "0", hrStr="0", mmStr="0";

    do {

      if (t >= 3600){
	hours = t / 3600;
      }

      t -= (hours * 3600);

      if (t < 3600 && t >= 60){
	minute = t / 60;
      }
      
      t -= (minute * 60);

      if (t < 60){
	seconds = t;
      }
      t -= t;

    }while(t != 0);


    System.out.println("Time : " + hours + "hr : " + minute + "mm : " + seconds + "ss." );

  }
}
