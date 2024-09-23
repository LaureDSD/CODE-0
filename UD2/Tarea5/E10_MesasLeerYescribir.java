package UD2.Tarea5;

import java.util.Scanner;

public class E10_MesasLeerYescribir {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] cabezera = {"Mesa N    ", "Ocupacion"};
        final int FILAS = 2, COLMS = 10;
        int[][] tabla;
        int acu = 1, persona = 0;
//----------------------------------------------------------------------
        tabla = new int[FILAS][COLMS];
        for (int f = 1; f < FILAS; f++) {
            for (int c = 0; c < COLMS; c++) {
                tabla[f][c] = (int) (Math.random() * 4);
                tabla[0][c] = acu++;
            }
        }
//------------------------------------------------------------------------
        System.out.println();
        while (persona != -1) {

            for (int f = 0; f < FILAS; f++) {
                System.out.print("");
                System.out.print(cabezera[f] + "\t|   ");
                for (int k = 0; k < COLMS; k++) {
                    System.out.print(tabla[f][k] + "\t ");
                }
                System.out.println();
            }
//-------------------------------------------------------------------------------------------
            System.out.println("Cuantos son? (Introduzca -1 para salir del programa): ");
            persona = teclado.nextInt();
//_-------------------------------------------------------------------------------------------
            if (persona > 4) {
                System.out.println("No se permiten mas de 4 personas");
            } else if (persona < 1) {
                System.out.println("Error de informacion,o fin");
            } else {
//---------------------------------------------------------------------------------------------
                for (int m = 1; m < FILAS; m++) {
                    for (int c = 0; c < COLMS; c++) {
//----------------------------------------------Espacio_0----------------------------------------------
                        if ((tabla[m][c] == 0 && persona == 1) || (tabla[m][c] == 0 && persona == 2) || (tabla[m][c] == 0 && persona == 3) || (tabla[m][c] == 0 && persona == 4)) {
                            System.out.println("Test 0");
                            persona = tabla[m][c] + persona;
                            tabla[m][c] = persona;
                            if (persona == 1) {
                                System.out.println("Le toca compartir mesa, Mesa numero:" + tabla[0][c]);
                            } else {
                                System.out.println("Les toca compartir mesa, Mesa numero:" + tabla[0][c]);
                            }
                            c = 10;
                            m = 10;
                        }
//------------------------------------------------Espacio_1----------------------------------------------
                        else if ((tabla[m][c] == 1 && persona == 1) || (tabla[m][c] == 1 && persona == 2) || (tabla[m][c] == 1 && persona == 3)) {
                            System.out.println("Test 1");
                            persona = tabla[m][c] + persona;
                            tabla[m][c] = persona;
                            if (persona == 1) {
                                System.out.println("Le toca compartir mesa, Mesa numero:" + tabla[0][c]);
                            } else if (persona == 4) {
                                System.out.println("Mesa libre, Mesa numero:" + tabla[0][c]);
                            } else {
                                System.out.println("Les toca compartir mesa, Mesa numero:" + tabla[0][c]);
                            }
                            c = 10;
                            m = 10;
                        }
//-------------------------------------------------Espacio_2-----------------------------------------------
                        else if ((tabla[m][c] == 2 && persona == 1) || (tabla[m][c] == 2 && persona == 2)) {
                            System.out.println("Test 2");
                            persona = tabla[m][c] + persona;
                            tabla[m][c] = persona;
                            if (persona == 1) {
                                System.out.println("Le toca compartir mesa, Mesa numero:" + tabla[0][c]);
                            } else {
                                System.out.println("Les toca compartir mesa, Mesa numero:" + tabla[0][c]);
                            }
                            c = 10;
                            m = 10;
                        }
//------------------------------------------------Espacio_3------------------------------------------------
                        else if (tabla[m][c] == 3 && persona == 1) {
                            System.out.println("Test 3");
                            persona = tabla[m][c] + persona;
                            tabla[m][c] = persona;
                            System.out.println("Le toca compartir mesa, Mesa numero:" + tabla[0][c]);
                            c = 10;
                            m = 10;
                        }

//--------------------------------------------------Espacio_LLeno----------------------------------------------
                       // else if((tabla[m][c] == 4 && (persona == 4 || persona==3 || persona==2 || persona==1)) || (tabla[m][c] == 3 && (persona == 4|| persona==3 || persona==2)) || (tabla[m][c] == 2 && (persona == 4|| persona==3)) || (tabla[m][c] == 1 && persona == 4)){
                       //     c++;
                       //     System.out.println("Mesa "+ c +" no isponible");
                        //}
//---------------------------------------------------------------------------------------------
                    }
                }
            }
//---------------------------------------------------------------------------------------------
        }
    }
}


