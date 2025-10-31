package org.example;

import java.util.Scanner;

public class bateriaex_3 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        int meses = 10;
        int suma = 0;

        System.out.println("¿Cuántos meses financiaste? ");
        int finan = teclado.nextInt();

        System.out.println("Financiación a " + finan + " meses");
        for (int i=1;i<=finan;i++){
            System.out.println("Mes " + i + " " + meses + "€");
            suma = (meses+suma);
            meses = (meses * 2);
        }
        System.out.println("Total a pagar: " + suma + "€");
    }
}
