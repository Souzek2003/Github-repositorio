package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2_Matrices {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        int matriz[][] = new int[3][3];

        System.out.println("Introduce número: ");

        for (int i=0;i< matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                matriz[i][j] = teclado.nextInt();
            }
        }

        for (int fila[] : matriz){
            System.out.println(Arrays.toString(fila));
        }

        System.out.println("Introduce número a buscar: ");
        int numero = teclado.nextInt();

        externo:
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz.length;j++){

                if (matriz[i][j]==numero){
                    System.out.println("El número " + numero + " está en la posición (" + i + "," + j + ").");
                    break externo;
                }
            }
        }



    }
}
