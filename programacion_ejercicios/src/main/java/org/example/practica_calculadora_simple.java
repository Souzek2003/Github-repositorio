package org.example;

import java.util.Scanner;

public class practica_calculadora_simple {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        //Declaro constantes, con valor de 0 pero que luego pisaremos por teclado.
        double resultado = 0;
        int operando1 = 0;
        int operando2 = 0;

        //Pedimos al usuario que introduzca operando. En caso de que el operando no sea una número, Try Catch se encargará de mostrar el mensaje de error asignado "formato incorrecto" y finalizará el programa.
        System.out.println("***** BIENVENIDO A LA CALCULADORA RÁPIDA *****");
        try {
            System.out.println("> Introduce operando: ");
            operando1 = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("Formato incorrecto.");
            return;
        }
        //Le pedimos al usuario que elija una operación (sumar, restar, multiplicar, dividir o raíz cuadrada).
        System.out.println("-------------------------------");
        System.out.println("[+] -> Sumar");
        System.out.println("[-] -> Restar");
        System.out.println("[x] -> Multiplicar");
        System.out.println("[/] -> Dividir");
        System.out.println("[R] -> Raíz cuadrada");
        System.out.println("-------------------------------");
        System.out.println("Elige una operación: ");
        String operacion = teclado.next();
        //Después de que el usuario elija una operación, si ha elegido cualquiera menos la raíz cuadrada, pedirá al usuario el segundo operando. En caso de que el operando introducido no sea un número, Try Catch se encargará de lanzar el mensaje de error establecido "formato incorrecto".
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
        //Según la operación que haya elegido el usuario, el switch case se comportará de forma diferente.
        //Para la suma, resta, y multiplicación, simplemente hará la operación requerida (+,-,*) y lo guardará en la variable de "resultado".
        //Para la división, el programa verificará gracias a la condición establecida de if, que si el segundo operando (denominador) es IGUAL a 0, salte un mensaje diciendo que no se puede dividir entre 0 ya que no será posible y finalizará el programa.
        //Para la raíz cuadrada, la operación es algo distinta a las demás "variable = Math.sqrt (número);". El programa verificará gracias a la condición if, que si el número es menor a 0 (negativo), salte un mensaje diciendo que el número no puede ser negativo, y finalizará el programa. En caso de que el número NO sea negativo, hará la operación de manera normal y se guardará en la variable resultado.
        //Si el usuario no elige ninguna de las anteriores, el switch case irá a la opción "default", donde le mostrará al usuario un mensaje diciendo que debe elegir una operación del menú, finalizando el programa.
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
