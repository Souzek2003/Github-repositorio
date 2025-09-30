package org.example;

import java.util.Scanner;

public class Bateria1_Ejercicio4 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        try {
            System.out.println("Introduce número 1: ");
            num1 = teclado.nextInt();
            System.out.println("Introduce número 2: ");
            num2 = teclado.nextInt();
            System.out.println("Introduce número 3: ");
            num3 = teclado.nextInt();

        } catch (Exception e) {
            System.out.println("Debe ser formato numérico");
        }

        if (num1 == num2 || num2 == num3 || num1 == num3) {
            System.out.println("ERROR: hay números introducidos que son iguales");
        }else{
            System.out.println("Todos los números son distintos");
        }

    }
}

