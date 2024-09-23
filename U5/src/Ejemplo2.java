import java.io.File;

public class Ejemplo2 {
    public static void main(String[] args) {
        File temp = new File("C:/Temp");
        File fotos = new File("C:/Temp/Fotos");
        File documento = new File("C:/Temp/Documento.txt");
        System.out.println(temp.getAbsolutePath()+" ¿existe? "

                +temp.exists());

        mostrarEstado(fotos);
        mostrarEstado(documento);
    }
    public static void mostrarEstado(File f) {
        System.out.println(f.getAbsolutePath()+" ¿archivo? "+f.isFile());
        System.out.println(f.getAbsolutePath()+" ¿carpeta? "

                +f.isDirectory());
    }
}
