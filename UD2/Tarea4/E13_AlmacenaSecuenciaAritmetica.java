package UD2.Tarea4;

import java.util.Scanner;

import static java.lang.System.out;

public class E13_AlmacenaSecuenciaAritmetica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//---------------------------------------------------------------
        int v,i,n,acumulador;
//-----------------------------------------------------------------
        out.println("Valor : ");
        v = teclado.nextInt();
        out.println("Incremento : ");
        i = teclado.nextInt();
        out.println("Rango: ");
        n = teclado.nextInt();
//---------------------------array---------------------------------
        int[] array;
        array = new int[n];
//------------------------------escribir----------------------------------
        for (int r=0; r< array.length; r++) {
            v=v+i;
            array[r] = v;
        }
//-----------------------------------------------------------------
            for (int d = 0; d < array.length; d++) {
                out.print(" "+ array[d]);
            }
    }
}
