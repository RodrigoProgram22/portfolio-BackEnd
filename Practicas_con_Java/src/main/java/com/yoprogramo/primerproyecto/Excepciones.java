package com.yoprogramo.primerproyecto;
import java.util.Scanner;
public class Excepciones {
     public static void main(String[] args) {
         //Excepciones Ejercicios Practicos
         //Ejercicio 1
         try {
             int edades[]={1,4,23,22};
             System.out.println("Mostrando las edades " + edades[3]);
         } catch (Exception e) {
             System.out.println("¡Provocaste un error por desbordamiento!");
         }
         //Ejercicio 2
         Scanner teclado = new Scanner(System.in);
         try {
             System.out.println("Ingresa un numero");
             int num1 = teclado.nextInt();
             System.out.println("Ingresa un numero");
             int num2 = teclado.nextInt();
             int resultado = num1 / num2;
             System.out.println("El resultado fue: " + resultado);
         } catch (Exception e) {
             System.out.println("Error para dividir, el segundo numero es un : 0"); 
         }
        //Ejercicio 3
         System.out.println("Ingrese su edad");
         int edad = teclado.nextInt();
         final int edad_min = 1;
         final int edad_max = 100;
         
         try {
              if(edad > edad_min && (edad < edad_max)){
             System.out.println("Bienvenido");
         }else{
             throw new EdadExcepcion("Edad no permitida pa");
         }
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }
        
         
     }
}
