package UD2.Tarea1;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Meses {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(in);
        int numero;

        out.println("Indica numero del mes: ");
        numero = teclado.nextInt();

        if (numero == 1) {
            out.println("Enero");
        } else if (numero == 2) {
            out.println("Febrero");
        } else if (numero == 3) {
            out.println("Marzo");
        } else if (numero == 4) {
            out.println("Abril");
        } else if (numero == 5) {
            out.println("Mayo");
        } else if (numero == 6) {
            out.println("Junio");
        } else if (numero == 7) {
            out.println("Julio");
        } else if (numero == 8) {
            out.println("Agosto");
        } else if (numero == 9) {
            out.println("Septiembre");
        } else if (numero == 10) {
            out.println("Octubre");
        } else if (numero == 11) {
            out.println("Noviembre");
        } else if (numero == 12) {
            out.println("Diciembre");
        } else {
            out.println("Solo hay 12 meses");
        }
    }
}