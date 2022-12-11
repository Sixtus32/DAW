import java.util.Random;

public class XArray10{
  public static void main(String [] args){
    Random rm = new Random();
    int jugadas = 0, ncaras=0;

    System.out.println("Tiras la moneda y sale un : ");
    
    do{
    if(rm.nextBoolean()) {ncaras++;
    	System.out.println("Caras");}
    else {ncaras=0;
    	System.out.println("Cruz");}
    jugadas++;
  }while(jugadas > 3);

  }
}

