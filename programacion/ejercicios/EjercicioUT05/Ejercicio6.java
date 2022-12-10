/*
 * Ejercicio 6.
 * Programa que carga el nombre y los dos apellidos de 100 personas y realiza una clasificación completa (si los nombres son iguales se ordenan por el primer apellido, y si también son iguales
entonces por el segundo).
 * */
public class Ejercicio6{
  public static void main(String [] args){

    String [][][] arr = nomAplPersonas();
    
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[i].length; j++){
	for(int z = 0; k < arr[i][j].length; k++){
	  System.out.println(arr[i][j][z]);
	}
      }
    }
  }

  public static String [][][] nomAplPersonas (){
    String [][][] arr = {{"Antonio","Diego","Enrique"},{"Oregón","Munúz","Rivera"},{"Casas","Nueva","Garcia"}};
    return arr;

  }
}

/*
 *
 * */

