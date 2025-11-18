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

        int aciertos=0;


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
            numeros[i] = aleatorio.nextInt(49)+1;
        }

        boolean comprobar = true;

        while (comprobar){
            comprobar = false;
            Arrays.sort(numeros);
            for (int i=0;i<numeros.length;i++){
                if (i!= numeros.length-1 && numeros[i]==numeros[i+1]){
                    numeros[i] = aleatorio.nextInt(49)+1;
                    comprobar = true;
                }
            }
        }

        System.out.println(Arrays.toString(numusr));

        System.out.println("Ha salido:");
        System.out.println(Arrays.toString(numeros));

        int numusrint[] = new int[numusr.length];
        for (int i=0;i<numusr.length;i++){
            numusrint[i] = Integer.parseInt(numusr[i]);
        }

        for (int i=0;i<numeros.length;i++){
            for (int j=0;j<numusrint.length;j++)
            if (numeros[i]==numusrint[j])
                aciertos++;
            }


        int numeros2[] = new int[1];

        for (int i=0;i<numeros2.length;i++){
            numeros2[i] = aleatorio.nextInt(49)+1;
        }

        System.out.println("");
        System.out.println("RESULTADOS");
        System.out.println(aciertos + " aciertos");


        int reintegro[] = new int[1];
        reintegro[0] = aleatorio.nextInt(10);

        if (aciertos == 6) {
            System.out.println("1ª Categoría: Has acertado 6 números.");
        } else if (aciertos == 5) {
            System.out.println("2ª Categoría: Has acertado 5 números.");
        } else if (aciertos == 5) {
            System.out.println("3ª Categoría: Has acertado 5 números.");
        } else if (aciertos == 4) {
            System.out.println("4ª Categoría: Has acertado 4 números.");
        } else if (aciertos == 3) {
            System.out.println("5ª Categoría: Has acertado 3 números.");
        } else {
            System.out.println("No premiado.");
        }








    }
}
