package Ejemplos;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class CifrarTexto {

    private static final String ALGORITMO = "AES";
    private static final String TRANSFORMACION = "AES/ECB/PKCS5Padding";

    public static String cifrar(String texto, String clave) throws Exception {
        SecretKeySpec claveSecreta = new SecretKeySpec(clave.getBytes(), ALGORITMO);
        Cipher cipher = Cipher.getInstance(TRANSFORMACION);
        cipher.init(Cipher.ENCRYPT_MODE, claveSecreta);
        byte[] textoCifrado = cipher.doFinal(texto.getBytes());
        return Base64.getEncoder().encodeToString(textoCifrado);
    }

    public static String descifrar(String textoCifrado, String clave) throws Exception {
        SecretKeySpec claveSecreta = new SecretKeySpec(clave.getBytes(), ALGORITMO);
        Cipher cipher = Cipher.getInstance(TRANSFORMACION);
        cipher.init(Cipher.DECRYPT_MODE, claveSecreta);
        byte[] textoDescifrado = cipher.doFinal(Base64.getDecoder().decode(textoCifrado));
        return new String(textoDescifrado);
    }

    public static void main(String[] args) {
        String texto = "Hola, este es un mensaje cifrado.";
        String clave = "clave1234567890sdfgsfdgfdsgfdsgf"; // La clave debe tener 16, 24 o 32 bytes para AES
        try {
            String textoCifrado = cifrar(texto, clave);
            System.out.println("Texto cifrado: " + textoCifrado);
            String textoDescifrado = descifrar(textoCifrado, clave);
            System.out.println("Texto descifrado: "+textoDescifrado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
