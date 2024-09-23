package UD2.Tarea6;

import java.util.Scanner;

public class E15_CuentaPalabras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String Frase;
        String[] palabras;

        System.out.println("Introduce DNI (12345678-A):");
        Frase = teclado.nextLine();

        Frase = Frase.trim();


        //if (Frase.split("  ").length=0){
        //    System.out.println("Escribe 1 espacio maximo");
       // }else{
        //    System.out.println("Numero depalabras: "+Frase.split(" ").length+1);
        //}




        palabras = Frase.split(" ");
        System.out.println("Numero de palabras: "+palabras.length);

        System.out.println(Frase.split("\\s\\s") .length);
        System.out.println(Frase);

    }
}
