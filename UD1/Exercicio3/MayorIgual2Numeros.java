package UD1.Exercicio3;

import java.util.Scanner;

import static java.lang.System.*;

public class MayorIgual2Numeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(in);
        float numero ;
        float numero2;

        out.println("Indica numero1");
        numero = teclado.nextInt();
        out.println("Indica numero2");
        numero2 = teclado.nextInt();

        if( numero >= numero2) {
            out.println("Es mayor ="+ numero);
        }else{
            out.println("Es mayor ="+ numero2);
        }
    }
}
