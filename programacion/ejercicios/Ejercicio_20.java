import java.util.Scanner;

public class Ejercicio_20{
  public static void main (String [] args){
    evaluteGrates();
  }

  static void evaluteGrates (){
    float grade, avg= 0f;

    Scanner inputGrades = new Scanner (System.in);

    for (int i = 0; i < 40; i++){
      System.out.println("Introduce a grade : " );
      grade = inputGrades.nextFloat();
     avg+=grade;     
    }
    avg=avg/40;
    if (avg >= 5){
      System.out.println("Approved.");
    }else {
      System.out.println("Suspended.");
    }
  }
}
