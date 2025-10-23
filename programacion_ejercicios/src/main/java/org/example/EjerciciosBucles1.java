package org.example;

import java.util.Scanner;

public class EjerciciosBucles1 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

//        //1
        String buena = "admin1234";

        do {
            System.out.println("Introduce tu contraseña: ");
            String contrasenya = teclado.next();

            if (contrasenya.equals(buena)){
                break;
            }
        }while (true);

        System.out.println("Introduce número: ");
        int num = teclado.nextInt();

        //2
        for (int i=num;i>=1;i--){
            System.out.println(i);
        }

        //3
        for (int i=num;i<=50;i++){
            if (i % 3 !=0){
                continue;
            }
            System.out.println(i);
        }

        //4
        System.out.println("Introduce una palabra... ");
        String palabra = teclado.next();
        int letras = palabra.length();
        for (int i=0;i<letras;i++){
            System.out.println(palabra.charAt(i));
        }

        //5
        System.out.println("Introduce un número: ");
        int numero = teclado.nextInt();
        for (int i=0;i<=10;i++){
            System.out.println(numero + " x " + i + " = " + (numero*i));
        }

        //factorial 5 = 54321
    }
}
