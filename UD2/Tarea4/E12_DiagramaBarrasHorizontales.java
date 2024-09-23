package UD2.Tarea4;

import java.util.Scanner;

import static java.lang.System.out;

public class E12_DiagramaBarrasHorizontales {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//---------------------------------------------------------------
        int tmpm,año, tamaño=12;
        String[] mes ={"Enero     ", "Febrero   ","Marzo     ","Abril     ","Mayo      ","Junio     ","Julio     ","Agosto    ","Septiembre","Octubre   ","Noviembre ","Diciembre "};
//---------------------------------------------------------------
        out.println("Indique Ano: ");
        año = teclado.nextInt();
        out.println();
        out.println("Ano: "+año);
//---------------------------------------------------------------
        int[] temperatura;
        temperatura = new int[tamaño];
//---------------------------------------------------------------
        for (int recorrer=0 ; recorrer<tamaño ; recorrer++ ) {
//-----------------------------------------------------------------
            out.println("Mes: " + mes[recorrer]);
           out.println("Temperatura media : ");
           tmpm = teclado.nextInt();
           temperatura[recorrer] = tmpm;
       }
//-----------------------------------------------------------------
        out.println("-----------");
        out.println("Ano: "+año);
        out.println("-----------");
        for (int i = 0; i < mes.length; i++) {
            System.out.print(mes[i] + "|");
            for (int b = 0; b < temperatura[i]; b++){
                System.out.print("*");
            }
            out.println();
        }
        out.println();
    }
}
