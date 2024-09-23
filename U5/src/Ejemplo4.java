import java.io.File;
import java.util.Scanner;
public class Ejemplo4 {
    public static final int NUM_VALORES = 10;
    public static void main(String[] args) {
        try {
// Intentamos abrir el fichero
            File f = new File("enteros.txt");
            Scanner lector = new Scanner(f);
            int valor;
// Si llega aquí es que ha abierto el fichero :)
// leemos 10 enteros y los mostramos en pantalla
            for (int i = 0; i < NUM_VALORES; i++) {
                valor = lector.nextInt();
                System.out.println("El valor leído es: " + valor);
            }
// ¡Hay que cerrar el fichero!
            lector.close();
        } catch (Exception e) {
// En caso de error (excepción) mostramos el error
            System.out.println("Error: " + e);
        }
    }
}