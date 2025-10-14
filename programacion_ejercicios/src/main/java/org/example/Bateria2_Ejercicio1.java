package org.example;

import java.util.Scanner;

public class Bateria2_Ejercicio1 {

    static void main() {

    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce caracteres: ");
    String caracteres = teclado.nextLine();

    int tamanyo = caracteres.length();
    String espacios = caracteres.replace(" ", "");


    System.out.println("TEXTO ORIGINAL: " + caracteres);
    System.out.println("LA LONGITUD DEL TEXTO ES: " + tamanyo);
    System.out.println("ELIMINAMOS LOS ESPACIOS DEL TEXTO: " + espacios);

    }
}
