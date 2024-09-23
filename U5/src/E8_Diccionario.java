import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class E8_Diccionario {
    public static void main(String[] args) {

        try{
            Scanner teclado = new Scanner(System.in);
            ArrayList<String> palabras = new ArrayList<>();
            String nombreFichero = "usa_persoas";
            String[] letras = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
            boolean creada = false;

            //LecturaNomes
            /////////////////////////////////////////////////////////////////
            BufferedReader bufferLeer = new BufferedReader(
                    new FileReader("documentos/diccionario.txt"));
            String lineaNomes = bufferLeer.readLine();
            while (lineaNomes != null) {
                palabras.add(lineaNomes);
                lineaNomes = bufferLeer.readLine();
            }
            bufferLeer.close();

            //Generar archivo
            /////////////////////////////////////////////////////////////////
            File crearCarpeta = new File("documentos/diccionario");
            creada = crearCarpeta.mkdir();
            //Guardar datos
            ///////////////////////////////////////////////////////////////////
            int i=0;
            while(i<letras.length && creada) {
                char letra = letras[i].charAt(0);
                nombreFichero = letras[i];
                //EscrituraArchivo
                BufferedWriter bufferCrear = new BufferedWriter(
                        new FileWriter("documentos/diccionario/"+nombreFichero + ".txt")
                );
                //Escritura
                Collections.sort(palabras);
                for(String s: palabras ){
                    if(convertir(s).toUpperCase().charAt(0)==letra) {
                        bufferCrear.write(s+"\n");
                    }
                }
                bufferCrear.close();
                i++;
            }

//Fallos
        } catch (FileNotFoundException e) {
            System.out.println("Error al acceder al fichero " + e);
        } catch (IOException e) {
            System.out.println("No se ha podido escribir en el fichero");
        } catch (Exception e) {
            System.out.println("Error al acceder al fichero " + e);
        }
    }

    private static String convertir(String palabra) {
        String conTilde = "áàäéèëíìïóòöúùuñÁÀÄÉÈËÍÌÏÓÒÖÚÙÜ";
        String sinTilde = "aaaeeeiiiooouuunAAAEEEIIIOOOUUU";
        String cambiada = palabra;

        if(conTilde.contains(String.valueOf(palabra.trim().charAt(0)))){
            //Quitar espacios, reemplazar
            cambiada = palabra.trim().replace(
                    //Busca Original
                    palabra.charAt(0),
                            //Busca sustituta en la posicion
                            sinTilde.charAt(conTilde.indexOf(palabra.charAt(0)))
                    );
        }
        /*
        for (int i=0; i<conTilde.length(); i++) {
            cambiada = cambiada.replace(conTilde.charAt(i), sinTilde.charAt(i));
        }
         */
        return cambiada;
    }
}
