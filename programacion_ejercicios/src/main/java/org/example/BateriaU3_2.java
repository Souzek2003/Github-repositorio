package org.example;

import java.util.Scanner;

public class BateriaU3_2 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce altura: ");
        int altura = teclado.nextInt();

        for (int i=0;i<altura;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }

            System.out.println("*");
        }






    }
}
