package Archivos_Binarios;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;

public class Leer {
    public static void main(String[] args) {
        try {
            String apelido, nome;
            int ano;
            FileInputStream fileIn = new FileInputStream("../../../../../Documentos/personasBin.bat");
            DataInputStream dataIn = new DataInputStream(fileIn);

            apelido = dataIn.readUTF();
            nome = dataIn.readUTF();
            ano = dataIn.readInt();

            fileIn.close();
            dataIn.close();
        }catch (FileNotFoundException e) {
            System.out.println("\nArchivo no encontrado mira ben nos bolsillos");
        } catch (OutOfMemoryError e) {
            System.out.println("\nSin memoria");
        } catch (NoSuchElementException e) {
            System.out.println("\nElemento no existe");
        } catch (IOException e) {
            System.out.println("\nContactar con asistencia a saber");
        } catch (NullPointerException e) {
            System.out.println("\nNulo");
        } catch (NumberFormatException e) {
            System.out.println("\nFormato invalido");
        }
    }
}
