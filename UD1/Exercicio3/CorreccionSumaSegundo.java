package UD1.Exercicio3;

import java.util.Scanner;

import static java.lang.System.*;
import static java.lang.System.in;
import static java.lang.System.out;

public class CorreccionSumaSegundo {
    public static void main(String[] args)
            throws InterruptedException {

        int hora;
        int minuto;
        int segundo;

        Scanner teclado = new Scanner(in);

        out.println("Indica hora :");
        hora = teclado.nextInt();
        out.println("Indica minuto :");
        minuto = teclado.nextInt();
        out.println("Indica segundo :");
        segundo = teclado.nextInt();

        while (true) {
            segundo++;
            if (segundo == 60) {
                segundo = 0;
                minuto++;
                if (minuto == 60) {
                    minuto = 0;
                    hora++;
                    if (hora == 24)
                        hora = 0;
                }
            }
            System.out.println(hora+":"+minuto+":" + segundo);
            Thread.sleep(1000);
        }
    }
}
