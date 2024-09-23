package Tokenizer;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        // Crear un StringTokenizer con una cadena y un delimitador
        String str = "Hola, cómo estás? Espero que bien.";
        String delimiters = " ,?.";

        // Ejemplo básico de uso de StringTokenizer
        StringTokenizer st = new StringTokenizer(str, delimiters);
        System.out.println("Tokens:");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        // Output:
        // Hola
        // cómo
        // estás
        // Espero
        // que
        // bien

        // Contar el número de tokens
        StringTokenizer stCount = new StringTokenizer(str, delimiters);
        int tokenCount = stCount.countTokens();
        System.out.println("Número de tokens: " + tokenCount);  // Output: 6

        // Usar StringTokenizer con el delimitador por defecto (espacios en blanco)
        String str2 = "Hola cómo estás";
        StringTokenizer stDefault = new StringTokenizer(str2);
        System.out.println("Tokens con delimitador por defecto:");
        while (stDefault.hasMoreTokens()) {
            System.out.println(stDefault.nextToken());
        }
        // Output:
        // Hola
        // cómo
        // estás

        // Incluir los delimitadores como tokens
        StringTokenizer stIncludeDelims = new StringTokenizer(str, delimiters, true);
        System.out.println("Tokens incluyendo delimitadores:");
        while (stIncludeDelims.hasMoreTokens()) {
            System.out.println(stIncludeDelims.nextToken());
        }
        // Output:
        // Hola
        // ,
        //
        // cómo
        //
        // estás
        // ?
        //
        // Espero
        //
        // que
        //
        // bien
        // .

        // Tokenizar una cadena sin delimitadores explícitos (usa espacios por defecto)
        String str3 = "Java es divertido";
        StringTokenizer stNoDelims = new StringTokenizer(str3);
        System.out.println("Tokens sin delimitadores explícitos:");
        while (stNoDelims.hasMoreTokens()) {
            System.out.println(stNoDelims.nextToken());
        }
        // Output:
        // Java
        // es
        // divertido
    }

}
