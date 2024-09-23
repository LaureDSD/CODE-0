import java.util.Iterator;
import java.util.Scanner;

public class Main_EjemploMenu {
    public static void m1(String[] args) {
        Biblioteca_Programa biblioteca = new Biblioteca_Programa();
        Scanner scanner = new Scanner(System.in);
        Menu_Utilidad menu = new Menu_Utilidad("Menú de la Biblioteca", 6);

        menu.guardarOpcion("Agregar Publicación", 0);
        menu.guardarOpcion("Eliminar Publicación", 1);
        menu.guardarOpcion("Buscar Publicación por ISBN", 2);
        menu.guardarOpcion("Mostrar Publicaciones", 3);
        menu.guardarOpcion("Demostrar Modificadores de Strings", 4);
        menu.guardarOpcion("Salir", 5);

        boolean continuar = true;
        while (continuar) {
            menu.mostrar();
            int opcion = menu.leerOpcion();

            switch (opcion) {
                case 0:
                    agregarPublicacion(biblioteca, scanner);
                    break;
                case 1:
                    eliminarPublicacion(biblioteca, scanner);
                    break;
                case 2:
                    buscarPublicacionPorISBN(biblioteca, scanner);
                    break;
                case 3:
                    mostrarPublicaciones(biblioteca);
                    break;
                case 4:
                    demostrarModificadoresDeStrings(biblioteca);
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        scanner.close();
    }

    private static void agregarPublicacion(Biblioteca_Programa biblioteca, Scanner scanner) {
        System.out.print("Ingrese título: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese autor: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese ISBN: ");
        String isbn = scanner.nextLine();
        biblioteca.agregarPublicacion(new Libro_SubObjeto(titulo, autor, isbn));
    }

    private static void eliminarPublicacion(Biblioteca_Programa biblioteca, Scanner scanner) {
        System.out.print("Ingrese ISBN de la publicación a eliminar: ");
        String isbnEliminar = scanner.nextLine();
        try {
            Publicacion_Objeto publicacionEliminar = biblioteca.buscarPorIsbn(isbnEliminar);
            if (publicacionEliminar != null) {
                biblioteca.eliminarPublicacion(publicacionEliminar);
                System.out.println("Publicación eliminada.");
            } else {
                System.out.println("Publicación no encontrada.");
            }
        } catch (Exception_Personalizada e) {
            System.out.println(e.getMessage());
        }
    }

    private static void buscarPublicacionPorISBN(Biblioteca_Programa biblioteca, Scanner scanner) {
        System.out.print("Ingrese ISBN de la publicación a buscar: ");
        String isbnBuscar = scanner.nextLine();
        Publicacion_Objeto publicacionEncontrada = biblioteca.buscarPorIsbn(isbnBuscar);
        if (publicacionEncontrada != null) {
            System.out.println("Publicación encontrada: " + publicacionEncontrada);
        } else {
            System.out.println("Publicación no encontrada.");
        }
    }

    private static void mostrarPublicaciones(Biblioteca_Programa biblioteca) {
        System.out.println("Publicaciones en la biblioteca:");
        Iterator<Publicacion_Objeto> iterator = biblioteca.obtenerPublicaciones().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void demostrarModificadoresDeStrings(Biblioteca_Programa biblioteca) {
        // Implementación de demostrarModificadoresDeStrings() omitida por brevedad
    }
}
