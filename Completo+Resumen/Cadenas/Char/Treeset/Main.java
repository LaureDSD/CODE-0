package Cadenas.Char.Treeset;

import java.util.TreeSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Crear un TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Añadir elementos al TreeSet
        treeSet.add("Manzana");
        treeSet.add("Banana");
        treeSet.add("Cereza");
        treeSet.add("Durazno");
        System.out.println("TreeSet después de añadir elementos: " + treeSet);  // Output: [Banana, Cereza, Durazno, Manzana]

        // Intentar añadir un elemento duplicado
        treeSet.add("Banana");
        System.out.println("TreeSet después de intentar añadir 'Banana' de nuevo: " + treeSet);  // Output: [Banana, Cereza, Durazno, Manzana]

        // Acceder al primer y último elemento
        String firstElement = treeSet.first();
        String lastElement = treeSet.last();
        System.out.println("Primer elemento: " + firstElement);  // Output: Banana
        System.out.println("Último elemento: " + lastElement);  // Output: Manzana

        // Eliminar un elemento específico
        treeSet.remove("Cereza");
        System.out.println("TreeSet después de eliminar 'Cereza': " + treeSet);  // Output: [Banana, Durazno, Manzana]

        // Comprobar si el TreeSet contiene un elemento específico
        boolean containsDurazno = treeSet.contains("Durazno");
        System.out.println("¿Contiene 'Durazno'? " + containsDurazno);  // Output: true

        // Iterar sobre los elementos del TreeSet usando un iterator
        System.out.println("Elementos del TreeSet:");
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // Output:
        // Elementos del TreeSet:
        // Banana
        // Durazno
        // Manzana

        // Iterar sobre los elementos del TreeSet usando un bucle for-each
        System.out.println("Elementos del TreeSet (usando for-each):");
        for (String item : treeSet) {
            System.out.println(item);
        }
        // Output:
        // Elementos del TreeSet (usando for-each):
        // Banana
        // Durazno
        // Manzana

        // Obtener el tamaño del TreeSet
        int size = treeSet.size();
        System.out.println("Tamaño del TreeSet: " + size);  // Output: 3

        // Limpiar todos los elementos del TreeSet
        treeSet.clear();
        System.out.println("TreeSet después de limpiarlo: " + treeSet);  // Output: []

        // Comprobar si el TreeSet está vacío
        boolean isEmpty = treeSet.isEmpty();
        System.out.println("¿Está vacío el TreeSet? " + isEmpty);  // Output: true
    }
}

