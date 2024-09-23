package UD2.Tarea2;
import java.util.Scanner;
public class Numerosprimos {
    //-------------------------------------------------------
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, a;
        boolean primo = true;
        System.out.println("Introduce numero: ");
        numero = teclado.nextInt();


        //-------------------------------------------------------

        //for (int a = 10; a <= Math.sqrt(numero); a++) {
        //  if (numero % a == 0) {
        //    primo = false;
        // }
        // }

        //-------------------------------------------------------
        a=2;
        while (a <= Math.sqrt(numero)) {
            if (numero % a == 0) {
                a++;
                primo = false;
            }
        }


        //----------------------------------------------------------------
        if (primo) {
            System.out.println(numero + " es primo.");
        } else {
            System.out.println(numero + " no es primo.");
        }
    }
}
