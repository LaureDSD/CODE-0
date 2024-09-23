import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class E11_OrdenarPersonas2 {
    public static void main(String[] args) {

        try{
            FileOutputStream fileOut = new FileOutputStream("documentos/personas.dat");
            DataOutputStream dataOut = new DataOutputStream(fileOut);



            Scanner teclado = new Scanner(System.in);
            HashMap<Integer,Persona> personas = new HashMap<>();
            String nombre;
            String apellido;
            int año;
            int dni=0;
            //Guardado
            do{
                System.out.println("Indica dni (negativo para salir)");
                dni = Integer.parseInt(teclado.nextLine());
                if(dni>=0) {
                    System.out.println("Indica nombre");
                    nombre = teclado.nextLine();
                    System.out.println("Indica apellido");
                    apellido = teclado.nextLine();
                    System.out.println("Indica año");
                    año = Integer.parseInt(teclado.nextLine());
                    personas.put(dni, new Persona(nombre, apellido, año));
                }
            } while(dni>=0);
            personas.put(56, new Persona("nombre1", "apellido1", 1));
            personas.put(57, new Persona("nombre2", "apellido1", 2));
            personas.put(58, new Persona("nombre3", "apellido2", 3));


            ArrayList<HashMap.Entry<Integer,Persona>> array = new ArrayList<>(personas.entrySet());
            array.sort(HashMap.Entry.comparingByValue());
            for(HashMap.Entry<Integer,Persona> dp : array) {
                dataOut.writeUTF(dp+"\n");
            }

            dataOut.close();
            fileOut.close();

            //Fallos
        } catch (FileNotFoundException e) {
            System.out.println("Error al acceder al fichero " + e);
        } catch (IOException e) {
            System.out.println("No se ha podido escribir en el fichero");

        } catch (Exception e) {
            System.out.println("Error al acceder al fichero " + e);
        }
    }
}
