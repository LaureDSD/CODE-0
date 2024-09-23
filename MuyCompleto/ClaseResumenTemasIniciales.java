package MuyCompleto;//PACQUETES IMPORTADOS
import java.util.Random;
import java.util.Scanner;

    //NORMALIZACION
//- Identificadores de variables en minúscula.
//- Constantes en mayúsculas.
//- Métodos en minúsculas.
//- Clases con el primer carácter en mayúscula.

public class ClaseResumenTemasIniciales {

    //Variables de clase,final y static
    private final int VALOR_MAXIMO = 10000;
    private final static int VALOR_MAXIMO_GENERAL = 10000;


    //Clase de conceptos iniciamos con un main
    public static void main(String[] args) {



        //Declaracion de variables
        String VERDE = "\u001b[32m", AMARELO = "\u001b[33m", RESET = "\u001B[0m";
        int numeroentero = 3;
        double numerodouble = 1.02;
        String texto = "texto";
        boolean verdaderoFalso = true;
        char letra = 'C' ;
        byte Byte = 127;
        short Short =32767;
        long numero_largo = 1234567890L;
        float numFloat = 3.1415f;


        String[] columnas;
        columnas = new String[0];
        String[][] filascolumnas;
        filascolumnas = new String[0][0];
        String[][][] filascolumnasfondo;
        filascolumnasfondo = new String[0][0][0];
        final int filas = 3, colums = 3;
        char[][] tableroPrueba ;
        tableroPrueba = new char[filas][colums];
        String[] letras={"A", "B"};


        //Conversion de valores
        int conversion1 = Integer.parseInt("1234");
        double conversion2 = (double) conversion1;
        String conversion3 = String.valueOf(conversion2);


        //Entrada y salida nformacion

        //Mostrar informacion
        System.out.println(numeroentero % 2 );
        System.out.print(numeroentero/numerodouble);
        System.out.println(VERDE + "texto con salto de linea\n y tabulaciones\t , para imprimir " +
                "barra invertida\\ o comillas doles\" " + RESET);


        //Formator salida decimales
        double decimal = 3.14159;
        System.out.printf("El valor de pi es: %.2f%n", decimal);

        //Formato salida cadenas
        String nombre = "María";
        int edad1 = 30;
        System.out.printf("%s tiene %d años%n", nombre, edad1);

        //Entrada de informacion
        Scanner teclado = new Scanner(System.in);
        System.out.println(teclado.nextLine());
        System.out.println(Integer.parseInt(teclado.nextLine()));
        letra =  teclado.next().charAt(0);

        //GENERAR NUMEROS ALEATORIOS
        Random aleatorios = new Random();
        int numerogenerado = aleatorios.nextInt(1,100);

        //Uso de operadores asignacion
        int contador = 1;
        int numerocomparar = 10;

        contador = numerocomparar;
        contador += contador;
        contador -= contador;
        contador *= contador;
        contador /= contador;
        contador %= contador;

        //Uso operadores de comparacion
        if(contador == numerocomparar){}
        if(contador != numerocomparar){}
        if(contador < numerocomparar){}
        if(contador > numerocomparar){}
        if(contador >= numerocomparar){}
        if(contador <= numerocomparar){}

        //Operadores logicos
        if(contador == numerocomparar && contador != numerocomparar){}
        if(contador == numerocomparar || contador != numerocomparar){}
        if(!verdaderoFalso){}
        if(verdaderoFalso){}


        //Structuras de control en programación
        //IF
        int edad = 20;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }


        //ELSEIF
        int numero = 10;

        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }


        //Operador condicional ternario / IF SIMPLIFICADADO
        String x = (verdaderoFalso) ? "Verdadero" : "Falso";


        //CASE
        int opcion = 2;
        switch (opcion) {
            case 1:
                System.out.println("Opción 1 seleccionada");
                break;
            case 2:
                System.out.println("Opción 2 seleccionada");
                break;
            case 3:
                System.out.println("Opción 3 seleccionada");
                break;
            default:
                System.out.println("Opción no válida");
        }



        //CASE2
        int opcion2 = 2;
        switch (opcion2) {
            case 1 ->{
                System.out.println("Opción 1 seleccionada");
                System.out.println();
            }
            case 2 -> System.out.println("Opción 2 seleccionada");
            case 3 -> System.out.println("Opción 3 seleccionada");
            default -> System.out.println("Opción no válida");
        }



        //FOR
        for (int i = 0; i < 5; i++) {
            System.out.println("El valor de i es: " + i);
        }



        //WHILE
        int contador2 = 0;
        while (contador2 < 3) {
            System.out.println("Contador: " + contador2);
            contador2++;
        }



        //DO WHILE
        int numero2;
        do {
            System.out.println("Introduce un número positivo: ");
            numero2 = Integer.parseInt(teclado.nextLine());
        } while (numero2 <= 0);
        System.out.println("Número válido ingresado: " + numero2);


        //MODIFICADORES DE STRINGS Y ARRAY DE STRINGS

        //split(String regex): Separa por caracteres.

        //trim(): Quita espacios en blanco.

        //replace(char oldChar, char newChar): Cambia caracteres.

        //substring(int beginIndex, int endIndex): Extrae cadenas.

        //toUpperCase() y toLowerCase(): Mayusculas o minusculas.

        //startsWith(String prefix) y endsWith(String suffix): Busca cadenas.

        //indexOf(String str) y lastIndexOf(String str): Busca comienzo o fin.

        //charAt(int index): Toma letra en posicion.

        //isEmpty(): Indica si esta vacio.

        //contains(CharSequence s): Indica si contiene.

        //length(): Indica longitud.

        //substring(int beginIndex): Extrae posicion desde.

        //concat(String str): Une cadenas.

        //equalsIgnoreCase(String anotherString): Compara sin revisar tamanos.

        //contains(CharSequence s): Busca si contiene.



    }
}
