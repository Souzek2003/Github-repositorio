package org.example;

import java.util.Scanner;

public class Numero_suerte {

    static void main(){

        Scanner teclado = new Scanner(System.in);

        //Inicializamos constantes
        int num1;
        int num2;
        int num3;
        String fecha;
        String fecha_1;
        String fecha_2;
        String fecha_3;

        //Pedimos por teclado al usuario que inserte su fecha de nacimiento. Aplicamos Try Catch, por si el usuario inserta un formato incorrecto como por ejemplo "Hola" o 00/000/0000. Try Catch lanzará error diciendo "Formato incorrecto" y finalizará el programa. El formato correcto sería 00/00/0000.
        try {
            System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");
            fecha = teclado.nextLine();

            //Cogemos los números necesarios con cada substring. En el primero cogeremos los 2 primeros (día), en el segundo cogeremos los otros 2 siguientes (mes), y en el última cogeremos los 4 últimos (año).
            fecha_1 = fecha.substring(0,2);
            fecha_2 = fecha.substring(3,5);
            fecha_3 = fecha.substring(6,10);

            //Pasamos los strings (día, mes y año) a números para que el programa pueda realizar sumas.
            num1 = Integer.parseInt(fecha_1);
            num2 = Integer.parseInt(fecha_2);
            num3 = Integer.parseInt(fecha_3);

        } catch (Exception e) {
            System.out.println("Formato incorrecto");
            return;
        }

        //Establezco condición, si el usuario inserta su fecha de nacimiento y no tiene 10 caracteres, lanzará un mensaje diciendo que debe introducir 10 caracteres y finalizará el programa. Si se introducen 10 caracteres, el programa seguirá con su ejecución normal.
        if (fecha.length() != 10){
            System.out.println("Debes introducir 10 caracteres.");
        }else{

            //Defino variable suma, para que sume (día, mes y año).
            int suma = (num1+num2+num3);

            //Convertimos el resultado de suma a string suma_numeros.
            String suma_numeros = Integer.toString(suma);

            //Añado un while que, mientras la suma de los números "suma_numeros" sea menor a 4, añadirá ceros para que si el usuario inserta ceros en la fecha de nacimiento, el programa pueda realizar la suma sin errores.
            while (suma_numeros.length() < 4) {
                suma_numeros = 0 + (suma_numeros);
            }

            //Cogemos los números de el resultado de la suma uno a uno, para así obtener el resultado final (número de la suerte). suerte1 cogerá el primer número, suerte2 el segundo, suerte3 el tercero y suerte4 el último.
            String suerte1 = suma_numeros.substring(0,1);
            String suerte2 = suma_numeros.substring(1,2);
            String suerte3 = suma_numeros.substring(2,3);
            String suerte4 = suma_numeros.substring(3,4);

            //Convertimos los strings de el numero de la suerte a números (int) para que podamos realizar la suma final de los números.
            int suerte_suma1 = Integer.parseInt(suerte1);
            int suerte_suma2 = Integer.parseInt(suerte2);
            int suerte_suma3 = Integer.parseInt(suerte3);
            int suerte_suma4 = Integer.parseInt(suerte4);


            //Sumamos los números finales y obtenemos el resultado, dando el número de la suerte que esperamos. Así, finalizaría el programa mostrando tu número de la suerte según tu fecha de nacimiento.
            int suma_final = (suerte_suma1+suerte_suma2+suerte_suma3+suerte_suma4);

            System.out.println(fecha_1 + "+" + fecha_2 + "+" + fecha_3 + " = " + suma);
            System.out.println(suerte1 + "+" + suerte2 + "+" + suerte3 + "+" + suerte4 + " = " + suma_final);
            System.out.println("Tu número de la suerte es " + suma_final);
        }
    }
}
