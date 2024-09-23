package cliente;

import java.util.List;

public interface ClienteDAOI {
    Cliente buscar(int identificador) ;
    Cliente buscar(Cliente c) ;
    boolean guardar(Cliente c) ;
    boolean borrar(Cliente c) ;
    boolean modificar (Cliente c) ;
    List<Cliente> obtenerListado() ;

    // Y otros métodos, si es necesario ...
    boolean validarDni(String dni);

}

