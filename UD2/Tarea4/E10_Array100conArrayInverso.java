package UD2.Tarea4;

import java.util.Scanner;

public class E10_Array100conArrayInverso {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//---------------------------------------------------------------
        int a,acumulador=0,copiar=0,conversor;
//---------------------------array---------------------------------
        int[] principal;
        principal = new int[100];
        a = 0;
        while (a < 100) {
            principal[a] = acumulador++;
            a++;
        }
//------------------------------arrayinversa--------------------------------
        int[] inversa;
        inversa = new int[100];

        for (int d = 99; d > 0; d--) {
            inversa[+copiar] = principal[d];
            copiar++;
        }
//---------------------------------resultado-------------------------------
        System.out.println();
        System.out.println("Menor-Mayor:");
        for (int b = 0; b < principal.length; b++) {
            System.out.print(principal[b] + " ");
        }
        System.out.println();
        System.out.println("Mayor-Menor");
        for (int c = 0; c < inversa.length; c++) {
            System.out.print(inversa[c] + " ");
        }
        System.out.println();
    }
}
