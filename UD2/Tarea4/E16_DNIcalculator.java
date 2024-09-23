package UD2.Tarea4;

import java.util.Scanner;

public class E16_DNIcalculator {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char[] letras ={'T', 'R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        char letra;
        int numero,resto;

        System.out.println("DNI");
        numero = teclado.nextInt();
        resto = numero%23;
        letra=letras[resto];
        System.out.println("DNI: " + numero + " tiene asignada letra: "+ letra);
    }
}