package UD2.Tarea5;
import java.util.Scanner;
public class E11_3EnRaya {
    public static <string> void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int FILAS = 3, COLMS = 3;
        String[][] tablero ;
        tablero = new String[FILAS][COLMS];
        int fila=0, columna=0,botsito;
        for(int f=0; f<FILAS; f++) {
            System.out.println();
            for (int c = 0; c < COLMS; c++) {
                tablero[f][c] = "[ ]" ;
                System.out.print(" "+ tablero[f][c]);
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
        String figura;
//--------------------------------------Turno---------------------------------------------------------
        if (p % 2 == 0) {
            figura = "[X]";
        } else {
            figura = "[O]";
        }
        System.out.println("Turno de " + figura);
//--------------------------------------Bot----------------------------------------------------------
        if (botsito==1 && figura=="[X]"){
            if (tablero[1][1]=="[ ]") {
                fila=1;columna=1;
            } else if((tablero[0][1]=="[O]"&&tablero[0][0]=="[ ]") || (tablero[1][0]=="[O]"&&tablero[0][0]=="[ ]")) {
                fila=0;columna=0;
            }else if ((tablero[0][0]=="[O]"&&tablero[0][1]=="[ ]") || (tablero[0][2]=="[O]"&&tablero[0][1]=="[ ]")) {
                fila=0;columna=1;
            }else if ((tablero[0][1]=="[O]"&&tablero[0][2]=="[ ]") || (tablero[1][2]=="[O]"&&tablero[0][2]=="[ ]")) {
                fila=0;columna=2;
            }else if ((tablero[2][0]=="[O]"&&tablero[2][1]=="[ ]") || (tablero[2][2]=="[O]"&&tablero[2][1]=="[ ]")) {
                fila=2;columna=1;
            }else if ((tablero[0][0]=="[O]"&&tablero[1][0]=="[ ]") || (tablero[2][0]=="[O]"&&tablero[1][0]=="[ ]")) {
                fila=1;columna=0;
            }else if ((tablero[0][2]=="[O]"&&tablero[1][2]=="[ ]") || (tablero[2][2]=="[O]"&&tablero[1][2]=="[ ]")) {
                fila=1;columna=2;
            }else if ((tablero[1][0]=="[O]"&&tablero[2][0]=="[ ]") || (tablero[2][1]=="[O]"&&tablero[2][0]=="[ ]")) {
                fila=2;columna=0;
            }else if ((tablero[2][1]=="[O]"&&tablero[2][2]=="[ ]") || (tablero[1][2]=="[O]"&&tablero[2][2]=="[ ]")) {
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
            if (tablero[fila][columna] == "[ ]") {
                tablero[fila][columna] = figura;
                for (int f = 0; f < FILAS; f++) {
                    System.out.println();
                    for (int c = 0; c < COLMS; c++) {
                        System.out.print(" " + tablero[f][c]);
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
        if( (tablero[0][0]==figura && tablero[0][1]==figura && tablero[0][2]==figura) ||
            (tablero[1][0]==figura && tablero[1][1]==figura && tablero[1][2]==figura) ||
            (tablero[2][0]==figura && tablero[2][1]==figura && tablero[2][2]==figura) ||
            (tablero[0][0]==figura && tablero[1][0]==figura && tablero[2][0]==figura) ||
            (tablero[0][1]==figura && tablero[1][1]==figura && tablero[2][1]==figura) ||
            (tablero[0][2]==figura && tablero[1][2]==figura && tablero[2][2]==figura) ||
            (tablero[0][0]==figura && tablero[1][1]==figura && tablero[2][2]==figura) ||
            (tablero[2][0]==figura && tablero[1][1]==figura && tablero[0][2]==figura) ){
            System.out.println();
            System.out.println("Ganador es "+figura);
            p=9;
        }
    }
//----------------------------------------------------------------------------------------------
    }
}