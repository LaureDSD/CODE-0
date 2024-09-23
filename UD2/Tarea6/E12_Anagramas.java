package UD2.Tarea6;

import java.util.Arrays;
import java.util.Scanner;

public class E12_Anagramas {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        String frase , frase2;
        Boolean respuesta;

        System.out.println("Introduce frase:");
        frase = teclado.nextLine();
        System.out.println("Introduce frase:");
        frase2 = teclado.nextLine();

        char[] fraseordenada;
        fraseordenada = frase.toCharArray();
        char[] fraseordenada2;
        fraseordenada2 = frase2.toCharArray();

        Arrays.sort(fraseordenada);
        Arrays.sort(fraseordenada2);
        respuesta= new String(fraseordenada).equalsIgnoreCase(new String(fraseordenada2));

        if (respuesta) {
            System.out.println("Es anagrama");
        }else{
            System.out.println("Es palindromo");
        }
    }
}
