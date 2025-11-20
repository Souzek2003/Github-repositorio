package org.example;

import java.util.Scanner;

public class Ejercicio4_Matrices {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuántos alumnos tienes? ");
        int alumnos = teclado.nextInt();

        System.out.println("¿Cuántas asignaturas cursas? ");
        int asignaturas = teclado.nextInt();

        teclado.nextLine();
        String notas[][] = new String[alumnos+1][asignaturas+1];

        notas[0][0] = "Estudiantes";

        for (int i=1;i<notas.length;i++){
            System.out.println("Introduce el nombre del alumno " + i + ":");
            notas[i][0] = teclado.next();
        }

        for (int i=1;i<notas.length;i++){
            System.out.println("Introduce asignatura " + i);
            notas[0][i] = teclado.next();
        }

        for (int i=1;i<notas.length;i++){
            for (int j=1;j<notas[i].length;j++){
                System.out.println("Introduce la nota de " + notas[i][0] + " para la asignatura de " + notas);
                notas[i][j] = teclado.next();
            }
        }

        for (String fila[] : notas){
            for (String valor : fila){
                System.out.print(valor + " ");
            }
            System.out.println();
        }










    }
}
