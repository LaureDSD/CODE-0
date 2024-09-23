
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //PROGRAMA1
        double valor=0;
        int contador=0;

        Random aleatorio = new Random();
        Fraccion mayor = new Fraccion(Integer.MIN_VALUE, 1);
        Fraccion menor = new Fraccion(Integer.MAX_VALUE,1);

        System.out.println("FRACCIONES ALEATORIAS Y DATOS");
        while (valor!=1) {
            Fraccion fraccionAleatoria = new Fraccion(aleatorio.nextInt(0,100),aleatorio.nextInt(0,100));
            valor=fraccionAleatoria.valor();
            fraccionAleatoria.mostrarresultadoconsalto();
            System.out.println();
            contador++;
                if (valor > mayor.valor() && valor!=Double.POSITIVE_INFINITY) {
                    mayor = fraccionAleatoria;
                }
                if (valor < menor.valor()) {
                    menor = fraccionAleatoria;
                }
        }

        System.out.println("(FIN)");
        System.out.println("Se han generado "+contador+" fracciones con valor diferente a la unidad.");
        System.out.print("La fraction mayor fue ");
        mayor.mostrar();
        System.out.println(" = "+ mayor.valor());
        System.out.print("La fracción menor fue ");
        menor.mostrar();
        System.out.println(" = "+ menor.valor());

        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");



        //PROGRAMA2
        System.out.println();
        System.out.println("FRACCIONES ALEATORIAS Y OPERACIONES ( * & / )");
        int accion;
        do {
            Fraccion Aleat1 = new Fraccion(aleatorio.nextInt(0,10),aleatorio.nextInt(0,10));
            Fraccion Aleat2 = new Fraccion(aleatorio.nextInt(0,10),aleatorio.nextInt(0,10));
            Aleat1.mostrarresultadoconsalto();
            Aleat2.mostrarresultadoconsalto();

            accion = Aleat1.comparar(Aleat2);
            switch (accion) {
                case 0 -> {
                    Aleat1.mostrar();
                    System.out.print(" es equivalente a ");
                    Aleat2.mostrar();
                    System.out.println(" (Fin)");
                }

                case 1 -> {
                    Aleat1.mostrar();
                    System.out.print(" es mayor a ");
                    Aleat2.mostrarconsalto();
                    System.out.print("Multiplicacion: ");
                    Fraccion Multiplicacion =Aleat1.multiplicar(Aleat2);
                    Multiplicacion.mostrarresultadoconsalto();
                    System.out.print("Division: ");
                    Fraccion Division = Aleat1.dividir(Aleat2);
                    Division.mostrarresultadoconsalto();
                    System.out.println();
                }

                case -1 -> {
                    Aleat1.mostrar();
                    System.out.print(" es menor a ");
                    Aleat2.mostrarconsalto();
                    System.out.print("Multiplicacion: ");
                    Fraccion Multiplicacion =Aleat1.multiplicar(Aleat2);
                    Multiplicacion.mostrarresultadoconsalto();
                    System.out.print("Division: ");
                    Fraccion Division = Aleat1.dividir(Aleat2);
                    Division.mostrarresultadoconsalto();
                    System.out.println();
                }

            }
        }while (accion!=0);


        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");



        //PROGRAMA3
        System.out.println();
        System.out.println("FRACCIONES ALEATORIAS Y OPERACIONES ( + & - )");
        //OBJETOS3
        System.out.println("Mismo denomiador");
        int DenAl = aleatorio.nextInt(0,10);
        Fraccion Aleat3 = new Fraccion(aleatorio.nextInt(0,10),DenAl);
        Fraccion Aleat4 = new Fraccion(aleatorio.nextInt(0,10),DenAl);
        Aleat3.mostrarresultadoconsalto();
        Aleat4.mostrarresultadoconsalto();
        System.out.println("Suma: ");
        Fraccion Suma1=Aleat3.sumar(Aleat4);
        Suma1.mostrarresultadoconsalto();
        System.out.println("Resta: ");
        Fraccion Resta1=Aleat3.restar(Aleat4);
        Resta1.mostrarresultadoconsalto();

        System.out.println("-------------------------------------------");

        System.out.println("Diferente denominador");
        Fraccion Aleat5 = new Fraccion(aleatorio.nextInt(0,10),aleatorio.nextInt(0,10));
        Fraccion Aleat6 = new Fraccion(aleatorio.nextInt(0,10),aleatorio.nextInt(0,10));
        Aleat5.mostrarresultadoconsalto();
        Aleat6.mostrarresultadoconsalto();
        System.out.println("Suma: ");
        Fraccion Suma2=Aleat5.sumar(Aleat6);
        Suma2.mostrarresultadoconsalto();
        System.out.println("Resta: ");
        Fraccion Resta2=Aleat5.restar(Aleat6);
        Resta2.mostrarresultadoconsalto();

    }
}