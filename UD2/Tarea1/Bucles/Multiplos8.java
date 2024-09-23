package UD2.Tarea1.Bucles;

import java.util.Scanner;

import static java.lang.System.out;

public class Multiplos8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int limitador;

        out.println("Numero maximo :");
             limitador = teclado.nextInt();

        int n=0;
        while (n<limitador) {
            out.println( n );
            n+=8;
        }
        out.println(" Fin ");
    }
}