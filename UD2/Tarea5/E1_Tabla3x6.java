package UD2.Tarea5;

public class E1_Tabla3x6 {
    public static void main(String[] args) {

        int fila=3,colum=6;
        int[][] tabla;
        tabla = new int[fila][colum];
        tabla[0][0]=0;
        tabla[0][1]=30;
        tabla[0][2]=2;
        tabla[0][5]=5;
        tabla[1][0]=75;
        tabla[1][4]=0;
        tabla[2][2]=-2;
        tabla[2][3]=9;
        tabla[2][5]=11;

        for(int f=0; f<fila; f++){
            System.out.println();
            for(int c=0; c<colum; c++){
                System.out.print(tabla[f][c] + " ");
            }
        }
    }
}