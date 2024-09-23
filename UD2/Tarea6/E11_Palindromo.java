package UD2.Tarea6;

import java.util.Scanner;

public class E11_Palindromo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String frase;
        String [][] letras;
        int espacios=0,posi=0,posi2=0;
        boolean respuesta = true;
        System.out.println("Introduce frase:");
        frase = teclado.nextLine();
        letras = new String[2][frase.length()];
        posi2=frase.length();

        for (int c = 0; c < frase.length(); c++) {
            if (' ' != frase.charAt(c)) {
                letras[0][posi] = String.valueOf(frase.charAt(c));
                posi++;
                posi2--;
                letras[1][c] = String.valueOf(frase.charAt(posi2));
            }
        }

        for (int f = 0; f < letras.length; f++) {
            if (letras[0][f].equalsIgnoreCase(letras[1][f])){
            }else{
                respuesta=false;
            }
        }

        if (respuesta){
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }
    }
}
