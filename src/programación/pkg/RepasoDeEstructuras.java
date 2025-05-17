/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programación.pkg;

import java.util.Scanner;
/**
 *
 * @author najma
 */
public class RepasoDeEstructuras {
    public static void main(String[] args) {
    /*
    === Repaso de las Estructuras Control ===
    Puntos que debo tener mas cuidado:
    -Ciclos (for, while, do... while)
    -uso de charAt
    -uso equalsIgnoreCase (metodo)
    */
    

    String res = " ";
    Scanner lea = new Scanner(System.in);
        while(!res.equalsIgnoreCase("no")){
        System.out.println("Desea otra vez repetir? si/no: ");
        res = lea.next();
        System.out.println("\n=== Menu ====");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Vocal");
            System.out.println("4. Salir");
            System.out.print("Seleccionar una opcion: ");
            int opcion = lea.nextInt();
            switch(opcion) {
                case 1:
                    System.out.println("\n=== Suma ===");
                    System.out.print("Numero 1: ");
                    double num1 = lea.nextDouble();
                    System.out.print("Numero 2: ");
                    double num2 = lea.nextDouble();
                    System.out.println("Resultado: "+(num1+num2));
                    break; //Rompe la estructura
                case 2:
                    System.out.println("\n=== Resta ===");
                    System.out.print("Numero 1: ");
                    double num3 = lea.nextDouble();
                    System.out.print("Numero 2: ");
                    double num4 = lea.nextDouble();
                    System.out.println("Resultado: "+(num3-num4));
                    break; 
                /*case 3:
                    int cantidadVocales = 0;
                    System.out.println("\n=== Vocal ===");
                    System.out.println("Ingresar una palabra: ");
                    String palabra = lea.next().toLowerCase();
                    System.out.println("Cantidad de letras: "+palabra.length());
                    
                    /*
                    Indice 
                    0123
                    Ejemplo: Hola
                    length: conteo de palabra
                    
                    
                    for (int indice = 0; indice <= palabra.length(); indice++) {
                        char letra = palabra.charAt(indice);
                        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                        cantidadVocales++;
                    System.out.println("Cantidad de vocales: "+cantidadVocales);
                    break;
                        }
                    }
                    */
                   
                case 3:  
                    int cantidadVocales = 0;
                    System.out.println("\n=== Contar Vocales ===");
                    System.out.print("Ingresar una palabra: ");
                    String palabra = lea.next().toLowerCase();
                    System.out.println("Cantidad de letras: "+palabra.length());
                    for ( int indice = 0; indice < palabra.length(); indice++) {
                        char letra = palabra.charAt(indice);
                        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                        cantidadVocales++;  
                        }
                    }
                    System.out.println("Cantdad de vocales: "+cantidadVocales);
            }
            
    }
}
}
