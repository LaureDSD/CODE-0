import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        Random aleatorio = new Random();
        PiramideAsteriscos piramidea = new PiramideAsteriscos(aleatorio.nextInt(1,20));
        piramidea.imprimir();

        int altura = teclado.nextInt();
        PiramideAsteriscos piramide = new PiramideAsteriscos(altura);
        piramide.imprimir();


        piramidea.aumentaraltura(3);
        piramidea.imprimir();

        piramide.aumentaraltura(3);
        piramide.imprimir();

    }
}