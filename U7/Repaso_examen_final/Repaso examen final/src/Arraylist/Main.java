package Arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear un ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Añadir elementos al ArrayList
        list.add("Manzana");
        list.add("Banana");
        list.add("Cereza");
        System.out.println("Lista después de añadir elementos: " + list);  // Output: [Manzana, Banana, Cereza]

        // Acceder a un elemento en una posición específica
        String fruit = list.get(1);
        System.out.println("Elemento en la posición 1: " + fruit);  // Output: Banana

        // Modificar un elemento en una posición específica
        list.set(1, "Mango");
        System.out.println("Lista después de modificar el elemento en la posición 1: " + list);  // Output: [Manzana, Mango, Cereza]

        // Eliminar un elemento en una posición específica
        list.remove(2);
        System.out.println("Lista después de eliminar el elemento en la posición 2: " + list);  // Output: [Manzana, Mango]

        // Obtener el tamaño del ArrayList
        int size = list.size();
        System.out.println("Tamaño del ArrayList: " + size);  // Output: 2

        // Comprobar si el ArrayList contiene un elemento específico
        boolean containsMango = list.contains("Mango");
        System.out.println("¿Contiene 'Mango'? " + containsMango);  // Output: true

        // Iterar sobre los elementos del ArrayList
        System.out.println("Elementos del ArrayList:");
        for (String item : list) {
            System.out.println(item);
        }
        // Output:
        // Elementos del ArrayList:
        // Manzana
        // Mango

        // Añadir todos los elementos de otra colección (otro ArrayList)
        ArrayList<String> anotherList = new ArrayList<>();
        anotherList.add("Durazno");
        anotherList.add("Piña");
        list.addAll(anotherList);
        System.out.println("Lista después de añadir todos los elementos de anotherList: " + list);  // Output: [Manzana, Mango, Durazno, Piña]

        // Limpiar todos los elementos del ArrayList
        list.clear();
        System.out.println("Lista después de limpiarla: " + list);  // Output: []

        // Comprobar si el ArrayList está vacío
        boolean isEmpty = list.isEmpty();
        System.out.println("¿Está vacío el ArrayList? " + isEmpty);  // Output: true
    }

}
