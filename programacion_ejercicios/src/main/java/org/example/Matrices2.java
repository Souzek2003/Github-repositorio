package org.example;

import java.util.Arrays;
import java.util.Random;

public class Matrices2 {

    static void main() {

        Random aleatorio = new Random();

        int matriz[][] = new int[aleatorio.nextInt(6)+2][aleatorio.nextInt(6)+2];

        for (int i=0;i< matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                matriz[i][j] = aleatorio.nextInt(50)+1;
            }
        }

        for (int fila[] : matriz){
            System.out.println(Arrays.toString(fila));
        }












    }
}
