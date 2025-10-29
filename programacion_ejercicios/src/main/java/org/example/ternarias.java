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

         a = 4;
         b = 7;
         c = 5;

         resultado = b++ == 8 && c > b++ ? a += b :
                a > 3 && a == c ? a += c :
                        a == b || c > b ? a++ :
                                a++ == 4 && a == c ? b += c : b;
        System.out.println(resultado);

        a=1;
        b=2;
        c=3;

        boolean condicion = a == 1 ? true : false;

        condicion = a++ == b ? true :
                c == a++ ? true : false;

        System.out.println(condicion);


        a=4;
        b=5;
        c=6;
        resultado= a++ ==5 && a>b ? a-=b:
                a>3 &&a<10 ? a+=c:
                        a==c ? a++:a--;
        System.out.println(resultado);


        a = 5;
        b = 8;
        c = 10;

        resultado = a++ == 6 && b-- == 8 ? c + a++ == 10 ? c-- : a++ : a + c++  ;
        System.out.println(resultado);

        a = 1;
        b = 2;
        c = 3;

        resultado = ++a < c && a != b ? a -= b:
                c-- == b || --b == c ? b += c:
                        b <= a++ && a > c ? c + c: c--;
        System.out.println(resultado);

    }
}
