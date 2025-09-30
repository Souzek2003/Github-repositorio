package org.example;

import java.util.Scanner;

public class Bateria1_Ejercicio1 {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        double hora;
        double tarifa;
    try {
        System.out.println("Escribe número de horas trabajadas: ");
        hora = teclado.nextDouble();
        System.out.println("Escribe tu tarifa por hora: ");
        tarifa = teclado.nextDouble();

        System.out.println("Tu salario bruto es de " + (hora*tarifa)+ "€");

    } catch (Exception e) {
        System.out.println("No es un formato numérico");
    }






    }
}
