package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Crear un HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Añadir pares clave-valor al HashMap
        map.put("Manzana", 3);
        map.put("Banana", 2);
        map.put("Cereza", 5);
        System.out.println("HashMap después de añadir elementos: " + map);

        // Acceder a un valor usando una clave
        int bananas = map.get("Banana");
        System.out.println("Cantidad de Bananas: " + bananas);

        // Modificar el valor asociado con una clave
        map.put("Banana", 4);
        System.out.println("HashMap después de modificar el valor de 'Banana': " + map);

        // Eliminar un par clave-valor usando una clave
        map.remove("Cereza");
        System.out.println("HashMap después de eliminar 'Cereza': " + map);

        // Comprobar si el HashMap contiene una clave específica
        boolean containsManzana = map.containsKey("Manzana");
        System.out.println("¿Contiene 'Manzana'? " + containsManzana);

        // Comprobar si el HashMap contiene un valor específico
        boolean containsValue4 = map.containsValue(4);
        System.out.println("¿Contiene el valor 4? " + containsValue4);

        // Obtener el tamaño del HashMap
        int size = map.size();
        System.out.println("Tamaño del HashMap: " + size);

        // Iterar sobre los pares clave-valor del HashMap usando entrySet
        System.out.println("Elementos del HashMap:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        // Iterar sobre las claves del HashMap usando keySet
        System.out.println("Claves del HashMap:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        // Iterar sobre los valores del HashMap usando values
        System.out.println("Valores del HashMap:");
        for (int value : map.values()) {
            System.out.println(value);
        }

        // Limpiar todos los elementos del HashMap
        map.clear();
        System.out.println("HashMap después de limpiarlo: " + map);

        // Comprobar si el HashMap está vacío
        boolean isEmpty = map.isEmpty();
        System.out.println("¿Está vacío el HashMap? " + isEmpty);
    }
}

