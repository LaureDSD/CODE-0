package UD2.Tarea2;
import java.util.Scanner;
public class Multiplos3Limitado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 3;
        int limitador;
        System.out.println("Cantidad de multiplos : ");
        limitador = teclado.nextInt();
        limitador=limitador+1;
        System.out.println("1");
        while (numero<=limitador) {
            System.out.println( numero );
            numero+=3;
        }
    }
}
