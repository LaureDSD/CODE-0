package UD2.Tarea8;

import java.util.Random;
import java.util.Scanner;

public class Metodos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //variables
        String texto , dni = null;
        int[] array = new int[5];
        int x, y,mayor=0,parteNumerica,z,numero,mayormatriz;
        char letra;
        boolean difrentes;


        //pide texto
        System.out.println("Texto escrito");
        texto=teclado.nextLine();
        //pide numero
        System.out.println("Introduce numero");
        numero= teclado.nextInt();

        //pide numero x/y
        System.out.println("Introduce numero x");
        x= teclado.nextInt();
        System.out.println("Introduce numero y");
        y= teclado.nextInt();
        System.out.println("Introduce numero z");
        z= teclado.nextInt();

        //pide dni
        System.out.println("Introduce numero DNI");
        parteNumerica= teclado.nextInt();
        teclado.nextLine();

        System.out.println("Introduce letra");
        letra= teclado.nextLine().toUpperCase().charAt(0);

        System.out.println("-----------------mostrar texto mayusculas------------------");

        //mostrar texto mayusculas
       mostrarTextoMayúsculas(texto);
        System.out.println(texto);

        System.out.println("-----------------mostrar valor absoluto------------------");

        //mostrar valor absoluto
        mostrarValorAbsoluto(numero);
        System.out.println(numero);

        System.out.println("-----------------Numeros aleatorios------------------");

        //Numeros aleatorios
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]);
        }
        System.out.println();
        rellenarArray(array);
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]);
        }
        System.out.println();

        System.out.println("-----------------mayor de numeros void------------------");
        //mayor de numeros
        mostrarMayor(x,y);
        System.out.println(mayor);

        System.out.println("-----------------mostrar dni------------------");
        //mostrar dni
        mostrarDNI(parteNumerica, letra);
        System.out.println(dni);

        System.out.println("-----------------mayor de numeros int------------------");
        //mayor de numeros
        mayor=calcularMayor(x,y);
        System.out.println(mayor);


        System.out.println("-----------------formar dni------------------");
        //regresar dni
        dni=formarDNI(parteNumerica, letra);
        System.out.println(dni);

        System.out.println("-----------------numeros diferentes boolean------------------");
        // numeros difrentes
        System.out.println(sonDiferentes(x,y,z));
        difrentes = sonDiferentes(x,y,z);
        System.out.println(difrentes);


        System.out.println("-----------------mayor de numeros int matriz------------------");
        //mayor de numeros
        rellenarArray(array);
        mayormatriz=buscarMayor(array);
        System.out.println(mayormatriz);

    }

//Metodo devuelve escribe mayusculas pero no cambia
    public static void mostrarTextoMayúsculas(String texto){
        System.out.println(texto.toUpperCase());
    }

//metodo devuelve numero positivo
    public static void mostrarValorAbsoluto(int numero){
        numero=Math.abs(numero);
        System.out.println(numero);
    }

//metodo devuelve array con numeros random
    public static void rellenarArray(int[] array){
        Random aleatorios = new Random();
        for(int i=0;i<array.length;i++){
            array[i]= aleatorios.nextInt(0,100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

//metodo muestra mayor
    public static void mostrarMayor(int x, int y) {
        int mayor;
        if (x>y){
            mayor=x;
        }else{
            mayor=y;
        }
        System.out.println(mayor);
    }

    //metodo muestra DNI
    public static void mostrarDNI(int parteNumerica, char letra) {

        System.out.println(parteNumerica + "" + letra);
    }

   //metodo primera mayus

    public static String convertirPrimeraLetraMayusculas(String texto){
    String primeraLetra = texto.substring(0,1).toUpperCase();
    String resto = texto.substring(1);
    texto=primeraLetra.concat(resto);
    return texto;
    }


    //metodo return mayor
    public static int calcularMayor(int x, int y) {
        int mayor;
        if (x>y){
            mayor=x;
        }else{
            mayor=y;
        }
        return mayor;
    }

    //metodo muestra DNI
    public static String formarDNI(int parteNumerica, char letra) {
        String dni = parteNumerica + "-" + letra;
        return dni;
    }

    public static boolean sonDiferentes(int x, int y, int z){

        if(x!=y && x!=z && y!=z){
            return true;
        }else{
            return false;
        }
    }

    public static int buscarMayor(int[] array){
        int mayor=0;
        for(int i=0;i< array.length;i++){
            if (array[i]>mayor){
                mayor=array[i];
            }
        }
        return mayor;
    }

}

