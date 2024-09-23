package UD2.Tarea3;

import java.util.Scanner;

public class SumaSiguientesEnteroPositivo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero,acumulador,a,contador,resultado;
        System.out.println("Introduce numero: ");
        numero = teclado.nextInt();
        //----------------------------------------------------------------
        contador=0;
        acumulador=0;
        resultado=numero;

        if (numero<0) {
            System.out.println("negativo fin: ");
        } else {
            a=0;
            while(a<100) {
                contador=numero++;
                acumulador=resultado;
                a++;
                System.out.println(" positivo: "+acumulador);
                resultado=acumulador+numero;
                System.out.println(acumulador+"+"+numero+"="+resultado);
            }
        }
        //----------------------------------------------------------------

    }
}
