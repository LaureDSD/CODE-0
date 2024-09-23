package UD2.Tarea5;

public class E8_10x10DiagonalCalculos {
    public static void main(String[] args) {

        final int FILA=10,COLUMS=10;
        int maximo=0,minimo=0,media=0,suma=0,repet=1;
        int[][] tabla;
        tabla = new int[FILA][COLUMS];

        for(int f=0; f<FILA; f++){
            for(int c=0; c<COLUMS; c++){
                tabla[f][c]= (int) (Math.random()*100+200);
            }
            for(int r=0; r<FILA; r++){
                    suma=suma+tabla[r][r];
                    media=suma/repet;
                    repet++;
                    if (tabla[r][r]>maximo) {
                        maximo=tabla[r][r];
                    }
                    if (tabla[r][r]>minimo) {
                    minimo=tabla[r][r];
                }
            }
        }
        for(int r=0; r<FILA; r++){
            System.out.print(" "+tabla[r][r]);
        }
        System.out.println();
        System.out.println("maximo: "+maximo);
        System.out.println("minimo: "+minimo);
        System.out.println("media: "+media);
    }
}
