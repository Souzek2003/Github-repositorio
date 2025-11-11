package org.example;

import java.util.Scanner;

public class navidad {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserta palabra a imprimir...");
        String palabra = teclado.next();
        teclado.nextLine();
        String letras_vector[] = palabra.split("");

        System.out.println("Inserta la cantidad de letras a imprimir...");
        String cantidad = teclado.nextLine();
        String cantidad_vector[] = cantidad.split(" ");

        if (letras_vector.length == cantidad_vector.length){
            for (int i=0;i<letras_vector.length;i++){
                for (int j=0;j<Integer.parseInt(cantidad_vector[i]);j++){
                    System.out.print(letras_vector[i]);
                }
            }
        }else{
            System.out.println("La palabra y las cifras introducidas no coinciden.");
        }


    }
}
