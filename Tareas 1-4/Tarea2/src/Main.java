import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int edad;
        String nome,apellidos,dni;


        System.out.println("persona 1");
        //Persona pe1 = new Persona();
        System.out.println("dni");
        dni = teclado.nextLine();
        System.out.println("nombre");
        nome = teclado.nextLine();
        System.out.println("apellidos");
        apellidos = teclado.nextLine();
        System.out.println("edad");
        edad = teclado.nextInt();
        teclado.nextLine();
        Persona pe1 = new Persona (nome,apellidos, dni, edad);

        System.out.println("persona 2");
        //Persona pe2 = new Persona();
        System.out.println("dni");
        dni = teclado.nextLine();
        System.out.println("nombre");
        nome = teclado.nextLine();
        System.out.println("apellidos");
        apellidos = teclado.nextLine();
        System.out.println("edad");
        edad = teclado.nextInt();
        Persona pe2 = new Persona (nome,apellidos, dni, edad);


        System.out.println("-----------------------------------------------------------");

        pe1.imprime();
        if(pe1.esMayorEdad()){
            System.out.println("es mayor de edad");
        }
        if(pe1.esJubilado()){
            System.out.println("es juvilado");
        }
        pe2.imprime();
        System.out.println("difrencia de edadad entre p1 y pe2" + pe1.diferenciaEdad(pe2));

        System.out.println("-----------------------------------------------------------");

        teclado.nextLine();
        System.out.println(pe1.getDni() + " " + pe1.getNome() + " " + pe1.getApellidos() + " " + pe1.getEdad());
        System.out.println(pe2.getDni() + " " + pe2.getNome() + " " + pe2.getApellidos() + " " + pe2.getEdad());

    }

}