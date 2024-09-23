package UD2.Tarea6;

import java.util.Scanner;

public class E4_ContarVocales {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] almacenVocales;
        almacenVocales = new int[1][5];
        String frase;
        System.out.println("Introduce frase:");
        frase = teclado.nextLine();
        int largo;
        largo = frase.length();
        frase = frase.toLowerCase();
        for (int f = 0; f < largo; f++) {
            if ('a' == frase.charAt(f)) {
                almacenVocales[0][0] = almacenVocales[0][0] + 1;
            } else if ('e' == frase.charAt(f)) {
                almacenVocales[0][1] = almacenVocales[0][1] + 1;
            } else if ('i' == frase.charAt(f)) {
                almacenVocales[0][2] = almacenVocales[0][2] + 1;
            } else if ('o' == frase.charAt(f)) {
                almacenVocales[0][3] = almacenVocales[0][3] + 1;
            } else if ('u' == frase.charAt(f)) {
                almacenVocales[0][4] = almacenVocales[0][4] + 1;
            }
        }
        mostrar(almacenVocales);
    }
//----------------------------------------------------------------------------------------------
    private static void mostrar(int almacenVocales[][]){
        int m = 0;
        while (m < 5) {
            if (m == 0) {
                System.out.println("Nº de aes: " + almacenVocales[0][m]);
            }
            if (m == 1) {
                System.out.println("Nº de es: " + almacenVocales[0][m]);
            }
            if (m == 2) {
                System.out.println("Nº de ies: " + almacenVocales[0][m]);
            }
            if (m == 3) {
                System.out.println("Nº de oes: " + almacenVocales[0][m]);
            }
            if (m == 4) {
                System.out.println("Nº de ues: " + almacenVocales[0][m]);
            }
            m++;
        }
    }
//--------------------------------------------------------------------------------
}
