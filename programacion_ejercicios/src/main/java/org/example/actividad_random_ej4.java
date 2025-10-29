package org.example;

import java.util.Random;

public class actividad_random_ej4 {

    static void main() {

        Random aleatorio = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        String contrasenya = "";

        for (int i=0;i<12;i++){
            contrasenya += caracteres.charAt(aleatorio.nextInt(caracteres.length()-1));
        }

        System.out.println("La contraseña de 12 dígitos generada es: " + contrasenya);
    }
}
