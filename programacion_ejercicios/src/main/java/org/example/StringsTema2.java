package org.example;

public class StringsTema2 {

    static void main(){

        String frase = "Al palo JuanFran del Atleti palo";

        int tamanyo = frase.length();
        System.out.println(tamanyo);

        System.out.println(frase.charAt(8));

        String trozo = frase.substring(8,16);
        System.out.println(trozo);

        String trozo_final = frase.substring(17);
        System.out.println(trozo_final);

        int posicion = frase.indexOf("palo");
        System.out.println(posicion);

        int posicion2 = frase.indexOf("palo",10);
        System.out.println(posicion2);

        int posicion_ultimo = frase.lastIndexOf("palo");
        System.out.println(posicion_ultimo);

        String frase_mayusculas = frase.toUpperCase();
        System.out.println(frase_mayusculas);

        String frase_minusculas = frase.toLowerCase();
        System.out.println(frase_minusculas);

        String base_datos = "Raúl                  ";
        System.out.println(base_datos.trim() + " - " + base_datos + "#");

        //Si le quitas a base_datos el .trim() la boolean da falso porque raul tiene espacios y trim elimina los espacios
        boolean igual = base_datos.trim().equals("Raúl");
        System.out.println(igual);

        boolean igual_sin_mayusculas = "Raúl".equalsIgnoreCase("raúl");
        System.out.println(igual_sin_mayusculas);

        String frase_reemplazos = frase.replace("palo", "Florentino");
        System.out.println(frase_reemplazos);

        String equipo = " Real Madrid";

        System.out.println(frase.concat(equipo));
        System.out.println(frase+equipo);
    }
}
