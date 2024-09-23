
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList<T> {

    //Variable lista
    private List<T> listaRandom;

    //Constructor vacio
    public RandomList() {
        listaRandom = new ArrayList<>();
    }

    //Constructor que pide lista
    public RandomList(List<T> lista) throws Exception {
        if ( lista.isEmpty() ) {
            throw new RandomListException ("Lista de entrada vacia");
        }else{
            lista = new ArrayList<>(lista);
        }
    }

    //Añadir elemento a la lista
    boolean add(T elemento){
        if (listaRandom.contains(elemento)) {
            return false;
        }else{
            listaRandom.add(elemento);
            return true;
        }
    }

    //Pedir elemento aleatorio de la lista
    T get () throws RandomListException {
        if(listaRandom.isEmpty()) {
            throw new RandomListException("Lista de lectura vacia");
        }
        else if (!listaRandom.isEmpty()){
            Random aleatorio = new Random();
            int posicion = aleatorio.nextInt(0, listaRandom.size());
            T objeto = listaRandom.get(posicion);
            listaRandom.remove(posicion);
            return objeto;
        }
        return null;
    }

    //Borrar elemento de la lista
    boolean remove (T elemento){
        if(elemento!=null) {
            if (listaRandom.contains(elemento)) {
                listaRandom.remove(elemento);
                return true;
            }
        }
            return false;
    }

    //Limpiar lista
    void clear (){
        listaRandom.clear();
    }

    //Tamaño de la lista
    int size (){
        return listaRandom.size();
    }
}
