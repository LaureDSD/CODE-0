package UD2.Tarea1;

import java.util.Scanner;

import static java.lang.System.out;

public class Bisiesto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int año;

        out.println("Indica un Año :");
        año = teclado.nextInt();
        // code

        if (año % 4 == 0 && año % 100 != 0) {
            System.out.println("Bisisesto");

        } else if (año % 4 == 0 && año % 100 == 0 && año % 100 == 0) {
            System.out.println("Bisiesto :");
        } else {
            System.out.println("No bisisesto");
        }
    }
}