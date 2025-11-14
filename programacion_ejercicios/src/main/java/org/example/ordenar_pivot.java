package org.example;

import java.util.Arrays;
import java.util.Collections;

public class ordenar_pivot {

    static void main() {

        int vector[] = {4,3,2,5,0};

        int vector2[] = vector.clone();

        Arrays.sort(vector2);

        System.out.println(Arrays.toString(vector2));

//        Arrays.sort(vector2, Collections.reverseOrder()); // Integer para que funcione este

        System.out.println(Arrays.toString(vector2));

        int posicion = Arrays.binarySearch(vector2,5);

        System.out.println(posicion);


    }
}
