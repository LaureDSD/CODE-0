package UD2.Tarea1.CombinacionBucles;

import java.util.Scanner;

public class DebuxaRectangulo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        {
//  "--------------------------------"

            int fila;
            int columna;

            //  "--------------------------------"
//(fila>10 && fila<2)
//(columna>10 && fila<2)

                    System.out.println("Filas : ");
                    fila = teclado.nextInt();

                    System.out.println("Columnas : ");
                    columna = teclado.nextInt();


            //  "--------------------------------"

            int a=0;
            while (a < fila) {
                a++;
                for (int b = 0; b < columna; b++) {
                    System.out.print(" * ");

                }
                System.out.println();
            }
        }
    }
}

