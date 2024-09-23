package EXAMEN;

import java.util.Scanner;

import static java.lang.System.in;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Guardar
        String[][] libros;
        int[] ejemplares;
        //Separar
        String[] cadenas;
        int numeroLibrosOrdenar, numeroDatosOrdenar;
        //Datos a separar
        String csv = "quijote, cervantes, 3;" + "celes, rojas, 5;" + "fuente, vega, 3;" + "regent, clarin, 7;";
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
                    ejemplares[posicionLibro] = Integer.parseInt( (cadenas[posicionDato]) );
                    //System.out.print(" Ejemplares:" + ejemplares[posicionLibro]);
                }
            }
        }

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
            if (ejemplares[i] != 0 && separadorLibros[i]==true) {
                System.out.println("Ejemplares" + libros[i][0]+ " - " + libros[i][1] + " - " + ejemplares[i] + " ejemplares");
            }
        }





    }
}
