package TEMA0;

import java.util.Scanner;
import static java.lang.System.in;
public class Main {
    public static void main(String[] args) {
        //Guardar
        String[][] libros;
        int[] ejemplares;
        //Separar
        String[] cadenas;
        int numeroLibrosOrdenar, numeroDatosOrdenar;
        //Datos a separar
        String csv = "quijote, cervantes, 3;celes, rojas, 5;fuente, vega, 3;Qregent, clarin, 1;";
//SAPARAR Y OBTENER NUMERO DE LIBROS
        String[] separacadenas = csv.split(";");
        numeroLibrosOrdenar = separacadenas.length;
        //Array de libros y ejemplares
        libros = new String[numeroLibrosOrdenar][2];
        ejemplares =  new int[numeroLibrosOrdenar];
//SEPARAR Y OBTENER DATOS DE LOS LIBROS
        for (int posicionLibro = 0; posicionLibro < numeroLibrosOrdenar; posicionLibro++) {
            cadenas = separacadenas[posicionLibro].split(",");
            numeroDatosOrdenar = cadenas.length;
            //Guardar datos por partes
            for (int posicionDato = 0; posicionDato < numeroDatosOrdenar; posicionDato++) {
                if (posicionDato == 0) {
                    libros[posicionLibro][0] = cadenas[posicionDato];
                    //System.out.print(" Titulo: " + libros[posicionLibro][0]);
                } else if (posicionDato == 1) {
                    libros[posicionLibro][1] = cadenas[posicionDato];
                    //System.out.print(" Autor" + libros[posicionLibro][1]);
                } else if (posicionDato == 2) {
                    //ejemplares[posicionLibro] =  Integer.parseInt( cadenas[posicionDato].replace(" ","") );
                    ejemplares[posicionLibro] =  Integer.parseInt( cadenas[posicionDato].trim());
                    //System.out.print(" Ejemplares:" + ejemplares[posicionLibro]);
                }
            }
        }
        System.out.println("------------------------------------------------------------------------");
        //VARIABLES
        String letraString, cadenaConLetra;
        char letraChar,letraCompararChar;
        int contadorCoincidencias=0;
        //Array vacio
        Boolean[] separadorLibros;
        separadorLibros = new Boolean[ejemplares.length];
        //TECLADO
        System.out.println("Introduce una letra de busqueda");
        Scanner teclado = new Scanner(in);
        letraString=teclado.nextLine();
        //TRANSFORMAR LETRAS
        letraChar=letraString.toUpperCase().charAt(0);
        //SACAR Y COMPARAR LETRA DE LIBRO
        for (int posicionLibro=0 ; posicionLibro<ejemplares.length  ;posicionLibro++ ){
            //Sacar letra de cada titulo
            cadenaConLetra=libros[posicionLibro][0];
            letraCompararChar=cadenaConLetra.toUpperCase().charAt(0);
            //Comparar letra de cada titulo
            if (letraCompararChar==letraChar) {
                contadorCoincidencias++;
                separadorLibros[posicionLibro] = true;
            }else{
                separadorLibros[posicionLibro] = false;
            }
        }
        //MOSTRAR INFORMACION
        System.out.println("Con la letra buscada cuentas con [" + contadorCoincidencias + "] libros");
        for (int i=0 ; i<ejemplares.length  ;i++ ) {
            if (separadorLibros[i] && ejemplares[i]!=0) {
                System.out.println("Ejemplar: " + libros[i][0]+ " - Autor: " + libros[i][1] + " - Tiene: " + ejemplares[i] + " ejemplares");
            }
        }
        System.out.println("------------------------------------------------------------------------");
        //VARIABLES
        int valorMayor=Integer. MIN_VALUE ;
        int valorMenor=Integer. MAX_VALUE ;
        int valorRespuesta=-1;
        Boolean correcto=false ;
        //TECLADO
        System.out.println("Introduce numero maximo ejemplares (-1 maximo valor)");
        int respuesta=teclado.nextInt();
        //SELECCION
        libroBusEjemplares(respuesta, valorRespuesta, ejemplares, libros, correcto);
        //FILTRAR POR NUMERO EJEMPLARES
        for (int i = 0; i < ejemplares.length; i++) {
            int recorridoEjemplares = ejemplares[i];

            if (recorridoEjemplares > valorMayor) {
                valorMayor = recorridoEjemplares;
            }
            if (recorridoEjemplares < valorMenor) {
                valorMenor = recorridoEjemplares;
            }
        }
        //MAXIMO DE EJMPLARES
        libroMaxEjemplares(ejemplares, valorMayor, libros);
        //MINIMO EJEMPLARES
        libroMinEjemplares(ejemplares, valorMenor, libros);
    }

    private static void libroMinEjemplares(int[] ejemplares, int valorMenor, String[][] libros) {
        System.out.println("Libros con menos ejemplares");
        for (int i = 0; i< ejemplares.length  ; i++ ) {
            if (ejemplares[i] == valorMenor) {
                extracted(libros, i, ejemplares);
            }
        }
    }

    private static void libroMaxEjemplares(int[] ejemplares, int valorMayor, String[][] libros) {
        System.out.println("Libros con mas ejemplares");
        for (int i = 0; i< ejemplares.length  ; i++ ) {
            if (ejemplares[i] == valorMayor) {
                extracted(libros, i, ejemplares);
            }
        }
    }

    private static void libroBusEjemplares(int respuesta, int valorRespuesta, int[] ejemplares, String[][] libros, Boolean correcto) {
        if(respuesta != valorRespuesta){
            valorRespuesta = respuesta;
            System.out.println("Libros con numero de ejemplares indicado");
            for (int i = 0; i < ejemplares.length; i++) {
                if (ejemplares[i] == valorRespuesta) {
                    extracted(libros, i, ejemplares);
                    correcto = true;
                }
            }
            if (!correcto) {
                System.out.println("No se encontro ninguno");
            }
        }
    }

    private static void extracted(String[][] libros, int i, int[] ejemplares) {
        System.out.println( "Titulo: " + libros[i][0]+ " - Autor: " + libros[i][1] + " - Ejemplares: " + ejemplares[i]);
    }
}
