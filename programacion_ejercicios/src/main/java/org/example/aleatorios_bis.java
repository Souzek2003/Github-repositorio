package org.example;

import java.util.Random;

public class aleatorios_bis {

    static void main() {

        Random aleatorio = new Random();

        int numero = aleatorio.nextInt(10)+1;//Genera numero aleatorio del 1-10. Si no ponemos el +1 que indica que empezará por 1 y no por 0, nunca saldría el 10.
        System.out.println(numero);

        double numero3 = aleatorio.nextDouble();
        System.out.println(numero3);

        int numero2 = (int) (Math.random()*10+1);
        System.out.println(numero2);
    }
}
