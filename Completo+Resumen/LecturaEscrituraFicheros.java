import java.io.*;
import java.util.List;

public class LecturaEscrituraFicheros {

    public static void main(String[] args) {
// Lectura de un fichero de texto
// Lee todas sus líneas y las muestra en pantalla
        try {
// Creamos el buffer de lectura
            BufferedReader buffer = new BufferedReader(
                    new FileReader("fichero.txt")
            );
// Leemos la primera línea del fichero
            String linea = buffer.readLine();
// Mientras la línea no sea nula (no se acabe el fichero)
            while (linea != null) {
// La mostramos en pantalla y leemos la siguiente
                System.out.println(linea);
                linea = buffer.readLine();
            }
// Cerramos el fichero
            buffer.close();
        } catch (Exception e) {
            System.out.println("Error al acceder al fichero " + e);
        }


        // Lectura de un fichero de texto que contiene varios números
// Un número por línea
// Calcula y visualiza la media de esos números.
        String linea;
        int numLineas = 0;
        double suma = 0;
        try {
// Abrimos el buffer de lectura
            BufferedReader buffer = new BufferedReader(
                    new FileReader("numeros.txt")

            );
// Leemos la primera línea del fichero
            linea = buffer.readLine();
// Mientras la línea no sea nula (no se acabe el fichero)
            while (linea != null) {
// Contamos una línea
                numLineas++;
// Obtenemos el número de la línea y lo sumamos a suma
                suma += Double.parseDouble(linea);
// Leemos la siguiente línea
                linea = buffer.readLine();
            }
// Cerramos el buffer
            buffer.close();
// Calculamos y mostramos la media
            System.out.println("La media es " + (double) suma / numLineas);
        } catch (
                Exception e) {
            System.out.println("Error al acceder al fichero: " + e);
        }

    }
}
