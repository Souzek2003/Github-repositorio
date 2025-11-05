package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class vectoriales2 {

    static void main() {

        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        int vector[] = new int[8];
        System.out.println(Arrays.toString(vector));

        vector[4] = 10;
        vector[6] = 14;
        System.out.println(Arrays.toString(vector));

        for (int i=0;i< vector.length;i++){
            System.out.println("Número " + i + ": " + vector[i]);
        }

        int vector2[] = new int[8];

        vector2=vector.clone();
        System.out.println(Arrays.toString(vector2));

        for (int i=0;i<vector2.length;i++){
            vector2[i]= aleatorio.nextInt(501);
            System.out.println(Arrays.toString(vector2));
        }

        int vector3[] = new int [4];

        for (int i=0;i< vector3.length;i++){
            vector3[i] = teclado.nextInt();
        }
        System.out.println(Arrays.toString(vector3));
        }
    }

