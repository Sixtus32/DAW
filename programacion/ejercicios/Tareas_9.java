import java.util.Scanner;

/*Programa que lee la hora con formato hora, minutos y segundos e indique la hora, minutos y segundos después de que haya transcurrido un segundo.

	Ejemplos:

		Se introduce: 23:59:59   --->  0:0:0
		Se introduce: 12:04:43   ---> 12:04:44
 * 
 * */

public class Tareas_9{
  public static void main (String [] args){

    Scanner inputData = new Scanner(System.in);

    int hours, minute, seconds;

   do {
     System.out.print("Introduce hours (0-23) : ");
     hours = inputData.nextInt();
     inputData.nextLine();
   }while(hours < 0 || hours > 23);

   do {
     System.out.print("Introduce minute (0-59) : ");
     minute = inputData.nextInt();
     inputData.nextLine();
   }while(minute < 0 || minute > 59);

   do{
     System.out.print("Introduce seconds (0-59) : ");
     seconds = inputData.nextInt();
     inputData.nextLine();
   }while(seconds < 0 || seconds > 59);

   seconds++;

   if (seconds > 60){
     seconds = 0;
     minute++;
       if (minute > 59 ){
	 minute = 0;
	 hours++;

	 if (hours > 23){
	   hours = 0;
	 }
       }
   }

   System.out.println("" + hours + ":"+minute+":"+seconds);

   inputData.close();
  }
}
