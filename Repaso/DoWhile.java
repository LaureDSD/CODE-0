package TEMA0;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class DoWhile {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(in);
//------------------------------------------------------------------------------------------------------------
        String VERDE = "\u001b[32m", AMARELO = "\u001b[33m", RESET = "\u001B[0m";
        System.out.println(VERDE + "texto con salto de linea\n y tabulaciones\t , para imprimir " +
                "barra invertida\\ o comillas doles\" " + RESET);
//------------------------------------------------------------------------------------------------------------
        byte Byte = 127;
        short Short =32767;
        int numero_entero = 2147483647;
        long numero_largo = 1234567890L;
        float numFloat = 3.1415f;
        double numDouble = 3.12345678901234567890;
        char letra = 'B';
        Boolean verdadero = true;
        String compuesto = "abc123";
//------------------------------------------------------------------------------------------------------------
        letra =  teclado.next().charAt(0);
        numero_entero= teclado.nextInt();
        compuesto =  teclado.next();

        Random aleatorios = new Random();
        int numerogenerado = aleatorios.nextInt(1,100);
        System.out.println(numerogenerado);
//------------------------------------------------------------------------------------------------------------
        System.out.println("Letra:"+ letra +"Entero"+ numero_entero +"Compuesto"+ compuesto);
//------------------------------------------------------------------------------------------------------------
        double numDouble2 = (double) numero_entero;
        numero_entero = (int) numDouble2;
//------------------------------------------------------------------------------------------------------------
        int numero_resto=100%1;
        System.out.println(numero_resto);
//------------------------------------------------------------------------------------------------------------
        numero_resto++;
        int numero_resto2 = numero_resto;
        System.out.println(numero_resto +" y "+ numero_resto2);
//------------------------------------------------------------------------------------------------------------
        ++numero_resto;
        int numero_resto3 = numero_resto;
        System.out.println(numero_resto  +" y "+  numero_resto3);
//------------------------------------------------------------------------------------------------------------
        if(numero_entero<0){
            System.out.println("negativo");
        }
//------------------------------------------------------------------------------------------------------------
        if(numero_entero<0){
            System.out.println("negativo");
        }else{
            System.out.println("mayor 0");
        }
//------------------------------------------------------------------------------------------------------------
        if(numero_entero<0){
            System.out.println("negativo");
        }else{
            if(numero_entero<10){
                System.out.println("menor a 10");
            }else{
                System.out.println("mayor a 10");
            }
        }
//------------------------------------------------------------------------------------------------------------
        if(numero_entero<0){
            System.out.println("negativo");
        }else if(numero_entero<10){
            System.out.println("menor a 10");
        }else{
            System.out.println("mayor a 10");
        }
//------------------------------------------------------------------------------------------------------------
        switch (numero_entero){
            case 1:
                System.out.println("numero entero 1");
                break;
            case 2:
                System.out.println("numero entero 2");
                break;
            default:
                System.out.println("Oro numero diferente a 1 y 2");
        }
//------------------------------------------------------------------------------------------------------------
        switch (numero_entero) {
            case 1 -> System.out.println("numero entero 1");
            case 2 -> System.out.println("numero entero 2");
            default -> System.out.println("Oro numero diferente a 1 y 2");
        }
//------------------------------------------------------------------------------------------------------------
        int sumanaturales=0;
        for (int z=0;z<10;z++) {
            System.out.println("suma primeros "+ z +" numeros naturales");
            sumanaturales=sumanaturales+z;
            z++;
        }
        System.out.println("Ultimo numero natural"+ sumanaturales);
//------------------------------------------------------------------------------------------------------------
        int suma=0;
        int i= 0;
        while(i<10){
            System.out.println("suma primeros "+ i +" numeros naturales");
            suma=suma+i;
            i++;
        }
        System.out.println("Ultimo numero natural"+ suma);
//------------------------------------------------------------------------------------------------------------
        int sumaprimerosnaturales=0;
        int x= 0;
        do{
            sumaprimerosnaturales=sumaprimerosnaturales +i;
            x++;
        }while (x < 10 && sumaprimerosnaturales < 100);{
            System.out.println("suma primeros "+ x +" numeros naturales");
        }
        System.out.println("Ultimo numero natural"+ sumaprimerosnaturales);
//------------------------------------------------------------------------------------------------------------
        String[] columnas;
        columnas = new String[0];

        String[][] filascolumnas;
        filascolumnas = new String[0][0];

        String[][][] filascolumnasfondo;
        filascolumnasfondo = new String[0][0][0];

        final int filas = 3, colums = 3;
        char[][] tableroPrueba ;
        tableroPrueba = new char[filas][colums];

        String[] letras={"A", "B"};
//------------------------------------------------------------------------------------------------------------
        int vehiculoId;
        String vehiculoTipo;

        System.out.println("introduce un numero del 1 al 3 si tu vehiculo es auto o del 4 al infinito si tu vehiculo es moto: ");
        Scanner pedir = new Scanner(System.in);
        vehiculoId = pedir.nextInt();

        vehiculoTipo = (vehiculoId <= 3) ? "opcion1" : "opcion2"
        vehiculoTipo = (vehiculoId <= 3) ?  (     (vehiculoId <= 1) ?  (      (vehiculoId == 0) ?  ("No existe"+pedir) :"Monociclo"    ) : "Moto") : "Coche" ;



        System.out.println(vehiculoTipo);
    }
}
