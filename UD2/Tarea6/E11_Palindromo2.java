package UD2.Tarea6;

import java.util.Scanner;

public class E11_Palindromo2 {
    public static void main(String[] args) {

    String frase;
    Boolean respuesta= true;
    Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce frase:");
    frase = teclado.nextLine();
    frase =  frase.replace( " " , "");
        System.out.println(frase);
    int continvert =frase.length();
    continvert--;
    int i=0;
    while (i!=continvert && i<continvert){
        if (frase.charAt(i)!=frase.charAt(continvert)){
            respuesta=false;
        }
            i++;
            continvert--;
        }
        if (respuesta) {
        System.out.println("Es palindromo");
        }else{
        System.out.println("No es palindromo");
        }
    }
}
