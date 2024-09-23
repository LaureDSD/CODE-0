import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class Main_Principal {
    public static void main(String[] args) {
        Biblioteca_Programa biblioteca = new Biblioteca_Programa();
        Scanner scanner = new Scanner(System.in);

        biblioteca.agregarPublicacion(new Libro_SubObjeto("El Quijote", "Miguel de Cervantes", "1234567890"));
        biblioteca.agregarPublicacion(new Libro_SubObjeto("Cien Años de Soledad", "Gabriel García Márquez", "0987654321"));
        biblioteca.agregarPublicacion(new Libro_SubObjeto("La Sombra del Viento", "Carlos Ruiz Zafón", "1122334455"));
        System.out.println("Libros en la biblioteca:");
        System.out.println(biblioteca);
        System.out.println("Libros en la biblioteca Ordenados2:");
        biblioteca.obtenerPublicacionesOrdenadas().forEach(System.out::println);

        try {
            Gestor_Ficheros.escribirPublicacionesAFichero("publicaciones.txt", biblioteca.obtenerPublicaciones());
            System.out.println("Publicaciones escritas en 'publicaciones.txt'");
        } catch (IOException e) {
            System.err.println("Error escribiendo las publicaciones en el fichero: " + e.getMessage());
        }

        Biblioteca_Programa nuevaBiblioteca = new Biblioteca_Programa();
        try {
            Gestor_Ficheros.leerPublicacionesDeFichero("publicaciones.txt", nuevaBiblioteca);
            System.out.println("Publicaciones leídas de 'publicaciones.txt':");
            System.out.println(nuevaBiblioteca);
        } catch (IOException e) {
            System.err.println("Error leyendo las publicaciones del fichero: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // Uso de if, switch, bucles y más
        boolean continuar = true;
        while (continuar) {
            System.out.println("Menú de la Biblioteca:");
            System.out.println("1. Agregar Publicación");
            System.out.println("2. Eliminar Publicación");
            System.out.println("3. Buscar Publicación por ISBN");
            System.out.println("4. Mostrar Publicaciones");
            System.out.println("5. Demostrar Modificadores de Strings");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese ISBN: ");
                    String isbn = scanner.nextLine();
                    biblioteca.agregarPublicacion(new Libro_SubObjeto(titulo, autor, isbn));
                    break;
                case 2:
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
                    break;
                case 3:
                    System.out.print("Ingrese ISBN de la publicación a buscar: ");
                    String isbnBuscar = scanner.nextLine();
                    Publicacion_Objeto publicacionEncontrada = biblioteca.buscarPorIsbn(isbnBuscar);
                    if (publicacionEncontrada != null) {
                        System.out.println("Publicación encontrada: " + publicacionEncontrada);
                    } else {
                        System.out.println("Publicación no encontrada.");
                    }
                    break;
                case 4:
                    System.out.println("Publicaciones en la biblioteca:");
                    Iterator<Publicacion_Objeto> iterator = biblioteca.obtenerPublicaciones().iterator();
                    while (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }

                    Iterator<Publicacion_Objeto> iterator1  = biblioteca.obtenerPublicaciones().iterator();
                    while (iterator1.hasNext()) {
                        System.out.println(iterator1.next());
                    }


                    break;
                case 5:
                    demostrarModificadoresDeStrings(biblioteca);
                    break;
                case 6:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        scanner.close();
    }

    private static void demostrarModificadoresDeStrings(Biblioteca_Programa biblioteca) {
        System.out.println("Demostrando modificadores de Strings usando datos de la biblioteca:");

        // Ejemplo con el título de la primera publicación
        Publicacion_Objeto primeraPublicacion = biblioteca.obtenerPublicaciones().iterator().next();
        String titulo = primeraPublicacion.getTitulo();
        System.out.println("Título original: '" + titulo + "'");

        // split(String regex): Separa por espacios.
        String[] palabras = titulo.split(" ");
        System.out.println("split(\" \"): ");
        for (String palabra : palabras) {
            System.out.println("'" + palabra + "'");
        }

        // trim(): Quita espacios en blanco.
        String tituloTrim = titulo.trim();
        System.out.println("trim(): '" + tituloTrim + "'");

        // replace(char oldChar, char newChar): Cambia caracteres.
        String tituloReplace = titulo.replace('a', '@');
        System.out.println("replace('a', '@'): '" + tituloReplace + "'");

        // substring(int beginIndex, int endIndex): Extrae cadenas.
        String tituloSubstring = titulo.substring(0, 5);
        System.out.println("substring(0, 5): '" + tituloSubstring + "'");

        // toUpperCase() y toLowerCase(): Mayusculas o minusculas.
        String tituloUpper = titulo.toUpperCase();
        String tituloLower = titulo.toLowerCase();
        System.out.println("toUpperCase(): '" + tituloUpper + "'");
        System.out.println("toLowerCase(): '" + tituloLower + "'");

        // startsWith(String prefix) y endsWith(String suffix): Busca cadenas.
        boolean empiezaCon = titulo.startsWith("El");
        boolean terminaCon = titulo.endsWith("te");
        System.out.println("startsWith(\"El\"): " + empiezaCon);
        System.out.println("endsWith(\"te\"): " + terminaCon);

        // indexOf(String str) y lastIndexOf(String str): Busca comienzo o fin.
        int indiceDe = titulo.indexOf("a");
        int ultimoIndiceDe = titulo.lastIndexOf("a");
        System.out.println("indexOf(\"a\"): " + indiceDe);
        System.out.println("lastIndexOf(\"a\"): " + ultimoIndiceDe);

        // charAt(int index): Toma letra en posicion.
        char charEnPosicion = titulo.charAt(2);
        System.out.println("charAt(2): '" + charEnPosicion + "'");

        // isEmpty(): Indica si esta vacio.
        boolean estaVacio = titulo.isEmpty();
        System.out.println("isEmpty(): " + estaVacio);

        // contains(CharSequence s): Indica si contiene.
        boolean contiene = titulo.contains("Quijote");
        System.out.println("contains(\"Quijote\"): " + contiene);

        // length(): Indica longitud.
        int longitud = titulo.length();
        System.out.println("length(): " + longitud);

        // substring(int beginIndex): Extrae posicion desde.
        String tituloSubstringDesde = titulo.substring(3);
        System.out.println("substring(3): '" + tituloSubstringDesde + "'");

        // concat(String str): Une cadenas.
        String tituloConcat = titulo.concat(" - Una obra maestra");
        System.out.println("concat(\" - Una obra maestra\"): '" + tituloConcat + "'");

        // equalsIgnoreCase(String anotherString): Compara sin revisar tamanos.
        boolean igualesSinTamaño = titulo.equalsIgnoreCase("el quijote");
        System.out.println("equalsIgnoreCase(\"el quijote\"): " + igualesSinTamaño);
    }
}

