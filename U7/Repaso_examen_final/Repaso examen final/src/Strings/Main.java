package Strings;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de length()
        String str = "Hola Mundo";
        int length = str.length();
        System.out.println("Longitud: " + length);  // Output: 10

        // Ejemplo de charAt(int index)
        char ch = str.charAt(1);
        System.out.println("Carácter en la posición 1: " + ch);  // Output: o

        // Ejemplo de substring(int beginIndex)
        String subStr = str.substring(5);
        System.out.println("Subcadena desde el índice 5: " + subStr);  // Output: Mundo

        // Ejemplo de substring(int beginIndex, int endIndex)
        String subStr2 = str.substring(0, 4);
        System.out.println("Subcadena de 0 a 4: " + subStr2);  // Output: Hola

        // Ejemplo de indexOf(char ch)
        int index = str.indexOf('M');
        System.out.println("Índice de 'M': " + index);  // Output: 5

        // Ejemplo de lastIndexOf(char ch)
        int lastIndex = str.lastIndexOf('o');
        System.out.println("Último índice de 'o': " + lastIndex);  // Output: 7

        // Ejemplo de toUpperCase()
        String upperStr = str.toUpperCase();
        System.out.println("En mayúsculas: " + upperStr);  // Output: HOLA MUNDO

        // Ejemplo de toLowerCase()
        String lowerStr = str.toLowerCase();
        System.out.println("En minúsculas: " + lowerStr);  // Output: hola mundo

        // Ejemplo de trim()
        String strWithSpaces = "   Hola Mundo   ";
        String trimmedStr = strWithSpaces.trim();
        System.out.println("Sin espacios al inicio y al final: '" + trimmedStr + "'");  // Output: 'Hola Mundo'

        // Ejemplo de replace(char oldChar, char newChar)
        String replacedStr = str.replace('o', 'a');
        System.out.println("Reemplazar 'o' con 'a': " + replacedStr);  // Output: Hala Munda

        // Ejemplo de equals(Object anObject)
        String str2 = "Hola Mundo";
        boolean isEqual = str.equals(str2);
        System.out.println("¿Son iguales? " + isEqual);  // Output: true

        // Ejemplo de equalsIgnoreCase(String anotherString)
        boolean isEqualIgnoreCase = str.equalsIgnoreCase("hola mundo");
        System.out.println("¿Son iguales ignorando mayúsculas? " + isEqualIgnoreCase);  // Output: true

        // Ejemplo de startsWith(String prefix)
        boolean startsWithHola = str.startsWith("Hola");
        System.out.println("¿Comienza con 'Hola'? " + startsWithHola);  // Output: true

        // Ejemplo de endsWith(String suffix)
        boolean endsWithMundo = str.endsWith("Mundo");
        System.out.println("¿Termina con 'Mundo'? " + endsWithMundo);  // Output: true

        // Ejemplo de contains(CharSequence s)
        boolean containsMundo = str.contains("Mundo");
        System.out.println("¿Contiene 'Mundo'? " + containsMundo);  // Output: true

        // Ejemplo de split(String regex)
        String[] words = str.split(" ");
        System.out.println("Palabras separadas:");
        for (String word : words) {
            System.out.println(word);
        }
        // Output:
        // Palabras separadas:
        // Hola
        // Mundo
    }

}
