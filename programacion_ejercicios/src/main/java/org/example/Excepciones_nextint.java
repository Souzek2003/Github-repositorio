package org.example;

import java.time.LocalDateTime;

public class Excepciones_nextint {

    static void main() {

        LocalDateTime hoy = LocalDateTime.now();

        System.out.println("El día es: "+hoy.getDayOfMonth());
        System.out.println("El mes es: "+hoy.getMonthValue());
        System.out.println("El año es: "+hoy.getYear());
        System.out.println("Minutos: "+hoy.getMinute());

    }
}
