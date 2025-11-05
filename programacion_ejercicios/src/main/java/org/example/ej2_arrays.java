package org.example;

import java.util.Arrays;

public class ej2_arrays {

    static void main() {

        int vector[] = {1,4,6,3,9,4};
        int aux = 0;

        for (int i=0;i< vector.length/2;i++){

            aux = vector[i];
            vector[i]=vector[vector.length-1-i];
            vector[vector.length-1-i]=aux;
        }

        System.out.println(Arrays.toString(vector));
    }
}
