package UD2.Tarea3;
import java.util.Scanner;
public class CotadorPositivoNefgativo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero,a,contadorP,contadorN;
        contadorP=0;
        contadorN=0;
        a=0;
        while (a<10) {
            System.out.println("Introduce Numero");
            numero = teclado.nextInt();
            if (numero<0) {
                contadorN++;
            }else{
                contadorP++;
            }
            a++;
        }
        System.out.println("Positivos: " +contadorP);
        System.out.println("Negativos: " +contadorN);
    }
}
