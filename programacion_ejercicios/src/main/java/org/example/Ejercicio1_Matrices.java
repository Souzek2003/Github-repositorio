package org.example;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1_Matrices {

    static void main() {

        Random aleatorio = new Random();

        int filas = aleatorio.nextInt(6)+2;

        int matriz[][] = new int[filas][filas];

        for (int i=0;i< matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                matriz[i][j] = aleatorio.nextInt(50)+1;
            }
        }

        for (int fila[] : matriz){
            System.out.println(Arrays.toString(fila));
        }


        //diagonal
        for (int i=0;i< matriz.length;i++){
            for (int j =0;j<matriz[i].length;j++){

                if (i==j){
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }


        //diagonal en 1 bucle
        System.out.println();

        for (int i=0;i< matriz.length;i++){

            System.out.print(matriz[i][i] + " ");
        }

        System.out.println();

        //diagonal invertido
        for (int i=0;i< matriz.length;i++){
                    System.out.print(matriz[i][matriz.length-1-i] + " ");
        }

        System.out.println();

        int a[][] = {{1,2,3,4},{5,4,6,7},{6,9,10,12}};
        int b[][] = {{12,21,2,1},{50,1,2,3},{19,0,2,4}};
        int m[][] = new int[3][4];

        for (int i=0;i< a.length;i++){
            for (int j=0;j< a[i].length;j++){
                if (a[i][j]>b[i][j]) {
                    m[i][j] = a[i][j];
                }else{
                    m[i][j] = b[i][j];

                }
            }
        }

        for (int fila[] : m){
            System.out.println(Arrays.toString(fila));
        }













    }
}
