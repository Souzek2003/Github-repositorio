package org.example;

import java.util.Scanner;

public class Bateria1_Ejercicio2 {

    static void main() {

        final double jornada = 40;
        final double plus = 1.5;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe número de horas trabajadas: ");
        double hora = teclado.nextDouble();

        System.out.println("Escribe tu tarifa por hora: ");
        double tarifa = teclado.nextDouble();

        if (hora>jornada) {
            //si
            double extra = hora - jornada; //40
            double tarifa_extra = tarifa * plus;
            double salario_extra = extra * tarifa_extra;

            System.out.println("Salario (con extra): " + (salario_extra + jornada*tarifa) + "€");

        }else{  //si no - Ejercicio1
            double salario = hora * tarifa;
            System.out.println("Tu salario bruto es de " + salario + "€");
        }




    }
}
