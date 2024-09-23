package UD2.Tarea4;

import java.util.Scanner;

public class E7_TamñoNescribeM {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int M, N, vezes;
        System.out.println("Introduce tamaño");
        N = teclado.nextInt();
        int[] guardar;
        guardar = new int[N];
        System.out.println("Que guardar?");
        M = teclado.nextInt();
        vezes = 0;
        while (vezes < N) {
            guardar[vezes] = M;
            vezes++;
        }
        for (int i = 0; i < guardar.length; i++) {
            System.out.print(guardar[i] + " ");
        }
    }
}
