package Programación.pkg;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.text.DecimalFormat;
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
            lea.useDelimiter("\n");
            double descuento=0; double porcentajeDsct=0; boolean clienteTerceraEdad= false;
            
            System.out.println("****Facturación - CP****");
            System.out.println("Cliente: ");
            String nombreCliente=lea.next();
            System.out.println("Edad: ");
            int edad=lea.nextInt();
            System.out.println("Nombre del producto: ");
            String nombre_Producto=lea.next();
            System.out.println("Cantidad del producto: ");
            int cantidad=lea.nextInt();
            System.out.println("Precio: L.");
            double precio=lea.nextDouble();
            
            
            double subtotal=(cantidad*precio);
       
            if (edad>=60) {
                clienteTerceraEdad= true;
                descuento = (subtotal*0.3);
                porcentajeDsct = 30;
            } else {
          
                if (subtotal >= 1000) {
                    descuento = (subtotal*0.15);
                    porcentajeDsct = 15;
                
                } else if (subtotal > 5000 && subtotal <= 10000 ) {
                    if (subtotal > 10000) {
                        descuento=(subtotal*0.35);
                        porcentajeDsct=35;
                    }
                } else {
                    descuento=(subtotal*0.25);
                    porcentajeDsct=25;
                }
            }
            
            DecimalFormat df=new DecimalFormat("#.##");
            double impuesto=(subtotal*0.15);
            double total=((subtotal+impuesto)-descuento);
                    
            System.out.println("****Detalle de Factura****");
            System.out.println("Subtotal: L."+ df.format(subtotal));
            
            if (clienteTerceraEdad) {
            System.out.println("Observación: Cliente es de la tercera edad");
            } else {
            System.out.println("Observación: Cliente NO es de la tercera edad");
            }
            System.out.println("Descuento "+porcentajeDsct+"%: L."+ df.format(descuento));
            System.out.println("Impuesto: L."+ df.format(impuesto));
            System.out.println("Total: L."+ df.format(total));
            
            lea.close();
        }
}
