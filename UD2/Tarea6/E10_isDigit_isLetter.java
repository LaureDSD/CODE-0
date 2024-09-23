package UD2.Tarea6;

import java.util.Scanner;
import java.lang.*;

public class E10_isDigit_isLetter {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        String frase, caracter;
        String[] palabra;
        int contadorl = 0, contadorn = 0;
        char letras;

        System.out.println("Introduce frase:");
        frase = teclado.nextLine();

          for (int c = 0; c < frase.length(); c++) {
            letras = frase.charAt(c);
            boolean letrasc, numerosc;
            numerosc = Character.isDigit(letras);
            letrasc = Character.isLetter(letras);
            if (letrasc) {
                contadorl++;
            } else if (numerosc) {
                contadorn++;
            }
        }
            System.out.println();
            System.out.println("Hay [" + contadorl + "] letras");
            System.out.println("Hay [" + contadorn + "] numeros");
    }
}
