import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class E7_GenerarNombresFichero {
    public static void main(String[] args) throws IOException {

try{
    Random aleatorio = new Random();
    Scanner teclado = new Scanner(System.in);
    ArrayList<String>nomes = new ArrayList<>();
    ArrayList<String>apelidos = new ArrayList<>();
    String nombreFichero = "usa_persoas";
    int numeroNombres = 0;





        //LecturaNomes
        BufferedReader bufferLeerNomes = new BufferedReader(
                new FileReader("documentos/usa_nombres.txt"));
        String lineaNomes = bufferLeerNomes.readLine();
        while (lineaNomes != null) {
            nomes.add(lineaNomes);
            lineaNomes = bufferLeerNomes.readLine();
        }
        bufferLeerNomes.close();







        //LecturaApelidos
        BufferedReader bufferLeerApelidos = new BufferedReader(
                new FileReader("documentos/usa_apellidos.txt"));
        String lineaApelidos = bufferLeerApelidos.readLine();
        while (lineaApelidos != null) {
            apelidos.add(lineaApelidos);
            lineaApelidos = bufferLeerApelidos.readLine();
        }
        bufferLeerApelidos.close();

    System.out.println("Introduce cantidad de nombres aleatorios:");
    numeroNombres = Integer.parseInt(teclado.nextLine());
    System.out.println("Introduce nombre del fichero:");
    nombreFichero = teclado.nextLine();

        bufferLeerApelidos.close();









        //EscrituraArchivo
        BufferedWriter bufferCrear = new BufferedWriter(
                new FileWriter("documentos/"+nombreFichero+".txt")
        );
    //Generatador
    int i = 0;
    while(i<numeroNombres) {
        String nombre = nomes.get(aleatorio.nextInt(0,nomes.size()))+
                ","+apelidos.get(aleatorio.nextInt(0,nomes.size()));
        System.out.println(nombre);
        bufferCrear.write(nombre+"\n");
        i++;
    }
    bufferCrear.close();









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
