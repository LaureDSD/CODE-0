import java.io.IOException;
import java.util.Scanner;

public class JuegoTrivial {
    public static void main(String[] args) {

        try {

            Trivial juego = new Trivial("Trivial");
            Scanner teclado = new Scanner(System.in);

            while(true) {

                Pregunta p = juego.getPregunta();
                    System.out.println("Pregunta: " + p.pregunta);
                    teclado.nextLine();
                    System.out.println("Respuesta: " + p.respuesta);

            }


        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
