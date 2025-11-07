package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class practica_samurais {

    static void main() {

        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        int suma = 0;
        int contador = 1;

        do {
            System.out.println("Equipo " + contador);
            System.out.println("Introduce la potencia de los samurais: ");
            String potencia = teclado.nextLine();

            String potenciasamurais[] = potencia.split(" ");

            int equipo[] = new int[potenciasamurais.length];
            int equipo1[] = new int[potenciasamurais.length];
            int equipo2[] = new int[potenciasamurais.length];

            for (int i=0;i<potenciasamurais.length;i++){
                equipo[i] = Integer.parseInt(potenciasamurais[i]);
                suma = (equipo[i] + suma);
            }

            if (suma !=30){
                System.out.println("ERROR. La potencia total no suma 30.");
                suma = 0;
            }else{
                System.out.println("Equipo completado.");
                contador++;
                suma = 0;
            }

            if (contador == 2){
                equipo1=equipo.clone();
                System.out.println(Arrays.toString(equipo1));
            }else{
                if (contador == 3){
                    equipo2=equipo.clone();
                    System.out.println(Arrays.toString(equipo2));
                }
            }
        }while (contador != 3);

        System.out.println("¡Empieza la batalla!");
        System.out.println("La batalla inicia con el Samurai");

    }
}
