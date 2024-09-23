package UD1.Exercicio3;

import java.util.Scanner;

import static java.lang.System.out;

class CalculosMultiples {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float numero ;
        float numero2 ;
        double suma ;
        double resta ;
        double division ;
        double multiplicacion ;

        out.println("Indica numero1");
        numero = teclado.nextInt();
        out.println("Indica numero2");
        numero2 = teclado.nextInt();

        if (numero * numero2 == 0){
        out.println(" Es O");
        }else {
            suma = numero + numero2;
            resta = numero - numero2;
            division = numero * numero2;
            multiplicacion = numero % numero2;
            out.println("La suma es " + suma + "La resta es " + resta + "La division es " + division + "La multiplicacion es " + multiplicacion);
        }
    }
}