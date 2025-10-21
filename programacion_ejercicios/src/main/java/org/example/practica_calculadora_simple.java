package org.example;

import java.util.Scanner;

public class practica_calculadora_simple {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        double resultado = 0;
        int operando1 = 0;
        int operando2 = 0;
        //No se puede dividir entre 0. En la raíz cuadrada no puede haber número negativo.

        System.out.println("***** BIENVENIDO A LA CALCULADORA RÁPIDA *****");
        System.out.println("> Introduce operando: ");
        operando1 = teclado.nextInt();
        System.out.println("-------------------------------");
        System.out.println("[+] -> Sumar");
        System.out.println("[-] -> Restar");
        System.out.println("[x] -> Multiplicar");
        System.out.println("[/] -> Dividir");
        System.out.println("[R] -> Raíz cuadrada");
        System.out.println("-------------------------------");
        System.out.println("Elige una operación: ");
        String operacion = teclado.next();
        if (!operacion.equalsIgnoreCase("r")) {
            System.out.println("> Introduce el segundo operando: ");
            operando2 = teclado.nextInt();

        switch (operacion.toLowerCase()){
            case "+":
                resultado = (operando1+operando2);
                break;
            case "-":
                resultado = (operando1-operando2);
                break;
            case "x":
                resultado = (operando1*operando2);
                break;
            case "/":
                resultado = (operando1/operando2);
                break;
            case "r":
                resultado = Math.sqrt (operando1);
                System.out.println("El resultado de R " + operando1 + " es " + resultado);
                return;
            default:
                System.out.println("Formato incorrecto.");
        }
        }

        System.out.println("El resultado de " + operando1 + " " + operacion + " " + operando2 + " es " + resultado);

    }
}
