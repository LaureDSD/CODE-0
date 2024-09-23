package UD2.Tarea4;

import java.util.Scanner;

public class E9_Arrays3De20Num {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//---------------------------------------------------------------
        int aleatorio,a,rescubo,rescuad;
//---------------------------num---------------------------------
        int[] numeros;
        numeros = new int[20];
        a = 0;
        while (a < 20) {
            aleatorio = (int) (Math.random()*10);
            numeros[a] = aleatorio;
            a++;
        }
//------------------------------cuad--------------------------------
        int[] cuadrados;
        cuadrados = new int[20];
        for (int b = 0; b < numeros.length; b++) {
            rescuad = numeros[b] * numeros[b];
            cuadrados[b] = rescuad;
        }
//------------------------------cub---------------------------------
        int[] cubos;
        cubos = new int[20];
        for (int c = 0; c < numeros.length; c++) {
            cubos[c] = numeros[c] * numeros[c] * numeros[c];
        }
//---------------------------------resultado-------------------------------
        System.out.println("NUMEROS:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
            System.out.print(cuadrados[i] + " ");
            System.out.print(cubos[i] + " ");
        }
        System.out.println();
    }
}
