package UD2.Tarea6;

import java.util.Scanner;

public class E5_Invertir {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;
        int largo;
        System.out.println("Introduce frase:");
        frase = teclado.nextLine();
        largo = frase.length();
        char[][] invertir;
        invertir = new char[1][largo];
        //Guardar
        for (int b=0;b<largo;b++){
            invertir[0][b]=frase.charAt(b);
        }
        //Mostrar
        for (int l=largo-1;l>=0;l--){
            System.out.print(invertir[0][l]);
        }
    }
}
