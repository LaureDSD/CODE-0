package UD2.Tarea6;

import java.util.Scanner;

public class E14_ValidarDNI {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String DNI;
        char letra ,letrav;
        int numero;

        System.out.println("Introduce DNI (12345678-A):");

        DNI = teclado.nextLine();
        DNI = DNI.trim();
        DNI=DNI.toUpperCase();

        if (DNI.matches("\\d{8,}-[a-zA-Z]")) {
            System.out.println("El formato es válido");

            numero= Integer.parseInt( DNI.substring(0,8) );

            letra=DNI.charAt(9);

            char[] letras ={'T', 'R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
            int resto;
            resto = numero%23;
            letrav = letras[resto];

            if (letrav==letra){
                System.out.println("Valido");
            }else {
                System.out.println("Letra no valida");
            }

        } else {
            System.out.println("El formato no es válido");
        }
    }
}
