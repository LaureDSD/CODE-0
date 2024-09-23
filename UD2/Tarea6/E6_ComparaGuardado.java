package UD2.Tarea6;

import java.util.Scanner;

public class E6_ComparaGuardado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase, vocal;
        char comp;
        int largo, contador = 0;
        System.out.println("Introduce frase:");
        frase = teclado.nextLine();
        System.out.println("Indique vocal");
        vocal = teclado.nextLine();
        largo = frase.length();
        frase = frase.toLowerCase();
        int b=0;
        while(b<largo){
            comp=frase.charAt(b);
            if (vocal.equals("a") && comp=='a') {
                contador++;
            }
            if (vocal.equals("e") && comp=='e') {
                contador++;
            }
            if (vocal.equals("i") && comp=='i') {
                contador++;
            }
            if (vocal.equals("o") && comp=='o') {
                contador++;
            }
            if (vocal.equals("u") && comp=='u') {
                contador++;
            }
            b++;
        }
        System.out.println("La frase ["+frase+"]cuenta con ["+contador+"] vocal [" + vocal+ "]");
    }
}
