import java.util.Scanner;
/*
 *Programa que calcule la nota media de la clase de programación, para ello se pedirá al usuario que introduzca el número de alumnos que hay en clase, y a continuación, se irán pidiendo las notas individuales (con decimales) para mostrar finalmente la nota media de la clase.
 * */

public class Tareas_8{
  public static void main (String [] args){
    averageProgrammingGrade(); 
  }

  static void averageProgrammingGrade(){

    Scanner inputNumberOfStudents = new Scanner(System.in);
    Scanner inputStudentsGrade = new Scanner(System.in);
    int totalGrade = 0;

    System.out.println("Enter the number of students in class : ");
    int numberOfStudents = inputNumberOfStudents.nextInt();
    
    for (int i = 0; i < numberOfStudents; i++){
      System.out.println("Enter the students grade : ");
      float studentsGrade = inputStudentsGrade.nextFloat();

      totalGrade += studentsGrade;

    }

    double averageGrade = (double) totalGrade / numberOfStudents;

    System.out.println("The average grade is : " + averageGrade); 


  }
}
