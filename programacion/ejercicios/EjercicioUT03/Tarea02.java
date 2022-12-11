import java.util.Scanner;

public class Tarea02{
  public static void main(String [] args){
    //1.Programa que calcule la longitud en centímetros de una circunferencia de radio 3 metros. 
    final double RADIO = 3;
    final double NUMBER_PI = Math.PI;
    double longitude = (2 * NUMBER_PI * RADIO);
    System.out.println(longitude);

    //2. Programa que calcule el área de una circunferencia cuyo radio se pide al usuario que lo introduzca por teclado
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.println("Introduzca un número: ");
    System.out.println("Área de una circunferencia : " + (Math.PI * (Math.pow(input.nextDouble(), 2))));

    //3.Programa que imprima en pantalla, el siguiente texto, respetando el formato (tabulaciones, saltos de línea, etc):
    System.out.println("Me\t gusta la \"programación\",\n\ncada día más.");
    //4. Programa que genere una letra aleatoriamente y determine si es vocal o consonante.
    int n = (int) (Math.random() * (122 - 97 + 1) + 97);
    char w = (char) n;
    System.out.println("Su palabra es la siguiente : " + w);
    if( w == 'a' || w == 'e' || w == 'i' || w == 'o' || w == 'u') System.out.println("Es Volca.");
    else System.out.println("Es Consonante.");
    //5. Programa que lea la nota de 5 alumnos (valores enteros) y muestre en pantalla los siguientes datos:
    java.util.Scanner input2 = new java.util.Scanner(System.in);
    final int NUMBER_STUDENTS= 5;
    System.out.println("Introduce la nota de los " + NUMBER_STUDENTS + " estudiantes.");
    int nStudent = 1, perPass = 0, perFail = 0, took10 = 0, took0 = 0;
    int result; 
    do{
      System.out.println("Nota del alumno número " + nStudent + ": ");
      result = input2.nextInt();
      if (result < 5) {
	perFail++;
	if(result == 0) took0++;
      }else {
	perPass++;
	if (result == 10) took10++;
      }
      nStudent++;
    }while(nStudent <= 5 && result >= 0 && result <= 10);

    System.out.println("Porcentaje de Aprovados : " + ((perPass * 100) / NUMBER_STUDENTS)  + "%.");
    System.out.println("Porcentaje de Suspensos : "+((perFail * 100) / NUMBER_STUDENTS) + "%.");
    System.out.println("Número de alumnos con un 10 : " + took10);
    System.out.println("Número de alumnos con un 0 : " + took0);
    //6. Haz un programa que pida al usuario un valor N y después vaya sumando los N números que se vayan introduciendo por teclado.
    input2.nextLine();
    System.out.println("Introduzca cuántos números se van a procesar: ");
    int count = 0;
    int sumPares = 0, sumImpares = 0, inputTime  = input2.nextInt();
    while (count < inputTime){
      System.out.println("Introduzca un número : ");
      int numInput = input2.nextInt();
      if (numInput % 2 == 0) sumPares+=numInput;
      else sumImpares+=numInput;
      count++;
    }
    System.out.println("La suma de los pares es : " + sumPares);
    System.out.println("La suma de los impares es : " + sumImpares);
    //7. Nota media alumnos.
    input2.nextLine();
    System.out.println("Program que muestre nota media de la clase de programación.");
    System.out.println("Número de estudiantes : ");
    double numberOfStudents = input2.nextDouble();
    int countStudents = 0;
    double notesTotal = 0;
    while (numberOfStudents > countStudents){
      System.out.println("Introduce la nota del alumno : ");
      double notes = input2.nextDouble();
      notesTotal+=notes; 
      countStudents++;
    }
    double avg = notesTotal/numberOfStudents;
    System.out.println("Nota media de : " + avg);
    /*8. Programa que lee la hora con formato hora, minutos y segundos e indique la hora, minutos y segundos después de que haya transcurrido un segundo.
	Ejemplos:

		Se introduce: 23:59:59   --->  0:0:0
		Se introduce: 12:04:43   ---> 12:04:44
 * */
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

   if (seconds == 60 && minute < 59 && hours < 23){
     seconds = 0;
     minute++;
     hours++;
     if(minute == 60 && hours < 23){
       minute = 0;
       hours++;
       if(hours > 23){
	 hours = 0;
       }
     }
   }
   

   System.out.println("" + hours + ":"+minute+":"+seconds);
   // 9. Menú.
   inputData.nextLine();
   System.out.println("Menu");
   int op = 0;
   while(op != 3){
   inputData.nextLine();
     System.out.println("1. Saludar.");
     System.out.println("2. Despedirse.");
     System.out.println("3. Salir.");
     op = inputData.nextInt();
     switch(op){
       case 1:
         inputData.nextLine();
	 System.out.println("Tu nombre pls : ");
	 String nom = inputData.nextLine();
	 System.out.println("Hola " + nom);
	 break;
      case 2:
	 System.out.println("Adiós");
	 break;
      case 3:
	 System.out.println("Programa terminado.");
	 break;
      default:
	 System.out.println("Opción no válida.");
     }
   }

  }
}

