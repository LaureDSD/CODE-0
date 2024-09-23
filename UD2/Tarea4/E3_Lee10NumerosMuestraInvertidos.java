package UD2.Tarea4;

import java.util.Scanner;

public class E3_Lee10NumerosMuestraInvertidos {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;
//---------------------------------------------------
        int[] invertir;
        invertir = new int [10];
//----------------------------------------------------
        int vezes=10;
        while (vezes>0) {
            System.out.println("Introduce numero");
            numero = teclado.nextInt();
            vezes--;
            invertir[vezes] = numero;
        }
        for(int i=0; i<invertir.length; i++){
            System.out.print(invertir[i]+ " ");
        }
    }
}