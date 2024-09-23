package UD2.Tarea2;

import java.util.Scanner;

public class SumaCuadrado5Naturales {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero=0;
        int primo;
        int suma=0;

        int a=0;
        while (a < 5) {
            numero++;
            a++;
            primo =numero*numero;
            suma=suma+primo;
            System.out.println("Cuadrado de "+ numero +" es "+ primo);
        }
        System.out.println("Suma de los cuadrados: "+suma);
    }
}