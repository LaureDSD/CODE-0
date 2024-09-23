package TEMA0;

import javax.management.StringValueExp;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena = teclado.nextLine();

        String[] casa  = new String [cadena.length()];

        //String cadena = "Hola Mundo";
        char[] caracteres = cadena.toCharArray();

        int contador=0;
        for (char c : caracteres) {
            casa[contador] = String.valueOf(c);

            System.out.println(c);
            contador++;
        }

        System.out.println("---------------------------------------------------------------------------");

        int i=0;
        do{

            if(casa[i].isEmpty()) {
                System.out.println("HOLA");
            }else{
                System.out.print(casa[i]);
            }
            i++;
        }while(i<casa.length);

        System.out.println("-----------------------------------------------------------------------------");
        //String cad;
        //for(String casarecorrrido : casa){
        //    cad=cad.concat(casarecorrrido);
       // }
    }
}
