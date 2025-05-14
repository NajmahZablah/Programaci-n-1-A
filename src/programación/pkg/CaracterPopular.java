package Programación.pkg;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author najma
 */
public class CaracterPopular {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una palabra:");
        String palabra = scanner.nextLine().toLowerCase(); // Convertimos a minúsculas para no distinguir mayúsculas
        scanner.close();

        HashMap<Character, Integer> conteoRepetidas = new HashMap<>();
        boolean[] yaContado = new boolean[palabra.length()];
        int i = 0;

        while (i < palabra.length()) {
            char letraActual = palabra.charAt(i);
            int j = i + 1;
            int contador = 1; // La letra actual ya aparece una vez

            if (!yaContado[i]) {
                while (j < palabra.length()) {
                    if (palabra.charAt(j) == letraActual) {
                        contador++;
                        yaContado[j] = true; // Marcamos la letra repetida para no contarla de nuevo
                    }
                    j++;
                }
                if (contador > 1) {
                    conteoRepetidas.put(letraActual, contador);
                }
            }
            i++;
        }

        // Mostrar los resultados
        if (conteoRepetidas.isEmpty()) {
            System.out.println("No hay letras repetidas en la palabra.");
        } else {
            System.out.println("Letras repetidas:");
            for (char letra : conteoRepetidas.keySet()) {
                System.out.println("'" + letra + "': " + conteoRepetidas.get(letra) + " veces");
            }
        }
    }
}

