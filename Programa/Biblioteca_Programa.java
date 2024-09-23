import java.util.*;

public class Biblioteca_Programa {
    private List<Publicacion_Objeto> publicaciones;
    private Set<Publicacion_Objeto> publicacionesSet;
    private Map<String, Publicacion_Objeto> publicacionesMap;




    public Biblioteca_Programa() {
        this.publicaciones = new ArrayList<>();
        this.publicacionesSet = new TreeSet<>(Comparator.reverseOrder());
        this.publicacionesMap = new HashMap<>();
    }




    public void agregarPublicacion(Publicacion_Objeto publicacion) {
        publicaciones.add(publicacion);
        publicacionesSet.add(publicacion);
        publicacionesMap.put(publicacion.getIsbn(), publicacion);
    }




    public void eliminarPublicacion(Publicacion_Objeto publicacion) throws Exception_Personalizada {
        if (!publicaciones.remove(publicacion) || !publicacionesSet.remove(publicacion) || publicacionesMap.remove(publicacion.getIsbn()) == null) {
            throw new Exception_Personalizada("Publicación no encontrada: " + publicacion);


            //nombre.removeIf(o -> (o.getNumSub() == 0));
            //string algo.removeIf(n -> (n.charAt(0) == 'S'));
            //int algo.removeIf(n -> (n % 3 == 0));
        }else{

            //Borrado con iterador:
            Iterator iterador = publicaciones.iterator();

            while(iterador.hasNext()) {
                Publicacion_Objeto publicacionI = (Publicacion_Objeto) iterador.next();
                if(publicacionI.isbn.equals(publicacion.isbn)) {
                    iterador.remove();
                }
            }

        }
    }




    public List<Publicacion_Objeto> obtenerPublicaciones() {
        return publicaciones;
    }

    public Set<Publicacion_Objeto> obtenerPublicacionesOrdenadas() {
        return publicacionesSet;
    }

    public Publicacion_Objeto buscarPorIsbn(String isbn) {
        return publicacionesMap.get(isbn);
    }






    // Método para ordenar la lista de publicaciones por Ejemplares
    public void ordenarPorEjemplares() {

        Collections.sort(publicaciones);
        Collections.sort(publicaciones, Comparator.comparing(Publicacion_Objeto::getTitulo).reversed());

    }


    // Método para ordenar la lista de publicaciones por autor
    public void ordenarPorAutor() {
        Collections.sort(publicaciones, new Comparator<Publicacion_Objeto>() {
            @Override
            public int compare(Publicacion_Objeto publicacion1, Publicacion_Objeto publicacion2) {
                return publicacion1.getAutor().compareTo(publicacion2.getAutor());
            }
        });
    }





    // Método para ordenar la lista de publicaciones por ISBN
    public void ordenarPorISBN() {
        // No se puede ordenar un HashMap directamente, por lo que no se puede usar Collections.sort()
        // Puedes convertir el mapa a una lista ordenada de entradas y luego iterar sobre ella
        List<Map.Entry<String, Publicacion_Objeto>> listaOrdenada = new ArrayList<>(publicacionesMap.entrySet());
        Collections.sort(listaOrdenada, new Comparator<Map.Entry<String, Publicacion_Objeto>>() {
            @Override
            public int compare(Map.Entry<String, Publicacion_Objeto> entrada1, Map.Entry<String, Publicacion_Objeto> entrada2) {
                return entrada1.getKey().compareTo(entrada2.getKey());
            }
        });





        // Limpiar el mapa
        publicacionesMap.clear();




        // Volver a agregar las entradas ordenadas al mapa
        for (Map.Entry<String, Publicacion_Objeto> entrada : listaOrdenada) {
            publicacionesMap.put(entrada.getKey(), entrada.getValue());
        }
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Publicacion_Objeto publicacion : publicaciones) {
            sb.append(publicacion).append("\n");
        }
        return sb.toString();
    }
}
