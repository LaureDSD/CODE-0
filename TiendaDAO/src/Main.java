import cliente.Cliente;
import cliente.ClienteDAO;
import cliente.ClienteDAOXML;
import menu.Menu;

import java.util.Scanner;

public class Main {
    private static final String RESET = "\u001B[0m", AZUL = "\u001B[34m", ROJO = "\u001B[31m";

    //private static final ClienteDAO GESTOR_CLIENTES = new ClienteDAO();
    private static ClienteDAOXML GESTOR_CLIENTES = new ClienteDAOXML();

    public static void main(String[] args) {

        try {

            Menu menu0 = new Menu("Gestion de Clientes");
            menu0.guardarOpcion("Listar Clientes");
            menu0.guardarOpcion("Buscar cliente");
            menu0.guardarOpcion("Nuevo cliente");
            menu0.guardarOpcion("Modificar cliente");
            menu0.guardarOpcion("Eliminar cliente");
            menu0.guardarOpcion("Salir");

            boolean terminar = false;
            do {
                menu0.mostrar();
                switch (menu0.leerOpcion()) {
                    case 0 -> listarClientes();
                    case 1 -> buscarClientes();
                    case 2 -> guardarClientes();
                    case 3 -> modificarClientes();
                    case 4 -> borrarClientes();
                    default -> terminar = true;
                }
            } while (!terminar);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void listarClientes() {
        System.out.println("Listado de clientes");
        try {

            for (Cliente cliente : GESTOR_CLIENTES.obtenerListado()) {
                System.out.println(cliente);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void buscarClientes() {
        Menu menu1 = new Menu("Busqueda de clientes");
        menu1.guardarOpcion("Buscar por ID");
        menu1.guardarOpcion("Buscar por DNI");
        menu1.guardarOpcion("Regresar");
        menu1.mostrar();

        Cliente mostra;
        switch (menu1.leerOpcion()) {
            case 0 -> {
                System.out.println("Pulsa enter para campos desconocidos:");
                if ((mostra = GESTOR_CLIENTES.buscar(insertarCliente().getCodigo())) == null) {
                    System.out.println(ROJO + "No encontrado por ID" + RESET);
                } else {
                    System.out.println(mostra);
                }
            }
            case 1 -> {
                System.out.println("Pulsa enter para campos desconocidos:");
                if ((mostra = GESTOR_CLIENTES.buscar(insertarCliente())) == null) {
                    System.out.println(ROJO + "No encontrado por DNI" + RESET);
                } else {
                    System.out.println(mostra);
                }
            }
        }
    }

    public static void guardarClientes() {
        System.out.println("Indique datos del nuevo cliente");
        try {

            if (GESTOR_CLIENTES.guardar(insertarCliente())) {
                System.out.println("Insertado correctamente");
            } else {
                System.out.println(ROJO + "El cliente ya existe o dni no valido" + RESET);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void modificarClientes() {
        System.out.println("Indique ID y datos a modificar");
        try {

            if (GESTOR_CLIENTES.modificar(insertarCliente())) {
                System.out.println("Se mmodifico correctamente");
            } else {
                System.out.println(ROJO + "No se pudo realizar a modificacion" + RESET);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void borrarClientes() {
        System.out.println("Indique datos del cliente a borrar");
        try {

            if (GESTOR_CLIENTES.borrar(insertarCliente())) {
                System.out.println("Cliente borrado exitosamente");
            } else {
                System.out.println(ROJO + "No se pudo borrar el cliente" + RESET);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static Cliente insertarCliente() {

        //Teclado
        Scanner teclado = new Scanner(System.in);
        // Variables
        int codigo = 0;
        String nombre;
        String apellidos;
        String dni;
        String direccion;
        //Entrda de texto
        System.out.println("Introducir ID");
        try {
            String id;
            if ((id = teclado.nextLine()) != null) {
                codigo = Integer.parseInt(id);
            }
        } catch (NumberFormatException e) {
            System.out.println("**Valor por defecto aplicado**");
        }
        System.out.println("Introducir Nombre");
        nombre = teclado.nextLine();
        System.out.println("Introducir Apellidos");
        apellidos = teclado.nextLine();
        System.out.println("Introducir DNI");
        dni = teclado.nextLine();
        System.out.println("Introducir Direccion");
        direccion = teclado.nextLine();

        return new cliente.Cliente(codigo, nombre, apellidos, dni, direccion);
        //return new cliente.Cliente(25, "nombre", "apellidos", "44989625F", "direccion");
    }
}
