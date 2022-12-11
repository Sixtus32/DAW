
public class Tarea01{
  public static void main(String [] args){
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.println("Introduce un número : ");

    switch(input.nextInt()){
      case 1:
	input.nextLine();
	System.out.println("Este programa requiere de dos números");
	System.out.println("Primer valor : ");
	int first = input.nextInt();
	System.out.println("Segundo valor: ");
	int second = input.nextInt();
	int total = first * second;
	System.out.println("El total es : " + total);
	break;
      case 2:
	input.nextLine();
	System.out.println("Introduce un número : ");
	int num = input.nextInt();
	System.out.println("Números Divisibles entre " + num + " : ");
	for(int i = 1; i <= num; i++){
	  if (num % i == 0){
	    System.out.println(i);
	  }
	}
	break;
      case 3: 
	input.nextLine();
	System.out.println("Introduce una cadena de texto : ");
	String text = input.nextLine();
	for (int i = 0; i < text.length(); i++){
	  System.out.print(text.charAt(i) + "*");
	}
	break;
      default:
	System.out.println("Dicho número no es válido.");
    }

  }
}

