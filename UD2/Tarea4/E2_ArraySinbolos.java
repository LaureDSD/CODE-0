package UD2.Tarea4;

public class E2_ArraySinbolos {
    public static void main(String[] args) {

        char[] simbolos;
        simbolos = new char[10];
        simbolos[0] = 'a';
        simbolos[1] = 'X';
        simbolos[4] = '@';
        simbolos[6] = ' ';
        simbolos[7] = '+';
        simbolos[8] = 'Q';

        for(int i=0; i<simbolos.length; i++){
            System.out.print(simbolos[i]+ " ");
        }
    }
}
