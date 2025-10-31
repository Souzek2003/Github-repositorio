package org.example;

import java.util.Scanner;

public class bateriaex_4 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce nota 0-10 (redondeada): ");
        double nota = teclado.nextDouble();

        int notaredondeada = (int) Math.round(nota);

        switch (notaredondeada){
            case 0,1,2,3,4:
                System.out.println("INSUFICIENTE");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7,8:
                System.out.println("Notable");
                break;
            case 9,10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("No válido");
                break;
        }
    }
}
