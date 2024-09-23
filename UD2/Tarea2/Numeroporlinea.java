package UD2.Tarea2;

import java.util.Scanner;

public class Numeroporlinea {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, a, b;

        System.out.print("Dime un numero de 0 a 20: ");
        numero = teclado.nextInt();

        a = 0;
        while (a < numero) {
            a++;
            System.out.println();

            b = 0;
            while (b < a) {
                b++;
                System.out.print("" + a);
                }
            }
        System.out.println();
        }
    }


