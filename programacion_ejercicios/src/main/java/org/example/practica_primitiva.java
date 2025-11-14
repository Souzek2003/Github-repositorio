package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class practica_primitiva {

    static void main() {

        //.matches("\\d{2}/\\d{2,4}/\\d{1}/\\d{1,3}");
        //sacar 6 numeros del 1 al 49
        //Reintegro (0-9)
        //complementario (1-49)
        //N-N-N-N-N-N/R   \\d{1,2}

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();


        System.out.println("Introduce los datos de tu boleto: ");
        String datos = teclado.next();

        boolean formato = datos.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1,2}");

        if (formato == false) {
            System.out.println("Formato incorrecto. (1-2-49-6-8-9/7).");
            return;
        }

        String numusr[] = datos.split("[-/]");

        int numeros[] = new int[6];

        for (int i=0;i<numeros.length;i++){
            numeros[i] = aleatorio.nextInt(44)+6;
        }

        boolean comprobar = true;

        while (comprobar){
            comprobar = false;
            Arrays.sort(numeros);
            for (int i=0;i<numeros.length;i++){
                if (i!= numeros.length-1 && numeros[i]==numeros[i+1]){
                    numeros[i] = aleatorio.nextInt(44)+6;
                    comprobar = true;
                }
            }
        }

        System.out.println(Arrays.toString(numusr));

        System.out.println("Ha salido:");
        System.out.println(Arrays.toString(numeros));







    }
}

