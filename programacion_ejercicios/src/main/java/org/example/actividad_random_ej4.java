package org.example;

import java.util.Random;

public class actividad_random_ej4 {

    static void main() {

        Random aleatorio = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        int longitud = aleatorio.nextInt(5)+8;
        String contrasenya = "";

        contrasenya+="ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(aleatorio.nextInt(26));
        contrasenya+="abcdefghijklmnopqrstuvwxyz".charAt(aleatorio.nextInt(26));
        contrasenya+="0123456789".charAt(aleatorio.nextInt(10));


        for (int i=3;i<longitud;i++){
            contrasenya += caracteres.charAt(aleatorio.nextInt(caracteres.length()-1));

        }

        System.out.println(contrasenya);

    }
}
