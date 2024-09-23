package UD2.Tarea6;

import java.util.Random;
import java.util.Scanner;

public class E19_Wordle {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean reinicioprograma = true;
        while (reinicioprograma) {
            String palabrausuario, categoria="", palabraoculta = "", nuevapartida;
            String[][] guardado, validador , portafolio = new String[1][2];
            int intentos,lineas, buclerepeticionesprograma = 0,bucleseleccioncategoria=1;
            boolean correcto = true;
//----------------------------------------------------------------------------------------
            String[] ciencias = {"ciencia", "cientifico", "materia", "espacio", "nada",
                    "proton", "neutron", "electron", "atomo", "energia"};
            String[] letras = {"mayuscula", "minuscula", "sinonimo", "antonimo", "letra",
                    "frase", "oracion", "tilde", "vocal", "consonante"};
//----------------------------------------------------------------------------------------
            while (0<bucleseleccioncategoria) {
                System.out.println("Categoria: Ciencias o Letras");
                categoria = teclado.nextLine().toLowerCase();
            //********************************************************
                categorias(categoria,ciencias,letras,palabraoculta,bucleseleccioncategoria,portafolio);
                palabraoculta=portafolio[0][0];
                bucleseleccioncategoria= Integer.parseInt(portafolio[0][1]);
           //***********************************************************
            }
//----------------------------------------------------------------------------------------
            System.out.println("Indique intentos");
            intentos = Integer.parseInt(teclado.nextLine());
            System.out.println("Palabra de longiud [" + palabraoculta.length() + "] inicia el juego");
            lineas = intentos++;
            guardado = new String[lineas][palabraoculta.length()];
            validador = new String[lineas][palabraoculta.length()];
            guardarpalabraoculta(guardado, palabraoculta);
//-----------------------------------------------------------------------------------------
            int contador = 1;
            int xlinea=1;
            while (buclerepeticionesprograma < intentos && correcto) {
                System.out.println();
                System.out.println("Palabra:");
                palabrausuario = teclado.nextLine().toUpperCase();


                //************************************************************
                comprobador(contador,xlinea,palabraoculta,validador,guardado,palabrausuario,intentos ,buclerepeticionesprograma);
                contador++;
                while(xlinea<contador) {
                    for (int repeticionbucle = 0; repeticionbucle < palabrausuario.length(); repeticionbucle++) {
                        guardado[xlinea][repeticionbucle] = String.valueOf(palabrausuario.charAt(repeticionbucle));

                        if (palabraoculta.equals(palabrausuario)) {
                            buclerepeticionesprograma = intentos;
                        } else if (guardado[xlinea][repeticionbucle].equals(guardado[0][repeticionbucle])) {
                            validador[xlinea][repeticionbucle] = "V";
                        } else if (!guardado[0][repeticionbucle].equals(guardado[xlinea][repeticionbucle])) {
                            validador[xlinea][repeticionbucle] = "N";
                        }

                        for (int bucles = 0; bucles < palabraoculta.length(); bucles++) {
                            if (guardado[xlinea][repeticionbucle].equals(guardado[0][bucles])
                                    && validador[xlinea][repeticionbucle].equals("N")) {
                                validador[xlinea][repeticionbucle] = "A";
                                break;
                            }
                        }
                    }
                    xlinea++;
                }

                //************************************************************
                mostrarpalabras(contador,palabraoculta,validador,guardado,correcto,palabrausuario);
                buclerepeticionesprograma++;
            }

//-------------------------------------------------------------------------------------------

            System.out.println();
            System.out.println("Nueva partida? Si/No");
            nuevapartida = teclado.nextLine().toLowerCase();
            if (nuevapartida.equals("no")) {
                reinicioprograma = false;
                }
        }
    }


















//-------------------------------------------------------------------------------------------
    private static void mostrarpalabras(int contador,String palabraoculta,String[][] validador,String[][] guardado,Boolean correcto,String palabrausuario ) {

        String VERDE = "\u001b[32m", AMARELO = "\u001b[33m", RESET = "\u001B[0m";
        for (int mostrar=1;mostrar<contador;mostrar++) {
            System.out.println();
            for(int mostrarletra=0;mostrarletra<palabraoculta.length();mostrarletra++) {

                if (palabraoculta.equals(palabrausuario)) {
                    correcto = false;
                    System.out.print(VERDE + palabraoculta + RESET);
                } else if (validador[mostrar][mostrarletra].equals("V")) {
                    System.out.print(VERDE + guardado[mostrar][mostrarletra] + RESET);

                } else if (validador[mostrar][mostrarletra].equals("A")) {
                    System.out.print(AMARELO + guardado[mostrar][mostrarletra] + RESET);
                } else {
                    System.out.print(guardado[mostrar][mostrarletra] + RESET);
                }
            }
        }
    }

//--------------------------------------------------------------------------------------------------------
    private static void comprobador( int xlinea, int contador, String palabraoculta, String[][] validador, String[][] guardado, String palabrausuario, int intentos, int buclerepeticionesprograma) {



    }
//---------------------------------------------------------------------------------------
    private static void categorias(String categoria,String[] ciencias, String[] letras, String palabraoculta, int bucleseleccioncategoria, String[][] portafolio) {

        int  random = 0;
        Random aleatorios = new Random();
        if (categoria.equals("ciencias") || categoria.equals("ciencia")) {
            random = aleatorios.nextInt(0, ciencias.length);
            palabraoculta = ciencias[random];
            bucleseleccioncategoria = 0;

        } else if (categoria.equals("letras") || categoria.equals("letra")) {
            random = aleatorios.nextInt(0, letras.length);
            palabraoculta = letras[random];
            bucleseleccioncategoria=0;

        } else {
            System.out.println("Seleccione categoria");
        }
        portafolio[0][0] = palabraoculta;
        portafolio[0][1] = String.valueOf(bucleseleccioncategoria);

    }
//-------------------------------------------------------------------------------
    public static void guardarpalabraoculta(String guardado[][] , String palabraoculta) {
        palabraoculta = palabraoculta.toUpperCase();
        for (int guardar = 0; guardar < palabraoculta.length(); guardar++) {
            guardado[0][guardar] = String.valueOf(palabraoculta.charAt(guardar));
        }
//------------------------------------------------------------------------------
    }
}