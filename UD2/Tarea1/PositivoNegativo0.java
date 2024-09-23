package UD2.Tarea1;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class PositivoNegativo0 {

        public static void main(String[] args) {
            Scanner teclado = new Scanner(in);
            int numero;

            out.println("Indica numero : ");
            numero = teclado.nextInt();

            if (numero == 0) {
                out.println("Es 0 ");
            }
            else if (numero >= 0) {
                out.println("Es positivo : " + numero);
            }else{
                out.println("Es negativo : " + numero);
            }
        }
    }