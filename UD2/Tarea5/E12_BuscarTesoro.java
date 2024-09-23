package UD2.Tarea5;

import java.util.Scanner;

public class E12_BuscarTesoro {
    private final static int FILAS = 10, COLMS = 10;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char[][] tablero;
        tablero = new char[FILAS][COLMS];
        int fila, columna, filab, columnab, columnat, filat, rango, dificultad;
        char jugador;
        rango = FILAS * COLMS;
//------------------------------------------PrintTablero----------------------------------------------------------------
        escribirTablero(tablero);
//---------------------------------Dificultad---------------------------------------------------------------------------
        System.out.println();
        System.out.println("Indica nnnumro de bombas minimo:");
        dificultad = teclado.nextInt();
//-----------------------------------------GenerarTesoro----------------------------------------------------------------
        filat = (int) (Math.random() * FILAS);
        columnat = (int) (Math.random() * COLMS);
        tablero[filat][columnat] = 'T';
//--------------------------------------GenerarBombas-------------------------------------------------------------------
       generarBomba(tablero, dificultad, filat, columnat);
//-----------------------------------------Inicio-----------------------------------------------------------------------
        System.out.println();
        System.out.println("INICIO BUSCAR EL TESORO");
        System.out.println("Inicio de partida");
//------------------------------------------------Bucle-----------------------------------------------------------------
        for (int p = 0; p < rango; p++) {
            System.out.println();
//---------------------------------------------------Turno--------------------------------------------------------------
            jugador = 'O';
//-----------------------------------------------Coordenadas------------------------------------------------------------
            System.out.println("fila");
            fila = teclado.nextInt();
            System.out.println("columna");
            columna = teclado.nextInt();
//---------------------------------------------------Revision-----------------------------------------------------------
            if (fila < FILAS || columna < COLMS) {
                if (tablero[fila][columna] == ' ') {
                    tablero[fila][columna] = jugador;
                    tableroCensurado(tablero);
                } else if (tablero[fila][columna] == 'T') {
                    tablero(tablero);
                    p=rango;
                    System.out.println();
                    System.out.println("Tesoro encontrado ");
                } else if (tablero[fila][columna] == 'B') {
                    tablero(tablero);
                    p = rango;
                    System.out.println();
                    System.out.println("BOOMBA!! ");
                }
            } else {
                System.out.println("Error,valor no valido");
                p--;
            }
//----------------------------------------------------------------------------------------------------------------------
        }
//----------------------------------------------------------------------------------------------------------------------
    }
    private static void tablero(char tablero[][]) {
        for (int f = 0; f < FILAS; f++) {
            System.out.println();
            for (int c = 0; c < COLMS; c++) {
                System.out.print(" " + "[" + tablero[f][c] + "]");
            }
        }
    }
    private static void tableroCensurado(char tablero[][]) {
        for (int f = 0; f < FILAS; f++) {
            System.out.println();
            for (int c = 0; c < COLMS; c++) {
                if (tablero[f][c]== 'B' || tablero[f][c] == 'T' ) {
                    System.out.print(" " + "[ ]");
                }else {
                    System.out.print(" " + "[" + tablero[f][c] + "]");
                }
            }
        }
    }
    private static void escribirTablero(char tablero[][]) {
        for (int f = 0; f < FILAS; f++) {
            System.out.println();
            for (int c = 0; c < COLMS; c++) {
                tablero[f][c] = ' ';
                System.out.print(" " + "[" + tablero[f][c] + "]");
            }
        }
    }
    private static void generarBomba(char tablero[][] , int dificultad , int filat , int columnat ) {
        int b = 0;
        while (b < dificultad) {
           int filab = (int) (Math.random() * FILAS);
           int  columnab = (int) (Math.random() * COLMS);
            if (filab != filat && columnab != columnat ) {
                tablero[filab][columnab] = 'B';
                b++;
            }
        }
    }

//------------------------------------------------------Fin-------------------------------------------------------------
}
