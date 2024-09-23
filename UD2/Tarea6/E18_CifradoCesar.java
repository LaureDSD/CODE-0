package UD2.Tarea6;

import java.util.Scanner;

public class E18_CifradoCesar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String frase;
        String[] codificada;
        int posicion, count = 0;

        System.out.println("Frase:");
        frase = teclado.nextLine();
        System.out.println("Posiciones:");
        posicion = teclado.nextInt();

        frase = frase.toUpperCase();
        codificada = new String[frase.length()];

        for (int LetCom = 0; LetCom < frase.length(); LetCom++) {
            for (int Compar = 0; Compar < letras.length; Compar++) {
                String letr = String.valueOf(frase.charAt(LetCom));
                if (letr.equals(letras[Compar])) {
                    codificada[count] = letras[Compar + posicion];
                    count++;
                }
            }
        }

        System.out.println("Codificado: ");
        for (int i = 0; i < codificada.length; i++) {
            System.out.print(codificada[i].toLowerCase());
        }
        System.out.println();
    }
}
