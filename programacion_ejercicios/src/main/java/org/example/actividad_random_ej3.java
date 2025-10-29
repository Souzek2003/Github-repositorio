package org.example;

import java.util.Random;
import java.util.Scanner;

public class actividad_random_ej3 {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Introduce rango mínimo: ");
        int min = teclado.nextInt();
        System.out.println("Introduce rango máximo: ");
        int max = teclado.nextInt();
        if (min > max){
            System.out.println("El número mínimo debe ser menor que el máximo.");
        }else{
            System.out.println("¿Cuántos números aleatorios quieres? ");
            int numaleatorio = teclado.nextInt();
            for (int i=0;i<numaleatorio;i++) {
                int num = aleatorio.nextInt(max - min + 1) + min;
                System.out.println(num);
            }
        }

    }
}
