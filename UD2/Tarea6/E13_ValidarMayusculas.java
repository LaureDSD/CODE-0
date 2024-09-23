package UD2.Tarea6;

import java.util.Scanner;


public class E13_ValidarMayusculas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombrecompleto;
        String[] dato;
        dato = new String[3];
        String[] guardar;
        guardar = new String[3];
        Boolean respuesta = true;
        System.out.println("Introduce Nombre:");
        dato[0] = teclado.nextLine();
        System.out.println("Introduce Apellido1:");
        dato[1] = teclado.nextLine();
        System.out.println("Introduce Apellido2:");
        dato[2] = teclado.nextLine();
        for (int b=0 ; b<3; b++){
            guardar[b] = dato[b].substring(0,1);
            guardar[b] = guardar[b].toUpperCase();
            if (!guardar[b].equals(dato[b].substring(0,1))){
            respuesta=false;
            }
        }
        nombrecompleto = dato[0]+" "+dato[1]+" "+dato[2];
        System.out.println(nombrecompleto);
        if (respuesta) {
            System.out.println("Tiene mayusculas iniciales");
        }else{
            System.out.println("Revise, no tiene mayusculas iniciales");
        }
    }
}
