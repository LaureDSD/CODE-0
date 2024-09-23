package UD2.Tarea5;

public class E2_5X5NumerosMostrar {

    public static void main(String[] args) {

        int fila=5,colum=5,contador=0;
        int[][] tabla;
        tabla = new int[fila][colum];

        for(int f=0; f<fila; f++) {
            for (int c = 0; c < colum; c++) {
                contador=contador+1;
                tabla[f][c] = contador;
            }
        }
        for(int f=0; f<fila; f++){
            System.out.println();
            for(int c=0; c<colum; c++){
                System.out.print(tabla[f][c] + " ");
            }
        }
    }
}
