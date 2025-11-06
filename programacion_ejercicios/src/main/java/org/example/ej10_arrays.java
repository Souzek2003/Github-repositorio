package org.example;

import java.util.Scanner;

public class ej10_arrays {

    static void main() {

        String palabras[] = {"mandarina","jacobo","melocotón","melón"};

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una letra (inicial)...");
        char letra = teclado.next().charAt(0);

        for (int i=0;i<palabras.length;i++){
            if (letra == palabras[i].charAt(0)){
                System.out.println(palabras[i]);
            }
        }
    }
}
