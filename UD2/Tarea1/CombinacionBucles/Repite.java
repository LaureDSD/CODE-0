package UD2.Tarea1.CombinacionBucles;

import java.util.Scanner;

public class Repite {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        int a = 0;

        System.out.println("Numero : ");
        numero = teclado.nextInt();

        while (a<numero) {
            System.out.println( numero + " * ");
            a++;
        }
    }
}