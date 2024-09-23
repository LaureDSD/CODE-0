package UD2.Tarea4;

import java.util.Scanner;

public class E4_Suma20PositivosNegativos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, suma = 0, resta = 0;

//----------------------Inicio array-----------------------------

        int[] almacen;
        almacen = new int[20];

//-----------------------Introducir datos-----------------------------------------

        int vezes = 0;
        while (vezes <= 19) {
            System.out.println("Introduce numero");
            numero = teclado.nextInt();
            almacen[vezes] = numero;
            vezes++;
        }

//---------------------------Suma de datos de array----------------------------------

        for (int x = 0; x < almacen.length; x++) {
            if (almacen[x] > 0) {
                suma = suma + almacen[x];
            } else {
                resta = resta + almacen[x];
            }
        }

//----------------------------Mostrar array---------------------------------

        System.out.print("Numeros usados:  ");
        for (int i = 0; i < almacen.length; i++) {
            System.out.print(almacen[i] + " ");
            }

//-----------------------Resultados--------------------------------------

        System.out.println();
            System.out.println("Total suma positivos:  " +  suma);
            System.out.println("Total suma egativos:  " +  resta);
    }
}
