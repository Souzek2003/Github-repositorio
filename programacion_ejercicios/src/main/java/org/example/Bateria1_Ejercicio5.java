package org.example;

import java.util.Scanner;

public class Bateria1_Ejercicio5 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        boolean control = true;
        int numerador = 0;
        int denominador = 0;

        do {
            try {
                System.out.println("Introduce el numerador: ");
                numerador = teclado.nextInt();
                System.out.println("Introduce el denominador: ");
                denominador = teclado.nextInt();
                control = false;
            } catch (Exception e) {
                System.out.println("El formato no es correcto");
                control = true;
            }
            teclado.nextLine();
        } while (control);
        if (denominador != 0) {
            System.out.println("El resultado es " + (numerador/denominador));
        }

    }
}

