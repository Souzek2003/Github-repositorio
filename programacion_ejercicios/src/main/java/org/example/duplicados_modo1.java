package org.example;

import java.util.Arrays;

public class duplicados_modo1 {

    static void main() {

        int original[] = {1,2,2,3,4,5,5,6,6};

        int auxiliar[] = new int[original.length];

        int tam = 0;

        for (int i=0;i<=original.length-1;i++) {

            //i+1
            if (i == original.length-1){
                auxiliar[i]=original[i];
                tam++;
            }else if (original[i]!=original[i+1]){
                auxiliar[i]=original[i];
                tam++;
            }

        }

        System.out.println(Arrays.toString(auxiliar));
        System.out.println(tam);

        int limpio[] =  new int[tam];
        int j = 0;
        for (int i=0;i<auxiliar.length;i++){
            if (auxiliar[i]!=0){
                limpio[j]=auxiliar[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(limpio));


    }
}
