package Clase_Generica;

import Exceptions_personalizada.MiException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lista_aleatoria<T> {
    private List<T> list;

    public Lista_aleatoria() {
        list = new ArrayList<>();
    }

    public Lista_aleatoria(List<T> list) {
        this.list = list;
    }

    boolean add(T elemento) {
        boolean result = false;

        if (!this.list.contains(elemento)) {
            this.list.add(elemento);
            result = true;
        }

        return result;
    }

    boolean remove(T elemento) {
        return this.list.remove(elemento);
    }

    T getRandom() throws MiException {
        if (this.list.isEmpty()) {
            throw new MiException("Lista esta vacia");
        }

        Random aleatorio = new Random();

        T nuevo=list.get(aleatorio.nextInt(list.size()));
        list.remove(nuevo);
        return nuevo;
    }

    void clear(){
        list.clear();
    }

    int size(){
        return list.size();
    }
}
