package UD2.Tarea2;

import java.util.Scanner;

public class acumuladorcomparador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero,numero2,total, fallos;

        System.out.println("Introduce numero: ");
        numero = teclado.nextInt();
        fallos=0;
        total=0;
        do{
            System.out.println("Introduce numero: ");
            numero2 = teclado.nextInt();

            if (numero!=0) {
                total++;

                if (numero2 < numero) {
                    System.out.println("fallo es menor ");
                    fallos++;
                }
                numero=numero2;
            }
        }while(numero2!=0);
        fallos--;
        System.out.println("Total : "+total);
        System.out.println("Total fallos: "+fallos);
        }
    }