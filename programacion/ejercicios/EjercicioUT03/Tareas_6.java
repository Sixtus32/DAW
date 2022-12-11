/*
 *Programa que lea la nota de 5 alumnos (valores enteros) y muestre en pantalla los siguientes datos:

·         Porcentaje de Aprobados

·         Porcentaje de Suspensos

·         Número de alumnos que han obtenido 10

·         Número de alumnos que han obtenido 0
 * */

import java.util.Scanner;

public class Tareas_6{
  public static void main (String [] args){

    evaluateGrades();
  }

  static void evaluateGrades(){

    int numberOfStudents = 1;
    double gradeTotal = 0;
    double numberOfSuspended = 0;
    double numberOfApproved = 0;
    int maxGrade = 0;
    int minGrade = 0;

    Scanner inputData = new Scanner (System.in);

    do {

      System.out.println("Enter the students grade : ");

      int grade = inputData.nextInt();
      gradeTotal+=grade;

      if (grade >= 0 && grade <= 10){

	numberOfStudents++;

	if (grade >= 5){

	  numberOfApproved+=grade;

	 if (grade == 10) maxGrade++;
	 
	}else {

	  numberOfSuspended+=grade;

	  if (grade == 0)  minGrade++;
	}

      }
    }while(numberOfStudents <= 5);

    double percentageOfApproved = Math.round((numberOfApproved * 100) / gradeTotal);
    double percentageOfSuspended = Math.round((numberOfSuspended * 100)  / gradeTotal);

    //System.out.println("total: "+ gradeTotal);
    System.out.println("Percentage of approved : " + percentageOfApproved + "%.");
    System.out.println("Percentage of suspended : " + percentageOfSuspended + "%.");
    System.out.println("Number of students who got a 10 : " + maxGrade + ".");
    System.out.println("Number of students who got a 0 : " + minGrade + ".");
  }
}
