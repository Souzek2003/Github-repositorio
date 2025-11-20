package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class practica_primitiva {

    static void main() {

        //Lo que necesito para la práctica:
        //.matches("\\d{2}/\\d{2,4}/\\d{1}/\\d{1,3}");
        //sacar 6 numeros del 1 al 49
        //Reintegro (0-9)
        //complementario (1-49)
        //N-N-N-N-N-N/R   \\d{1,2}

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();


        //Defino constantes que más tarde pisaremos por teclado
        int aciertos=0;


        //Le pedimos al usuario que introduzca los datos de su boleto.
        //Una vez introducidos, el formato .matches validará si los datos han sido introducidos
        //con el formato adecuado.
        //En caso de que el usuario haya introducido los datos del boletos con un formato incorrecto,
        //formato .matches será false y devolverá el mensaje de error "Formato incorrecto".
        //El formato correcto serán 6 números separados por guiones (-) y
        //el último (7) corresponderá con el número de reintegro, separado por "/".
        System.out.println("Introduce los datos de tu boleto: ");
        String datos = teclado.next();

        boolean formato = datos.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1,2}");

        if (formato == false) {
            System.out.println("Formato incorrecto. (1-2-49-6-8-9/7).");
            return;
        }

        //Hacemos un .split con los datos del boleto correctamente validados, indicando que está
        //separado por guiones (-).
        String numusr[] = datos.split("[-/]");

        //Creamos el vector que cogerá el número del reintegro (última posición).
        //También creo el vector llamado numeros, que corresponderá con el número
        //ganador de la primitiva.
        int reintegrousr = Integer.parseInt(numusr[6]);

        int numeros[] = new int[6];

        //Bucle for que generará el número ganador al azar (1-49).
        for (int i=0;i<numeros.length;i++){
            numeros[i] = aleatorio.nextInt(49)+1;
        }


        //Creamos reintegro y complementario, que generará también serán generados al azar.
        //Reintegro generará un número al azar del 0-9.
        //Complementario generará un número al azar del 1-49.
        int reintegro = aleatorio.nextInt(10);
        int complementario = aleatorio.nextInt(49)+1;

        boolean comprobar = true;

        //Bucle while que ordenará los números del sorteo de menor a mayor,
        //también comprobará que no se repita ningún número, generando uno nuevo.
        //El bucle no se detendrá hasta que todos los números sean distintos y sean ordenados. (false).
        //Hacemos lo mismo con el número complementario y el reintegro.
        while (comprobar){
            comprobar = false;
            Arrays.sort(numeros);
            for (int i=0;i<numeros.length;i++){
                if (i!=numeros.length-1 && numeros[i]==numeros[i+1]){
                    numeros[i] = aleatorio.nextInt(49)+1;
                    comprobar = true;

                }
                if (numeros[i]==complementario||numeros[i]==reintegro||complementario==reintegro){
                    reintegro=aleatorio.nextInt(10);
                    complementario=aleatorio.nextInt(49)+1;
                    comprobar=true;
                }
            }
        }

        System.out.println(Arrays.toString(numusr));

        System.out.println("Ha salido:");
        System.out.println(Arrays.toString(numeros));
        System.out.println("Complementario: " + complementario);
        System.out.println("Reintegro: " + reintegro);

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



        int acierto_complementario = 0;
        for(int i=0;i<numusrint.length;i++){
            if (numusrint[i]==complementario){
                acierto_complementario++;
            }
        }

        if (aciertos == 6 && reintegrousr==reintegro) {
            System.out.println("Categoría Especial: Has acertado 6 números y el reintegro.");
        } else if (aciertos == 6) {
            System.out.println("1ª Categoría: Has acertado 6 números.");
        } else if (aciertos == 5 && acierto_complementario==1) {
            System.out.println("2ª Categoría: Has acertado 5 números y el complementario.");
        } else if (aciertos == 5) {
            System.out.println("3ª Categoría: Has acertado 5 números.");
        } else if (aciertos == 4) {
            System.out.println("4ª Categoría: Has acertado 4 números.");
        } else if (aciertos == 3) {
            System.out.println("5ª Categoría: Has acertado 3 números.");
        } else if (reintegrousr==reintegro) {
            System.out.println("Has acertado el reintegro.");
        } else {
            System.out.println("No has sido premiado.");
        }








    }
}
