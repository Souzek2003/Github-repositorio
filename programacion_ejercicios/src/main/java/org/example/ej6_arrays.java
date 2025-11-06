package org.example;

import java.util.Arrays;

public class ej6_arrays {

    static void main() {

        int vector[] = {1,2,3,2,1};

        System.out.println(Arrays.toString(vector));

        int ultima_posicion=vector.length-1;
        boolean es_o_no = true;

        for (int i=0;i< vector.length/2;i++){
            if (vector[i]!=vector[ultima_posicion-i]){
                System.out.println("No es palíndromo.");
                es_o_no=false;
                break;
            }
        }

        if (es_o_no){
            System.out.println("Es palíndromo.");
        }
    }
}
