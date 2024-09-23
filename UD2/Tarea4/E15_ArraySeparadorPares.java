package UD2.Tarea4;

public class E15_ArraySeparadorPares {

    public static void main(String[] args) {

//---------------------------------------------------------------
        int a;
        int acumuladorp;
        int auxiliarimp=0;
        int posicion=0;
        int aleatorio;
        int par;
        int impar,continuar;
//---------------------------array---------------------------------
        int[] numeros;
        numeros = new int[20];
        a = 0;
        while (a < 20) {
            aleatorio = (int) (Math.random()*10);
            numeros[a] = aleatorio;
            a++;
        }
//-------------------------------mostrar--------------------------------
        System.out.println("Desordenado:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
//---------------------------array_aux---------------------------------
        int[] auxiliar;
        auxiliar = new int[20];
//--------------------------------Separar-------------------------------
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%2==0) {
                numeros[posicion]=numeros[i];
                //System.out.println(numeros[i]);
                posicion++;
            }else{
                auxiliar[auxiliarimp]=numeros[i];
                //System.out.println(numeros[i]);
                auxiliarimp++;
            }
        }
//---------------------------------Escriir------------------------------
        for (int i = 0; i < auxiliarimp; i++) {
           numeros[posicion]=auxiliar[i];
           posicion++;
        }
//-------------------------------mostrar--------------------------------
        System.out.println("ParToImpar");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
