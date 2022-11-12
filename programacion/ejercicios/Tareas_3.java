
import java.util.Scanner;

/*Programa que calcule el área de una circunferencia cuyo radio se pide al usuario que lo introduzca por teclado.

(Fórmula: A= л*r2)
 * */

public class Tareas_3 {
  public static void main (String [] args){

    calculateAreaCircumference();
  }

  static void calculateAreaCircumference(){

    Scanner inputData = new Scanner(System.in);
    System.out.println("Enter a value for the radius : ");
    int radiusValue = inputData.nextInt();

    double area = Math.PI*Math.pow(radiusValue,2);

    System.out.println("The area circumference is : " + area);
  }
}
