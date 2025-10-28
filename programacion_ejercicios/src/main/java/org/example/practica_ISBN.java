package org.example;

import java.util.Scanner;

public class practica_ISBN {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        //Defino constantes que más adelante pisaremos por teclado
        String isbn ="";
        int opcion =0;

        //Mostramos el menú al usuario
        System.out.println("-------------------------------");
        System.out.println("[1] -> Validar");
        System.out.println("[2] -> Reparar");
        System.out.println("[3] -> Salir");
        System.out.println("-------------------------------");
        //Hacemos un try catch por si el usuario introduce en las opciones letras en lugar de números, devolviendo el mensaje "Formato incorrecto" y saliendo del programa.
        try {
            System.out.println("Introduce una opción: ");
            opcion = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("Formato incorrecto. Debes introducir una opción del menú.");
            return;
        }
        System.out.println("-------------------------------");

        //Cuando el usuario introduzca una de las opciones del menú, el swtich case se comportará de manera diferente.
        //1 y 2 dirán que introduzcas el ISBN, mientras que 3 saldrá del programa.
        //Default mostrará el mensaje de "debes introducir una opción del menú" en caso de que el usuario introduzca un número que no está en el menú.
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

        //Si el usuario introduce la opción 1 o 2, el programa determinará si el usuario ha introducido o no 10 números de ISBN.
        //Si no introduce 10 números, el programa dirá que debe contener 10 números y saldrá del programa.
        //Si el usuario introduce 10 números, el programa irá cogiendo todos los números del ISBN uno a uno y seguidamente pasará los strings a números.
        if (opcion == 1 || opcion == 2){
            if (isbn.length()!=10){
                System.out.println("El ISBN debe contener 10 números.");
                return;
            }else if (opcion == 1){
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
                //Si el usuario introduce el caracter X como último número de ISBN, su valor será X, y si no, hará la conversión normal de string a número.
                int num10 = isbn_10.equalsIgnoreCase("X") ? 10 : Integer.parseInt(isbn_10);

                //Hacemos las multiplicaciones y sumas necesarias para obtener el resultado final y saber si es múltiplo de 11.
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

                //Si la suma final es múltiplo de 11, el ISBN será válido. En caso contrario, el ISBN no será válido y lo mostrará por pantalla.
                if (suma_final % 11 == 0){
                    System.out.println("El ISBN es válido");
                }else{
                    System.out.println("El ISBN no es válido");
                }
            }
        }

        //Si el usuario introduce el la opción 2 (modo reparar)
        if (opcion == 2){

            //Tenemos que encontrar en qué posición se encuentra el "?" y para ello recorremos la cadena.
            if (opcion == 2) {
                int interrogante = -1;
                for (int i = 0; i < isbn.length(); i++) {
                    if (isbn.charAt(i) == '?') {
                        interrogante = i;
                        break;
                    }
                }
                //Si no se introdujo ningún interrogante, el programará le dirá al usuario que no se ha encontrado ninguno.
            if (interrogante == -1) {
                System.out.println("No se encontró el número faltante (?).");
            } else {
                //Defino la constante "isbn_reparado" que luego se pisará por teclado con el resultado del número faltante.
                //También creo una booleana, para cuando el número sea encontrado.
                String isbn_reparado = "";
                boolean encontrado = false;


                //Si el ? no es el último número, se buscará en los números del 0 al 9. Si es el último, irá del 0 al 10.
                int posicion = (interrogante == 9) ? 11 : 10;

                //Reemplaza el ? con el número actual (0-9) o X (si valor_x es 10 y es la última posición)
                for (int valor_x = 0; valor_x < posicion; valor_x++) {
                    char caracter_actual;
                    int valor_actual =0;
                    if (valor_x == 10) {
                        caracter_actual = 'X';
                        valor_actual = 10;
                    } else {
                        caracter_actual = Character.forDigit(valor_x, 10);
                        valor_actual = valor_x;
                    }

                    //El programa obtiene el ISBN con el valor de prueba
                    String isbn_temporal = isbn.substring(0, interrogante) + caracter_actual + isbn.substring(interrogante + 1);

                    //Calcula la suma con el ISBN temporal
                    int suma_parcial = 0;
                    for (int i = 0; i < 10; i++) {
                        char num_caracter = isbn_temporal.charAt(i);
                        int numero_valor;

                        //X tiene valor 10 y controlaremos que se pueda introducir tanto minúscula como mayúscula
                        if (num_caracter == 'X' || num_caracter == 'x') {
                            numero_valor = 10;
                        } else {
                            //Controlamos que sean números válidos con el try catch
                            try {
                                numero_valor = Integer.parseInt(String.valueOf(num_caracter));
                            } catch (NumberFormatException e) {
                                numero_valor = 0;
                            }
                        }

                        //Multiplica por el peso (10, 9, 8, ... 1)
                        int peso = 10 - i;
                        suma_parcial += numero_valor * peso;
                    }

                    //Comprobamos si la suma es múltiplo de 11 y si encuentra el número correcto saldrá del bucle.
                    if (suma_parcial % 11 == 0) {
                        isbn_reparado = String.valueOf(caracter_actual);
                        encontrado = true;
                        break;
                    }
                }

                //Si lo encuentra, el programará mostrará por pantalla cuál es el número que falta, y si no lo encuentra, dirá que no se pudo reparar.
                if (encontrado) {
                    System.out.println("El dígito que falta es " + isbn_reparado);
                } else {
                    System.out.println("No se pudo reparar el ISBN.");

                    }
                }
            }
        }
    }
}