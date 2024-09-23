package UD2.Tarea1.Bucles;

import java.util.Scanner;

import static java.lang.System.out;

public class PotenciaNumero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        int potencia;
        int acumulador = 1;
        int a = 0;

        System.out.println("Numero para potenciar :");
        numero = teclado.nextInt();
        System.out.println("Numero para potenciador :");
        potencia = teclado.nextInt();

        while(a<potencia) {
           acumulador = acumulador*numero;
           a++;
        }
        System.out.println("Resultado : " + acumulador);
    }
}