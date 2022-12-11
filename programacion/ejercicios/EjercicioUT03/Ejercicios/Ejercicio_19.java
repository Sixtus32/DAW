import java.util.Scanner;

/*19. Realiza un programa que dado un importe en euros nos indique el mínimo número de billetes y la cantidad sobrante que se pueden utilizar para obtener dicha cantidad. Se considera que disponemos de billetes de 200, 100, 50, 10 y 5 €. Por ejemplo: 232 euros: 1 billete de 200. 1 billete de 20. 1 billete de 10 Sobran 2 euros.*/

public class Ejercicio_19{
  public static void main(String [] args){
    cashSeperator();
  }

  static void cashSeperator(){
    
    Scanner inputCash = new Scanner (System.in);

    System.out.println("Enter amount : ");

    int cash = inputCash.nextInt();


    String result = "";

    int money_200 = cash / 200;
    int money_100 = (cash%200) / 100;
    int money_50 = ((cash%200) % 100) / 50;
    int money_20 = (((cash%200) % 100) % 50) / 20;
    int money_10 = ((((cash%200) % 100) % 50) %20) / 10;
    int money_5 = (((((cash%200) % 100) % 50) % 20) % 10) / 5;
    int money_2 = ((((((cash%200) % 100) % 50) % 20) % 10 ) % 5) / 2;
    int money_1 = (((((((cash%200) % 100) % 50) % 20) % 10 ) % 5) % 2) / 1;
    
    
// display better

    if (money_200 > 0){
      result += "\n" + money_200 + " billetes  de 200.";
    }
    if (money_100 > 0){
      result += "\n" + money_100 + " billetes  de 100.";
    }
    if(money_50 > 0){
      result += "\n" + money_50 + " billetes de 50.";
    }
    if (money_20 > 0){
      result += "\n" + money_20 + " billetes de 20.";
    }
    if (money_10 > 0){
      result += "\n" + money_10 + " billetes de 10.";
    }
    if (money_5 > 0){
      result += "\n" + money_5 + " billetes de 5.";
    }
    if (money_2 > 0){
      result += "\n" + money_2 + " monedas de 2.";
    }
    if (money_1 > 0){
      result += "\n" + money_1 + " monedas de 1.";
    }

    System.out.println(result);


  }
}
