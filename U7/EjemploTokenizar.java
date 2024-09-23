import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

       // Ejemplo 1 - Separando palabras
        System.out.println("// Ejemplo 1 - Separando palabras");
        String linea = "Ola, ola, ola. Bo día. Que tal? Hasta mañá.";
        StringTokenizer tokenizer = new StringTokenizer(linea, " ,.?");

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }

        System.out.println("\n");

        // Ejemplo 2 - Buscando palabra
        System.out.println("// Ejemplo 2 - Buscando palabra");
        String linea2 = "Ola, ola, ola. Bo día. Que tal? Hasta mañá.";
        String palabra2 = "ola";
        StringTokenizer tokenizer2 = new StringTokenizer(linea, " ,.?");
        int contador = 0;

        while (tokenizer2.hasMoreTokens()) {
            if (tokenizer2.nextToken().equalsIgnoreCase(palabra2)){
                contador++;
            }
        }
        System.out.println("A palabra buscada aparece " + contador +" veces");
    }
}
