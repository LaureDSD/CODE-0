import java.io.*;
import java.util.List;

public class Gestor_Ficheros {
    public static void escribirPublicacionesAFichero(String nombreFichero, List<Publicacion_Objeto> publicaciones) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nombreFichero))) {
            outputStream.writeObject(publicaciones);
        }
    }


    public static void leerPublicacionesDeFichero(String nombreFichero, Biblioteca_Programa biblioteca) throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nombreFichero))) {
            List<Publicacion_Objeto> publicaciones = (List<Publicacion_Objeto>) inputStream.readObject();
            for (Publicacion_Objeto publicacion : publicaciones) {
                biblioteca.agregarPublicacion(publicacion);
            }
        }
    }


    // Método para escribir datos binarios a un archivo
    public static void escribirDatosBinariosAFichero() throws IOException {
        try {
// Abrimos el fichero binario para escritura
            FileOutputStream fileOut = new FileOutputStream("datos.bin");
            DataOutputStream dataOut = new DataOutputStream(fileOut);
// Escribimos un número entero
            int numEntero = 42;
            dataOut.writeInt(numEntero);
// Escribimos un número de coma flotante
            float numFlotante = 3.14f;
            dataOut.writeFloat(numFlotante);
// Escribimos un carácter
            char caracter = 'A';
            dataOut.writeChar(caracter);
// Escribimos una cadena de caracteres
            String cadena = "Hola mundo!";
            dataOut.writeUTF(cadena);
// Cerramos el fichero
            dataOut.close();
            fileOut.close();
            System.out.println("Datos escritos en el fichero datos.bin");
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());;
        }
    }



    // Método para leer datos binarios de un archivo
    public static void EscribirFicheroBinario() {
        try {
// Abrimos el fichero binario para lectura
            FileInputStream fileIn = new FileInputStream("datos.bin");
            DataInputStream dataIn = new DataInputStream(fileIn);
// Leemos un número entero
            int numEntero = dataIn.readInt();
// Leemos un número de coma flotante
            float numFlotante = dataIn.readFloat();
// Leemos un carácter
            char caracter = dataIn.readChar();
// Leemos una cadena de caracteres de longitud variable
            String cadena = dataIn.readUTF();
// Cerramos el fichero
            dataIn.close();
            fileIn.close();
// Muestramos los datos leídos
            System.out.println("El entero leído es: " + numEntero);
            System.out.println("El flotante leído es: " + numFlotante);
            System.out.println("El carácter leído es: " + caracter);
            System.out.println("La cadena leída es: " + cadena);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }



        try {
// Abrimos el fichero binario para lectura
            FileInputStream fileIn = new FileInputStream("numeros.bin");
            DataInputStream dataIn = new DataInputStream(fileIn);
            int numEntero;
// Mientras haya datos disponibles...
            while (dataIn.available()>0){
// Leemos un número y lo mostramos...
                numEntero = dataIn.readInt();
                System.out.println("El entero leído es: " + numEntero);
            }
// Cerramos el fichero
            dataIn.close();
            fileIn.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }



    }


    // Método para escribir texto a un archivo sin usar buffer
    public static void escribirTextoAFichero(String nombreFichero, String texto) throws IOException {
        try (FileWriter writer = new FileWriter(nombreFichero)) {
            writer.write(texto);
        }
    }


    // Método para leer texto de un archivo sin usar buffer
    public static String leerTextoDeFichero(String nombreFichero) throws IOException {
        try (FileReader reader = new FileReader(nombreFichero)) {
            StringBuilder texto = new StringBuilder();
            int caracter;
            while ((caracter = reader.read()) != -1) {
                texto.append((char) caracter);
            }
            return texto.toString();
        }
    }
}
