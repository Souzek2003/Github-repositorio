package org.example;

import java.util.Arrays;

public class ej5_arrays {

    static void main() {

        int aux = 0;

        int vector[] = {1,3,5,7,9};

        System.out.println("Array original: " + Arrays.toString(vector));

        aux=vector[vector.length-1];

        for (int i=vector.length-1;i>=1;i--){
            if (i == vector.length-1){
                aux=vector[i];
                vector[i]=vector[i-1];
            }else{
                vector[i]=vector[i-1];
            }
        }

        vector[0]=aux;

        System.out.println("Array rotado: " + Arrays.toString(vector));
    }
}
