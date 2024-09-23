package UD2.Tarea4;

import java.util.Scanner;

public class E8_RangoPaQ {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int p, q, vezes,rango,mayor,menor;

        System.out.println("Introduce Numero");
        p = teclado.nextInt();

        System.out.println("Introduce Numero");
        q = teclado.nextInt();
//--------------------------Comprobador----------------------------
        if (p>q) {
            mayor=p;
            menor=q;
        }else{
            mayor=q;
            menor=p;
        }
        rango=mayor-menor;
//---------------------------Array------------------------------
        rango--;
        int[] guardar;
        guardar = new int[rango];

        vezes = 0;
        while (vezes < rango) {
            menor=menor+1;
            guardar[vezes] = menor;
            vezes++;
//---------------------------Resultado----------------------------------
        }
        for (int i = 0; i < guardar.length; i++) {
            System.out.print(guardar[i] + " ");
        }
    }
}
