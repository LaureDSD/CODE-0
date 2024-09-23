package UD2.Tarea3;
import java.util.Scanner;
public class Tablasmultiplicar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero,resultado,a;
        System.out.println("Introduce numero");
        numero = teclado.nextInt();
        a=0;
        while (a<10) {
            a++;
            resultado=numero*a;
            System.out.println(numero+ "*" +a+ "=" +resultado);
        }
    }
}

