package UD1.Exercicio3;

import java.util.Scanner;

public class CalculoRadio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float radio ;
        float longitud ;
        double area ;
        double volumen ;
        System.out.println("Insertar Radio");
        radio = teclado.nextInt();
        longitud = (float) ((2 * Math.PI ) * radio);
        area = Math.PI * (radio/2);
        volumen = ( 4 / 3) * Math.PI * (radio * radio * radio);
        System.out.println("El diametro es = " + longitud + " la area es = " + area + " El volumen es =" +volumen );
    }
}
