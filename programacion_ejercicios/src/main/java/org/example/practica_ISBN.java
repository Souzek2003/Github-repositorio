package org.example;

import java.util.Scanner;

public class practica_ISBN {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        String isbn ="";

        //ISBN son 10 números. 10,9,8,7,6,5,4,3,2,1
        //X=10
        //num % 11 = resto 0
        //112?461204 (solo puede haber 1 interrogante)
        //debe haber switch case 1 validar 2 reparar 3 salir
        //int num = integer.parseint(string value of)(char)

        System.out.println("-------------------------------");
        System.out.println("[1] -> Validar");
        System.out.println("[2] -> Reparar");
        System.out.println("[3] -> Salir");
        System.out.println("-------------------------------");
        System.out.println("Introduce una opción: ");
        int opcion = teclado.nextInt();
        System.out.println("-------------------------------");

        switch (opcion){
            case 1:
                System.out.println("Introduzca ISBN: ");
                isbn = teclado.next();
                break;

            case 2:
                System.out.println("Introduzca ISBN: ");
                isbn = teclado.next();
                break;

            case 3:
                System.out.println("Saliendo...");
                break;

            default:
                System.out.println("Debes elegir una opción del menú.");
                break;

        }

        if (opcion == 1 || opcion == 2){
            if (isbn.length()<10){
                System.out.println("El ISBN debe contener 10 números.");
            }else{
                String isbn_1 = isbn.substring(0,1);
                String isbn_2 = isbn.substring(1,2);
                String isbn_3 = isbn.substring(2,3);
                String isbn_4 = isbn.substring(3,4);
                String isbn_5 = isbn.substring(4,5);
                String isbn_6 = isbn.substring(5,6);
                String isbn_7 = isbn.substring(6,7);
                String isbn_8 = isbn.substring(7,8);
                String isbn_9 = isbn.substring(8,9);
                String isbn_10 = isbn.substring(9,10);

                int num1 = Integer.parseInt(isbn_1);
                int num2 = Integer.parseInt(isbn_2);
                int num3 = Integer.parseInt(isbn_3);
                int num4 = Integer.parseInt(isbn_4);
                int num5 = Integer.parseInt(isbn_5);
                int num6 = Integer.parseInt(isbn_6);
                int num7 = Integer.parseInt(isbn_7);
                int num8 = Integer.parseInt(isbn_8);
                int num9 = Integer.parseInt(isbn_9);
                int num10 = Integer.parseInt(isbn_10);

                int multi1 = (10*num1);
                int multi2 = (9*num2);
                int multi3 = (8*num3);
                int multi4 = (7*num4);
                int multi5 = (6*num5);
                int multi6 = (5*num6);
                int multi7 = (4*num7);
                int multi8 = (3*num8);
                int multi9 = (2*num9);
                int multi10 = (1*num10);

                int suma_final = (multi1+multi2+multi3+multi4+multi5+multi6+multi7+multi8+multi9+multi10);

                String suma = Integer.toString(suma_final);

                if (suma % 11){
                    System.out.println("El ISBN es válido");
                }else{
                    System.out.println("El ISBN no es válido");
                }
            }
        }

    }
}
