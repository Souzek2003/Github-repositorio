package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class vectoriales {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        int vector[] = {1,3,4,6,10};
        System.out.println(Arrays.toString(vector));
        System.out.println(vector.length);

        System.out.println("");

        int vector2[] = new int [8];
        System.out.println(Arrays.toString(vector2));
        System.out.println(vector2.length);

        System.out.println("");

        for (int i=0;i<vector.length;i++) {
            System.out.println(vector[i]);
        }

        System.out.println("");

        vector=vector2;
        vector[2]=0;
        vector=vector2.clone();
        System.out.println(Arrays.toString(vector));
        System.out.println(vector.length);

    }
}
