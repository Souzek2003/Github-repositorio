package org.example;

import java.util.Scanner;

public class Bateria1_Ejercicio3 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int num = teclado.nextInt();

        if (num > 0) {
            System.out.println("El número " + num + " es positivo");
        }

        if (num == 0) {
            System.out.println("El número " + num + " es natural");

        }

        if (num < 0) {
            System.out.println("El número " + num + " es negativo");
        }




    }
}

