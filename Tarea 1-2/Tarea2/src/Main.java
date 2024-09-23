import carrito1.Carrito;
import carrito1.Elemento;
import carrito2.Carrito2;
import carrito2.Elemento2;
import carrito3.Carrito3;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //EJ 1 y 2
        //supermercadoEcologico();
        //EJ 3
        //buscadorCapitales();
        //EJ 4
        //carrito();
        //EJ 5
        //carrito2();
        //Ej 6 y 7
        //diccionarioInglesEspanol();
        //Ej 8
        //amigosAnfibios();
        //Ej 9
        capturaAjedrez();
    }

    private static void capturaAjedrez() {
        Random aleatorio = new Random();

        //Valor de piezas
        HashMap<String,Integer> piezaValor = new HashMap<String,Integer>();
        piezaValor.put("dama",9);
        piezaValor.put("torre",5);
        piezaValor.put("alfil",3);
        piezaValor.put("caballo",2);
        piezaValor.put("peon",1);

        //Nmero de piezas
        HashMap<String,Integer> piezaCantidad = new HashMap<String,Integer>();
        piezaCantidad.put("dama",1);
        piezaCantidad.put("torre",2);
        piezaCantidad.put("alfil",2);
        piezaCantidad.put("caballo",2);
        piezaCantidad.put("peon",8);

        //CapturasSuma
        HashMap<String,Integer> listCapturas = new HashMap<String,Integer>();
        listCapturas.put("dama",0);
        listCapturas.put("torre",0);
        listCapturas.put("alfil",0);
        listCapturas.put("caballo",0);
        listCapturas.put("peon",0);

        int total=0,captura=aleatorio.nextInt(0,15);
        int selector1,selector2;
        int restaPiezas, posicion;
        String piezaAtaque=null,piezaDefiende=null;
        int valorPieza=0,numeroPiezas=0;
        do{
            //obtener pieza ataque
            selector1 =  aleatorio.nextInt(0,piezaValor.size());
            //Obtener pieza defiende
            selector2 =  aleatorio.nextInt(0,piezaValor.size());
            posicion = 0;
            for (HashMap.Entry<String,Integer> p: listCapturas.entrySet()) {
                if(posicion==selector1) {
                    piezaAtaque = p.getKey().toString();
                }
                if(posicion==selector2) {
                    piezaDefiende = p.getKey().toString();
                }
                posicion++;
            }
                //Restar numero piezas, si es posible valida captura
                restaPiezas = piezaCantidad.get(piezaDefiende)-1;
                if (restaPiezas>=0){
                    numeroPiezas = restaPiezas;
                piezaCantidad.put(piezaDefiende, numeroPiezas);
                    //Guardar valor
                    valorPieza=piezaValor.get(piezaDefiende)+listCapturas.get(piezaAtaque);
                    listCapturas.put(piezaAtaque,valorPieza);
                }
            //Cuenta capturas
            captura--;
        }while(captura>0);
        System.out.println("Fichas capturadas por el jugador:");
        for (HashMap.Entry<String,Integer> p: listCapturas.entrySet()) {
            System.out.println(p);
            total+= (int) p.getValue();
        }
        System.out.println("Puntos totales: "+total);
    }

    private static void capturaAjedrez2() {
        Random aleatorio = new Random();

        //Piezas
        HashMap<String,Pieza> piezas = new HashMap<String,Pieza>();
        piezas.put("dama",new Pieza(9,1));
        piezas.put("torre",new Pieza(5,2));
        piezas.put("alfil",new Pieza(3,2));
        piezas.put("caballo",new Pieza(2,2));
        piezas.put("peon",new Pieza(1,8));

        //CapturasSuma
        HashMap<String,Integer> listCapturas = new HashMap<String,Integer>();
        listCapturas.put("dama",0);
        listCapturas.put("torre",0);
        listCapturas.put("alfil",0);
        listCapturas.put("caballo",0);
        listCapturas.put("peon",0);

        int total=0,captura=aleatorio.nextInt(0,15);
        int selector1,selector2;
        int restaPiezas, posicion;
        String piezaAtaque=null,piezaDefiende=null;
        int valorPieza=0,numeroPiezas=0;
        do{
            //obtener pieza ataque
            selector1 =  aleatorio.nextInt(0,piezas.size());
            //Obtener pieza defiende
            selector2 =  aleatorio.nextInt(0,piezas.size());
            posicion = 0;
            for (HashMap.Entry<String,Integer> p: listCapturas.entrySet()) {
                if(posicion==selector1) {
                    piezaAtaque = p.getKey().toString();
                }
                if(posicion==selector2) {
                    piezaDefiende = p.getKey().toString();
                }
                posicion++;
            }
            //Restar numero piezas, si es posible valida captura
            restaPiezas = piezas.get(piezaDefiende).getNumero()-1;
            if (restaPiezas>=0){
                numeroPiezas = restaPiezas;
                piezas.put(piezaDefiende,new Pieza(piezas.get(piezaDefiende).getValor(),numeroPiezas));
                //Guardar valor

                valorPieza=piezas.get(piezaDefiende).getValor()+listCapturas.get(piezaAtaque);
                listCapturas.put(piezaAtaque,valorPieza);
            }
            //Cuenta capturas
            captura--;
        }while(captura>0);
        System.out.println("Fichas capturadas por el jugador:");
        for (HashMap.Entry p: listCapturas.entrySet()) {
            System.out.println(p);
            total+= (int) p.getValue();
        }
        System.out.println("Puntos totales: "+total);
    }














    private static void amigosAnfibios() {
        //Objetos
        Scanner teclado = new Scanner(System.in);
        HashMap<String, String> listaHabita = new HashMap<String, String>();
        HashMap<String, String> listaAlimento = new HashMap<String, String>();
        //Variables
        listaHabita.put("rana","Tropical,humedo y agua");
        listaHabita.put("salamandra","Humedo");
        listaHabita.put("sapo","No desierto y no antartida");
        listaHabita.put("triton","America y Africa");

        listaAlimento.put("rana","Larvas e insectos");
        listaAlimento.put("salamandra","Pequenos crustaceos e insectos");
        listaAlimento.put("sapo","Insectos, lombrices y pequenos roedores");
        listaAlimento.put("triton","Insectos");
        //Variable de uso
        String nombreAnimal;
        //Programa
        do{
            System.out.println("Introduce nombre de amfibio: (salir)");
            nombreAnimal = teclado.nextLine();
            if(listaHabita.containsKey(nombreAnimal) && listaAlimento.containsKey(nombreAnimal)){
                System.out.println("Habitat : "+listaHabita.get(nombreAnimal));
                System.out.println("Alimento : "+listaAlimento.get(nombreAnimal));
            }else{
                System.out.println("Ese anfibio no existe");
            }
            //salir
        }while(!nombreAnimal.equals("salir"));
    }



    private static void diccionarioInglesEspanol() {
        //Objetos
        Scanner teclado = new Scanner(System.in);
        HashMap<String, String> diccionario = new HashMap<String, String>();
        //Variables
        diccionario.put("caliente","hot");
        diccionario.put("rojo","red");
        diccionario.put("ardiente","hot");
        diccionario.put("verde","green");
        diccionario.put("agujetas","stiff");
        diccionario.put("abrasador","hot");
        diccionario.put("hierro","iron");
        diccionario.put("grande","big");
        //Variables de uso
        String palabraEsp,palabraIng,nuevaPalabraEsp,nuevaPalabraIng;
        boolean encuentra;
        //Programa
        do{
            System.out.println("\nIntroduzca una palabra y le dare los sinonimos:");
            palabraEsp= teclado.nextLine();
            palabraEsp=palabraEsp.toLowerCase();
            palabraIng=diccionario.get(palabraEsp);
            if(diccionario.containsValue(palabraIng)){
                encuentra = false;
                for (HashMap.Entry d: diccionario.entrySet()) {
                    if (d.getValue().equals(palabraIng) && !d.getKey().equals(palabraEsp)) {
                        encuentra = true;
                        break;
                    }
                }

                //Valida la busqueda
                //Nop existe sinonimo
                if(!encuentra){
                    System.out.println("Sin sinonimos");
                    //Mejora
                    System.out.println("Anadir un sinonimo?(s/n)");
                    nuevaPalabraEsp = teclado.nextLine();
                    nuevaPalabraEsp = nuevaPalabraEsp.toLowerCase();
                    if(!nuevaPalabraEsp.equals("n")){
                        System.out.println("Escriba el nuevo sinonimo");
                        nuevaPalabraEsp = teclado.nextLine();
                        nuevaPalabraEsp = nuevaPalabraEsp.toLowerCase();
                        diccionario.put(nuevaPalabraEsp,palabraIng);
                        System.out.println("Gracias por un nuevo sinonimo");
                    }
                    //Existe sinonimo
                }else {
                    System.out.print("Sinonimos de " + palabraEsp + ": ");
                    if (diccionario.containsValue(palabraIng)) {
                        //guarda sinonimos y valida
                        for (HashMap.Entry d : diccionario.entrySet()) {
                            if (d.getValue().equals(palabraIng) && !d.getKey().equals(palabraEsp)) {
                                System.out.print(d.getKey() + " ");
                            }
                        }
                    }
                }
            }else {
                //Nueva palabra
                System.out.println("No conozco esa palabra");
                //Mejora
                 if (!palabraEsp.equals("salir")){
                    System.out.println("Anadir la nueva palabra?(s,n)");
                  nuevaPalabraEsp = teclado.nextLine();
                  nuevaPalabraEsp = nuevaPalabraEsp.toLowerCase();
                    if (!nuevaPalabraEsp.equals("n")) {
                        System.out.println("Escriba la nueva palabra");
                      nuevaPalabraEsp = teclado.nextLine();
                      nuevaPalabraEsp = nuevaPalabraEsp.toLowerCase();
                      System.out.println("Escribala en ingles:");
                        nuevaPalabraIng = teclado.nextLine();
                      nuevaPalabraIng = nuevaPalabraIng.toLowerCase();
                      diccionario.put(nuevaPalabraEsp, nuevaPalabraIng);
                        System.out.println("Gracias por esta palabra");
                    }
                }else{
                     System.out.println("Pero se su sinonimo: Adios");
                 }
            }
            //Salir
        }while(!palabraEsp.equals("salir"));
    }



    private static void carrito3() {
        Carrito3 miCarrito = new Carrito3();
        miCarrito.agrega("Targeta SD 64GB",19.95, 2.0);
        miCarrito.agrega("Canon EOS 2000D", 449.0, 1.0);
        System.out.println(miCarrito);
        System.out.print("Hay " + miCarrito.numeroDeElementos());
        System.out.println(" Productos en la cesta.");
        System.out.println("El total asciende a " + String.format("%.2f",miCarrito.importeTotal())+" euros");
        System.out.println("\nContinua la compra...\n");
        miCarrito.agrega("Samsung galaxy Tab", 199.0, 3.0);
        miCarrito.agrega("Targeta SD 64GB",19.95, 1.0);
        System.out.println(miCarrito);
        System.out.print("Hay " + miCarrito.numeroDeElementos());
        System.out.println(" Productos en la cesta.");
        System.out.println("El total asciende a " + String.format("%.2f",miCarrito.importeTotal())+" euros");
    }



    private static void carrito2() {
        Carrito2 miCarrito = new Carrito2();
        miCarrito.agrega(1,new Elemento2("Targeta SD 64GB",19.95,2));
        miCarrito.agrega(2,new Elemento2("Canon EOS 2000D",449,1));
        System.out.println(miCarrito);
        System.out.print("Hay " + miCarrito.numeroDeElementos());
        System.out.println(" Productos en la cesta.");
        System.out.println("El total asciende a " + String.format("%.2f",miCarrito.importeTotal())+" euros");
        System.out.println("\nContinua la compra...\n");
        miCarrito.agrega(3,new Elemento2("Samsung galaxy Tab",199,3));
        miCarrito.agrega(1,new Elemento2("Targeta SD 64GB",19.95,1));
        System.out.println(miCarrito);
        System.out.print("Hay " + miCarrito.numeroDeElementos());
        System.out.println(" Productos en la cesta.");
        System.out.println("El total asciende a " + String.format("%.2f",miCarrito.importeTotal())+" euros");
    }

    private static void carrito() {
        Carrito miCarrito = new Carrito();
        miCarrito.agrega(new Elemento("Targeta SD 64GB",19.95,2));
        miCarrito.agrega(new Elemento("Canon EOS 2000D",449,1));
        System.out.println(miCarrito);
        System.out.print("Hay " + miCarrito.numeroDeElementos());
        System.out.println(" Productos en la cesta.");
        System.out.println("El total asciende a " + String.format("%.2f",miCarrito.importeTotal())+" euros");
        System.out.println("\nContinua la compra...\n");
        miCarrito.agrega(new Elemento("Samsung galaxy Tab",199,3));
        miCarrito.agrega(new Elemento("Targeta SD 64GB",19.95,1));
        System.out.println(miCarrito);
        System.out.print("Hay " + miCarrito.numeroDeElementos());
        System.out.println(" Productos en la cesta.");
        System.out.println("El total asciende a " + String.format("%.2f",miCarrito.importeTotal())+" euros");
    }

    private static void buscadorCapitales() {
        //Objetos
        Scanner teclado = new Scanner(System.in);
        HashMap<String, String> listaPaises = new HashMap<String, String>();
        //Variables
        listaPaises.put("espana","madrid");
        listaPaises.put("portugal","lisboa");
        listaPaises.put("francia","paris");
        //Variables de uso
        String introducirPais=null,introducirCapital=null;
        //Programa
        do{
            System.out.println("Dime un pais, te digo capital:");
            introducirPais= teclado.nextLine();
            introducirPais=introducirPais.toLowerCase();
            if(listaPaises.containsKey(introducirPais)){
                //Respuesta
                System.out.println("La capital de "+introducirPais+" es "+ listaPaises.get(introducirPais));
            }else if(!introducirPais.equals("salir")){
                //Anadir
                System.out.println("No conozco ese pais, cual es la capital de "+introducirPais+"? o >No< " );
                introducirCapital= teclado.nextLine();
                introducirCapital=introducirCapital.toLowerCase();
                //nosabes
                if(introducirCapital.equals("no")){
                    System.out.println("Ya lo descubrire");
                    //Sisanbes
                }else{
                    listaPaises.put(introducirPais,introducirCapital);
                    System.out.println("Gracias por ensenarme");
                }

            }
            //salir
        }while(!introducirPais.equals("salir"));
    }

    private static void supermercadoEcologico() {
        //Objetos
        Scanner teclado = new Scanner(System.in);
        HashMap<String, Double> listaProductos = new HashMap<String, Double>();
        HashMap<String, Double> carrito = new HashMap<String, Double>();
        StringBuilder factura = new StringBuilder();
        //Variables
        String producto,codigoDescuento="ECODTO";
        double descuento=0,descuentoCodigo = 0.1;
        listaProductos.put("avena",2.21);
        listaProductos.put("garbanzos",2.39);
        listaProductos.put("tomate",1.59);
        listaProductos.put("jengibre",3.13);
        listaProductos.put("quinoa",4.49);
        listaProductos.put("guisantes",1.59);
        //Varianbles de uso
        double cantidad=0;
        double total=0,subtotal=0,precio=0;
        String productoMostrar=null;
        //Programa
        do{
            //Buscar
            System.out.println("Introduce prducto");
            producto= teclado.nextLine();
            producto=producto.toLowerCase();
            if(listaProductos.containsKey(producto)) {
                System.out.println("Introduce cantidad");
                cantidad = teclado.nextInt();
                teclado.nextLine();
            }
            if(listaProductos.containsKey(producto)){
                //Anadir o crear
                if(carrito.containsKey(producto)){
                    carrito.put(producto,(carrito.get(producto)+cantidad));
                }else{
                    carrito.put(producto,cantidad);
                }
            }
        }while(!producto.equals("fin"));
        //Mostrar carrito
        factura.append("\nProductos en cesta:\n");
        for (HashMap.Entry p: carrito.entrySet()) {
            factura.append("Producto: "+p.getKey()+"\n");
            factura.append("Cantidad: "+p.getValue()+"\n");
        }
        //Descuento
        System.out.println("Introduce codigo descuento:");
        if(codigoDescuento.equals(teclado.nextLine())){
            descuento=descuentoCodigo;
        }
        //Factura
        factura.append("Producto: fin \n");
        factura.append("\nProducto\tPrecio\tCantidad\tSubtotal\n");
        factura.append("____________________________________________\n");
        for (HashMap.Entry p: carrito.entrySet()) {
            //Producto
            productoMostrar= p.getKey().toString();
            //Tonteria
            if(productoMostrar.length()<8){
                factura.append(productoMostrar+"\t\t");
            }else{
                factura.append(productoMostrar+"\t");
            }
            //Correcto comentario
            //factura.append(p.getKey()+"\t\t");
            //Precio
            precio=listaProductos.get(p.getKey());
            precio=Math.round(precio * 100) / 100d;
            factura.append(precio+"\t");
            //Cantidad
            factura.append(p.getValue()+"\t\t");
            //Subtotal;
            subtotal=(double)p.getValue()*precio;
            subtotal=Math.round(subtotal * 100) / 100d;
            factura.append(subtotal+"\n") ;
            //Total
            total+=subtotal;
        }
        factura.append("____________________________________________\n");
        //Calcular descuento
        double totalDescuento=descuento*total;
        totalDescuento=Math.round(totalDescuento * 100) / 100d;
        factura.append("Descuento: "+ totalDescuento +"\n") ;
        //Precio menos descuento
        total=total-descuento;
        factura.append("____________________________________________\n");
        total=Math.round(total * 100) / 100d;
        factura.append("Total: "+total+"\n");
        //Imprimir
        System.out.println(factura);
    }
    //fin
}