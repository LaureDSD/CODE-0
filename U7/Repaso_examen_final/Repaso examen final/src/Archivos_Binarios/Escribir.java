package Archivos_Binarios;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.NoSuchElementException;

public class Escribir {
    public static void main(String[] args) {
        try{
            FileOutputStream fileOut=new FileOutputStream("../../../../../Documentos/personasBin.bat");
            DataOutputStream dataOut=new DataOutputStream(fileOut);

            dataOut.writeUTF("Nombre: ");
            dataOut.writeUTF("Apellido: ");
            dataOut.writeInt(10);

            dataOut.close();
            fileOut.close();
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
