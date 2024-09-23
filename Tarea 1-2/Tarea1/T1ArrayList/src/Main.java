import alumnos.Alumno;
import coleccionMusical.ColeccionDiscos;
import coleccionMusical.Genero;
import coleccionMusical.Menu;
import juegoCartas.Carta;
import juegoCartas.Valor;
import personas.Persona;
import productos.Producto;
import java.util.Collections;
import java.util.HashMap;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        //1-3
        System.out.println("Ej"+1);
        //listaAlumnos();
        //2-3
        System.out.println("Ej"+2);
        //listaAleatorios();
        //4
        System.out.println("Ej"+4);
        //listaEnteros();
        //5
        System.out.println("Ej"+5);
        //listaCadenas();
        //6
        System.out.println("Ej"+6);
        //listaPersonas();
        //7
        System.out.println("Ej"+7);
        //listaProductos();
        //8
        System.out.println("Ej"+8);
        listaAlumnos2();
        //9-10
        System.out.println("Ej"+9);
        //guardarColeccionMusica();
        //11
        System.out.println("Ej"+11);
        //controlAcceso();
        //12-13
        System.out.println("Ej"+12);
        //minidiccionario();
        //14-15-16
        System.out.println("Ej"+14);
        juegoCartas();
        //17
        System.out.println("Ej"+17);
        //juegoBrisca();

    }

    private static void juegoBrisca() {
        //Contador puntos
        int puntos = 0;
        //HashMap JuegoCartas.Valor y numero
        HashMap<Valor, Integer> valorNumero = new HashMap<Valor, Integer>();
        valorNumero.put(Valor.As,11);
        valorNumero.put(Valor.Tres,10);
        valorNumero.put(Valor.Rey,4);
        valorNumero.put(Valor.Caballo,3);
        valorNumero.put(Valor.Sota,2);
        //Lista de cartas
        ArrayList<Carta> listCartas = new ArrayList<>();
        //Cantidad de cartas
        while (listCartas.size()< 5) {
            //Generar carta
            Carta newCarta = new Carta();
            //Comprobacion carta
            if ( !listCartas.contains(newCarta)  ) {
                //Guardar carta
                listCartas.add(newCarta);
            }
        }
        //Mostrar lista
        for(Carta c : listCartas){
            System.out.println(c.toString());
            //Sumar puntos
            if(valorNumero.containsKey(c.getValor())){
                puntos+=valorNumero.get(c.getValor());
            }
        }
        System.out.println("Total puntos: "+puntos);
    }


    ////////////////////////////////////////////////////////////////////////////////////////////
    private static void juegoCartas() {
        //Lista de cartas
        ArrayList<Carta> listCartas = new ArrayList<>();
        /*
        //Cantidad de cartas
        while (listCartas.size()< 10) {
            //Generar carta
            Carta carta = new Carta();
            //Comprobacion carta
            boolean contiene = false;
            for(Carta c : listCartas) {
                if (c.getValor().equals(carta.getValor()) && c.getPalo().equals(carta.getPalo()) && !contiene) {
                    contiene = true;
                }
            }
            //Guardar carta
            if(!contiene){
                listCartas.add(carta);
            }
        }
        */
        //Cantidad de cartas
        while (listCartas.size()< 10) {
            //Generar carta
            Carta carta = new Carta();
            if ( !listCartas.contains(carta)  ) {
                //Guardar carta
                listCartas.add(carta);
            }
        }
        //Ordena cartas
        Collections.sort(listCartas);
            //Mostrar lista
        for(Carta c : listCartas){
            System.out.println(c.toString());
        }
    }


    ////////////////////////////////////////////////////////////////////////////////////////////
    private static void minidiccionario() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        //HASH MAP
        HashMap<String, String> diccionario = new HashMap<String, String>();
        diccionario.put("hola","hello");
        diccionario.put("cat","gato");
        diccionario.put("dog","perro");
        diccionario.put("fish","pez");
        diccionario.put("fly","mosca");
        diccionario.put("cow","vaca");
        diccionario.put("butterfly","mariposa");
        diccionario.put("car","coche");
        diccionario.put("computer","ordenador");
        diccionario.put("inglish","ingles");
        diccionario.put("ireland","irlanda");
        diccionario.put("count","contar");
        diccionario.put("limit","limite");
        diccionario.put("truck","camion");
        diccionario.put("one","uno");
        diccionario.put("two","dos");
        diccionario.put("exit","salir");
        diccionario.put("good","bien");
        diccionario.put("shoe","zapato");
        diccionario.put("keyboard","teclado");
        //Variables Diccionario
        String palabraBuscar;
        //Variables juego
        String jugarSalir;
        String respuesta;
        String traducir ;
        String respuestaUsuario;
        int acierto;
        int fallo;
        int contarPalabras;
        int numeroRondas;
        int intentosPalabra;
        boolean correcto;
        //Diccionario
        do {
            System.out.println("PALABRA A BUSCAR >Palabra</>Exitdi<");
            palabraBuscar = teclado.nextLine();
            //Validar no nulls
            if (diccionario.get(palabraBuscar.toLowerCase()) != null) {
                System.out.println("Traduccion: " + diccionario.get(palabraBuscar.toLowerCase()));
            }
        }while(!palabraBuscar.toLowerCase().equals("exitdi"));

        //minijuego
        do {
            System.out.println("MUESTRA LO APRENDIDO >jugar</>exitgame<");
            //Seleccion
            jugarSalir = teclado.nextLine();
            //variables
            acierto=0;
            fallo=0;
            contarPalabras=0;
            //inicio juego
            if(jugarSalir.toLowerCase().equals("jugar")) {
                //Numero de rondas
                numeroRondas = 10;
                //Inicio de ronda
                while (numeroRondas > 0) {
                    //Palabra aleatoria
                        //Extrae traducir
                        traducir = (String) diccionario.keySet().toArray()[aleatorio.nextInt(0, 20)];
                        //Extrae respuesta de traducir
                        respuesta = diccionario.get(traducir);
                        //Cuenta palabras
                        contarPalabras++;
                        System.out.println("La palabra a traducir es: "+traducir);
                    //Intentos por palabra
                    intentosPalabra=5;
                    do{
                        //pedir respuesta
                        respuestaUsuario=teclado.nextLine();
                        //comparar respuesta
                        if(respuestaUsuario.equals(respuesta.toLowerCase())){
                            System.out.println("Correcto!!");
                            correcto=true;
                            acierto++;
                        }else{
                            System.out.println("Error!!");
                            correcto=false;
                            fallo++;
                            intentosPalabra--;
                            numeroRondas--;
                        }
                    }while(!correcto && intentosPalabra>0);
                    numeroRondas--;
                }
                //Puntiuaciones
                System.out.println("Palabras:"+contarPalabras);
                System.out.println("Aciertos:"+acierto);
                System.out.println("Fallos:"+fallo);
            }
            //fin programa
        } while (!jugarSalir.toLowerCase().equals("exitgame"));
    }


    ////////////////////////////////////////////////////////////////////////////////////////////
    private static void controlAcceso() {
        Scanner teclado = new Scanner(System.in);
        //HASH MAP
        HashMap<String, String> usuarios = new HashMap<String, String>();
        usuarios.put("pepe","abc123.");
        usuarios.put("maria","abc123.");
        //VARIABLES
        int intentos=3;
        String usuario;
        String contraseña;
        boolean correcta =false;
        //PROGRAMA
        do{
            //SELECCION USUARIO
            System.out.println("Indica usuario");
                usuario=teclado.nextLine();
            //SELECCION CONTRASEÑA
            System.out.println("Indica contraseña");
                contraseña=teclado.nextLine();
                //VALIDAR CONTRASEÑA
            if(usuarios.get(usuario)!=null && usuarios.get(usuario).equals(contraseña)){
                System.out.println("Acceso concedido");
                correcta=true;
               //INTENTOS
            }else{
                intentos--;
                System.out.println("Quedan "+intentos+" intentos");
            }
            //FIN BUCLE
        }while(intentos>0 && !correcta);
        //MENSAJE FINAL
        if(!correcta){
        System.out.println("Lo siento, no tiene acceso al área restringida");
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    private static void guardarColeccionMusica() {
        Scanner teclado = new Scanner(System.in);
        Random generarCod = new Random();
        //Crear coleccion
        ColeccionDiscos c1 = new ColeccionDiscos();
        //MENU DISCOS
        Menu mdiscos = new Menu("Coleccion de discos",5);
        mdiscos.guardarOpcion("Nuevo ColeccionMusical.Disco",0);
        mdiscos.guardarOpcion("Mostrar discos",1);
        mdiscos.guardarOpcion("Borrar ColeccionMusical.Disco",2);
        mdiscos.guardarOpcion("Modificar disco",3);
        mdiscos.guardarOpcion("Salir",4);
        //VARIABLES
        int opcion;
        int codigo=generarCod.nextInt(1, Integer.MAX_VALUE);
        String titulo = "Default";
        String autor = "Default";
        String anoPublicacion = "DD/MM/AAAA or AAAA";
        Genero genero = Genero.desconocido;
        //Añadir discoTest
        c1.añadirDisco(0,titulo,autor,anoPublicacion, genero);
        //MENU GENERAL
        do {
            mdiscos.mostrar();
            opcion = mdiscos.leerOpcion();
            switch (opcion) {
                //AÑADIR DISCOS
                case 0:{
                    System.out.println("Titulo");
                    titulo=teclado.nextLine();
                    System.out.println("Autor");
                    autor=teclado.nextLine();
                    System.out.println("Año");
                    anoPublicacion=teclado.nextLine();
                    genero = menuSeleccionGenero(teclado, genero);
                    c1.añadirDisco(codigo,titulo,autor,anoPublicacion,genero);
                    break;
                }
                //MOSTRAR DISCOS
                case 1:{
                    /*
                    //Mostrar coleccion
                    System.out.println("\nLista de discos[");
                    c1.listarDiscos();
                    System.out.println("]\n");
                    teclado.nextLine();
                    break;
                    */
                    opcion = menuMostrarDiscos(teclado, c1,genero);
                }
                //BORRAR DISCO
                case 2:{
                    //Borrar discos
                    if(c1.borrarDiscosCodigo(teclado.nextInt())){
                        System.out.println("ColeccionMusical.Disco borrado");
                    }else{
                        System.out.println("Error");
                    }
                    break;
                }
                //MODIFICAR DISCO
                case 3:{
                    System.out.println("Indique codigo del disco:");
                    codigo=teclado.nextInt();
                    teclado.nextLine();
                    //Nuevos Datos del disco
                        System.out.println("Titulo");
                        titulo=teclado.nextLine();
                        System.out.println("Autor");
                        autor=teclado.nextLine();
                        System.out.println("Año");
                        anoPublicacion=teclado.nextLine();
                        genero = menuSeleccionGenero(teclado, genero);
                        //Modificar discos
                        if(c1.modificarDiscos(codigo,titulo,autor,anoPublicacion, genero) ){
                            System.out.println("Correcto");
                        }else{
                            System.out.println("Error");
                        }
                    break;
                }
            }
        } while (opcion != 4);
    }
    private static int menuMostrarDiscos(Scanner teclado, ColeccionDiscos c1, Genero genero) {
        //MENU MOSTRAR
        Menu mostrarDiscos = new Menu("Mostrar Discos",4);
        mostrarDiscos.guardarOpcion("Todos",0);
        mostrarDiscos.guardarOpcion("Por autor",1);
        mostrarDiscos.guardarOpcion("Por género",2);
        mostrarDiscos.guardarOpcion("Volver",3);
        //MENU
        int opcion;
        do {
            System.out.println();
            mostrarDiscos.mostrar();
            opcion = mostrarDiscos.leerOpcion();
            switch (opcion) {
                //MOTRAR TODOS
                case 0: {
                    System.out.println("Lista de discos:");
                    c1.listarDiscos();
                    System.out.println("Enter para salir");
                    teclado.nextLine();
                    break;
                }
                //MOSTRAR AUTOR
                case 1: {
                    System.out.println("Indica Autor:");
                    c1.mostrarDiscosAutor(teclado.nextLine());
                    System.out.println("Enter para salir");
                    teclado.nextLine();
                    break;
                }
                //MOSTRAR GENERO
                case 2: {
                    System.out.println("Indica ColeccionMusical.Genero:");
                    c1.mostraDiscosGenero(menuSeleccionGenero(teclado,genero));
                    System.out.println("Enter para salir");
                    teclado.nextLine();
                    break;
                }
            }
            } while (opcion != 3);
        return opcion;
    }
    private static Genero menuSeleccionGenero(Scanner teclado, Genero genero) {
        System.out.println("""
                ColeccionMusical.Genero\s
                0 - Metal\s
                1 - Clasic\s
                2 - Pop\s
                3 - Rock\s
                4 - Jazz\s
                5 - Desconocido\s
                """);
        int selGenero = teclado.nextInt();
        switch (selGenero){
            case 0:
                genero =Genero.metal;
                break;
            case 1:
                genero =Genero.clasic;
                break;
            case 2:
                genero =Genero.pop;
                break;
            case 3:
                genero =Genero.rock;
                break;
            case 4:
                genero =Genero.jazz;
                break;
            case 5:
                genero =Genero.desconocido;
                break;
        }
        return genero;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    private static void listaAlumnos2() {
        //8.0)Crear ArrayList
        ArrayList<Alumno> listaAlumnos2 = new ArrayList<>();
        int media,nnotas;
        //8.1)Crear Alumnos + Añadir Alumnos
        listaAlumnos2.add(new Alumno("Aaa", "1 2 3 10"));
        listaAlumnos2.add(new Alumno("Bbb", "8 4"));
        listaAlumnos2.add(new Alumno("Ccc", "6 7 7 10"));
        listaAlumnos2.add(new Alumno("Ddd", "5 6 9"));
        listaAlumnos2.add(new Alumno("Eee", "4 5 3"));
        //8.2)Crear filtro
        Collections.sort(listaAlumnos2);
        //8.3)Mostrar Productos
        System.out.println("Listado Alumnos2");
        for (Alumno listaA2 : listaAlumnos2) {
                System.out.println(listaA2.getNome());
                media=0;
                nnotas=0;
            for (Integer n  : listaA2.getNotas()) {
                media+=n;
                nnotas++;
                System.out.print(n+" ");
            }
            media=media/nnotas;
            System.out.println("Media:"+media);
        }
        System.out.println("\n Fin \n");
    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    private static void listaProductos() {
        //7.0)Crear ArrayList
        ArrayList<Producto> listaProductos = new ArrayList<>();
        //7.1)Crear Productos + Añadir Productos
        listaProductos.add(new Producto("p1",1,1));
        listaProductos.add(new Producto("p2",10,0));
        listaProductos.add(new Producto("p3",11,2));
        listaProductos.add(new Producto("p4",100,20));
        //7.2)Crear filtro
        Collections.sort(listaProductos);
        //7.3)Mostrar Productos
        System.out.println("Listado Productos");
        for (Producto listaProducto : listaProductos) {
            if (listaProducto.getStock() > 0)
                System.out.println(listaProducto.getNombre());
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    private static void listaPersonas() {
        //6.0)Crear ArrayList
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        //6.1)Crear Personas + Añadir Personas
        listaPersonas.add(new Persona("Nome1",13));
        listaPersonas.add(new Persona("Nome2",22));
        listaPersonas.add(new Persona("Nome3",31));
        listaPersonas.add(new Persona("Nome4",32));
        listaPersonas.add(new Persona("Nome5",33));
        //6.2)Crear filtro
        listaPersonas.sort(Comparator.reverseOrder());
        //6.3)Mostrar Personas
        System.out.println("Personas de mayor edad");
        for(int i=0;i< 3;i++){
            System.out.println(listaPersonas.get(i).nome);
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    private static void listaCadenas() {
        //5.0)Crear ArrayList
        ArrayList<String> listaCadenas = new ArrayList<>();
        //5.1)Integrar Texto
        listaCadenas.add("ABBaa");
        listaCadenas.add("Bbb");
        listaCadenas.add("Ccc");
        listaCadenas.add("Ddd");
        listaCadenas.add("Eee");
        //5.2)Localizar e imprimir por letra
        System.out.println("Cadena con caracter A");
        for (String listaCadena : listaCadenas) {
            if (listaCadena.charAt(0) == 'A') {
                System.out.println(listaCadena);
            }
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    private static void listaEnteros() {
        //4.0)Crear ArrayList
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        //4.1)Integrar numeros
        listaEnteros.add(1);
        listaEnteros.add(2);
        listaEnteros.add(3);
        listaEnteros.add(4);
        listaEnteros.add(5);
        listaEnteros.add(6);
        listaEnteros.add(7);
        listaEnteros.add(8);
        listaEnteros.add(9);
        listaEnteros.add(0);
        //4.2)Localizar Primos
        System.out.println("Multiplos de 3");
        for (Integer listaEntero : listaEnteros) {
            if (listaEntero % 3 == 0) {
                System.out.println(listaEntero);
            }
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    private static void listaAleatorios() {
        //2.0)Crear Array
        ArrayList<Integer> listaAleatorios = new ArrayList<>();
        //2.1)Generardor Numeros Aleatorios;
        Random aleatorio = new Random();
        //Generar Rango Aleatorio
        int rango = aleatorio.nextInt(10,50);
        //Guarda aleatorios
        for(int i=0;i<rango;i++){
        listaAleatorios.add(aleatorio.nextInt(0,1000));
        }
        //2.2)Ordenar
        Collections.sort(listaAleatorios);
        //2.3)Mostrar Contenido
        System.out.println("Numericos Aleatorios Ordenado");
        for (Integer listaAleatorio : listaAleatorios) {
            System.out.println(listaAleatorio);
        }
        System.out.println("Menor: "+listaAleatorios.get(0));
        System.out.println("Mayor"+listaAleatorios.get(rango-1));
        //3.0)Nombres Ordenados desc
        System.out.println("Numericos Aleatorios Ordenado Desc");
        Collections.sort(listaAleatorios, Comparator.reverseOrder());
        for (Integer listaAleatorio : listaAleatorios) {
            System.out.println(listaAleatorio);
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    private static void listaAlumnos() {
        //1.0)Crear Array list
        ArrayList<String> listaAlumnos = new ArrayList<>();
        listaAlumnos.add("A");
        listaAlumnos.add("C");
        listaAlumnos.add("B");
        listaAlumnos.add("E");
        listaAlumnos.add("F");
        listaAlumnos.add("D");
        //1.1)Mostrar array list
        System.out.println("Listado normal");
        for (String listaAlumno : listaAlumnos) {
            System.out.println(listaAlumno);
        }
        //1.2)Mostrar ordenado
        System.out.println("Listado Ordenado");
        Collections.sort(listaAlumnos);
        for (String listaAlumno : listaAlumnos) {
            System.out.println(listaAlumno);
        }
        //3.0)Nombres Ordenados desc
        System.out.println("Listado Ordenado Desc");
        Collections.sort(listaAlumnos, Comparator.reverseOrder());
        for (String listaAlumno : listaAlumnos) {
            System.out.println(listaAlumno);
        }
    }
}