package org.example;

import java.util.Arrays;

public class BateriaU3_5 {

    static void main() {

        int matriz[][] = {{0,1,2},{3,4,5},{6,7,8}};

        int matriz2[][] = new int[3][3];

        System.out.println(matriz[1][0]);
        System.out.println(matriz[2][1]);

        for (int fila=0;fila<matriz.length;fila++){
            for (int columna=0;columna<matriz[0].length;columna++){

                System.out.print(matriz[fila][columna]);

            }
            System.out.println();
        }

        for (int fila[] : matriz){
            for (int columna : fila){
                System.out.print(columna);
            }
            System.out.println();
        }

        for (int fila[] : matriz){
            System.out.println(Arrays.toString(fila));
        }
        int vector[] = {1,2,3,4};

        for (int num : vector){
            System.out.println(num);
        }









    }
}
