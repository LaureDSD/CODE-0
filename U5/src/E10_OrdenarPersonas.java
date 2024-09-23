
import java.io.*;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class E10_OrdenarPersonas {
    public static void main(String[] args) {

        try{
            ArrayList<Persona> personas = new ArrayList<>();
            //Guardado
            BufferedWriter bufferCrear = new BufferedWriter(
                    new FileWriter("documentos/personas.txt")
            );
            bufferCrear.write("Pérez Álvarez"+"\n"+
                    "María"+"\n"+
                    "1990"+"\n");
            bufferCrear.write("García Fernández"+"\n"+
                    "Juan"+"\n"+
                    "2000"+"\n");
            bufferCrear.write("González Iglesias"+"\n"+
                    "Ramón"+"\n"+
                    "1999"+"\n");
            bufferCrear.write("García Fernández"+"\n"+
                    "Ana"+"\n"+
                    "1980"+"\n");
            bufferCrear.write("Álvarez González"+"\n"+
                    "Teresa"+"\n"+
                    "1995"+"\n");
            bufferCrear.write("Alvarez González"+"\n"+
                    "Teresa"+"\n"+
                    "1995");
            bufferCrear.close();
            //LecturaNomes
            String nome = "Default";
            String apellido = "Default";
            int ano = 0;
            BufferedReader bufferLeerNomes = new BufferedReader(
                    new FileReader("documentos/personas.txt"));
            String linea = bufferLeerNomes.readLine();
            int contador=0;
            while (linea != null) {
                    if(contador==0){
                        //apellido = covertir(linea);
                        apellido = linea;
                        contador++;
                    }else if(contador==1){
                        //nome = covertir(linea);
                        nome = linea;
                        contador++;
                    }else if (contador==2){
                        ano = Integer.parseInt(linea);
                        contador=0;
                        personas.add(new Persona(nome,apellido,ano));
                    }
                linea = bufferLeerNomes.readLine();
            }
            bufferLeerNomes.close();
            //Guardado
            BufferedWriter bufferEscribir = new BufferedWriter(
                    new FileWriter("documentos/ordenadas.txt")
            );
            Collections.sort(personas);
            for(Persona p : personas){
                bufferEscribir.write(p.apellido+"\n");
                bufferEscribir.write(p.nombre+"\n");
                bufferEscribir.write(p.nacimiento+"\n");
            }
            bufferEscribir.close();
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
