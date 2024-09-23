import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class E5_OrdenarPalabras {
    public static void main(String[] args) {
        try {
//ArrayList
            ArrayList<String> ordenar = new ArrayList<>();
//Creacion
            BufferedWriter bufferCrear = new BufferedWriter(
                    new FileWriter("documentos/palabras.txt")
            );
            bufferCrear.write("Laureano\nqwewqe\n");
            bufferCrear.write("sdsfds\nqsdwdas\n");
            bufferCrear.write("fesfsdv\nxcvzxvc\n");
            bufferCrear.write("jytjyt\nmhmvbnm\n");
            bufferCrear.write("afwqfwe\nñokjj\n");
            bufferCrear.write("qrefevd\npoioi\n");
            bufferCrear.close();
//Lectura
            BufferedReader bufferLeer = new BufferedReader(
                    new FileReader("documentos/palabras.txt"));
            String linea = bufferLeer.readLine();
            while (linea != null) {
                ordenar.add(linea);
                linea = bufferLeer.readLine();
            }
            bufferLeer.close();
//Guardado
            BufferedWriter bufferEscribir = new BufferedWriter(
                    new FileWriter("documentos/palabras_ordenado.txt")
            );
            Collections.sort(ordenar);
            for(String s: ordenar ){
                System.out.println(s);
                bufferEscribir.write(s+"\n");
            }
            bufferEscribir.close();
//Fallos
        } catch (FileNotFoundException e) {
            System.out.println("Error al acceder al fichero " + e);
        } catch (IOException e) {
            System.out.println("No se ha podido escribir en el fichero");
        } catch (Exception e) {
            System.out.println("Error al acceder al fichero " + e);
        }
    }
}
