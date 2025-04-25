/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programación.pkg1.a;

/**
 *
 * @author najma
 */
public class PrimerPrograma {
    public static void main(String[] args){
        /*Salida de Pantalla - print
        System.out.print("Hola");
        System.out.print(" Mundo!");
        
        //Salida de Pantalla - printin
        System.out.println("\nHola");
        System.out.println(" Mundo!");*/
        
        //Tema: Variable
        //Valor Constante
        //Formato:
        //Tipo Datos Identificador = Dato
        String identidad="0502";
        String nombre,completo;
        nombre="Najmah";
        String apellido;
        apellido=" Zablah";
        completo=nombre+apellido;
        int edad=18;
        double salarioBase=1000,salarioNeto;
        salarioNeto=salarioBase+(salarioBase*0.1);
        
        System.out.println("***** Datos Personales");
        System.out.println("DNAI: "+identidad+ " \nNombre: "+completo+" \nEdad: "+edad+
                "\nSalario Neto: $."+salarioNeto);
    }
}
