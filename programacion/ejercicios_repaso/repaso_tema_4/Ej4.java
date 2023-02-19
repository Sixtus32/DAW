public class Ej4{
  public static void main(String [] args){
    int [] bolaAzar=new int[6];
    int contador=0;
    while (contador < bolaAzar.length) {
      int numAle=(int)(Math.random() * (50 - 1 + 1) + 1);
      if (noreps(bolaAzar,numAle)){
	bolaAzar[contador]=numAle;
	contador++;
      }	
    }

    for(int i=0; i<bolaAzar.length; i++){
       System.out.println(bolaAzar[i]); 
    }

  }

  public static boolean noreps(int [] arrays, int num){
    for(int i=0; i < arrays.length; i++){
      if (arrays[i]==num){
	return false;
      }
    }
    return true;
  }
}

