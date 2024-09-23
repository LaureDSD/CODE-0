import java.util.*;


public class Main {
    public static void main(String[] args) {
        //Ej1,2
        //generarNumerosAleatorios();
        //Ej3,4
        textoPalabraOrdenada();
        //EJ5;
        //articulosAleatorios();
    }

    private static void articulosAleatorios() {
        TreeSet<Producto> productos;
        //productos = new TreeSet<>();
        //productos = new TreeSet<>(Comparator.reverseOrder());
        //productos = new TreeSet<>(Comparator.comparing(Producto::getNombre));
        //productos = new TreeSet<>(Comparator.comparingDouble(Producto::getPrecio));
        //productos = new TreeSet<>(Comparator.comparing(Producto::getNombre).reversed());
        productos = new TreeSet<>(Comparator.comparingDouble(Producto::getPrecio).reversed());

        productos.add(new Producto("P1",1));
        productos.add(new Producto("P3",2));
        productos.add(new Producto("P5",4));
        productos.add(new Producto("P7",6));
        productos.add(new Producto("P2",18));
        productos.add(new Producto("P4",6));
        productos.add(new Producto("P6",8));
        System.out.println(productos);
    }

    //Salida de ArrasyList
    //Collections.sort(aleatorios,Comparator.comparingDouble(Producto::getPrecio).reversed());


    private static void textoPalabraOrdenada() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce Frase");
        String fraseLarga = teclado.nextLine();
        System.out.println("Indica orden (press enter) o escribe (invertido)");
        TreeSet<String> palabras;
        String seleccion = teclado.nextLine();

        if(seleccion.equals("invertido")){
            palabras = new TreeSet<>(Comparator.reverseOrder());
        }else{
            palabras = new TreeSet<>();
        }
        String[] palabra = fraseLarga.split(" ");
        for(String p : palabra){
            palabras.add(p.replace("[^a-zA-Z]", ""));
        }
        Collections.addAll(palabras, palabra);


        System.out.println(palabras);

        }

    private static void generarNumerosAleatorios() {
        Random aleatorio = new Random();

        //Array list para entender
        ArrayList<Integer> aleatorios = new ArrayList<>();
        do {aleatorios.add(aleatorio.nextInt(1, 100));
        }while(aleatorios.size()<=100);
        aleatorios.sort(Comparator.reverseOrder());
        System.out.println(aleatorios);

        //Comparator.reverse, es parte 2.
        TreeSet<Integer> aleatorios2 = new TreeSet<>(Comparator.reverseOrder());
        do {aleatorios2.add(aleatorio.nextInt(1, 100));
        }while(aleatorios2.size()<=100);
        System.out.println(aleatorios);


    }
}
