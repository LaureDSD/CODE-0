package UD2.Tarea6;

import java.util.Scanner;

public class E7_CuentaPlabras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;
        String[] palabra;
        System.out.println("Introduce frase:");
        frase = teclado.nextLine();
        char ultimo='*';
        int numpalabras=1;


       // for (int f = 0; f < frase.length(); f++) {
       //     if (' ' == frase.charAt(f) && ultimo!='*') {
        //        numpalabras++;
       //     }
       //     ultimo=frase.charAt(f);
       // }

        frase = frase.trim();
        for (int f = 0; f < frase.length(); f++) {
            if (frase.startsWith(" ")) {
                numpalabras++;
            }
        }

        palabra = frase.split(" ");
        System.out.println("Split"+palabra.length);
        for(int f=0 ;f< palabra.length;f++){
            System.out.println(palabra[f]);
        }

        //*numpalabras=1;
        //for (int f = 0; f < frase.length(); f++) {
            //if (' ' == frase.charAt(f)) {
          //      numpalabras++;
        //    }
        //}

        System.out.println("La frase tiene " + numpalabras +" palabras");
    }
}
