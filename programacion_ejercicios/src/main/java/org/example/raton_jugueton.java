package org.example;

import java.util.Scanner;

public class raton_jugueton {

    static void main(){

        Scanner teclado = new Scanner(System.in);

        final double altura_minima = 140;
        final double peso_maximo = 120;
        double altura = 0;
        double peso = 0;

        System.out.println("***BIENVENIDO AL RATÓN JUGUETÓN***");
        try {
            System.out.println("Leyendo altura (cm)... ");
            altura = teclado.nextDouble();
        } catch (Exception e) {
            System.out.println("El formato no es correcto");
            System.exit(0);
        }

        if (altura < 0){
            System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR...");
        }else{
            if (altura < altura_minima){
                System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRACCIÓN. " + "Te faltan " + (altura_minima-altura) + " cm de altura.");
        }else{
            if (altura > 230){
                System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR...");
            }

            try {
                System.out.println("Leyendo peso (kg)... ");
                peso = teclado.nextDouble();
            } catch (Exception e) {
                System.out.println("El formato no es correcto");
                System.exit(0);
            }

            double peso_minimo = altura*2/8;

            if (peso_minimo < peso){
                System.out.println("Pesas " + peso + " kg. Peso mínimo calculado: " + peso_minimo + " kg");
                System.out.println("¡¡SUBE A LA ATRACCIÓN!!");
            }else{
                if (peso < 0){
                    System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR...");
            }else{
                if (peso_minimo > peso){
                    System.out.println("LO SIENTO. Te faltan " + (peso_minimo-peso) + " kg para poder subir a la atracción.");
                }else{
                    if (peso > peso_maximo){
                        System.out.println("LO SIENTO. Sobrepasas " + (peso - peso_maximo) + " kg el límite de la atracción.");
                    }
                }
            }
            }
            }
        }
    }
}
