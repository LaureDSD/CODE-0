package Archivos_Normales;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;

public class Escribir {
    public static void main(String[] args) {
        try {
            BufferedWriter archivo = new BufferedWriter(new FileWriter("../../../../../Documentos/personas10.txt"));

            archivo.write("Nombre: ");
            archivo.newLine();
            archivo.write("Apellido: ");
            archivo.newLine();
            archivo.write("Edad: ");
            archivo.newLine();
            archivo.close();
        }catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado mira ben nos bolsillos");
        } catch (OutOfMemoryError e) {
            System.out.println("Sin memoria");
        } catch (NoSuchElementException e) {
            System.out.println("Elemento no existe");
        } catch (IOException e) {
            System.out.println("Contactar con asistencia a saber");
        }
    }
}
