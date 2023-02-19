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
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //meto el metodo Scanner y defino el array, y las variables de numero y posicion
        Scanner sc = new Scanner(System.in);
        int array[] = {11, 20, 3, 15, 9, 4, 12, 1, 7, 13, 5, 14, 19, 2};
        int num, posi;
        //Aqui pido el numero y la posicion
        System.out.println("Inserte un numero a poner en el array");
        num = sc.nextInt();
        System.out.println("Ahora inserte en que posicion");
        posi = sc.nextInt();
        //muestro el array original
        System.out.println("Original:");
        mostrar(array);
        //Si el numero no a podido ser insertado se dara un mensaje de error, si no se procedera con lo demas
        if (insertaElemento(array, num, posi)) {
            System.out.println("Con el numero insertado");
            mostrar(array);
            Arrays.sort(array);
            System.out.println("Ordenada:");
            mostrar(array);
        } else {
            System.out.println("¡Error al meter el numero!");
        }
    }

    public static boolean insertaElemento(int array[], int num, int posi) {
        //a esta array llega el numero y la posicion, se almacena en un aux el numero de la posicion
        boolean insertado = false;
        //se rellena la posicion siguiente con aux y se guarda el numero que estaba en esta
 ///ERROR:la última posición es la longitud del array menos 1
        if (posi >= 0 && posi <= array.length) {
            int aux = array[posi], aux2;//No es necesario, 1º desplazo y luego inserto en posicion
            for (int i = posi + 1; i < array.length; i++) {
                aux2 = array[i];
                array[i] = aux;
                aux = aux2;
            }
            array[posi] = num;
            insertado = true;
        }
        return insertado;
    }

    public static void mostrar(int array[]) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
        System.out.println("");
    }
}
