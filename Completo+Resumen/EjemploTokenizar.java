
import java.util.Iterator;
import java.util.StringTokenizer;

public class EjemploTokenizar {
    public static void main(String[] args) {


        String texto = "Ola, ola, ola. Bo día. Que tal? Hasta mañá.";

        String[] algo = texto.split(",");

        StringTokenizer linea = new StringTokenizer(texto, " ,.?");

        while (linea.hasMoreTokens()) {
            String token = linea.nextToken();

            if (token.equals("ola")) {
                System.out.println("H" + token);

                linea.nextToken();
            }
            System.out.println("[" + token + "]");
        }
        System.out.println("\n");



    }
}
