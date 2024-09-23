package UD2.Tarea4;

public class E1_ArrayAsignacion12Numros {
    public static void main(String[] args) {
        int[] arraytest;
        arraytest = new int[12];
        arraytest[0] = 39;
        arraytest[1] = -2;
        arraytest[4] = 0;
        arraytest[6] = 14;
        arraytest[8] = 5;
        arraytest[9] = 120;

        for(int i=0; i<arraytest.length; i++){
            System.out.print(arraytest[i]+ " ");
        }
        System.out.println();
    }
}
