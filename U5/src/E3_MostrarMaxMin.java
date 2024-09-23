import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class E3_MostrarMaxMin {
    public static void main(String[] args) {
        try {
            BufferedReader buffer = new BufferedReader(
                    new FileReader("documentos/numeros.txt")
            );
            int maximo = Integer.MIN_VALUE;
            int minimo = Integer.MAX_VALUE;
            int numero;
            String linea = buffer.readLine();
            /////////////AJUSTE///////////////
            if (linea != null) {
                ////////////////////////////
                while (linea != null) {
                    numero = Integer.parseInt(linea);
                    linea = buffer.readLine();
                    if (numero > maximo) {
                        maximo = numero;
                    } else if (numero < minimo) {
                        minimo = numero;
                    }
                }

                System.out.println(maximo);
                System.out.println(minimo);
                /////////////AJUSTE////////////////
            } else {
                System.out.println("vacio");
            }
            buffer.close();
            //////////////////////////////


        } catch (FileNotFoundException e) {
            System.out.println("Error al acceder al fichero " + e);
        } catch (IOException e) {
            System.out.println("No se ha podido escribir en el fichero");
        } catch (Exception e) {
            System.out.println("Error al acceder al fichero " + e);
        }
    }
}
