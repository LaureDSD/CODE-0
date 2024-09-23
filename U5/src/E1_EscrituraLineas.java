import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class E1_EscrituraLineas {
    public static void main(String[] args) {
        try {
            BufferedWriter buffer = new BufferedWriter(
                    new FileWriter("documentos/nombre.txt")
            );
            buffer.write("Laureano\nDe Sousa\n");
            buffer.close();
        } catch (IOException e) {
            System.out.println("No se ha podido escribir en el fichero");
        }
    }
}
