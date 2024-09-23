package UD2.Tarea4;

import java.util.Scanner;

public class E6_MaximoMinimoArray {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero=0;
        int mayor=0;
        int menor=0;

//------------------------Array-----------------------------------

        int[] mayormenor;
        mayormenor = new int[10];

//---------------------------Pedir numeros-------------------------------

        int vezes = 0;
        while (vezes <= 9) {
            System.out.println("Introduce numero");
            numero = teclado.nextInt();
            mayormenor[vezes] = numero;
            vezes++;

            if (numero>=menor) {
                menor=numero;
            }
        }


//-----------------------------------------------------------

        for (int x = 0; x < mayormenor.length; x++) {
            if (mayormenor[x]<=menor)  {
                menor=mayormenor[x];
            }
            if (mayormenor[x]>=mayor) {
                mayor=mayormenor[x];
            }
        }

//-----------------------Resultados--------------------------------------
        System.out.print("Numeros usados:  ");
        for (int i = 0; i < mayormenor.length; i++) {
            System.out.print(mayormenor[i] + " ");
        }
        System.out.println();
        System.out.println("Mayor:  " +  mayor);
        System.out.println("Menor:  " +  menor);

    }
}
