/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author najma
 */
public class EstructuraCondicional {
        public static void main(String[] args) {
            /*
            Tema: Estructura condicional
            Tipo:
            1- Simple
            Sintaxis
            * prueba lógica: Expresión          +       Operador relacional     +       Expresión
                puede ser una -IDvariable               -Mayor que >
                              -Valor constante          -Menor que <
                              -Función                  -Mayor igual >=
                              -Formúla                  -Menor igual <=
                                                        -igual == -String: equals()
                                                        -Distinto !=
           * Conectivos lógicos: Y - And - &&
                                 O - Or - ||
            if (prueba lógica)
            (
                bloque código - True
            )
            
            2- Doble 
            Sintaxis 
            if (prueba lógica)
            (
                bloque código - True 
            )else(
                bloque código - False
            )
            
            3- Anidada
            Sintaxis 
            if (prueba lógica)
            (
                bloque código - True
                if - Simple o Doble 
            )else if(prueba lógica) (
                bloque código - True
            )else(
                bloque código - True
            )
 
            */
            
            // Ex. Factura
            
            Scanner lea=new Scanner(System.in);
            lea.useDelimeter("\n");
            
            System.out.println("****Facturación - CP****");
            System.out.println("Cliente: ");
            String nombreCliente=lea.next();
            System.out.println("Nombre del producto: ");
            String nombre_Producto=lea.next();
            System.out.println("Cantidad del producto: ");
            int cantidad=lea.nextInt();
            System.out.println("Precio: L.");
            double precio=lea.nextDouble();
            
            double Pago_total=(cantidad*precio);
            System.out.println("El total a pagar es: L.");
           
        }
}
