
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

 * */

public class Array10{
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);

    float notaAlumnos [] = new float[10];
    String nombresAlumnos [] = new String[10];

    float nota;
    String nombre;


    do {
      System.out.println("Nombre del alumno : ");
      nombre = input.nextLine();
      System.out.println("Nota del alumno: ");
      nota = input.nextFloat();

      for (int i = 0; i < notaAlumnos.length; i++){
	notaAlumnos[i] = nota;
        nombresAlumnos[i] = nombre;	
	System.out.println("El alumno " + nombresAlumnos[i] + " ha sacado esta nota : " + notaAlumnos[i]);
      }


    }while(nota >= 0.00 && nota <= 10);
    input.close();
  }
}
