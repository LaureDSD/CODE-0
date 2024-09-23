import java.io.File;

public class Ejemplo1 {
    public static void main(String[] args) {
// Dos rutas absolutas
            File carpetaAbs = new File("/home/usuario/fotos");
            File archivoAbs = new File("/home/usuario/fotos/foto1.jpg");
// Dos rutas relativas
            File carpetaRel = new File("trabajos");
            File archivoRel = new File("trabajos/documento.txt");
// Mostrar sus rutas
            mostrarRutas(carpetaAbs);
            mostrarRutas(archivoAbs);
            mostrarRutas(carpetaRel);
            mostrarRutas(archivoRel);
        }

    public static void mostrarRutas(File f) {
        System.out.println("getParent() : " + f.getParent());
        System.out.println("getName() : " + f.getName());
        System.out.println("getAbsolutePath(): " + f.getAbsolutePath()
                + "\n");

    }
}
