package UD2.Tarea3;
import java.util.Scanner;
public class CajaFuerte {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contra, a, numero;
        contra=2323;
        a=0;
        while (a<4) {
            System.out.println("Introduce contraseña");
            numero = teclado.nextInt();
            if (contra==numero) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
               a=4;
            } else {
                System.out.println("Lo siento, esa no es la combinacion");
                a++;
            }
        }
    }
}
