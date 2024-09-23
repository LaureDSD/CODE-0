import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class E6_NotaMedia {
    public static void main(String[] args) throws IOException {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        try{
        //Lectura
        BufferedReader bufferLeer = new BufferedReader(
                new FileReader("documentos/alumnos_notas.txt"));
        String linea = bufferLeer.readLine();
        String[] texto;
        while (linea != null) {
            texto = linea.split(" ");
            Alumno nuevoalumno = new Alumno(texto[0],texto[1]) ;
            for(int i=2;i< texto.length;i++){
                int nota = Integer.parseInt(texto[i]);
                nuevoalumno.añadirNota(nota);
            }
            alumnos.add(nuevoalumno);
            linea = bufferLeer.readLine();
        }
        bufferLeer.close();
            Collections.sort(alumnos);
        for (Alumno a : alumnos){
            System.out.println(a);
        }
        } catch (FileNotFoundException e) {
            System.out.println("Error al acceder al fichero " + e);
        } catch (IOException e) {
            System.out.println("No se ha podido escribir en el fichero");
        } catch (Exception e) {
            System.out.println("Error al acceder al fichero " + e);
        }
    }
}
