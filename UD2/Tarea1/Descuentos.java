package UD2.Tarea1;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Descuentos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(in);
        int cantidad;
        float importe,total;
        int desconto;
        float descontado;
        int pizza = 8;
        out.println("Indica numero de pizzas: ");
        cantidad = teclado.nextInt();
       switch (cantidad){
           case 1:
               desconto = 0;
               break;
           case 2:
               desconto = 20;
               break;
           case 3:
               desconto = 25;
               break;
           case 4:
               desconto = 30;
               break;
           case 5:
               desconto = 35;
               break;
           default:
               desconto = 40;
       }
       total=pizza*cantidad;
       importe= total/100*(100-desconto);
       descontado = total-importe;

        System.out.println(" Precio total: "+ total + "Euros" );
        System.out.println(" Descuento aplicado: "+ desconto + "%" );
        System.out.println( " Total descuento: " + descontado + "Euros" );
        System.out.println( " Precio: " + importe + "Euros" );
    }
}