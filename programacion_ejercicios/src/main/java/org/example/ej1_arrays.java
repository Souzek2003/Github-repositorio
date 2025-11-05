package org.example;

import java.util.Random;

public class ej1_arrays {

    static void main() {

        Random aleatorio = new Random();

        int vector[] = new int[8];

        vector[4] = 10;
        vector[6] = 14;

        int contador = 0;
        for (int i=0;i<vector.length;i++){
            contador += vector[i];
        }

        System.out.println(contador);
    }
}
