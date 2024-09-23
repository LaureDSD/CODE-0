package UD2.Tarea1.Bucles;

import java.util.Scanner;

import static java.lang.System.out;

public class AlturaMedia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double altura;
        double media;
        double acumulador = 0;

        int n=0;
        while (n<10) {
            out.println("suma 10 alturas para media :");
            altura = teclado.nextInt();
            acumulador = acumulador + altura;
            n++;
        }
        media=acumulador/10;
        out.println("Media :" + media);
    }
}