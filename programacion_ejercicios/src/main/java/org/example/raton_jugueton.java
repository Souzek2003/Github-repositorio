package org.example;

import java.util.Scanner;

public class raton_jugueton {

    static void main(){

        Scanner teclado = new Scanner(System.in);

        //Defino variables, para altura y peso ponemos = 0 porque luego lo pisamos por teclado.
        final double altura_minima = 140;
        final double peso_maximo = 120;
        double altura = 0;
        double peso = 0;

        System.out.println("***BIENVENIDO AL RATÓN JUGUETÓN***");
        //Try catch para detectar si el usuario pone un formato incorrecto en altura "hola", dando error de formato y saliendo de la consola con exit.
        try {
            System.out.println("Leyendo altura (cm)... ");
            altura = teclado.nextDouble();
        } catch (Exception e) {
            System.out.println("El formato no es correcto");
            System.exit(0);
        }

        //Condiciones para la altura. El programa detectará si el usuario pone un número negativo, si le falta altura o si pone una altura superior a 230, dando error en cada caso. Se indicará la altura necesaria para poder subir a la atracción.
        if (altura < 0 || altura > 230) {
            System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR...");
        }else if (altura < altura_minima) {
            System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRACCIÓN. " + " Te faltan " + (altura_minima - altura) + " cm de altura.");
        }else{
            //Try catch para el peso, en caso de que el usuario ponga un formato incorrecto "Hola", dará error y saldrá de la consola con exit.
            try {
                System.out.println("Leyendo peso (kg)... ");
                peso = teclado.nextDouble();
            } catch (Exception e) {
                System.out.println("El formato no es correcto");
                System.exit(0);
            }

                //Cálculo que calcula el peso mínimo que necesitará el usuario para montar a la atracción.
                double peso_minimo = altura*2/8;

                //Condiciones para el peso. El programa detectará si el usuario introduce un número negativo, si le falta peso o si lo sobrepasa, dando error en cada caso. Se indicará el peso necesario para subir a la atracción.
                if (peso < 0){
                    System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR...");
                }else{
                    if (peso_minimo > peso){
                        System.out.println("LO SIENTO. Te faltan " + (peso_minimo-peso) + " kg para poder subir a la atracción.");
                    }else{
                        if (peso > peso_maximo){
                            System.out.println("LO SIENTO. Sobrepasas " + (peso - peso_maximo) + " kg el límite de la atracción.");
                        }else{
                            if (peso_minimo < peso){
                                System.out.println("Pesas " + peso + " kg. Peso mínimo calculado: " + peso_minimo + " kg");
                                System.out.println("¡¡SUBE A LA ATRACCIÓN!!");
                            }
                        }
                    }
                }
            }
        }
    }

