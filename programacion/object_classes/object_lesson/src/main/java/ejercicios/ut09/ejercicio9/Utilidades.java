/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ut09.ejercicio9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author s6x
 */
public class Utilidades {
    public static void main(String[] args) {
        System.out.println("Hola Mundo.");
                
    }

   // Método estático que retorna un mapa ordenado con el número de repeticiones de las cadenas
    public static Map<String, Integer> contarRepeticiones(String... cadenas) {
        Map<String, Integer> mapa = new HashMap<>();
        for (String cadena : cadenas) {
            if (mapa.containsKey(cadena)) {
                mapa.put(cadena, mapa.get(cadena) + 1);
            } else {
                mapa.put(cadena, 1);
            }
        }

        // Ordenar el mapa por el valor (número de repeticiones)
        List<Map.Entry<String, Integer>> lista = new ArrayList<>(mapa.entrySet());
        lista.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // Retornar el mapa ordenado
        LinkedHashMap<String, Integer> mapaOrdenado = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entrada : lista) {
            mapaOrdenado.put(entrada.getKey(), entrada.getValue());
        }
        return mapaOrdenado;
    }

    // Método que devuelve un conjunto con las cadenas que tienen asociado un número par en el mapa
    public static Set<String> obtenerCadenasConNumeroPar(Map<String, Integer> mapa) {
        Set<String> cadenasConNumeroPar = new HashSet<>();
        for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
            if (entrada.getValue() % 2 == 0) {
                cadenasConNumeroPar.add(entrada.getKey());
            }
        }
        return cadenasConNumeroPar;
    }

    // Método que devuelve una lista con la moda de una serie de números
    public static List<Integer> obtenerModa(int... numeros) {
        Map<Integer, Integer> mapa = new HashMap<>();
        for (int numero : numeros) {
            if (mapa.containsKey(numero)) {
                mapa.put(numero, mapa.get(numero) + 1);
            } else {
                mapa.put(numero, 1);
            }
        }

        // Encontrar el valor máximo de repeticiones
        int maxRepeticiones = 0;
        for (int repeticiones : mapa.values()) {
            if (repeticiones > maxRepeticiones) {
                maxRepeticiones = repeticiones;
            }
        }

        // Obtener la moda (o modas) de la serie
        List<Integer> moda = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entrada : mapa.entrySet()) {
            if (entrada.getValue() == maxRepeticiones) {
                moda.add(entrada.getKey());
            }
        }

        return moda;
    }

    
}
