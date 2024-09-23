

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        System.out.println("Ejemplos de control de excepciones");

        System.out.println("Valor carcterre incorrecto");
        // ejercicio1();
        System.out.println("Valor indivisible entre 0");
        // ejercicio2();
        System.out.println("Valor indivisble o fuera de rango");
        // ejercicio3();
        System.out.println("Fuera de rango");
        // ejercicio4();
        System.out.println("Automatico");
        /*
        for (int i = 0; i < 10; i++) {
            try {
                imprimirPositivo(aleatorio.nextInt(-5, 5));
                imprimirNegativo(aleatorio.nextInt(-5, 5));
            } catch (Exception e) {
                System.out.println("Personalizada: " + e.getMessage());
            }
        }
*/
        System.out.println("Gatos");
        /*
            try {
                Gato a = new Gato("aaa", 3);
                Gato b = new Gato("aaaa", 4);
                Gato c = new Gato("aaa", 5);
                Gato d = new Gato("aaaa", 6);
                Gato e = new Gato("aaa1", 7);

                System.out.println("Gato bueno");
                    b.setNombre("asdf");
                    b.setEdad(2);
                System.out.println("Gato malo");
                    a.setEdad(-1);
                    a.setNombre("a");
            } catch (Exception e) {
                System.out.println("Personalizada: " + e.getMessage());
            }

         */
        falseManin();
    }


    //////////////////////////////////////////////////////////////////////////////////


    public static void ejercicio1() {
        try {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Inserta un numero");
            int numero = teclado.nextInt();
            System.out.println("El numero introducido es: " + numero);

        } catch (InputMismatchException e) {
            System.out.println("Valor introducido incorrecto");
        }
    }

    //////////////////////////////////////////////////////////////////////////////////

    public static void ejercicio2() {
        Scanner teclado = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Inserta un numero");
                int numero1 = Integer.parseInt(teclado.nextLine());
                System.out.println("Inserta un numero");
                int numero2 = Integer.parseInt(teclado.nextLine());
                int division = numero1 / numero2;
                System.out.println("La division es: " + division);
            } catch (InputMismatchException e) {
                System.out.println("Valor introducido incorrecto");
            } catch (ArithmeticException e) {
                System.out.println("NO divisible netre 0");
            }catch (NumberFormatException e) {
                System.out.println("Edad no es un numero");
            }
        }
    }

    //////////////////////////////////////////////////////////////////////////////////



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

    //////////////////////////////////////////////////////////////////////////////////

    public static void ejercicio4() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int numero1 = 0;
        while (numero1 >= 0) {
            try {
                int[] numeros;
                numeros = new int[aleatorio.nextInt(1, 100)];
                for (int i = 0; i < numeros.length; i++) {
                    numeros[i] = aleatorio.nextInt(1, 10);
                }
                System.out.println("Inserta un numero");
                numero1 = Integer.parseInt(teclado.nextLine());
                System.out.println("Enposicion " + numero1 + " esta: " + numeros[numero1]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Fin de programa");
            } catch (NumberFormatException e) {
                System.out.println("Valor introducido incorrecto");
            }
        }
    }


    //////////////////////////////////////////////////////////////////////////////////
    public static void imprimirPositivo(int num) throws Exception {
        if (num >= 0) {
            for (int i = 0; i < num; i++) {
                System.out.print("+");
            }
            System.out.println();
        } else {
            throw new Exception("No es positivo");
        }
    }

    public static void imprimirNegativo(int num) throws Exception {
        if (num < 0) {
            for (int i = 0; i > num; i--) {
                System.out.print("-");
            }
            System.out.println();
        } else {
            throw new Exception("No es negativo");
        }
    }

    //////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////
    public static void falseManin() {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Gato> gatos = new ArrayList<>();
        System.out.println("Introduc e datos de gatos");
        while (gatos.size()<5){
            try {
                System.out.println("Nombre");
                String nombre = teclado.nextLine();
                System.out.println("Edad");
                int edad = Integer.parseInt(teclado.nextLine());
                gatos.add(new Gato(nombre,edad));
            }catch (NumberFormatException e) {
                System.out.println("Edad no es un numero");
            }
            catch (MiExcepcion e) {
                System.out.println("Personalizada: " + e.getMessage());
            }
        }
        for (Gato gato : gatos) {
            System.out.println(gato);
        }
    }

}
