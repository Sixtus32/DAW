import java.util.Scanner;

public class Ahorcado{
  public static void main(String [] args){ 
    Scanner input = new Scanner(System.in);

    start();

    // Almacenamos una palabra aleatoria aquí.
    String palabraGenerada = eleccionAleatoria(palabrasSP());

    int oportunidades = 6;

    String [] partesDeCuerpo = {" LA CABEZA 🫥  🤯"," EL BRAZO DERECHO 💪🏾😲", " EL BRAZO IZQUIERDO 💪🏾🥹", " EL TORSO 😢 🦴", " LA PIERNA DERECHA 🦵🏾😭", " LA PIERNA IZQUIERDA 🦶🏾 🫣"}; 

    boolean estadoJuego = true;

    String palabraIncompleta = palabraPorCompletar(palabraGenerada);

    //System.out.println("\n"+palabraGenerada);
    //System.out.println(palabraIncompleta);
    do{
      String letra = introducirLetra(input); 
      char wordToPick = input.nextLine().charAt(0);
      letra.toLowerCase();
      if(comprobarSi(letra,palabraGenerada)){	
        //La posicion o posiciones que ocupa esa letra en la palabra.	
	int [] arr = arrPosiciones(letra,palabraGenerada);
	palabraIncompleta = irCompletando(letra,arr,palabraIncompleta);

        if(palabraIncompleta.equalsIgnoreCase(palabraGenerada)){
	    System.out.println("\n\nHas ganado CAMPEÓN. 🏆😀\n\n\tLa palabra que buscabamos era : " + palabraIncompleta+"🥳🎉."); 
	    estadoJuego = false;
        }else{
	  
            System.out.println("\nLa palabra en cuestión SI CONTIENE la letra "+letra+" 😀 .\n");
	    System.out.println(palabraIncompleta);
	}

      }else{
	oportunidades--;
	if(oportunidades > 0){
	  System.out.println("\nLa palabra en cuestión NO CONTIENE la " + letra +".\n");
	  System.out.println("\n"+palabraIncompleta);
	  System.out.println("\nFallastes. Y Perdistes " + partesDeCuerpo[oportunidades]+"." + "\n\t\tTe quedan "+oportunidades+" oportunidades. ");

	}
      } 

      if (oportunidades == 0){
	System.out.println("\n\nFin del juego perdistes. ¡¡¡Eres un MANTA 🤬 a llorar a otra parte!!! 🪦 💀");
	estadoJuego = false;
      }
    }while(estadoJuego);
  }

  public static String palabraPorCompletar(String palabra){
    String str = "";
    for (int i = 0; i < palabra.length(); i++){
      str += "_";
    }

    return str;
  }
  public static String irCompletando(String s, int [] pos, String incompleta){
    String sr = incompleta;
    char [] myStringChars = sr.toCharArray();
    for(int i = 0; i < pos.length; i++){
      myStringChars[pos[i]] = s.charAt(0);
    }
    sr = String.valueOf(myStringChars);
    return sr;
   }

  public static Boolean comprobarSi(String letra, String palabra){
    boolean comp = false;
    for(int i = 0; i < palabra.length(); i++){
      if (palabra.charAt(i) == letra.charAt(0)){
	comp = true;
      }
    }
    return comp;
   }

  public static int [] arrPosiciones(String letra, String palabra){
    int arr [];
    int tam = 0;
    //Me ayudará a saber las posiciones de las letras dentro de la palabra.
    for(int i = 0; i < palabra.length(); i++){
      if (palabra.charAt(i) == letra.charAt(0)){
	tam++;
      }
    }
    arr = new int[tam]; // tam → Es igual a veces en que se repite la letra.
    for(int i = 0, j = 0; i < palabra.length(); i++){
      if(palabra.charAt(i) == letra.charAt(0)){
	arr[j] = i;
	j++;
      }
    }

    return arr;
    
  }

  public static String [] palabrasSP(){
    //25 palabras a elegir.
    String  [] palabras =  {"lombriz","molusco","serpientes","empresa","autoridad","municipio", "democracia","congreso","pantalla","pomo", "arma","girasol","ventana","paraguas","bolso","bolsa","cuerda","sujetador","calzoncillo","autopista","ambulancia","entretenimiento","cultura","contenido","tigre"};
    return palabras;
  }

  public static void start(){
    System.out.println("\nBienvenido al juego del Ahorcado.");
    System.out.println("\nDispone usted de hasta seis oportunidades.");

    System.out.println("\nCOMENCEMOS!!!!");
  }

  public static String introducirLetra(Scanner sc){
    String word;
    System.out.println("\n__________________________________________\t\t* * * * * * * ");
    do{
      System.out.println("\nIntroduzca una Letra :");
      word = sc.nextLine();
      if(word.length() > 1){
        System.out.println("\nError. !!Por favor introduzca una sola letra. 🙈 ❌");
      }
    }while(word.length() > 1);

    return word;
  }

  public static String eleccionAleatoria(String [] palabras){
   int numAlea = (int)(Math.random() * palabras.length);
    return palabras[numAlea];
  }

}
