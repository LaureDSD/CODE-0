package UD2.Tarea6;

import java.util.Scanner;

public class E2_ComparaStrings {
        //--------------------------------------------------------------------------------
        public static void main(String[] args) {
            String palabra,palabra2;
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce palabra:");
            palabra = teclado.nextLine();
            System.out.println("Introduce palabra:");
            palabra2 = teclado.nextLine();
            comparador(palabra,palabra2);
        }
        //--------------------------------------------------------------------------------
        private static void comparador(String palabra ,String palabra2) {
            if (palabra.length()==palabra2.length()) {
                System.out.println("Miden lo mismo");
            }else{
                System.out.println("Miden lo distinto");
            }
        }
//--------------------------------------------------------------------------------
    }
