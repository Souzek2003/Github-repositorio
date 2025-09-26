package org.example;

import java.util.Scanner;

public class Bateria1_Ejercicio1 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe número de horas trabajadas: ");
        double hora = teclado.nextDouble();

        System.out.println("Escribe tu tarifa por hora: ");
        double tarifa = teclado.nextDouble();

        System.out.println("Tu salario bruto es de " + (hora*tarifa)+ "€");




    }
}
