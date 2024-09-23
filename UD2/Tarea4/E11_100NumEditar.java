package UD2.Tarea4;

import java.util.Scanner;

import static java.lang.System.out;

public class E11_100NumEditar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//---------------------------------------------------------------
        int aleatorio, a, b, cambiar, sustituto;
//---------------------------num---------------------------------
        int[] numeros;
        numeros = new int[100];
        a = 0;
        while (a < 100) {
            aleatorio = (int) (Math.random() * 20);
            numeros[a] = aleatorio;
            a++;
        }
//-----------------------------------------------------------------
        out.println();
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        out.println();
        b = 0;
        while (b < 1) {
            out.println("Numero a cambiar : ");
            cambiar = teclado.nextInt();
            out.println("Sustitito: ");
            sustituto = teclado.nextInt();
//--------------------------------------------------------------------
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i]==cambiar){
                    numeros[i]=sustituto;
                    out.print("\""+numeros[i]+"\" ");
                }else {
                    out.print(numeros[i]+" ");
                }
            }
//-----------------------------------------------------------------------
            out.println();
        }
    }
}
