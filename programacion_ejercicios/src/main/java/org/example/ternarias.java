package org.example;

public class ternarias {

    static void main() {


        int a = 1, b = 2, c = 3;
        int resultado = a++ == 2 && c > b++ ? a += b :
                a > 0 && a == b ? a += c :
                        a == c ? a++ : a--;
        System.out.println(resultado);

        a = 1;
        b = 2;
        c = 3;

        resultado = a++ == 1 && a > b++ ? a += b :
                a > 0 && a == b ? a += c :
                        a == c ? a++ : a--;
        System.out.println(resultado);

        a = 1;
        b = 2;
        c = 3;

        resultado = a++ == 1 && a > b++ ? a += b :
                a > 0 && a == b ? a += c :
                        b == c ? a++ : a--;
        System.out.println(resultado);

        a = 5;
        b = 6;
        c = 7;

        resultado = a++ == 5 && a < b++ ? a+= b :
                a > 1 && a == b ? a+= c :
                        b == c ? a++ : a--;
        System.out.println(resultado);
    }
}
