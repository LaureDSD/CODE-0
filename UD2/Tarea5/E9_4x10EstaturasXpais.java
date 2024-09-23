package UD2.Tarea5;

public class E9_4x10EstaturasXpais {
    public static void main(String[] args) {
        int media=0,min=0,max=0,rep=1,suma=0;
        String[] pais ={"Espana   ", "Rusia    ", "Japon    " ,"Australia"};
        final int FILAS=4,COLMS=10;
        int[][] tabla;
        tabla = new int[FILAS][COLMS];
        for(int f=0; f<FILAS; f++) {
            for (int c = 0; c < COLMS; c++) {
                tabla[f][c] = (int) (Math.random() * 70) + 140;
            }
        }
//------------------------------------------------------------------------
            for(int m=0; m<FILAS; m++){
                System.out.println();
                System.out.print(pais[m]+"|\t ");
                max=0;
                min=400;
                 for(int c=0; c<COLMS; c++){
                System.out.print( tabla[m][c]+"\t ");
                     suma=suma+tabla[m][m];
                     media=suma/rep;
                     rep++;
                     if (tabla[m][c]>max) {
                         max=tabla[m][c];
                     }
                     if (tabla[m][c]<min) {
                         min=tabla[m][c];
                     }
                }
                System.out.print("|\t");
                System.out.print(media+"\t ");
                System.out.print(min+"\t ");
                System.out.print(max+"\t ");
            }
    }
}
