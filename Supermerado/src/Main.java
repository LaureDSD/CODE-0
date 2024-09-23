import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        try {
            ArrayList<Producto> productos = new ArrayList<>();

            //Leer
            BufferedReader leer = new BufferedReader(new FileReader("src/productos.txt"));
            String linea;
            String nombre = "";
            Double precio = 0.0;
            String descripcion = "";
            while ((linea = leer.readLine()) != null) {
                String[] cadena = linea.split(",");
                int contador = 0;
                for (int i = 0; i < cadena.length; i++) {
                    if (contador == 0) {
                        nombre = cadena[i].trim();
                        contador++;
                    } else if (contador == 1) {

                            precio = Double.parseDouble(cadena[i].trim());
                        if(precio<0) {
                            throw new PreciosException("Precio negativo");
                        }
                        contador++;
                    } else if (contador == 2) {
                        descripcion = cadena[i].trim();

                        productos.add(new Producto(nombre, precio, descripcion));
                        contador = 0;
                    }
                }
            }


            HashMap<String, Integer> frecuencia = new HashMap<>();
            //Fracuencia de palabras
            for (Producto producto : productos) {
                String[] contar = producto.getDescripcion().split(" ");
                for (int i = 0; i < contar.length; i++) {
                    if (frecuencia.containsKey(contar[i].trim().toLowerCase())) {
                        frecuencia.put(contar[i].trim().toLowerCase(), frecuencia.get(contar[i]) + 1);
                    } else {
                        frecuencia.put(contar[i].trim().toLowerCase(), 1);
                    }
                }
            }

            for (Map.Entry key_value : frecuencia.entrySet()) {
                System.out.println(key_value);
            }

            //Exscribir
            Collections.sort(productos);
            for (Producto producto : productos) {
                System.out.println(producto);
            }


            //Escribir
            BufferedWriter escribir = new BufferedWriter(new FileWriter("src/salida.txt"));

            escribir.write("productos 2: "+"\n");
            escribir.write(productos.toString().replace("},","},\n"));

            escribir.write("productos: "+"\n");
            for (Producto producto : productos) {
                escribir.write(producto.toString()+"\n");
            }



            //escribir.write(frecuencia.toString());
            escribir.write("Contadas: "+"\n");
            for (Map.Entry key_value : frecuencia.entrySet()) {
                escribir.write(key_value.toString()+"\n");
            }
            escribir.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }


}