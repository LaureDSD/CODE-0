package EXAMEN;

public class Ejercicio1 {
    public static void main(String[] args) {

        int [] ejemplares = {3,5,3,7};
         String[][] libros ={
                {"quijote" , "cervantes"},
                {"celes", "rojas"},
                {"fuente", "vega"},
                {"regent", "clarin"}
        };
         int guardado=10000 ;

        for (int i=0 ; i<ejemplares.length  ;i++ ){
            if ( ejemplares[i]<guardado ) {
                guardado=ejemplares[i];
            }
        }
        System.out.println("Libros con menos ejemplares");
        for (int i=0 ; i<ejemplares.length  ;i++ ) {
            if (ejemplares[i] == guardado) {
                System.out.println("Ejemplares" + libros[i][0]+ " - " + libros[i][1] + " - " + ejemplares[i] + " ejemplares");
            }
        }

    }
}
