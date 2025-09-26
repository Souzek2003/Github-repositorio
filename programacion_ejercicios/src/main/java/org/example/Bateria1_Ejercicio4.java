package org.example;

import java.util.Scanner;

public class Bateria1_Ejercicio4 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce número 1: ");
        int num1 = teclado.nextInt();
        System.out.println("Introduce número 2: ");
        int num2 = teclado.nextInt();
        System.out.println("Introduce número 3: ");
        int num3 = teclado.nextInt();

        if (num1 == num2 || num2 == num3 || num1 == num3) {
            System.out.println("ERROR: hay números introducidos que son iguales");
        }else{
            System.out.println("Todos los números son distintos");
        }

    }
}

