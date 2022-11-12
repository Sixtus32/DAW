import java.util.Scanner;


public class Tareas_12 {
  public static void main (String [] args){

  }

  static void terraMiticaProgram(){
    int numberOfEntrance = 0;

    int numberChildrens = 0;
    int numberYoungs = 0;
    int numberAdults = 0;

    


    do {
      Scanner inputAge = new Scanner(System.in);
    int age = inputAge.nextInt();

    }while(age == -1)

    
     if (age < 4){
      numberChildrens+=1;

      numberOfEntrance+=0;
    }else if (age <=  4 && age <= 12){

      numberYoungs+=1;

      numberOfEntrance+=20;
    }else if (age > 12){

      numberAdults+=1;

      numberOfEntrance+=40;
    }


  }
}
