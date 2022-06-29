
package com.yoprogramo.primerproyecto;

// import java.util.Scanner;

public class main {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        // Matrices y Vectores
    
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
    }
    
}
