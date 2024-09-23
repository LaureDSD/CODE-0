package UD2.Tarea2;

import java.util.Scanner;

public class PiramideAsteriscos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, espacio, contador = -1, a, b, c;

        System.out.print("piramide");
        numero = teclado.nextInt();

        espacio = numero;
            //---------------------------------------------------------------------------
            a=0;
            while (a < numero) {
                a++;
                System.out.println();
                contador = contador + 2;
//---------------------------------------------------------------------------
                c=0;
                espacio--;
                while (c < espacio) {
                    c++;
                    System.out.print("   ");
                }
//----------------------------------------------------------------------------
                b=0;
                while (b < contador) {
                    b++;
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
