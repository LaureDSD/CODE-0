package UD1.Exercicio3;

import java.util.Scanner;

public class SumaDecimales {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float numero;
        float numero2;
        float resultado;
        System.out.println("Indica numero1");
        numero = teclado.nextInt();
        System.out.println("Indica numero2");
        numero2 = teclado.nextInt();
        resultado = numero + numero2;
        System.out.println("La suma es "+resultado);
    }
}