import java.io.*;
import java.util.*;

public class E9_Estadisticas {
    public static void main(String[] args) {
        try{
            HashMap<String, Integer> mapa = new HashMap<> ();
            int contadorSaltosLiena =0;
            int contadorPalabras =0;
            int contadorCaracteres=0;
            //LecturaPalabras
            /////////////////////////////////////////////////////////////////
            BufferedReader bufferLeer = new BufferedReader(
                    new FileReader("documentos/Libros/lazarillo.txt"));
            String linea = bufferLeer.readLine();
            while (linea != null) {
                //Contadores
                //contadorCaracteres+=linea.length();
                contadorSaltosLiena++;

                //Palabras
                StringTokenizer tokenizer = new StringTokenizer(linea, " ,.?;:_-\"!()");
                while (tokenizer.hasMoreTokens()) {
                    contadorCaracteres+=tokenizer.countTokens();
                    String palabra = tokenizer.nextToken();
                    if (mapa.containsKey(palabra)){
                        int cantidad = mapa.get(palabra);
                        mapa.replace(palabra,cantidad+1);
                    }else{
                        contadorPalabras++;
                        mapa.put(palabra,1);
                    }
                }
                linea = bufferLeer.readLine();
            }
            bufferLeer.close();
            //Mostrar datos
            ///////////////////////////////////////////////////////////////////
            System.out.println("FIN DE SINTESIS:");
            System.out.println("NUmero de palabras:"+ contadorPalabras );
            System.out.println("NUmero de caracteres:"+ contadorCaracteres );
            System.out.println("NUmero de saltos:"+ contadorSaltosLiena );
            System.out.println("Palabras que se repiten:");
            ArrayList<HashMap.Entry<String, Integer>> array = new ArrayList<>(mapa.entrySet());
            array.sort(HashMap.Entry.comparingByValue());

            for(HashMap.Entry<String, Integer> hm : array) {
                System.out.println(hm);
            }
        //Fallos
        } catch (FileNotFoundException e) {
            System.out.println("Error al acceder al fichero " + e);
        } catch (IOException e) {
            System.out.println("No se ha podido escribir en el fichero");
        }
    }
}
