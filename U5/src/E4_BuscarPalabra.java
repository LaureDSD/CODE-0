import java.io.*;

public class E4_BuscarPalabra {
    public static void main(String[] args) {

        try {
//Creacion
            BufferedWriter buffer = new BufferedWriter(
                    new FileWriter("documentos/buscarTexto.txt")
            );
            for(int i=0 ;i<1;i++) {
                buffer.write("Laureano DeSousa  [ pepe ] Laureano DeSousa");
                buffer.write("Laureano DeSousa [ pepe ]  Laureano DeSousa");
                buffer.write("Laureano [ pepe ] DeSousa\n Laureano [ pepe ] DeSousa");
                buffer.write("Laureano DeSousa \n Laureano DeSousa [");
                buffer.write("pepe");
            }
            buffer.close();
//Lectura
            int contadorOcurrencias =0;
            String palabra = "DeSousa";

            BufferedReader buff = new BufferedReader(
                    new FileReader("documentos/buscarTexto.txt")
            );
            String linea = buff.readLine();
            while (linea != null) {
                String[] text = linea.split(palabra);
                if(text.length>1) {
                    contadorOcurrencias += text.length-1;
                }else if(text.length>0){
                    contadorOcurrencias += text.length;
                }
                linea = buff.readLine();
            }
            buff.close();
            System.out.println("Contador:"+contadorOcurrencias);
        } catch (FileNotFoundException e) {
            System.out.println("Error al acceder al fichero " + e);
        } catch (IOException e) {
            System.out.println("No se ha podido escribir en el fichero");
        } catch (Exception e) {
            System.out.println("Error al acceder al fichero " + e);
        }

    }

}
