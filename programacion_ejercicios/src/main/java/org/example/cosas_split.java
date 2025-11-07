package org.example;

import java.util.Arrays;

public class cosas_split {

    static void main() {

        String cadena = "1,3,6,9,12,16,18"; //Se pueden poner palabras. Lo cambié a números por el parseint.

        String profesores[] = cadena.split(",");

        System.out.println(Arrays.toString(profesores));

        int vector[] = new int[profesores.length];

        for (int i=0;i<profesores.length;i++){
            vector[i] = Integer.parseInt(profesores[i]);
        }



    }
}
