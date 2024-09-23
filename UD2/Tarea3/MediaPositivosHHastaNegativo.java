
package UD2.Tarea3;
import java.util.Scanner;
public class MediaPositivosHHastaNegativo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float numero,acumulador,contador,media,cierre;
        contador=0;
        acumulador=0;
        cierre=0;
        System.out.print("Introduce ");
        while (cierre<1) {
            System.out.println("Numero");
            numero = teclado.nextInt();
            if (numero<0) {
                media = acumulador / contador ;
                System.out.println("Suma total: "+acumulador+ "/ Numeros introducidos: " +contador+ " = Media : " + media);
                cierre=1;
            }else{
                System.out.print("Introduce nuevo ");
            }
            acumulador=acumulador+numero;
            contador++;
        }
    }
}