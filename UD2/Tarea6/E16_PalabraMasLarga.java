package UD2.Tarea6;

import java.util.Scanner;

public class E16_PalabraMasLarga {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String Frase,mayor="";
        String[] palabras;
        int largo=0;
        System.out.println("Frase:");
        Frase = teclado.nextLine();
        Frase = Frase.trim();
        palabras = Frase.split("\\s+");
        for (int i=0;i<palabras.length;i++) {
            if (palabras[i].length()>mayor.length()){
                mayor=palabras[i];
            }
        }
        largo=mayor.length();
        System.out.println("La mas larga es ["+mayor+"] con ["+largo+"] caracteres.");
    }
}
