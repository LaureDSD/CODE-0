package UD1.Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime tu edad: ");
        int edad;
        edad = teclado.nextInt();

        if(edad>=18) {
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
    }
}
