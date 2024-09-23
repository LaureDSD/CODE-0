package UD1.Exercicio3;

import java.util.Scanner;

import static java.lang.System.*;

public class MayorDe3Numeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(in);
        int numero;
        int numero2;
        int numero3;

        out.println("Indica numero1");
        numero = teclado.nextInt();
        out.println("Indica numero2");
        numero2 = teclado.nextInt();
        out.println("Indica numero3");
        numero3 = teclado.nextInt();

        if (numero >= numero2) {

            if (numero >= numero3) {
                System.out.println("El mayor es: " + numero);
            } else {
                System.out.println("el mayor es: " + numero3);
            }

        } else if (numero2 > numero3) {

            System.out.println("el mayor es: " + numero2);
        } else {
            System.out.println("el mayor es: " + numero3);

        }

    }
}