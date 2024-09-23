package UD2.Tarea3;
import java.util.Scanner;
public class MuestraCuentaSumaMultiplos3 {
    public static void main(String[] args) {
        int numero, contador, acumulador,acumulador2;
        acumulador = 1;
        acumulador2=0;
        contador=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Intrtoduce numero");
        numero = teclado.nextInt();
        while (acumulador<=numero) {
            System.out.println("Numero :" +acumulador);
            acumulador2=acumulador2+acumulador;
            acumulador=acumulador+2;
            contador++;
        }
        System.out.println("Cantidad :" +contador);
        System.out.println("Suma :" +acumulador2);
    }
}