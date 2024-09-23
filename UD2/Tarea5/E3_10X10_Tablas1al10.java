package UD2.Tarea5;

public class E3_10X10_Tablas1al10 {
    public static void main(String[] args) {

        int fila=10,colum=10,resultado,num1=1,num2=1;
        int[][] tabla;
        tabla = new int[fila][colum];

        for(int f=0; f<fila; f++) {

            for (int c = 0; c < colum; c++) {

                resultado=num1*num2;
                tabla[f][c] = resultado;
                num2++;
            }
            num2=1;
            num1++;
        }
        for(int f=0; f<fila; f++){
            System.out.println();
            for(int c=0; c<colum; c++){
                System.out.print(tabla[f][c] + " ");
            }
        }
    }
}
