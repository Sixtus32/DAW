
/*16. Desarrolla en Java un programa para jugar a un juego de azar. El programa deberá generar 6 apuestas. Cada apuesta consiste en generar 5 números aleatorios entre 1 y 50, todos distintos entre sí. Estos números serán mostrados en pantalla en una solo línea y separados por comas. Además se deberá generar dos estrellas, que son números aleatorios entre 1 y 12, ambos distintos entre sí pero que pueden coincidir con alguno de los anteriores, y serán mostrados en otra línea separados por comas.

Ejemplo: 

Apuesta 1:

      Números: 1,25,16,21, 45

Estrellas: 9, 3

 Apuesta 2:

      Números: 47,33,12,36, 27

Estrellas: 2, 12
 *
 * */
public class Ejercicio_16{
  public static void main(String [] args){
    generetePush();

  }

  static void generetePush(){
    int star1 = 0, star2 = 0;
    int numberOfPush = 1;
    do{
       System.out.println("\nApuesta " + numberOfPush);

       int oldNumber = 0;

       for (int i = 5; i>0; i--){

       int numberRandom = (int) (Math.random() *  (50 - 1) + 1);
	

	
	if (oldNumber != numberRandom){
  	  System.out.print(numberRandom + ",");
	  oldNumber = numberRandom;
	}
	
      }

      numberOfPush++;
      do{
      star1 = (int) (Math.random() * 12) + 1;
      star2 = (int) (Math.random() * 12) + 1;
    }while (star1 == star2);
    System.out.println("\n"+star1 + ", " + star2);

      }while (numberOfPush <= 6);
  }
}
