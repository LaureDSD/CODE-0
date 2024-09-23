package UD2.Tarea4;

import java.util.Scanner;

public class E5_Array7cadenas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
//-----------------------------------------------------------
        String[] diasSemana;
        diasSemana = new String[7];
        diasSemana[0] = "Lunes";
        diasSemana[1] = "Martes";
        diasSemana[2] = "Miercoles";
        diasSemana[3] = "Jueves";
        diasSemana[4] = "Viernes";
        diasSemana[5] = "Savado";
        diasSemana[6] = "Domingo";
//----------------------------------------------------------
        System.out.println("Indica numero para saber el dia: ");
        numero = teclado.nextInt();
        System.out.println(diasSemana[numero]);
    }
}

