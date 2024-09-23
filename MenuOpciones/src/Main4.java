import java.sql.Array;
import java.util.Scanner;

public class Main4 {
    // Lee por teclado dos números y muestra si son amigos o no.as
    public static void comprobarAmigos() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero 1:   ");
        Numero num1 = new Numero(teclado.nextInt());
        System.out.println("Numero 2:");
        Numero num2 = new Numero(teclado.nextInt());
        System.out.println(num1.esAmigo(num2));
    }
    //Mostrar información detallada de 10 números aleatorios.
    public static void numerosAleatorios() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Cantidad de numeros: ");
        int cantidadNumeros = teclado.nextInt();


        for (int i = 0; i < cantidadNumeros; i++) {
            Numero aleat = new Numero();
            aleat.mostrarInformacion();
        }

    }
    //Mostrar información detallada de 10 números aleatorios primos.
    public static void numerosPrimos() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Cantidad de numeros: ");
        int cantidadNumeros = teclado.nextInt();


        int i = 0;
        while (i < cantidadNumeros) {
            Numero aleat = new Numero();
            if(aleat.esPrimo()) {
                aleat.mostrarInformacion();
                i++;
            }
        }
    }
    // Mostar información detallada de 10 números aleatorios pares.
    public static void numerosPares() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Cantidad de numeros: ");
        int cantidadNumeros = teclado.nextInt();


        int i = 0;
        while (i < cantidadNumeros) {
            Numero aleat = new Numero();
            if(aleat.esPar()) {
                aleat.mostrarInformacion();
                i++;
            }
        }

    }
    // Mostrar información detallada de 10 números aleatorios perfectos.
    public static void numerosPerfectos() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Cantidad de numeros: ");
        int cantidadNumeros = teclado.nextInt();


        int[] guardarNumeros;
        guardarNumeros = new int[cantidadNumeros];
        int contador=0;
        int i = 0;


        while (i < cantidadNumeros) {
            Numero aleat = new Numero();
            //System.out.println(aleat.getValor());
            //----------------------------

                if(aleat.esPerfecto()) {
                    System.out.println("perfect "+aleat.getValor());
                    //-------------------------

                    for(int x=0; x<guardarNumeros.length ;x++){
                        System.out.println(guardarNumeros[x]);


                        if (guardarNumeros[x] != aleat.getValor()) {

                            //------------------------
                        guardarNumeros[contador] = aleat.getValor();
                        aleat.mostrarInformacion();
                        contador++;
                        i++;
                        }
                }
            }


            //----------------------------

        }
    }
    //Menu de opciones.
    public static void main(String[] args) {

        int opcion;
        Menu menuNum = new Menu("Menu numeros", 6);
        menuNum.guardarOpcion("Comprobar numeros amigos", 1);
        menuNum.guardarOpcion("Mostrar X num aleatorios", 2);
        menuNum.guardarOpcion("Mostrar X num aleatorios primos", 3);
        menuNum.guardarOpcion("Mostrar X num aleatorios pares", 4);
        menuNum.guardarOpcion("Mostrar X num aleatorios perfectos", 5);
        menuNum.guardarOpcion("SALIR", 0);

        do {
            menuNum.mostrar();
            opcion = menuNum.leerOpcion();
            switch (opcion) {
                case 1 -> comprobarAmigos();
                case 2 -> numerosAleatorios();
                case 3 -> numerosPrimos();
                case 4 -> numerosPares();
                case 5 -> numerosPerfectos();
                }
        } while (opcion != 0);
    }

}