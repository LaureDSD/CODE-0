package UD2.Tarea5;

import java.util.Scanner;

public class E11_TresEnRaya {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int FILAS = 3, COLMS = 3;
        char[][] tableroPrueba ;
        tableroPrueba = new char[FILAS][COLMS];
        int fila=0, columna=0,botsito;
        for(int f=0; f<FILAS; f++) {
            System.out.println();
            for (int c = 0; c < COLMS; c++) {
                tableroPrueba[f][c] = ' ' ;
                System.out.print(" "+ "["+tableroPrueba[f][c]+"]");
            }
        }
//------------------------------------Inicio----------------------------------------
        System.out.println();
        System.out.println("INICIO TRES EN RAYA");
        System.out.println("Desea BOT? (Si=1/No=0)?");
        botsito = teclado.nextInt();
        System.out.println("Inicio de partida");
        for (int p=0;p<9 ;p++) {
            System.out.println();
            char jugador;
//--------------------------------------Turno---------------------------------------------------------
            if (p % 2 == 0) {
                jugador = 'X';
            } else {
                jugador = 'O';
            }
            System.out.println("Turno de " + jugador);
//--------------------------------------Bot----------------------------------------------------------
            if (botsito==1 && jugador=='X'){
                if (tableroPrueba[1][1]== ' ') {
                    fila=1;columna=1;
                } else if((tableroPrueba[0][1]=='O'&&tableroPrueba[0][0]==' ') || (tableroPrueba[1][0]=='O'&&tableroPrueba[0][0]==' ')) {
                    fila=0;columna=0;
                }else if ((tableroPrueba[0][0]=='O'&&tableroPrueba[0][1]==' ') || (tableroPrueba[0][2]=='O'&&tableroPrueba[0][1]==' ')) {
                    fila=0;columna=1;
                }else if ((tableroPrueba[0][1]=='O'&&tableroPrueba[0][2]==' ') || (tableroPrueba[1][2]=='O'&&tableroPrueba[0][2]==' ')) {
                    fila=0;columna=2;
                }else if ((tableroPrueba[2][0]=='O'&&tableroPrueba[2][1]==' ') || (tableroPrueba[2][2]=='O'&&tableroPrueba[2][1]==' ')) {
                    fila=2;columna=1;
                }else if ((tableroPrueba[0][0]=='O'&&tableroPrueba[1][0]==' ') || (tableroPrueba[2][0]=='O'&&tableroPrueba[1][0]==' ')) {
                    fila=1;columna=0;
                }else if ((tableroPrueba[0][2]=='O'&&tableroPrueba[1][2]==' ') || (tableroPrueba[2][2]=='O'&&tableroPrueba[1][2]==' ')) {
                    fila=1;columna=2;
                }else if ((tableroPrueba[1][0]=='O'&&tableroPrueba[2][0]==' ') || (tableroPrueba[2][1]=='O'&&tableroPrueba[2][0]==' ')) {
                    fila=2;columna=0;
                }else if ((tableroPrueba[2][1]=='O'&&tableroPrueba[2][2]==' ') || (tableroPrueba[1][2]=='O'&&tableroPrueba[2][2]==' ')) {
                    fila=2;columna=2;
                }
//---------------------------------------Jugador---------------------------------------------------------
            }else{
                System.out.println("fila");
                fila = teclado.nextInt();
                System.out.println("columna");
                columna = teclado.nextInt();
            }
//------------------------------------------Juego-------------------------------------------------------
            if(fila<FILAS || columna<COLMS) {
                if (tableroPrueba[fila][columna] == ' ') {
                    tableroPrueba[fila][columna] = jugador;
                    for (int f = 0; f < FILAS; f++) {
                        System.out.println();
                        for (int c = 0; c < COLMS; c++) {
                            System.out.print(" "+"[" + tableroPrueba[f][c]+"]");
                        }
                    }
                    System.out.println();
                } else {
                    System.out.println("Posicion no valida,intenta de nuevo");
                    p--;
                }
            }else{
                System.out.println("Error,valor no valido");
                p--;
            }
//------------------------------------------Resultado-------------------------------------------------------
            if( (tableroPrueba[0][0]==jugador && tableroPrueba[0][1]==jugador && tableroPrueba[0][2]==jugador) ||
                    (tableroPrueba[1][0]==jugador && tableroPrueba[1][1]==jugador && tableroPrueba[1][2]==jugador) ||
                    (tableroPrueba[2][0]==jugador && tableroPrueba[2][1]==jugador && tableroPrueba[2][2]==jugador) ||
                    (tableroPrueba[0][0]==jugador && tableroPrueba[1][0]==jugador && tableroPrueba[2][0]==jugador) ||
                    (tableroPrueba[0][1]==jugador && tableroPrueba[1][1]==jugador && tableroPrueba[2][1]==jugador) ||
                    (tableroPrueba[0][2]==jugador && tableroPrueba[1][2]==jugador && tableroPrueba[2][2]==jugador) ||
                    (tableroPrueba[0][0]==jugador && tableroPrueba[1][1]==jugador && tableroPrueba[2][2]==jugador) ||
                    (tableroPrueba[2][0]==jugador && tableroPrueba[1][1]==jugador && tableroPrueba[0][2]==jugador) ){
                System.out.println();
                System.out.println("Ganador es "+jugador);
                p=9;
            }
        }
//----------------------------------------------------------------------------------------------
    }
}
