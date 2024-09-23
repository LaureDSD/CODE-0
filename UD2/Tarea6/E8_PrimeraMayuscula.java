package UD2.Tarea6;

import java.util.Scanner;

public class E8_PrimeraMayuscula {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase,letra,mayus;
        String[] palabra;
        System.out.println("Introduce frase:");
        frase = teclado.nextLine();


        palabra = frase.split(" ");
        for(int f=0 ;f< palabra.length;f++){
            for (int c = 0; c < palabra[f].length(); c++) {
                if (c==0) {
                    letra =Character.toString( palabra[f].charAt(c));
                    mayus = letra.toUpperCase();
                    System.out.print(mayus);
                }else{
                    System.out.print( palabra[f].charAt(c));
                }
            }
            System.out.print(" ");
        }



    }
}