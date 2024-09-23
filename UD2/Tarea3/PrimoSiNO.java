package UD2.Tarea3;
import java.util.Scanner;
public class PrimoSiNO {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, a;
        boolean primo = true;
        System.out.println("Introduce numero: ");
        numero = teclado.nextInt();
        //----------------------------------------------------------------


            a=2;
            while (a <= Math.sqrt(numero)) {
                if (numero % a == 0) {

                    primo=false;
                }
                a++;
            }


        //----------------------------------------------------------------
        if (primo) {
            System.out.println(numero + " es primo.");
        } else {
            System.out.println(numero + " no es primo.");
        }
    }
}
