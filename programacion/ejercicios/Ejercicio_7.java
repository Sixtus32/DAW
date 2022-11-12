import java.util.Scanner;


public class Ejercicio_7{
  public static void main(String [] args){

  }

  static void showGrades (){
    
    int numberOfGrades = 1;
    int numberOfApproved = 0;
    int numberOfSuspended = 0;

    do{
      Scanner inputGrades = new Scanner(System.in);

      int grades = inputGrades.nextInt();

      if(grades >= 5){
	numberOfApproved++;
      }else {
	numberOfSuspended++;
      }
      

    }while(numberOfGrades <= 20);

    System.out.println("Number of approved : " + numberOfApproved);
    System.out.println("Number of suspended : "+ numberOfSuspended);
  }
}
