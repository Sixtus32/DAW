/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ANTONIOESPIN;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Aqui meto el Scanner, defino la array de palos, la de las cartas sacadas(que siempre sera igual) y las demas variables
        Scanner sc = new Scanner(System.in);
        String palos[] = {"Copas", "Oros", "Espadas", "Bastos"};
        boolean salir = false;
        int elegido;
        int sacadas[][] = new int[4][4];
        //invoco el metodo que pide las cartas
        elegirCarta(sacadas, palos);
         mostrar(sacadas, palos);
         
        //Aqui el menu, que se cierra cuando el boolean de salir es true
        do {
            System.out.println("1.Palo con mas puntos");
            System.out.println("2.Carta mas alta");
            System.out.println("3.Salir");
            elegido = sc.nextInt();
            //Segun cada caso se hara la funcion que le e asignado
            if (elegido == 1) {
                mostrar(sacadas, palos);
                ganador(sacadas, palos);
            } else if (elegido == 2) {
                mostrar(sacadas, palos);
                masalta(sacadas, palos);
            } else if (elegido == 3) {
                System.out.println("Adiós!!");
                salir = true;
            } else {
                System.out.println("Error, vuelva a intentarlo");
            }
        } while (!salir);

    }

    public static int[][] elegirCarta(int sacadas[][], String palos[]) {
        //en esta funcion hago que se lean 4 numeros, primero se ve si estan repetidos con la funcion repetido
        //o si esta fuera de rango si lo esta te lo vuelve a pedir
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Elija cuatro cartas de cada palo");
        for (int i = 0; i < sacadas.length; i++) {
            System.out.println(palos[i] + ":");
            for (int j = 0, k = 0; j < sacadas[i].length; k++) {
                num = sc.nextInt();
                if (num >= 1 && num <= 12) {
                    if (!repetido(sacadas, num, i)) {
                        sacadas[i][j] = num;
                        j++;
                    } else {
                        System.out.println("Numero repetido, inserte uno nuevo");
                    }
                } else {
                    System.out.println("Numero fuera de rango, intentelo de nuevo");
                }
            }
        }
        return sacadas;
    }

    public static boolean repetido(int sacadas[][], int num, int fila) {
        //Aqui simplemente se ve si el numero que he metido en elegircarta esta repetido en su fila
        boolean repe = false;
        for (int i = 0; i < sacadas.length; i++) {
            if (sacadas[fila][i] == num) {
                repe = true;
            }
        }
        return repe;
    }

    public static void ganador(int sacadas[][], String palos[]) {
        //Aqui e creado variables para ver cual a sido la mayor
        //tambien tengo una array para recopilar las filas en las que el mayor es igual, en el caso de empates
        int mayor = -1, suma;
        int filamayor[] = new int[palos.length];
        Arrays.fill(filamayor, -1);
        for (int i = 0, k = 0; i < sacadas.length; i++) {
            suma = 0;
            for (int j = 0; j < sacadas[i].length; j++) {
                suma += sacadas[i][j];
            }
            //Si la suma es mayor que mayor la array de la fila mayor se queda con un hueco que no sea -1 y la suma mayor se actualiza
            if (suma > mayor) {
                k = 0;
                Arrays.fill(filamayor, -1);
                mayor = suma;
                filamayor[k] = i;
                //Si no el mayor se queda igual pero la array de filas mayores se complementa con otra fila mas
            } else if (suma == mayor) {
                filamayor[k + 1] = i;
                k++;
            }
        }
        //Aqui veo cuantos huecos de la array filamayor no estan rellenos(son los que no tienen -1)
        int cont1 = 0;
        for (int i = 0; i < filamayor.length; i++) {
            if (filamayor[i] == -1) {
                cont1++;
            }
        }
        //Si 3 huecos no estan rellenos quiere decir que solo hay 1 ganador, si no querra decir que habra un empate de 2 o mas palos
        if (cont1 == 3) {
            System.out.println("El palo con mas puntos es: " + palos[0] + " con " + mayor + " puntos");
        } else {
            System.out.print("Ha habido un empate, los palos con mas puntos son: ");
            for (int i = cont1, j = 0; i < filamayor.length; j++, i++) {
                System.out.print(palos[filamayor[j]] + " ");
            }
            System.out.print(" con " + mayor + " puntos cada uno");
        }
        System.out.println("");
    }

    public static void masalta(int sacadas[][], String palos[]) {
        //Esta funcion hace exactamente lo que la anterior pero sin necesitar la variable suma
        //lo que se almacena en mayor es el numero de la carta
        int mayor = -1;
        int filamayor[] = new int[palos.length];
        Arrays.fill(filamayor, -1);
        for (int i = 0, k = 0; i < sacadas.length; i++) {
            for (int j = 0; j < sacadas[i].length; j++) {
                //Si el numero es mayor que mayor la array de la fila mayor actualiza su primer hueco y la suma mayor se actualiza
                if (sacadas[i][j] > mayor) {
                    k = 0;
                    Arrays.fill(filamayor, -1);
                    mayor = sacadas[i][j];
                    filamayor[k] = i;
                    //Si no el mayor se queda igual pero la array de filas mayores se complementa con otra fila mas
                } else if (sacadas[i][j] == mayor) {
                    filamayor[k + 1] = i;
                    k++;
                }
            }

        }
        //Aqui veo cuantos huecos de la array filamayor no estan rellenos(son los que no tienen -1)
        int cont1 = 0;
        for (int i = 0; i < filamayor.length; i++) {
            if (filamayor[i] == -1) {
                cont1++;
            }
        }
        //Si 3 huecos no estan rellenos quiere decir que solo hay 1 ganador, si no querra decir que habra un empate de 2 o mas palos
        if (cont1 == 3) {
            System.out.println("La carta mas alta a sido el " + mayor + " de " + palos[0] + " puntos");
        } else {
            System.out.print("Ha habido un empate, los palos con la carta mas alta han sido: ");
            for (int i = cont1, j = 0; i < filamayor.length; i++, j++) {
                System.out.print(palos[filamayor[j]] + " ");
            }
            System.out.print(" con un " + mayor + " cada uno");
        }
        System.out.println("");
    }

    public static void mostrar(int sacadas[][], String palos[]) {
        //Esto simplemente muestra el array de las cartas sacadas con dos bucles for
        for (int i = 0; i < sacadas.length; i++) {
            System.out.print(palos[i] + "[ ");
            for (int j = 0; j < sacadas[i].length; j++) {
                System.out.print(sacadas[i][j] + " ");
            }
            System.out.println("]");
        }
    }
}
