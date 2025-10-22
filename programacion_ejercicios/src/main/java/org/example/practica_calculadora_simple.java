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
        try {
            System.out.println("> Introduce operando: ");
            operando1 = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("Formato incorrecto.");
            return;
        }
        System.out.println("-------------------------------");
        System.out.println("[+] -> Sumar");
        System.out.println("[-] -> Restar");
        System.out.println("[x] -> Multiplicar");
        System.out.println("[/] -> Dividir");
        System.out.println("[R] -> Raíz cuadrada");
        System.out.println("-------------------------------");
        System.out.println("Elige una operación: ");
        String operacion = teclado.next();
        try {
            if (operacion.equalsIgnoreCase("+")
                    || operacion.equalsIgnoreCase("-")
                    || operacion.equalsIgnoreCase("x")
                    || operacion.equalsIgnoreCase("/")) {
                System.out.println("> Introduce el segundo operando: ");
                operando2 = teclado.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Formato incorrecto.");
            return;
        }

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
                if (operando2 == 0) {
                    System.out.println("No es posible dividir entre 0.");
                    return;
                }
                resultado = (operando1/operando2);
                break;
            case "r":
                if (operando1 < 0){
                    System.out.println("El número no puede ser negativo.");
                }else{
                resultado = Math.sqrt (operando1);
                System.out.println("El resultado de R " + operando1 + " es " + resultado);
                }return;
            default:
                System.out.println("Debes elegir una operación del menú.");
                return;
        }

        System.out.println("El resultado de " + operando1 + " " + operacion + " " + operando2 + " es " + resultado);

    }
}
