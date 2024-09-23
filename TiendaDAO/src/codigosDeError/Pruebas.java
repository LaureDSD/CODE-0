package codigosDeError;

import cliente.Cliente;
import cliente.ClienteDAO;
import cliente.ClienteDAOXML;
import conexiones.Cifrado;

public class Pruebas {
    public static void main(String[] args) throws Exception {

        //System.out.println("Gen     "+Cifrado.generarClaves());

        System.out.println("Set:    "+Cifrado.setClave("abc"));
        System.out.println("Set:    "+Cifrado.setClave("src/Config/bd.cfg"));
        System.out.println("Set:    "+Cifrado.setClave("abc"));
        System.out.println("Get     "+Cifrado.getClave("abc"));
        System.out.println("Set:    "+Cifrado.setClave("src/Config/bd.cfg"));

        //ClienteDAO cxml = new ClienteDAO();
        ClienteDAOXML cxml = new ClienteDAOXML();

        System.out.println(cxml.buscar(new Cliente(1,null,null,"12345678A",null)));
        System.out.println(cxml.buscar(1));

        System.out.println(cxml.guardar(new Cliente(1, "perso1", "teamas",
                "12655678A", "Aven3ida Siempre Viva 742")));
        System.out.println(cxml.guardar(new Cliente(2, "perso2", "teamas",
                "12365678B", "Aven3ida Siempre Viva 742")));
        System.out.println(cxml.guardar(new Cliente(3, "perso3", "teamas",
                "12356578C", "Aven3ida Siempre Viva 742")));
        System.out.println(cxml.guardar(new Cliente(4, "perso4", "teamas",
                "12356378D", "Aven3ida Siempre Viva 742")));
        System.out.println(cxml.guardar(new Cliente(5, "perso5", "teamas",
                "12356378E", "Aven3ida Siempre Viva 742")));
        System.out.println(cxml.guardar(new Cliente(6, "perso6", "teamas",
                "12356378F", "Aven3ida Siempre Viva 742")));
        System.out.println(cxml.guardar(new Cliente(7, "perso7", "teamas",
                "12356378G", "Aven3ida Siempre Viva 742")));
        System.out.println(cxml.guardar(new Cliente(8, "perso8", "teamas",
                "12356378H", "Aven3ida Siempre Viva 742")));
        System.out.println(cxml.guardar(new Cliente(9, "perso9", "teamas",
                "44499625f", "Aven3ida Siempre Viva 742")));

        System.out.println(cxml.buscar(new Cliente(0,null,null,"12356578A",null)));
        System.out.println(cxml.buscar(4));

        System.out.println("Listado");
        for (Cliente c : cxml.obtenerListado()){
            System.out.println(c);
        }

        System.out.println(cxml.modificar(new Cliente(4, "POBRE ANA", "teamas",
                "22334455D", "Aven3ida Siempre Viva 742")));

        for (Cliente c : cxml.obtenerListado()){
            System.out.println(c);
        }

        System.out.println(cxml.borrar(new Cliente(8,null,null,"12655678A",null)));
        System.out.println(cxml.borrar(new Cliente(9,null,null,"44499625F",null)));
        for (Cliente c : cxml.obtenerListado()){
            System.out.println(c);
        }


    }
}
