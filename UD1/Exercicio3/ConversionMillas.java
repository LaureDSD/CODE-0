package UD1.Exercicio3;

import java.util.Scanner;

public class ConversionMillas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float millas = 1852;
        float metros ;
        System.out.println("Metros a convertir");
        metros = teclado.nextInt();
        millas = metros * millas;
        System.out.println("En millas es = " + millas );
    }
}
