import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;

public class LecturaEscritura {

    String palabraBuscar ;
    String lineaEncontrada;

    public LecturaEscritura(String palabra) {
        palabraBuscar = palabra;
    }

    public void getPalabraFichero() {
        //Lectura y escritura:
        try {
            BufferedReader leer = new BufferedReader(new FileReader("src/palabrasextraer.txt"));
            String linea;
            while ((linea = leer.readLine()) != null) {

                if (linea.indexOf(palabraBuscar) != -1) {
                    lineaEncontrada = linea;
                }else{
                    lineaEncontrada = "";
                }
            }
            leer.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void setPalabraFichero() {
        //Lectura y escritura:
        try {
            BufferedWriter escribir = new BufferedWriter(new FileWriter("src/palabrasextraida.txt",true));
            escribir.write(palabraBuscar+": "+lineaEncontrada+"\n");
            escribir.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }



}


