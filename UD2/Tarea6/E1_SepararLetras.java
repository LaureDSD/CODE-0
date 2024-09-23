package UD2.Tarea6;
import java.util.Scanner;
public class E1_SepararLetras {
//--------------------------------------------------------------------------------
    public static void main(String[] args) {
        String palabra;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce palabra:");
        palabra = teclado.nextLine();
        letraPorLinea(palabra);
    }
//--------------------------------------------------------------------------------
private static void letraPorLinea(String palabra) {
int largo;
    largo=palabra.length();
        for (int f = 0; f < largo; f++) {
        System.out.println();
        System.out.print(palabra.charAt(f));
    }
}
//--------------------------------------------------------------------------------
}
