package UD2.Tarea5;

import java.util.Scanner;

import static java.lang.System.out;

public class E7_Generos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int FILAS = 2;
        int colums,fila, media0 = 0, media1 = 0, sumam=0, sumah=0, vezesm=0, vezesh=0;
        out.println("Tamaño : ");
        colums = teclado.nextInt();
        colums++;
        int[][] tabla;
        tabla = new int[FILAS][colums];
        tabla[0][0]=0;
        tabla[1][0]=1;
        for (int i=1 ;colums>i; i++) {
            out.print("Genero (0=Hombre 1=Mujer): ");
            fila = teclado.nextInt();
            if(fila>1){
                out.println("Genero no exite,femenino por defecto");
                fila=1;
            }
                out.print("  Sueldo : ");
                tabla[fila][i] = teclado.nextInt();
            if (fila == 0) {
                vezesm++;
            } else {
                vezesh++;
            }
        }
//----------------------------------------------------------------------------
        for (int f = 0; f < FILAS; f++) {
            for (int c = 1; c < colums; c++) {
                if (f == 0) {
                    sumam = sumam + tabla[f][c];
                } else {
                    sumah = sumah + tabla[f][c];
                }
                if (vezesh==0){vezesh=1;
                }
                if (vezesm==0){vezesm=1;
                }
                media0=sumam/vezesm;
                media1=sumah/vezesh;
            }
        }
        out.println();
        out.println("Hombre Sueldo Medio: " + media0);
        out.println("Mujer Sueldo Medio: " + media1);
    }
}
