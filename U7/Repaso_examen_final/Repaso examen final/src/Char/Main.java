package Char;

public class Main {
    public static void main(String[] args) {
        // Declaración de un carácter
        char ch = 'A';
        System.out.println("Carácter: " + ch);  // Output: A

        // Convertir un carácter a su valor numérico en ASCII
        int asciiValue = ch;
        System.out.println("Valor ASCII de 'A': " + asciiValue);  // Output: 65

        // Convertir un valor numérico en ASCII a un carácter
        char chFromAscii = (char) 66;
        System.out.println("Carácter para el valor ASCII 66: " + chFromAscii);  // Output: B

        // Verificar si un carácter es una letra
        boolean isLetter = Character.isLetter(ch);
        System.out.println("¿Es 'A' una letra? " + isLetter);  // Output: true

        // Verificar si un carácter es un dígito
        char digit = '5';
        boolean isDigit = Character.isDigit(digit);
        System.out.println("¿Es '5' un dígito? " + isDigit);  // Output: true

        // Convertir un carácter a minúsculas
        char lowerCh = Character.toLowerCase(ch);
        System.out.println("Minúscula de 'A': " + lowerCh);  // Output: a

        // Convertir un carácter a mayúsculas
        char upperCh = Character.toUpperCase('b');
        System.out.println("Mayúscula de 'b': " + upperCh);  // Output: B

        // Verificar si un carácter es una letra mayúscula
        boolean isUpperCase = Character.isUpperCase(ch);
        System.out.println("¿Es 'A' una letra mayúscula? " + isUpperCase);  // Output: true

        // Verificar si un carácter es una letra minúscula
        boolean isLowerCase = Character.isLowerCase('a');
        System.out.println("¿Es 'a' una letra minúscula? " + isLowerCase);  // Output: true

        // Convertir un carácter a su valor numérico en un sistema decimal (para dígitos)
        int numericValue = Character.getNumericValue(digit);
        System.out.println("Valor numérico de '5': " + numericValue);  // Output: 5

        // Verificar si un carácter es un espacio en blanco
        char space = ' ';
        boolean isSpace = Character.isWhitespace(space);
        System.out.println("¿Es ' ' un espacio en blanco? " + isSpace);  // Output: true

        // Comparar dos caracteres
        char ch1 = 'a';
        char ch2 = 'b';
        int comparison = Character.compare(ch1, ch2);
        System.out.println("Comparación entre 'a' y 'b': " + comparison);  // Output: -1 (significa que 'a' es menor que 'b')

        // Convertir un carácter a cadena
        String charToString = Character.toString(ch);
        System.out.println("Carácter 'A' como cadena: " + charToString);  // Output: A
    }


}
