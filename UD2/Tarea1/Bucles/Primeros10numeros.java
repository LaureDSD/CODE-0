package UD2.Tarea1.Bucles;

import java.util.Scanner;

import static java.lang.System.out;

public class Primeros10numeros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        out.println("Numeros enteros de 1-10 impares :");

        for (int a=1 ; a<10 ;a+=2 ){
            out.println( a );
        }
    }
    }