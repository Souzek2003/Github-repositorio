package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ej3_arrays {

    static void main() {

        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        int vector[] = new int[25];

        for (int i=0;i< vector.length;i++){
            vector[i] = aleatorio.nextInt(101);
        }

        System.out.println(Arrays.toString(vector));

        System.out.println("Ingresa un número para buscar [0,100]: ");
        int num = teclado.nextInt();

        int contador = 0;
        for (int i=0;i<vector.length;i++){
            if (vector[i]==num){
                contador++;
            }
        }

        System.out.println("El número " + num + " aparece " + contador + " veces");
    }
}
