package org.example;

import java.util.Scanner;

public class bateriaex_1 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        int mayoresQueCero = 0;
        int menoresQueCero = 0;
        int igualesACero = 0;

        System.out.println("Cantidad de números a ingresar: ");
        int cantidad = teclado.nextInt();

        for (int i=0;i<cantidad;i++){
            System.out.println("Introduce número: ");
            int num = teclado.nextInt();

        if (num > 0) {
            mayoresQueCero++;
        } else if (num < 0) {
            menoresQueCero++;
        } else {
            igualesACero++;
        }
        }

        System.out.println("Cantidad de números mayores a 0: " + mayoresQueCero);
        System.out.println("Cantidad de números menores a 0: " + menoresQueCero);
        System.out.println("Cantidad de números iguales a 0: " + igualesACero);
    }
}
