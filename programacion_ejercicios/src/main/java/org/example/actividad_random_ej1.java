package org.example;

import java.util.Random;

public class actividad_random_ej1 {

    static void main() {

        Random aleatorio = new Random();

        int dado1 = aleatorio.nextInt(6)+1;
        System.out.println("El resultado del primer dado es: " + dado1);
        int dado2 = aleatorio.nextInt(6)+1;
        System.out.println("El resultado del segundo dado es: " + dado2);
        System.out.println("La suma de los dados es: " + (dado1+dado2));
    }
}
