
import java.util.Scanner;
/*
 *Crea un array de números y otro de String de 10 posiciones 
 donde insertaremos notas entre 0 y 10 
 (debemos controlar que inserte una nota valida), 
 pudiendo ser decimal la nota en el array de números, 
 en el de Strings se insertaran los nombres de los alumnos.

Después, crearemos un array de String donde insertaremos el resultado de la nota con palabras.

    Si la nota esta entre 0 y 4,99 , sera un suspenso
    Si esta entre 5 y 6,99 , sera un bien.
    Si esta entre 7 y 8,99 sera un notable.
    Si esta entre 9 y 10 sera un sobresaliente.

Muestra por pantalla, el alumno su nota y su resultado en palabras. Crea los métodos que creas conveniente.

//Calcular la nota media.
 * */

public class Array10{
  public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Número de alumnos :");
    int tam = input.nextInt();
    input.nextLine();

    float notaAlumnos [] = new float[tam];
    String nombresAlumnos [] = new String[tam];

    float sumaTotal = 0f;

    for(int i = 0; i < notaAlumnos.length; i++){ 
     System.out.println("Introducir nombre del alumno: ") ;
     nombresAlumnos[i] = input.nextLine();
     System.out.println("Introduce la nota del alumno " + nombresAlumnos[i] + " : ") ;
     notaAlumnos[i] = input.nextFloat();
     if (notaAlumnos[i] >= 0 || notaAlumnos[i] <= 10){
       sumaTotal += notaAlumnos[i];
     }else{
       System.out.println("Error. Número fuera de rango.");
     }
     input.nextLine();
    }

    float media = sumaTotal / tam;
    System.out.println("La media de la clase es : " + media);

    input.close();


  } 
}

