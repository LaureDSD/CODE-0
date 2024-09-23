package UD2.Tarea3;

import java.util.Scanner;

public class Primosde2a100 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, contador,limitador;
       boolean primo = true;
        contador = 2;
        limitador=3;
      while (limitador <= 100) {
            limitador++;
            contador++;
            primo = true;
            a = 2;
         while (a <= Math.sqrt(contador)) {
                if (contador % a == 0) {
                    primo = false;
                }
                a++;
            }
           if (primo) {
                System.out.println("count  "+contador);
            }
        }
    }
}