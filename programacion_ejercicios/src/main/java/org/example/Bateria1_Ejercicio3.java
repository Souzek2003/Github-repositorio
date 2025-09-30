package org.example;

import java.util.Scanner;

public class Bateria1_Ejercicio3 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        int num;

        try {
            System.out.println("Introduce un número: ");
            num = teclado.nextInt();

        if (num > 0) {
            System.out.println("El número " + num + " es positivo");
        }

        if (num == 0) {
            System.out.println("El número " + num + " es natural");

        }

        if (num < 0) {
            System.out.println("El número " + num + " es negativo");
        }

        } catch (Exception e) {
            System.out.println("Debe ser formato numérico");
        }




    }
}

