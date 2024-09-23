package UD2.Tarea6;

import java.util.Scanner;

public class E9_ReemplazarLetra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase,minus,compara,letrabuscada;
        String[] palabra;
        int contador=0;
        System.out.println("Introduce frase:");
        frase = teclado.nextLine();
        System.out.println("Introduce letra:");
        letrabuscada = teclado.nextLine();
//--------------------------------------------------------------------
        String frasemodificada =  frase.replace( letrabuscada, "¨¨");
        System.out.println("frase.replace"+frasemodificada);
//---------------------------------------------------------------------
        palabra = frase.split(" ");
        for(int f=0 ;f< palabra.length;f++){
            for (int c = 0; c < palabra[f].length(); c++) {
                compara=Character.toString( palabra[f].charAt(c));
                if (letrabuscada.equals(compara)) {
                    System.out.print("“”");
                    contador++;
                }else{
                    System.out.print(palabra[f].charAt(c));
                }
            }
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("Hay ["+contador+"] letras ["+letrabuscada+"]");
    }
}
