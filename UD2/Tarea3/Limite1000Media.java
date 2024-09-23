package UD2.Tarea3;

import java.util.Scanner;

public class Limite1000Media {
    public static void main(String[] args) {
        int numero,contador,acumulador,media;
        acumulador=0;
        contador=0;
        while (acumulador<=10000) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Intrtoduce numero");
            numero = teclado.nextInt();

            acumulador=acumulador+numero;
            contador++;
        }
        media=acumulador/contador;
        System.out.println(" Acumulado: "+acumulador);
        System.out.println(" Introducidos: "+contador);
        System.out.println(" Media: "+media);
    }
}
