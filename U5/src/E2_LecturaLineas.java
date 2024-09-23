import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class E2_LecturaLineas {
    public static void main(String[] args) {
        try {
            BufferedReader buffer = new BufferedReader(
                    new FileReader("documentos/nombre.txt")
            );
            String linea = buffer.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = buffer.readLine();
            }
            buffer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error al acceder al fichero " + e);
        } catch (IOException e) {
            System.out.println("No se ha podido escribir en el fichero");
        } catch (Exception e) {
            System.out.println("Error al acceder al fichero " + e);
        }
    }
}

