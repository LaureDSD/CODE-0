package UD2.Tarea1.CombinacionBucles;

import java.util.Scanner;

import static java.lang.System.out;

public class Asterisco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int vezes;

        out.println("Numeros de * :");
        vezes = teclado.nextInt();

        for (int a = 0; a < vezes; a++ ) {
            out.println("*");

        }
    }
}
