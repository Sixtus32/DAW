package com.mycompany.ejercio_1;


import java.util.Scanner;

/*	Tareas 1.	Realiza un programa que reciba por teclado un número, que indicará lo que se desea realizar:

    Si el usuario introduce un 1, se pedirán dos números más y se multiplicarán.
    Si el usuario introduce un 2, se pedirá un número del cual mostrarán los divisores.
    Si el usuario introduce un 3, se pedirá una cadena, y a continuación se mostrarán todos los caracteres de esa cadena, seguidos de caracteres *. Ejemplo, si se introduce 'hola', se mostrará 'h*o*l*a*'
 *
 * */

public class Tareas_1 {
  public static void main (String [] args){
    Scanner inputData = new Scanner(System.in);
    System.out.println("Introduce a number : ");

    int option = inputData.nextInt();
    
    switch (option){
      case 1:
	flutter();
	break;
      case 2:
	System.out.println("Introduce un número");
	int number = inputData.nextInt();
	divide(number);
	break;
      case 3:
	System.out.println("Write a string : ");
	String str = inputData.next();
	stringPrinter(str);
        	
    }
  }

  static void flutter(){
    Scanner inputData = new Scanner (System.in);
    System.out.println("Introduce the first number : ");
    int number1 = inputData.nextInt();
    System.out.println("Introduce the second number : ");
    int number2 = inputData.nextInt();
    System.out.println("Multiplication is : " + number1*number2);
  }

  static void stringPrinter(String str){
    for(int s = 0; s < str.length(); s++){
      System.out.println(str.charAt(s) + "*");
    }
  }

  static void divide(int number){
    int counter = 1;
    while (counter <= number){
      if (number % counter == 0){
	System.out.print(counter + " ");
      }
      counter++;
    }
  }
}
