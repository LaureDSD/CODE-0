package menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Menu {
    private static final String RESET = "\u001B[0m",AZUL ="\u001B[34m",ROJO = "\u001B[31m";
    private String titulo;
    private List<String > opciones;

    public Menu(String titulo) {
        this.titulo = titulo;
        opciones = new ArrayList<>();
    }

    public void guardarOpcion(String texto) {
        opciones.add(texto);
    }

    public void mostrar() {
        System.out.println(AZUL + this.titulo + RESET);
        for (int i = 0; i < this.opciones.size(); i++) {
            System.out.println(AZUL+"\t"+ i + ".   " + this.opciones.get(i) +RESET);
        }
    }

    public int leerOpcion() {
        int opcion;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print( AZUL + "Introduce opcion: " +RESET);
            opcion = teclado.nextInt();
            teclado.nextLine();
            if(opcion < 0 || opcion >= this.opciones.size()) {
                System.out.println(ROJO+"Error: Valor no valido"+RESET);
            }
        } while (opcion < 0 || opcion >= this.opciones.size());
        return opcion;
    }
}
