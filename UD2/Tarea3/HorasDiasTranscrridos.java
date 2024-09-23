package UD2.Tarea3;

import java.util.Scanner;

public class HorasDiasTranscrridos {
    public static void main(String[] args) {
        //--------------------------------------------
        int hora1, hora2, dia1, dia2;
        //--------------------------------------------
        int horas, rango;
        horas = 0;
        //--------------------------------------------
        System.out.println();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Intrtoduce Dias: 1.lunes 2.Martes 3.Miercoles 4.Jueves 5.Viernes 6.Sabado 7.Domingo");
        System.out.println();
        //--------------------------------------------
        System.out.println("Intrtoduce Dia Inicio: ");
        dia1 = teclado.nextInt();
        System.out.println("Intrtoduce hora Inicio: ");
        hora1 = teclado.nextInt();
        System.out.println("Intrtoduce Dia Final: ");
        dia2 = teclado.nextInt();
        System.out.println("Intrtoduce hora Final: ");
        hora2 = teclado.nextInt();
        //--------------------------------------------

        rango = dia2 - dia1;
        //horas= ((24*rango)-hora1)+hora2;
        horas = (24 - hora1) + hora2 + (24 * (rango - 1));
        System.out.println("Horas transcurridas: " + horas);



        if (dia2 < dia1) {
            System.out.println("Introduce fecha valida");
        } else {
            rango = dia2 - dia1;
            //System.out.println("rango  " +rango);
            //--------------------------------------------
            if (rango<1) {
                horas = hora2 - hora1;
                //System.out.println("rango 0 :" + horas);
            }
            if (rango==1) {
                horas = (24 - hora1) + hora2;
                //System.out.println("rango 1 :" + horas);
            }
            if (rango>1) {
                horas = (24 - hora1) + hora2 + (24 * (rango - 1));
               //System.out.println("rango 2 :" + horas);
            }
            System.out.println("Horas transcurridas: " + horas);
        }

    }
}