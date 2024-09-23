package conexiones;

import codigosDeError.ErrorCifrado_Exception;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.util.Base64;
import java.util.Random;
import java.util.StringTokenizer;

public class Cifrado {

    private static final String ALGORITMO = "AES";
    private static final String TRANSFORMACION = "AES/ECB/PKCS5Padding";
    private static final String FICHEROCLAVESRUTA = "src/Config/secret.key";
    private static final String FICHEROCLAVESRUTAM = "src/Config/secret.bin";
    private static String CLAVEMAESTRA = null;

    // Generar clave /////////////////////////////////////////////////////////////////////////////////////////////

    public static String setClave(String rutaFichero) {
        escibirleerbin();
            String clave;

            try {
                BufferedWriter buffer = new BufferedWriter(new FileWriter(FICHEROCLAVESRUTA, true));
                clave = getClave(rutaFichero);
                if(clave==null) {
                    clave = generarClaves();
                    //Bufer Writer
                    buffer.write(Cifrado.cifrar(rutaFichero + "[" + clave + "]\n", CLAVEMAESTRA)+"\r\n");
                    buffer.close();
                }
            }catch (Exception e){
                throw new ErrorCifrado_Exception("Error en setClave: "+e.getMessage());
            }
            return clave;
    }

    // Pedir clave de fichero ////////////////////////////////////////////////////////////////////////////////////

    public static String getClave(String rutaFichero) {
        escibirleerbin();
        try {
            String clave = null;
            //Bufer Reader
            BufferedReader buffer = new BufferedReader(new FileReader(FICHEROCLAVESRUTA));
            String linea = descifrar(buffer.readLine(), CLAVEMAESTRA);
            while (linea != null) {
                if(tokenizerBuscadorFicheros(linea,rutaFichero)) {
                    clave = tokenizerExtraerClaves(linea, rutaFichero);
                }
                linea = descifrar(buffer.readLine(), CLAVEMAESTRA);
            }
            buffer.close();
            return clave;
        }catch (Exception e){
            throw new ErrorCifrado_Exception("Error en getClave: "+e.getMessage());
        }
    }

    //Tokenizer /////////////////////////////////////////////////////////////////////////////////////////////

    private static String tokenizerExtraerClaves (String texto,String fichero){
        try {
            String clave = null;
            StringTokenizer linea = new StringTokenizer(texto, "[]");
            String token = linea.nextToken();
            while (linea.hasMoreTokens()) {
                if (token.equals(fichero)) {
                    clave = linea.nextToken().trim();
                }
                linea.nextToken();
            }
            return clave;
        }catch (Exception e){
            throw new ErrorCifrado_Exception("Error en tokenizer: "+e.getMessage());
        }
    }

    private static boolean tokenizerBuscadorFicheros (String texto,String fichero){
        try {
            String clave = null;
            StringTokenizer linea = new StringTokenizer(texto, "[]");
            String token = linea.nextToken();
            while (linea.hasMoreTokens()) {
                if (token.equals(fichero)) {
                    return true;
                }
                linea.nextToken();
            }
            return false;
        }catch (Exception e){
            throw new ErrorCifrado_Exception("Error en tokenizer: "+e.getMessage());
        }
    }

    //CIFRADO /////////////////////////////////////////////////////////////////////////////////////////////


    //Cifrar (No dependiente)
    static String cifrar(String texto,String clave) {
        try {
            if (texto!=null && clave!=null) {
                SecretKeySpec claveSecreta = new SecretKeySpec(clave.getBytes(), ALGORITMO);
                Cipher cipher = Cipher.getInstance(TRANSFORMACION);
                cipher.init(Cipher.ENCRYPT_MODE, claveSecreta);
                byte[] textoCifrado = cipher.doFinal(texto.getBytes());
                return Base64.getEncoder().encodeToString(textoCifrado);
            }
            return null;
        }catch (Exception e){
            throw new ErrorCifrado_Exception("Error al cifrar: "+e.getMessage());
        }
    }

    //Descifrar (Independiente)
    static String descifrar(String textoCifrado,String clave) {
        try {
            if (textoCifrado!=null && clave!=null) {
            SecretKeySpec claveSecreta = new SecretKeySpec(clave.getBytes(), ALGORITMO);
            Cipher cipher = Cipher.getInstance(TRANSFORMACION);
            cipher.init(Cipher.DECRYPT_MODE, claveSecreta);
            byte[] textoDescifrado = cipher.doFinal(Base64.getDecoder().decode(textoCifrado));
            return new String(textoDescifrado);
            }
            return null;
        }catch (Exception e){
            throw new ErrorCifrado_Exception("Error al descifrar: "+e.getMessage());
        }
    }

    //GenerarClaves ///////////////////////////////////////////////////////////////////////////////////////////////

    public static String generarClaves(){
        try {
            StringBuilder clave = new StringBuilder();
            Random r = new Random();
            String[] lista = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                    "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
                    "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
            while (clave.toString().length() < 32) {
                clave.append(lista[r.nextInt(0, lista.length)]);
            }
            return clave.toString();
        }catch (Exception e){
            throw new ErrorCifrado_Exception("Error al generar clave: "+e.getMessage());
        }
    }

    //Cargar clave maestra BIN

    private static void escibirleerbin(){
            try {
/*
                FileOutputStream fileOut = new FileOutputStream(FICHEROCLAVESRUTAM);
                DataOutputStream dataOut = new DataOutputStream(fileOut);
                dataOut.writeUTF("clave1234567890sdfgsfdgfdsgfdsgf");
                dataOut.close();
                fileOut.close();

 */

                // Abrimos el fichero binario para lectura
                FileInputStream fileIn = new FileInputStream(FICHEROCLAVESRUTAM);
                DataInputStream dataIn = new DataInputStream(fileIn);
                CLAVEMAESTRA = dataIn.readUTF();
                dataIn.close();
                fileIn.close();

            }catch (Exception e ){
                throw new ErrorCifrado_Exception("Error secreto: "+e.getMessage());
            }

    }
}
