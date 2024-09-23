package UD2.Tarea2;
import java.util.Scanner;

public class AcumuladorMayor {
    //-------------------------------------------------------
    public static void main(String[] args) {
        int numero;
        int acumulador;
        System.out.println("Dime numero inicial: ");
        Scanner teclado = new Scanner(System.in);
        acumulador = teclado.nextInt();
        int contador = 0;
        int fallo = 0;

        for (int limitador = 6; fallo < limitador; contador++) {

        //for (int limitador = 6; contador < limitador; contador++) {
            // System.out.println("-----------------"+acumulador + " test---------------");

            System.out.println("Dime numero: ");
            numero = teclado.nextInt();
            if (numero > acumulador) {
                acumulador=numero;
            } else {
                    System.out.println("Fail");
                    acumulador=0;
                    fallo++;
                }
            }
        System.out.println(" Total de numeros " + contador);
        System.out.println("Fallos " + fallo );
        }
    }




