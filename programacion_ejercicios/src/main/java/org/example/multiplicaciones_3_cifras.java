package org.example;

import java.util.Scanner;

public class multiplicaciones_3_cifras {

    static void main(){

        Scanner teclado = new Scanner(System.in);

        int multiplicando = 0;
        int multiplicador = 0;

        //Pide los datos al usuario y el programa los lee por teclado
        do {
            try {
                System.out.println("Introduce el multiplicando (3 cifras): ");
                multiplicando = teclado.nextInt();

                if (multiplicando < 100 || multiplicando > 999){
                    System.out.println("Error: Debes introducir un número de 3 cifras (< 100) (> 999).");
                }
            } catch (Exception e) {
                System.out.println("Formato incorrecto");
                System.exit(0);
            }

        }while (multiplicando < 100 || multiplicando > 999);

        do {
            try {
                System.out.println("Introduce el multiplicador (3 cifras): ");
                multiplicador = teclado.nextInt();

                if (multiplicador < 100 || multiplicador > 999) {
                    System.out.println("Error: Debes introducir un número de 3 cifras (< 100) (> 999).");
                }
            } catch (Exception e) {
                System.out.println("Formato incorrecto");
                System.exit(0);
            }

            }while (multiplicador < 100 || multiplicador > 999);

        //Convierte el multiplicador a String
        String multC = Integer.toString(multiplicador);

        //Coge las cifras (del 0 al 1, del 1 al 2 y del 2 al 3)
        String multC_1 = multC.substring(0, 1);
        String multC_2 = multC.substring(1, 2);
        String multC_3 = multC.substring(2, 3);

        //Convierte las cifras a número entero
        int num1 = Integer.parseInt(multC_1);
        int num2 = Integer.parseInt(multC_2);
        int num3 = Integer.parseInt(multC_3);

        //Muestra por pantalla, multiplicando, multiplicador, parciales y resultado final
        System.out.println("El producto de la multiplicación es: " + (multiplicando*multiplicador));
        System.out.println("El proceso es:");
        System.out.println("  " + multiplicando);
        System.out.println("x " + multiplicador);
        System.out.println("--------");
        System.out.println("  " + (multiplicando*num3));
        System.out.println(" " + (multiplicando*num2) + "x");
        System.out.println((multiplicando*num1) + "xx");
        System.out.println("--------");
        System.out.println(" " + (multiplicando*multiplicador));
    }
}
