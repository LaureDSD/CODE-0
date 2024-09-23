import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static <Path> void main(String[] args) {
try {

    ArrayList<Persona> personas = new ArrayList<>();
    //Persona:
    Persona p1 = new Persona("aba", "aa", 17);
    Persona p2 = new Persona("aaa", "aa", 15);
    Persona p3 = new Persona("aaa", "aa", -1);
    personas.add(p1);
    personas.add(p2);
    personas.add(p3);

    //Lectura y escritua
    LecturaEscritura lectura1 = new LecturaEscritura("Juan");
    lectura1.getPalabraFichero();
    lectura1.setPalabraFichero();

    //Validar correo
    System.out.println("Correo valido: "+validarCorreo("correoprueba@gmail.com"));

    //Mostrar personas
    System.out.println("Ver personas: ");
    Collections.sort(personas);
    for (Persona persona : personas) {
        System.out.println(persona);
    }

    //Manipulacion de rutas
    manipularRutas();



    //Expresiones labda



}catch (Exception e){
    System.out.println(e.getMessage());
}
    }

    private static void manipularRutas() {
        Path ruta = Paths.get("directorio/subdirectorio/archivo.txt");
        System.out.println("Nombre del fichero: " + ruta.getFileName());
        System.out.println("Directorio padre: " + ruta.getParent());
        System.out.println("Ruta absoluta: " + ruta.toAbsolutePath());
        System.out.println("Ruta normalizada: " + ruta.normalize());
    }


    public static boolean validarCorreo(String correoElectronico) {
        String correo = "usuario@example.com";
        Pattern patron = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        Matcher matcher = patron.matcher(correo);
        return matcher.matches();
    }
}