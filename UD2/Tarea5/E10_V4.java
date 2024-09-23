package UD2.Tarea5;

import java.util.Scanner;

public class E10_V4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] cabezera = {"Mesa N    ", "Ocupacion"};
        final int FILAS = 2, COLMS = 10;
        int[][] tabla;
        int acu, persona,mesa, mesav;
//-----------------------------Array-----------------------------------------
        tabla = new int[FILAS][COLMS];
        acu = 1;
        for (int c = 0; c < COLMS; c++) {
            tabla[1][c] = (int) (Math.random() * 4);
            tabla[0][c] = acu++;
        }
//-------------------------------Finalizador-----------------------------------------
        System.out.println();
        persona = 0;
        while (persona != -1) {
            for (int f = 0; f < FILAS; f++) {
                System.out.print("");
                System.out.print(cabezera[f] + "\t|   ");
                for (int k = 0; k < COLMS; k++) {
                    System.out.print(tabla[f][k] + "\t ");
                }
                System.out.println();
            }
//------------------------------------------Introducir-------------------------------------------------
            System.out.println("Cuantos son? (Introduzca -1 para salir del programa): ");
            persona = teclado.nextInt();
//_----------------------------------------Errores---------------------------------------------------
            if (persona > 4) {
                System.out.println("No se permiten mas de 4 personas");
            } else if (persona < 1) {
                System.out.println("Error de informacion,o fin");
            } else {
//--------------------------------------------Buscador-------------------------------------------------
                mesa = -1;
                mesav = -1;
                int a =0;
                while(a<COLMS && mesav == -1){
                    if (tabla[1][a] == 0){
                        mesav = a;
                    }else if(mesa == -1 && tabla[1][a] + persona <= 4){
                        mesa = a;
                    }
                    a++;
                }
//---------------------------------------Escribir----------------------------------------------
                if(mesav!=-1) {
                    System.out.println("Disfruten de su mesa "+ tabla[0][mesav]);
                    tabla[1][mesav] = tabla[1][mesav] + persona;
                }else if(mesa != -1) {
                    System.out.println("Lo sieentro, tendrán que compartir mesa. Disfruten de su mesa "+ tabla[0][mesa]);
                    tabla[1][mesa] += persona;

                }else {
                    System.out.println("Lo siento, no hay mesas disponibles...");
                }
            }
        }
    }
}