package UD2.Tarea6;

import java.util.Scanner;

public class E3_seleccionarmultiple {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra,palabra2,palabra3;
        System.out.println("Introduce Nombre:");
        palabra = teclado.nextLine();
        System.out.println("Introduce primer apellido:");
        palabra2 = teclado.nextLine();
        System.out.println("Introduce segundo apellido:");
        palabra3 = teclado.nextLine();
        seleccionar(palabra,palabra2,palabra3);
    }
    //--------------------------------------------------------------------------------
    private static void seleccionar(String palabra , String palabra2, String palabra3) {
        char[][] guardar ;
        int contador=0;
        guardar = new char[1][6];
        for (int f = 0; f < 2; f++) {
            guardar[0][contador] = palabra.charAt(f);
            contador++;
        }
        for (int f = 0; f < 2; f++) {
            guardar[0][contador] = palabra2.charAt(f);
            contador++;
        }
        for (int f = 0; f < 2; f++) {
            guardar[0][contador] = palabra3.charAt(f);
            contador++;
        }
            for (int f=0 ; f<6 ; f++) {
                System.out.print(guardar[0][f]);
            }
        }
//--------------------------------------------------------------------------------
}

