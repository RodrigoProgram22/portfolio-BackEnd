/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.yoprogramo.primerproyecto;

 //import java.util.Date;


/**
 *
 * @author Romano
 */
public class PrimerProyecto {

    public static void main(String[] args) {
    metodoEscribirSaludo("Rodrigo Romano");
    
    int resultado;
    resultado = minimo(22,80);
        System.out.println(resultado);
    }
    public static void metodoEscribirSaludo(String nombre){
        System.out.println("Saludos "+nombre);
    }
    public static int minimo (int n1 , int n2){
        int min;
        if (n1>n2)
            min = n2;
        else
            min = n1;
        return min;
    }
    
   
    //Bucles For 
    /*
        Date date = new Date();
        String nombre = "Rodrigo";
        System.out.print("Hola Mundo, Soy "+ nombre +"! La fecha es ");
        System.out.print(date.toString());
        
        int x = 20;
        while (x < 30){
            System.out.print("Valor de x es :"+ x);
            x++;
            System.out.println("\n");    
        }
        System.out.println("\n");
        System.out.println("\n");
        for (int i = 0; i <= 10; i++) {
            System.out.print("Valor de i es :"+ i);
            System.out.println("\n");
        }
        System.out.println("\n");
        System.out.println("\n");
        int [] numeros = {10,20,30,40,50};
        for (int x1 : numeros) {
            System.out.print(x1);
            System.out.print(",");
            System.out.println("\n");
        } 
    */
}
