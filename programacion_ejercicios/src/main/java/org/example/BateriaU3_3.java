package org.example;

import java.util.Scanner;

public class BateriaU3_3 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce número máximo...");
        int maximo = teclado.nextInt();

        tabla:
        for (int i=1;i<=9;i++){

            System.out.println("Tabla del " + i);

            for (int j=1;j<=10;j++){

                System.out.println(i + " x " + j + " = " + (i*j));

                if (maximo <= (i*j)){
                    break tabla;
                }

            }
        }













    }
}
