package org.example;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class CosasHasNextInt {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        if (teclado.hasNextInt()){
            int numero = teclado.nextInt();
            System.out.println(numero);
        }else{
            System.out.println("Formato incorrecto. No es un número.");
        }

        int numero = 2;
        char caracter = 'A';
        String palabra = "Patricia";

        switch (numero){

            case 1:
            System.out.println("El alumno es Raul");
            break;
            case 2:
                System.out.println("La profe es patricia");
                break;
        }
    }
}
