package UD2.Tarea1;

import java.util.Scanner;

import static java.lang.System.out;

public class SeleccionSimple {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;


        out.println("Indica un numero entero :");

        numero = teclado.nextInt();


        if (numero%2 == 0) {
            out.println("Es par " );
        }else{
            out.println("Es impar:");
        }
    }
}