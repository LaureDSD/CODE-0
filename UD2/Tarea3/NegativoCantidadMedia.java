package UD2.Tarea3;

import java.util.Scanner;

public class NegativoCantidadMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, acumulador, a, contador,media,mayor,contadorinpar;
        //---------------------------------------------------------------
        contadorinpar=0;
        contador=0;
        mayor=0;
        acumulador=0;
        a = 0;
        while (a < 1) {
            System.out.println("Introduce numero: ");
            numero = teclado.nextInt();
            if (numero<0){
                a=1;
            }else{
                contador++;
                if (numero%2!=0) {
                    acumulador=acumulador+numero;
                    contadorinpar++;
                }
            if (numero%2==0) {
                if (numero>mayor) {
                    mayor=numero;
                    }
                }
            }
        }
        media=acumulador/contadorinpar;
        System.out.println("Cantidad: "+contador);
        System.out.println("Media de impares: "+media);
        System.out.println("Mayor de pares "+mayor);
    }
}
