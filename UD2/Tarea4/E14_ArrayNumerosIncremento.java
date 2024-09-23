package UD2.Tarea4;

import static java.lang.System.out;

public class E14_ArrayNumerosIncremento {
    public static void main(String[] args) {
//-----------------------------------------------------------------
        int contador = 0, contador2=0;
        int numero = 10;
        int t=0,a=0;
//---------------------------array---------------------------------
        while (t<=numero) {
            for (int g = 0; g < t; g++) {
                contador++;
            }
            t++;
        }
        int[] array;
        array = new int[contador];
//-----------------------------------------------------------------
        while (a<=numero) {
            for (int b = 0; b < a; b++) {
                array[contador2] = a;
                contador2++;
            }
            a++;
        }
//---------------------------mostrar--------------------------------------
        for (int d = 0; d < array.length; d++) {
                out.print(" " + array[d]);
        }
        out.println();
    }
}