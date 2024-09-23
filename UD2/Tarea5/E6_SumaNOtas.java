package UD2.Tarea5;

import java.util.Scanner;

import static java.lang.System.out;

public class E6_SumaNOtas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int FILAS=4,COLS=5;
        int numero=1,minima,maxima,media=0,suma,asignatura;
        int [][] tabla;
        tabla = new int[FILAS][COLS];
        for(int f=0; f<FILAS; f++) {
            System.out.println("Alumno"+numero++);
            for (int c = 0; c < COLS; c++) {
                out.println("Nota : ");
                tabla[f][c] = teclado.nextInt();
            }
        }
        numero=1;
        for(int f1=0; f1<FILAS; f1++){
            System.out.println("Alumno"+numero);
            numero++;
            asignatura=0;
            minima=10;
            maxima=0;
            suma=0;
            for(int c=0; c<COLS; c++){
                //System.out.print(tabla[f1][c] + " ");
                if (tabla[f1][c]>maxima ) {
                    maxima=tabla[f1][c];
                }
                if (tabla[f1][c]<minima ) {
                    minima=tabla[f1][c];
                }
                asignatura++;
                suma=suma+tabla[f1][c];
                media=suma/asignatura;
            }
            System.out.println("Mayor Nota: "+maxima);
            System.out.println("Menor Nota: "+minima);
            System.out.println("Nota Media: "+media);
            out.println();
        }
    }
}
