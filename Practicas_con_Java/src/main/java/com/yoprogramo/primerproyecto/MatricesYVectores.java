
package com.yoprogramo.primerproyecto;
//import java.util.Arrays;
//import java.util.Comparator;


public class MatricesYVectores {
    public static void main(String[] args) {
        //Practicas con Vectores y Matrices
        
        //Ejecicio 1
        /*
        int vector[] = new int [10];
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingresaste un numero para la posición : " + i);
            int tecla = teclado.nextInt();
            vector[i] = tecla;
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Numero : "+ vector[i]);
        } */
        //Ejecicio 2
        /*
        int edad[] = new int [15];
        for (int i = 0,j=15; i < edad.length; i++,j++) {
            edad[i]=j;
        }
        int menorE = 0;
        int mayorE = 0;
        for (int i = 0; i < edad.length; i++) {
            if (i==0){
                menorE = edad[i];
            }else if (menorE < edad[i]){
                menorE = edad[i];
            }
            if (i==0){
                mayorE = edad[i];
            }else if (mayorE > edad[i]){
                mayorE = edad[i];
            }
        } 
        System.out.println("El de mayor edad tiene: " + mayorE);
        System.out.println("El de menor edad tiene: " + menorE);
        */
        //Ejercicio 3
        /*
        int dni[] = new int [3];
        String nombre[] = new String [3];
        String apellido[] = new String [3];
        
        dni[0] = 4322131;
        nombre[0] = "Rodrigo";
        apellido[0] = "Romano";
        
        dni[1] = 4113651;
        nombre[1] = "Maria";
        apellido[1] = "Lopez";
        
        dni[2] = 4113652;
        nombre[2] = "Juan";
        apellido[2] = "Ramirez";
        
        for (int i = 0; i < dni.length; i++) {
            System.out.println("Nombre : " + nombre[i]);
            System.out.println("Apellido : " + apellido[i]);
            System.out.println("Dni:" + dni[i]);
            System.out.println("\n");
        } */
        //Ejercicio 4
        /*
        Integer[] temp = new Integer[23];      
        for (int i = 0; i < temp.length; i++) {
            temp[i]= (int) (Math.random()*50+1);
        }
        Integer[] tempMax = Arrays.stream(temp)
                .sorted(Comparator.reverseOrder())
                .limit(5)
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(temp));
        System.out.println("\n");
        System.out.println(Arrays.toString(tempMax));
        */
        //Ejercicio 5
        /*
        String animales[] = new String[10];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0,j=1; i < animales.length; i++,j++) {
            System.out.println("Ingresa un animal para la posición : " + j);
            String tecla = teclado.next();
            animales[i] = tecla;
        }
        String animalesInvers[] = new String[10];
        for (int i = 0,j=9; i < animales.length; i++,j--) {
            animalesInvers[j] = animales[i];
        }
        System.out.println("\n");
        for (String animal : animales) {
            System.out.println(animal);
        }
        System.out.println("\n");
        for (String animal : animalesInvers) {
            System.out.println(animal);
        }
        */
        //MATRICES - Ejercicio 1
        /*
        int totalGoles[][] = new int [5][3]; 
        double promedio[] = new double[5];
        Scanner teclado = new Scanner(System.in);
        
        for (int f = 0; f < 5; f++) {
            for (int c = 0; c < 3; c++) {
            System.out.println("Ingrese un valor para la fila "
                    + f + " columna: "+c);
            int tecla = teclado.nextInt();
            totalGoles[f][c] = tecla; 
            }
        }
       
        System.out.println("\n");
        promedio[0] = (totalGoles[0][0] + totalGoles[0][1] + totalGoles[0][2])
                / 3;
        promedio[1] = (totalGoles[1][0] + totalGoles[1][1] + totalGoles[1][2])
                / 3;
        promedio[2] = (totalGoles[2][0] + totalGoles[2][1] + totalGoles[2][2])
                / 3;
        promedio[3] = (totalGoles[3][0] + totalGoles[3][1] + totalGoles[3][2])
                / 3;
        promedio[4] = (totalGoles[4][0] + totalGoles[4][1] + totalGoles[4][2])
                / 3;
        
        for (int i = 0,j = 1; i < promedio.length; i++,j++) {
        System.out.println("\n");
            System.out.println("Jugador : "+j);
        System.out.println("El promedio es: " + promedio[i]);                    
        }
        */
        //MATRICES - Ejercicio 2
        /*
        double notas[][] = new double[10][4]; 
        Scanner teclado = new Scanner(System.in);
        double suma = 0.0 ;
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 3; c++) {
            System.out.println("Ingrese un valor para la fila "
                    + f + " columna: " + c);
            double tecla = teclado.nextDouble();
            notas[f][c] = tecla; 
            suma = suma + notas[f][c];
            }
            notas[f][3] = suma / 3;
            suma = 0.0;
        }
        for (int f = 0; f < 10; f++) {
            System.out.println("Las notas del alumno n° "+((f)+(1))+" son;");
            for (int c = 0; c < 3; c++) {
                System.out.println("Notas N°"+ c +" "+ notas[f][c]);
            }
            System.out.println("El promedio del alumno es: " + notas[f][3]);
        }
        */
        //MATRICES - Ejercicio 3
      
        int matriz[][] = new int[4][4];
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                if(f==c){
                    matriz[f][c] = 0;
                }else{
                    matriz[f][c] = 1;
                }
            }
        }
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.println("Fila: "+f+". Columna: "+c);
                System.out.println("Casilla con un : " + matriz[f][c]);
            }
        }
        
        //MATRICES - Ejercicio 4
        /*
        String menu[][] = new String[4][3];
        Scanner teclado = new Scanner(System.in);
        
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {
            if (c == 0){
                System.out.println("Ingrese el nombre para el plato n° "+((f)+1));
            }else{
                System.out.println("Ingrese un acompañante para el plato n° "+ ((f)+1));
            }
            String tecla = teclado.nextLine();
            if (tecla.equals(".") == true){
                menu[f][c] = "Vacio";
            }else{
                menu[f][c] = tecla.toUpperCase();
            } 
            }
        }
        System.out.println("\n");
        System.out.println("Ingresa un plato.");
        String tecla2 = teclado.nextLine();
        tecla2 = tecla2.toUpperCase();
        for (int f = 0; f < 4; f++) {
        if (tecla2.equals(menu[f][0]) == true){
            System.out.println("Nombre del plato n°"+((f)+1)+": "+ menu[f][0]);
            for (int c = 1; c < 3; c++) {
             System.out.println("Lo puedes acompañar con : "+ menu[f][c]);
            }
            System.out.println("\n");
            }
        }
        */
    }
}