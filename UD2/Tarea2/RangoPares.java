package UD2.Tarea2;

import java.util.Scanner;

public class RangoPares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int inicio,fin;

        System.out.print("Dime un numero menor : ");
        inicio = teclado.nextInt();

        System.out.print("Dime un numero mayor : ");
        fin = teclado.nextInt();

        int pares = 0;


        while (inicio < fin) {
            if (inicio % 2 == 0) {
                pares++;
            }else{
            }
            System.out.print(""+ inicio);
            inicio++;
        }
        System.out.println("");
        System.out.println("Cantidad de pares"+ pares);
    }
}