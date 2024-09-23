package UD2.Tarea6;

import java.util.Scanner;

public class E17_Comparador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] letras={"A", "B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String frase;

        System.out.println("Frase:");
        frase = teclado.nextLine();

        frase=frase.toUpperCase();
        for(int LetCom=0;LetCom<frase.length();LetCom++) {
            for( int Compar=0;Compar< letras.length;Compar++){
                String letr = String.valueOf(frase.charAt(LetCom));
                if (letr.equals(letras[Compar])){
                    letras[Compar]="";
                }
            }
        }
        System.out.println("Letras no usadas: ");
        for (String letra : letras) {
            if (!letra.equals("")) {
                System.out.print(" " + letra);
            }
        }
        System.out.println();
    }
}
