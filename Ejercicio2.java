package EXAMEN;

import java.util.Scanner;

import static java.lang.System.in;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(in);


        String letraS, letracompararS;
        char letra,letracomparar;
        int contador=0 ,guardado=10000;
        int [] ejemplares = {3,5,3,7};
        String[][] libros ={
                {"quijote" , "cervantes"},
                {"celes", "rojas"},
                {"fuente", "vega"},
                {"regent", "clarin"}
        };

        System.out.println("Introduce una letra");
        letraS=teclado.nextLine();
        letra=letraS.toUpperCase().charAt(0);

        for (int i=0 ; i<ejemplares.length  ;i++ ){
            letracompararS=libros[i][0];
            letracomparar=letracompararS.toUpperCase().charAt(0);

            if (letracomparar==letra) {
                contador++;
            }else{
                ejemplares[i]=0;
            }
        }
        System.out.println("Con la letra buscada cuentas con [" + contador + "] libros");

        for (int i=0 ; i<ejemplares.length  ;i++ ) {
            if (ejemplares[i] != 0) {
                System.out.println("Ejemplares" + libros[i][0]+ " - " + libros[i][1] + " - " + ejemplares[i] + " ejemplares");
            }
        }


    }
}
