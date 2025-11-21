package org.example;

import java.util.Scanner;

public class Práctica_Zxspectrum {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("******* VALIDADOR DE COMPATIBILIDAD ZX SPECTRUM *******");
        System.out.println("Introduce la resolución de pantalla (ancho x alto)...");
        System.out.println("Ancho: ");
        int ancho = teclado.nextInt();

        if (ancho > 48){
            System.out.println("El ancho no puede ser mayor de 48.");
        }else{

            System.out.println("Alto: ");
            int alto = teclado.nextInt();

            if (alto > 48){
                System.out.println("El alto no puede ser mayor de 48.");
            }else{

                System.out.println("Introduce (línea a línea) los colores de tu imagen para cada píxel: ");
                String colores = teclado.next();

                boolean formato = colores.matches("[a-oA-O]");

                if (formato == false){
                    System.out.println("Has introducido un valor de píxel incorrecto (A-O)");
                }
            }
        }







    }
}
