package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ej4_arrays {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        int vector[] = {1,3,5,7,9};

        System.out.println("Array original: " + Arrays.toString(vector));
        System.out.println("Ingresa el índice a eliminar: ");
        int num = teclado.nextInt();

        int vector2[] = new int[vector.length-1];

        for (int i=0;i<vector2.length;i++){
            if (i>=num){
                vector2[i]=vector[i+1];
            }else{
                vector2[i]=vector[i];
            }
        }

        System.out.println("Array resultante: " + Arrays.toString(vector2));

    }
}
