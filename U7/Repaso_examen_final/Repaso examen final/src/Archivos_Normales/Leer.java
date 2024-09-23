package Archivos_Normales;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Leer {
    public static void main(String[] args) {
        try {
            BufferedReader archivo = new BufferedReader(new FileReader("../../../../../Documentos/personas10.txt"));
            String linea;

            while ((linea=archivo.readLine())!=null){
                StringTokenizer tokens = new StringTokenizer(linea,".;:)(_-/");
                while(tokens.hasMoreElements()){
                    System.out.println(tokens.nextToken());
                }
                System.out.println(linea);
            }
            archivo.close();
        }catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado mira ben nos bolsillos");
        } catch (OutOfMemoryError e) {
            System.out.println("Sin memoria");
        } catch (NoSuchElementException e) {
            System.out.println("Elemento no existe");
        } catch (IOException e) {
            System.out.println("Contactar con asistencia a saber");
        }catch (NullPointerException e){
            System.out.println("Nulo");
        }catch (NumberFormatException e){
            System.out.println("Formato invalido");
        }
    }
}
