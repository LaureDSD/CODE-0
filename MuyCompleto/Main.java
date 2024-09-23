package MuyCompleto;

import java.time.LocalDate;
import java.util.*;

import

public class Main {
    //Colores y efectos
    private static final String RESET = "\u001B[0m", VERDE = "\u001B[32m" , AMARILLO = "\u001B[33m", ROJO = "\u001B[31m", AZUL ="\u001B[34m",COLOR ="\u001B[35m";
    public static void main(String[] args) {

        String nombre = "hola mundo cruel 99";
        StringBuilder nombreNuevo = new StringBuilder();
        String[] separar  = nombre.split(" ");
        for(String s : separar) {
            nombreNuevo.append(s.substring(0, 1).toUpperCase()).append(s.substring(1).toLowerCase()).append(" ");
        }
        nombre=String.valueOf(nombreNuevo.toString().trim());
        System.out.println("test"+nombre);



        /*
        String salida = "";
        boolean espacio=false,concatenado=false;
        for (int i=0;i<nombre.length();i++){
            if (i==0){
                salida=salida.concat(String.valueOf(Character.toUpperCase(nombre.charAt(i))));
                concatenado=true;
            }
            if (espacio){
                salida=salida.concat(String.valueOf(Character.toUpperCase(nombre.charAt(i))));
                espacio=false;
                concatenado=true;
            }
            if (Character.isWhitespace(nombre.charAt(i))) {
                salida=salida.concat(String.valueOf(nombre.charAt(i)));
                espacio=true;
                concatenado=true;
            }
            if (!concatenado) {
                salida=salida.concat(String.valueOf(nombre.charAt(i)));
            }
            concatenado=false;
        }
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println(salida);
        */
        //-------------------------------------------------------------------------------------------------------------------------


        StringBuilder salida = new StringBuilder();
        boolean espacio=false;
        String letra;
        int x=0;
        for (int i=0;i<nombre.length();i++) {
            letra = nombre.substring(i,++x);
            if(letra.equals(" ")) {
                espacio = true;
            }
            if( espacio || i==0){
                salida.append(letra);
                espacio = false;
            }else{
                salida.append(letra);
            }
        }
        System.out.println(salida);




        //Fechas
        System.out.println(LocalDate.of(2014,3,16));
        //String Buildder
        StringBuilder unirCadenas = new StringBuilder();
        unirCadenas.append(" Unir").append(" Cadenas").append(" DE");
        //Mostrar enum
        System.out.println("Valores enum: ");
        EnumEjemplo unionMainEnum1 = EnumEjemplo.ENUM1;
        EnumEjemplo unionMainEnum2 = EnumEjemplo.ENUM2;
        EnumEjemplo unionMainEnum3 = EnumEjemplo.ENUM3;
        System.out.println(unionMainEnum1.getValorEnu()+ "," +unionMainEnum1.getValorEnu2());
        System.out.println(unionMainEnum2.getValorEnu()+ "," +unionMainEnum2.getValorEnu2());
        System.out.println(unionMainEnum3.getValorEnu()+ "," +unionMainEnum3.getValorEnu2());
        //CrearSubObjetos
        SubObjetoCompareTo so5 =new SubObjetoCompareTo("so5",5);
        SubObjetoCompareTo so6 =new SubObjetoCompareTo("so6",6);
        //Objeto a partir de abstracta ,No recomendado
        AbsTract unionMainAbs1 = new ObjetoListsConExceptions("abs1",1,"bj1",1,new SubObjetoCompareTo("sub1",1));
        System.out.println(AZUL +unionMainAbs1);
        AbsTract unionMainAbs2 = new ObjetoGenerico<>("abs2",2,"abs2",2);
        System.out.println(unionMainAbs2);
        //Objeto a partir de Objeto
        ObjetoListsConExceptions unionMainObj1 = new ObjetoListsConExceptions("abs1",1,"bj1",1,new SubObjetoCompareTo("sub2",2));
        //Anadir subObjetos a primer objeto
        unionMainObj1.setSubobjeto(new SubObjetoCompareTo("sbu2",3));
        unionMainObj1.setSubobjeto(new SubObjetoCompareTo("sbu3",3));
        unionMainObj1.setSubobjeto(new SubObjetoCompareTo("sbu4",3));
        unionMainObj1.setSubobjeto(so5);
        unionMainObj1.setSubobjeto(so6);
        System.out.println(unionMainObj1);
        ObjetoGenerico<String, Integer> unionMainObj2 = new ObjetoGenerico<>("abs2",2,"abs2",5);
        System.out.println(unionMainObj2);
        System.out.println("Lista de objetos abstractos");
        //Lista de objetos con misma clase superior
        ArrayList<AbsTract> listaAbs = new ArrayList<>();
        listaAbs.add(unionMainObj1);
        listaAbs.add(unionMainAbs1);
        listaAbs.add(unionMainAbs2);
        listaAbs.add(unionMainObj2);
        mostrarListaAbstract(listaAbs);
        System.out.println("Lista de objetos tipo1");
        //Lista de objetos 1
        ArrayList<ObjetoListsConExceptions> listaO1 = new ArrayList<>();
        listaO1.add(unionMainObj1);
        listaO1.add((ObjetoListsConExceptions) unionMainAbs1);
        mostrarListaT1(listaO1);
        System.out.println("Lista de objetos tipo2");
        //Lista de objetos 2
        ArrayList<ObjetoGenerico> listaO2 = new ArrayList<>();
        listaO2.add(unionMainObj2);
        listaO2.add((ObjetoGenerico) unionMainAbs2);
        mostrarListaT2(listaO2);


        //Menu Opciones
        MenuEjemplo menu1 = new MenuEjemplo("Programa examen", 6);
        menu1.guardarOpcion("SALIR", 0);
        menu1.guardarOpcion("Mejora objeto1", 1);
        menu1.guardarOpcion("Lista objetos abstractos", 2);
        menu1.guardarOpcion("lista objetos tipo1", 3);
        menu1.guardarOpcion("Lista objetos tipo2", 4);
        menu1.guardarOpcion("String Builder", 5);
        int opcion;
        do {
            menu1.mostrar();
            opcion = menu1.leerOpcion();

            switch (opcion) {
                case 1:{
                    //metodo  de interface
                    System.out.println(RESET+"Mejora objeto1");
                    unionMainObj1.mejora(2);
                    break;
                }
                case 2:{
                    mostrarListaAbstract(listaAbs);
                    break;
                }
                case 3:{
                    mostrarListaT1(listaO1);
                    break;
                }
                case 4:{
                    mostrarListaT2(listaO2);
                    break;
                }
                case 5:{
                    //Resultado subString metodo y regurlar
                    System.out.println(unionMainObj1.testBuilder());
                    unirCadenas.append(" TEXTO").append("  SEPARADAS");
                    System.out.println(COLOR+unirCadenas+RESET);

                    break;
                }
            }
        } while (opcion != 0);
    }



    //Objeto tipo1
    private static void mostrarListaT1(ArrayList<ObjetoListsConExceptions> lista) {
        for(AbsTract a : lista){
            System.out.println(VERDE+a+RESET);
        }
    }


    //Objetos tipo2
    private static void mostrarListaT2(ArrayList<ObjetoGenerico> lista) {
        for(AbsTract a : lista){
            System.out.println(AMARILLO+a+RESET);
        }
    }



    //Abstract
    private static void mostrarListaAbstract(ArrayList<AbsTract> listaAbs) {
        for(AbsTract a : listaAbs){
            if(a instanceof ObjetoListsConExceptions){
            System.out.println("Objeto1: "+ ROJO +a+RESET);
            }
            if(a instanceof ObjetoGenerico){
                System.out.println("Objeto2: "+ ROJO +a+RESET);
            }
        }
    }



    //ARRAY LISTS
    private static void arraylist (){

        ArrayList<SubObjetoCompareTo> nombre = new ArrayList<>();
        if(!nombre.isEmpty()){
            System.out.println(nombre.get(1));
        }else{
            System.out.println("vacio");
        }

        SubObjetoCompareTo s1 = new SubObjetoCompareTo("a",1);
        nombre.add(s1);
        nombre.add(new SubObjetoCompareTo("c",1));
        nombre.add(new SubObjetoCompareTo("d",2));
        nombre.add(new SubObjetoCompareTo("e",3));
        nombre.add(1,new SubObjetoCompareTo("b",1));

        if(nombre.contains(s1)){
            System.out.println(nombre.indexOf(s1));
            System.out.println(nombre.get(1));
            System.out.println();
        }

        nombre.remove(3);
        nombre.remove(s1);
        nombre.removeIf(o -> (o.getNumSub() == 0));
        //string algo.removeIf(n -> (n.charAt(0) == 'S'));
        //int algo.removeIf(n -> (n % 3 == 0));
        nombre.set(0,s1);

        int i = 0;
        while(!nombre.get(i).getValorStringSub().equals("e")){
            i++;
        }
        System.out.println(nombre.size());
        //SubObjeto[] sa = nombre.toArray();

        //Borrado con iterador:
        Iterator iterador = nombre.iterator();
        while(iterador.hasNext()) {
            SubObjetoCompareTo ref = (SubObjetoCompareTo) iterador.next();
            if(ref.getNumSub()>2) {
                iterador.remove();
            }
        }
        //Necesita compare to:
        Collections.sort(nombre);
        //Collections.sort(nombre, Comparator.comparing(SubObjeto::getValorStringSub).reversed());
        for(SubObjetoCompareTo so : nombre){
            System.out.println(so);
        }

    };




    //HASHMAPS
    private static void hashmap(){
        HashMap<Integer, SubObjetoCompareTo> nombre = new HashMap<>();

        SubObjetoCompareTo so1 = new SubObjetoCompareTo("d",1);
        nombre.put(4,so1);
        nombre.put(1,new SubObjetoCompareTo("a",1));
        nombre.put(2,new SubObjetoCompareTo("b",1));
        nombre.put(3,new SubObjetoCompareTo("c",1));

        nombre.get(1);
        Set<Integer> in = nombre.keySet();
        Set<SubObjetoCompareTo> so = (Set<SubObjetoCompareTo>) nombre.values();
        System.out.println(nombre.entrySet());

        for (Map.Entry<Integer, SubObjetoCompareTo> keyvalue: nombre.entrySet()) {
            System.out.println(keyvalue);
            System.out.println(keyvalue.getKey());
            System.out.println(keyvalue.getValue());
        }

        if(nombre.containsKey(1)){
            System.out.println("hola");
        }

        if(nombre.containsValue(so1)){
            System.out.println("hola");
        }


    };


    //TREESETS
    private static void treeset (){

        TreeSet<Integer> numeros=new TreeSet<>(Comparator.reverseOrder());
        //numeros = new TreeSet<>(Comparator.comparing(numeros::getNumero).reversed());
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.remove(0);
        numeros.first();
        //numeros.getFirst();

        System.out.println(numeros);

    };



    // EXCEPTIONS ENTRADA DE TECLADO
    public static void ejercicio3() {
        try {
            Scanner teclado = new Scanner(System.in);
            double[] numeros;
            numeros = new double[5];
            while (true) {
                System.out.println("Indica posicion");
                int valor = Integer.parseInt(teclado.nextLine());
                System.out.println("Indica valor");
                numeros[valor] = 100 / teclado.nextInt();
                System.out.println(numeros[valor]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Limite superado");
        } catch (InputMismatchException e) {
            System.out.println("Valor introducido incorrecto");
        } catch (ArithmeticException e) {
            System.out.println("NO divisible netre 0");
        }catch (NumberFormatException e) {
            System.out.println("Edad no es un numero");
        }
    }



    //EXCEPTIONS DE OBJETOS (USO OBJETO)
    public static void falseManin() {
        Scanner teclado = new Scanner(System.in);
        ArrayList<ObjetoPruebasExceptions> objetos = new ArrayList<>();
        System.out.println("Introduc e datos de gatos");
        while (objetos.size()<5){
            try {
                System.out.println("Nombre");
                String nombre = teclado.nextLine();
                System.out.println("Edad");
                int edad = Integer.parseInt(teclado.nextLine());
                objetos.add(new ObjetoPruebasExceptions(nombre,edad));
            }catch (NumberFormatException e) {
                System.out.println("Edad no es un numero");
            }
            catch (ExcepcionPersonalizada e) {
                System.out.println("Personalizada: " + e.getMessage());
            }
        }
        for (ObjetoPruebasExceptions o : objetos) {
            System.out.println(o);
        }
    }


}