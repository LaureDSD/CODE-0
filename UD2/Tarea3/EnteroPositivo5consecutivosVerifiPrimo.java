package UD2.Tarea3;

import java.util.Scanner;

public class EnteroPositivo5consecutivosVerifiPrimo {
    public static void main(String[] args) {
        //--------------------------------------------
        int numero,contador,a,b;
        boolean primo=true;
        //--------------------------------------------
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce Numero : ");
        numero = teclado.nextInt();
        //----------------bucle----------------------------
        b=0;
        while (b<5) {
        //-----------------Verificador Primo---------------------------
        a=2;
        primo=true;
        while (a <= Math.sqrt(numero)) {
            if (numero % a == 0) {

                primo=false;
            }
            a++;
        }
        //-------------------Validar-------------------------
            if (primo) {
                System.out.println(numero + " es primo.");
            } else {
                System.out.println(numero + " no es primo.");
            }
        //-------------------Numeros-------------------------
            numero=numero+1;
        //--------------------------------------------
            b++;
        }
    }
}
