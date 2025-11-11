package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class practica_samurais {

    static void main() {

        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        //Defino constantes a 0, que luego pisaremos por teclado, y los 2 equipos de samurais los cuales tendrán un total
        //de 7.
        int suma = 0;
        int contador = 1;
        int samurai = 0;
        int equipo1[] = new int[7];
        int equipo2[] = new int[7];
        int bajaseq1 = 0;
        int bajaseq2 = 0;

        //Utilizo un bucle while, por si el usuario no introduce correctamente las potencias de los samurais.
        //(Debe sumar 30 en total). El programa seguirá repitiendo que se introduzcan las potencias hasta que
        //sume 30. El bucle continúa hasta que los dos equipos estén completos.
        do {
            //Le decimos al usuario que introduzca las potencias.
            //En mi caso, he decidido que el formato será con espacios.
            //Cuando el equipo 1 se complete correctamente, pasará al equipo 2.
            //Añadí un contador para que se refleje que es el equipo 2 cuando el 1 haya terminado, sumándose +1.
            System.out.println("Equipo " + contador);
            System.out.println("Introduce la potencia de los samurais: ");
            String potencia = teclado.nextLine();

            //Vector que guardará cada samurai separado con espacios.
            String potenciasamurais[] = potencia.split(" ");

            //Vector equipo que guardará las potencias de los equipos 1 y 2.
            int equipo[] = new int[potenciasamurais.length];

            //Cuando se introduzca la potencia de los samurais, se sumará para ver si el total es 30.
            //Si el total no es 30, dará un mensaje de ERROR, y el usuario deberá introducir nuevamente las potencias.
            for (int i=0;i<potenciasamurais.length;i++){
                equipo[i] = Integer.parseInt(potenciasamurais[i]);
                suma = (equipo[i] + suma);
            }

            //La suma volverá a 0 cuando se deba introducir de nuevo las potencias.
            //En caso de ponerlo, se sumaría con las anteriores potencias y nuestro programa no podría funcionar correctamente.
            if (suma !=30){
                System.out.println("ERROR. La potencia total no suma 30.");
                suma = 0;

            //Si el usuario introduce todas las potencias correctamente, mostrará el mensaje "Equipo completado".
            //Sumo +1 al contador cuando se complete el equipo.
            }else{
                System.out.println("Equipo completado.");
                contador++;
                suma = 0;
            }

            //Solo si el usuario introdujo bien las potencias y el equipo fue completado,
            //guardaremos las potencias en dos vectores diferentes con clone.
            //Vector "equipo1" para el equipo uno, y el segundo vector "equipo2" para el equipo dos.
            //Para saber si el usuario introdujo bien las potencias, utilizo el contador,
            //el cual si llega a 2, clonará las potencias al equipo 1.
            //Si llega a 3, clonará las potencias para el equipo 2.
            if (contador == 2){
                equipo1=equipo.clone();
            }else{
                if (contador == 3){
                    equipo2=equipo.clone();
                }
            }
        }while (contador != 3);

        int batalla = aleatorio.nextInt(7);

        //Ahora empezaremos la parte del enfrentamiento
        System.out.println("¡Empieza la batalla!");
        //Creamos un numero aleatorio del 0 al 6 debido que esas son las posiciones de los samurais
        System.out.println("La batalla empieza con el samurai " + batalla);
        //Bucle para que empiece del numero aleatorio al 7
        for (int i=batalla;i<7;i++){
            //Numero de los samurais
            samurai=0;
            //Para ver que equipo gana
            if (equipo1[i]>equipo2[i]) {
                samurai = 1+i;
                System.out.println("Samurai " + samurai + "." + " Gana Equipo 1. " + equipo1[i] + " vs " + equipo2[i]);
                //Sumamos 1 a las bajas del equipo perdedor
                bajaseq2++;
            }else{
                if (equipo1[i]<equipo2[i]){
                    //Lo mismo pero para el otro equipo
                    samurai = 1+i;
                    System.out.println("Samurai " + samurai + "." + " Gana Equipo 2. " + equipo1[i] + " vs " + equipo2[i]);
                    bajaseq1++;
                }
            }
        }
        //Bucle de 0 a iniciar-1, lo mismo que el anterior pero desde 0 a iniciar-1
        for (int i =0;i<batalla;i++){
            samurai=0;
            if (equipo1[i]>equipo2[i]) {
                samurai = 1+i;
                System.out.println("Samurai " + samurai + "." + " Gana Equipo 1. " + equipo1[i] + " vs " + equipo2[i]);
                bajaseq2++;
            }else{
                if (equipo1[i]<equipo2[i]){
                    samurai = 1+i;
                    System.out.println("Samurai " + samurai + "." + " Gana Equipo 2. " + equipo1[i] + " vs " + equipo2[i]);
                    bajaseq1++;
                }
            }
        }
        //Ver quiene es el ganador
        if (bajaseq1<bajaseq2){
            System.out.println("¡Equipo 1 GANA! Equipo 2 ha tenido " + bajaseq2 + " bajas");
        }else{
            if (bajaseq1>bajaseq2) {
                System.out.println("¡Equipo 2 GANA! Equipo 1 ha tenido " + bajaseq1 + " bajas");
        }
        }

    }
}
