
/*
 * Ejercicio 12. Simular la extracción al azar de las 6 bolas más la del complementario del bombo
de la lotería primitiva, visualizándolas según vayan apareciendo. Evitar repeticiones.
 * */

import java.util.Random;

public class XArray12{
  public static void main(String [] args){
    boolean [] sorteo = new boolean[50];

    int num;

    Random bola = new Random();

    for(int i = 0; i < sorteo.length; i++){
      sorteo[i]=false;
    }

    for(int i = 0; i < 6; i++){
      do{
	num=bola.nextInt(49-1+1);
      }while(sorteo[num]);
      sorteo[num]=true;
    }

    for(int i=0; i < sorteo.length;i++){
      if(sorteo[i]){
	System.out.println((i+1) + "\t");
      }
    }

  }
}

