package UD1.Exercicio3;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Hora1Segundo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(in);
        int hora;
        int minuto;
        int segundo;
        out.println("Indica hora :");
        hora = teclado.nextInt();
        out.println("Indica minuto :");
        minuto = teclado.nextInt();
        out.println("Indica segundo :");
        segundo = teclado.nextInt();
        if (hora > 23) {
            System.out.println("No admito 24h o mas, esto no calcula dias");
        } else {
            if (segundo <= 58) {
                System.out.println(" Horas :"+ hora + ";" + minuto + ";" + ++segundo);

            } else if (minuto <= 58) {
                System.out.println(" Horas :"+ hora + ";" + ++minuto + ";" + 0);

            } else {
                System.out.println(" Horas :"+ ++hora + ";" + 0 + ";" + 0);
            }
        }
    }
}