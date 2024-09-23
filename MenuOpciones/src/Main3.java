import java.util.Random;
import java.util.Scanner;

public class Main3 {

    public static void crearpiramide(){

        //*Teclado
        Scanner teclado = new Scanner(System.in);
        int altura;
        do{
            System.out.print("Altura de piramide:");
            altura = teclado.nextInt();
        } while (altura<1 || altura>20);

        //*Generar Piramide
        PiramideAsteriscos piramide = new PiramideAsteriscos(altura);
        piramide.imprimir();
    }

    public static void main(String[] args) {

        //Variables
        int opcion;

        //Piramide
        PiramideAsteriscos piramide = new PiramideAsteriscos();
        Random aleatorio = new Random();
        PiramideAsteriscos piramidealeatoria = new PiramideAsteriscos(aleatorio.nextInt(1,20));
        //*piramidealeatoria.aumentaraltura(3);
        //*piramidealeatoria.imprimir();
        //*piramide.aumentaraltura(3);
        //*piramide.imprimir();

        //Menu
        Menu piramidemenu = new Menu("Piramide",3);
        piramidemenu.guardarOpcion("Piramide Aleatoria",1);
        piramidemenu.guardarOpcion("Crear Piramide",2);
        piramidemenu.guardarOpcion("SALIR",0);

        do {
            piramidemenu.mostrar();
            opcion = piramidemenu.leerOpcion();
            switch (opcion) {
                case 1:{
                    piramidealeatoria.imprimir();
                    break;
                }
                case 2:{
                    crearpiramide();
                    break;
                }
            }
        } while (opcion != 0);
    }
}
