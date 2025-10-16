package org.example;

import java.util.Scanner;

public class Numero_suerte {

    static void main(){

        Scanner teclado = new Scanner(System.in);

        int num1=0;
        int num2=0;
        int num3=0;
        String fecha_1 = "";
        String fecha_2= "";
        String fecha_3= "";

        try {
            System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");
            String fecha = teclado.nextLine();

            fecha_1 = fecha.substring(0,2);
            fecha_2 = fecha.substring(3,5);
            fecha_3 = fecha.substring(6,10);

            num1 = Integer.parseInt(fecha_1);
            num2 = Integer.parseInt(fecha_2);
            num3 = Integer.parseInt(fecha_3);

            if (fecha.length() > 10){
                System.out.println("Excedes el límite. Puedes introducir hasta un máximo de 10 caracteres.");
            }

        } catch (Exception e) {
            System.out.println("Formato incorrecto");
        }

        int suma = (num1+num2+num3);

        String suma_numeros = Integer.toString(suma);

        String suerte1 = suma_numeros.substring(0,1);
        String suerte2 = suma_numeros.substring(1,2);
        String suerte3 = suma_numeros.substring(2,3);
        String suerte4 = suma_numeros.substring(3,4);

        int suerte_suma1 = Integer.parseInt(suerte1);
        int suerte_suma2 = Integer.parseInt(suerte2);
        int suerte_suma3 = Integer.parseInt(suerte3);
        int suerte_suma4 = Integer.parseInt(suerte4);

        int suma_final = (suerte_suma1+suerte_suma2+suerte_suma3+suerte_suma4);

        System.out.println(fecha_1 + "+" + fecha_2 + "+" + fecha_3 + " = " + suma);
        System.out.println(suerte1 + "+" + suerte2 + "+" + suerte3 + "+" + suerte4 + " = " + suma_final);
        System.out.println("Tu número de la suerte es " + suma_final);
    }
}
