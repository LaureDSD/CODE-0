import java.io.*;
import java.util.*;

public class E12_LeerFicheroDat {
    public static void main(String[] args) {

        try {
            Scanner teclado = new Scanner(System.in);
            HashMap<Integer,Persona> personas = new HashMap<>();
            String nombre = null;
            String apellido = null;
            int año=0,añoborrar=0;
            int dni = 0;
            String texto;

            // Abrimos el fichero binario para lectura
            FileInputStream fileIn = new FileInputStream("documentos/personas.dat");
            DataInputStream dataIn = new DataInputStream(fileIn);


            System.out.println("Cargando..");
            // Mientras haya datos disponibles...
            while (dataIn.available()>0){
            // Leemos un número y lo mostramos...
                texto = dataIn.readUTF();
                StringTokenizer tokenizer = new StringTokenizer(texto, " ,=");
                int contador=0;
                while (tokenizer.hasMoreTokens()) {
                     String valor=tokenizer.nextToken();
                    if(contador==0){
                        dni = Integer.parseInt(valor.trim());
                        contador++;
                    }else if(contador==1){
                        nombre = valor.trim();
                        contador++;
                    }else if(contador==2){
                        apellido = valor.trim();
                        contador++;
                    }else if (contador==3){
                        año= Integer.parseInt(valor.trim());
                        contador=0;
                        personas.put(dni, new Persona(nombre, apellido, año));
                    }
                }
            }





            // Cerramos el fichero
            dataIn.close();
            fileIn.close();

            FileOutputStream fileOut = new FileOutputStream("documentos/personas.dat");
            DataOutputStream dataOut = new DataOutputStream(fileOut);
            //Teclado
            System.out.println("Indica año a borrar:");
            añoborrar = Integer.parseInt(teclado.nextLine());
            //Informacion
            Iterator<Map.Entry<Integer, Persona>> iterator = personas.entrySet().iterator();
            System.out.println("Accines:");
            while(iterator.hasNext()){
                Map.Entry<Integer, Persona> persona = iterator.next();
                if(persona.getValue().getNacimiento()==añoborrar){
                    System.out.println("\tSe borrara: "+persona);
                    iterator.remove();
                }else{
                    System.out.println("\tSe conserva: "+persona);
                    dataOut.writeUTF(persona+"\n");
                }
            }
            dataOut.close();
            fileOut.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error al acceder al fichero " + e);
        } catch (IOException e) {
            System.out.println("No se ha podido escribir en el fichero");

        } catch (Exception e) {
            System.out.println("Error al acceder al fichero " + e);
        }

    }
}
