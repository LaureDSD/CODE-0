package UD2.Tarea1;

import java.util.Scanner;

import static java.lang.System.*;

public class MenorDeDosNumeros {
public static void main(String[] args) {
        Scanner teclado = new Scanner(in);
        int numero ;
        int numero2;

        out.println("Indica numero1");
        numero = teclado.nextInt();
        out.println("Indica numero2");
        numero2 = teclado.nextInt();

        if( numero <= numero2) {
        out.println("Es menor ="+ numero);
        }else{
        out.println("Es menor ="+ numero2);
        }
        }
        }
