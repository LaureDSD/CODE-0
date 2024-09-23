import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Trivial {

    RandomList<Pregunta> preguntas;
    int aciertos;
    int fallos;

    public Trivial() {
    }

    public Trivial(String fichero) throws Exception  {
        preguntas = new RandomList<>();
        lecturaFichero(fichero);
    }

    //Leer fichero
    private void lecturaFichero(String fichero) throws Exception {
        try {
            BufferedReader buffer = new BufferedReader(
                    new FileReader("src/Recursos/" + fichero + ".txt")
            );

            String linea;
            String p = null;
            boolean pregunta = true;

            while ((linea = buffer.readLine()) != null) {
                p = linea;
                linea = buffer.readLine();
                preguntas.add(new Pregunta(p, linea));
            }

            buffer.close();

        } catch (FileNotFoundException e) {
            throw new TriviaException("Error de lectura: " + e);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    boolean addPregunta (Pregunta p){
          return  preguntas.add(p);
    }

    //Pedir pregunta
    Pregunta getPregunta () throws RandomListException {
        return  preguntas.get();
    }
}
