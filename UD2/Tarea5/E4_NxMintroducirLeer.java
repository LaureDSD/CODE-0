package UD2.Tarea5;

import java.util.Scanner;

import static java.lang.System.out;

public class E4_NxMintroducirLeer {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int fila, colum, con1 = 0, con2 = 0;

        out.println("Filas : ");
        fila = teclado.nextInt();
        out.println("Columnas : ");
        colum = teclado.nextInt();


        int[][] tabla;
        tabla = new int[fila][colum];

        for (int f = 0; f < fila; f++) {
            for (int c = 0; c < colum; c++) {
                out.println("Valor : ");
                tabla[f][c] = teclado.nextInt();
            }
        }
        out.println("Tabla");
        for (int f = 0; f < fila; f++) {
            System.out.println();
            for (int c = 0; c < colum; c++) {
                System.out.print(tabla[f][c] + " ");

                if (tabla[f][c] >= 0) {
                    con1 = con1 + 1;
                } else {
                    con2 = con2 + 1;
                }

            }
        }
        out.println();
        out.println("Mayor a 0 : " + con1);
        out.println("Menor a 0 : " + con2);
    }
}
