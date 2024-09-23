import java.util.Scanner;

public class MenuHotel {
    private String titulo;
    private String[] opciones;
    public MenuHotel(String titulo, int numeroOpciones) {
        this.opciones = new String[numeroOpciones];
        this.titulo = titulo;
    }
    public void guardarOpcion(String texto, int posicion) {
        if (posicion < this.opciones.length) {
            this.opciones[posicion] = texto;
        }
    }
    public void mostrar() {
        System.out.println("Titulo: " + this.titulo);
        for (int i = 0; i < this.opciones.length; i++) {
            System.out.println(i + ".   " + this.opciones[i]);
        }
    }
    public int leerOpcion() {
        int opcion;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Introduce opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine();
        } while (opcion < 0 || opcion >= this.opciones.length);
        return opcion;
    }
}
