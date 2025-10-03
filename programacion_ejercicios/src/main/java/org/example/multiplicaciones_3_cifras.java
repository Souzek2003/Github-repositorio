package org.example;

import java.util.Scanner;

public class multiplicaciones_3_cifras {

    static void main(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el multiplicando (3 cifras): ");
        int multiplicando = teclado.nextInt();
        System.out.println("Introduce el multiplicador (3 cifras): ");
        int multiplicador = teclado.nextInt();

        int multiplicandonum = multiplicando; //definimos la variable de tipo numérica con la que vamos a trabajar
        String numC = Integer.toString(multiplicando); //convertimos el número a carácter
        String numC_1 = numC.substring(0,1); //cogemos la primera cifra (desde posión 0 hasta 3)
        int num_1 = Integer.parseInt(numC_1); //convertimos a entero la cifra que hemos cogido, con la que podríamos hacer algún cálculo que necesitemos

        int multiplicadornum = multiplicador; //definimos la variable de tipo numérica con la que vamos a trabajar
        String numB = Integer.toString(multiplicador); //convertimos el número a carácter
        String numB_1 = numB.substring(0,1); //cogemos la primera cifra (desde posión 0 hasta 3)
        int num_2 = Integer.parseInt(numB_1); //convertimos a entero la cifra que hemos cogido, con la que podríamos hacer algún cálculo que necesitemos

        System.out.println("El producto de la multiplicación es: " + (multiplicandonum*multiplicadornum)); //imprimimos el resultado
        System.out.println("El proceso es:");
        System.out.println("  " + multiplicandonum);
        System.out.println("x " + multiplicadornum);
        System.out.println("--------");
        System.out.println("  " + multiplicandonum);
        System.out.println(" " + multiplicandonum + "x");
        System.out.println(multiplicandonum + "xx");
        System.out.println("--------");
        System.out.println(multiplicandonum*multiplicadornum);

        //cambio
    }
}
