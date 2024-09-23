package UD2.Tarea5;

public class E5_4x5NumerosSumas {
    public static void main(String[] args) {

        int sumaf,sumac,sumatf=0,sumatc=0;
        final int FILAS = 4, COLS = 5;

        int[][] tabla;
        tabla = new int[5][6];
//-----------------------GenrarTabla------------------------
        for (int f = 0; f < FILAS; f++) {
            for (int c = 0; c < COLS; c++) {
                tabla[f][c] = (int) (Math.random() * 10);
            }
        }
//--------------------SumarFila---------------------------
        for (int f = 0; f < FILAS; f++) {
            sumaf=0;
            for (int c = 0; c < COLS; c++) {
                sumaf=sumaf+tabla[f][c];
                //System.out.println(f+" suma filas "+sumaf);
                tabla[f][5]=sumaf;
            }
            //System.out.println(sumaf);
            sumatf=sumaf+sumaf;
        }
//----------------------SumarColum--------------------
        for (int f = 0; f < COLS; f++) {
            sumac=0;
            for (int c = 0; c < FILAS; c++) {
                sumac=sumac+tabla[c][f];
                //System.out.println(c+" suma col "+sumac);
                tabla[4][f]=sumac;
            }
            //System.out.println(sumac);
            sumatc=sumac+sumac;
        }

        tabla[4][5]=sumatf+sumatc;
//----------------------------Mostrar----------------------------------------
        for (int f2 = 0; f2 < 5; f2++) {
            System.out.println();
            for (int c2 = 0; c2 < 6; c2++) {
                System.out.print(tabla[f2][c2] + " \t");
            }

        }
    }
}
