package cliente;

import codigosDeError.ErrorClienteDAO_Exception;
import conexiones.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements ClienteDAOI {
    // Implementa los métodos de la interfaz para interactuar
    // con la BD. Maneja adecuadamente las posibles excepciones.

    @Override
    public Cliente buscar(int identificador) {
        try {
            Cliente cliente = null;
            if (identificador != 0) {
                //Variables
                Connection conexionBusquedaID = ConexionBD.getConnection();
                //Select
                String sql = "SELECT * FROM clientes WHERE codigo_cliente=?";
                PreparedStatement statement = conexionBusquedaID.prepareStatement(sql);
                statement.setString(1, String.valueOf(identificador));
                ResultSet resultSet = statement.executeQuery();
                //No es necesario bucle
                while (resultSet.next()) {
                    cliente = new Cliente(
                            resultSet.getInt("codigo_cliente"),
                            resultSet.getString("nombre_cliente"),
                            resultSet.getString("apellidos_cliente"),
                            resultSet.getString("dni_cliente"),
                            resultSet.getString("direccion_cliente")
                    );
                }
                //Cierres
                resultSet.close();
                statement.close();
                ConexionBD.closeConnection(conexionBusquedaID);
            }
            //cliente.Cliente encontrado
            return cliente;
        } catch (Exception e) {
            throw new ErrorClienteDAO_Exception("Error al buscar cliente en la base de datos:" + e.getMessage());
        }
    }

    public Cliente buscar(Cliente c) {
        try {
            List<Cliente> clientes = new ArrayList<>(obtenerListado());

            int posicion = clientes.indexOf(c);
            if (posicion != -1) {
                return clientes.get(posicion);
            }
            return null;
        } catch (Exception e) {
            throw new ErrorClienteDAO_Exception("Error al buscar cliente:" + e.getMessage());
        }
    }

    public boolean guardar(Cliente c) {
        System.out.println("Inicio de guardado");
        try {
            Boolean guardado = false;
            //Comprobacion de no existencia
            if (buscar(c) == null && buscar(c.getCodigo()) == null && validarDni(c.getDni())) {
                Connection conexionInsert = ConexionBD.getConnection();
                //Select
                String sql = "insert into clientes(nombre_cliente, apellidos_cliente, dni_cliente, direccion_cliente) values(?,?,?,?);";
                PreparedStatement statementInsert = conexionInsert.prepareStatement(sql);
                statementInsert.setString(1, String.valueOf(c.getNombre()));
                statementInsert.setString(2, String.valueOf(c.getApellidos()));
                statementInsert.setString(3, String.valueOf(c.getDni()));
                statementInsert.setString(4, String.valueOf(c.getDireccion()));
                statementInsert.executeUpdate();
                statementInsert.close();
                ConexionBD.closeConnection(conexionInsert);
                guardado = true;
            }
            //Verificacion
            return guardado;
        } catch (Exception e) {
            throw new ErrorClienteDAO_Exception("Error guardar cliente:" + e.getMessage());
        }
    }

    public boolean borrar(Cliente c) {
        try {
            //variables
            boolean encontrado = false, borrado = false;
            //Comprobacion de existencia
            if (buscar(c.getCodigo()) != null) {
                encontrado = true;
                Connection conexionDelete = ConexionBD.getConnection();
                //Select
                String sql = "delete from clientes where codigo_cliente=?";
                PreparedStatement statement = conexionDelete.prepareStatement(sql);
                statement.setInt(1, c.getCodigo());
                statement.executeUpdate();
                statement.close();
                ConexionBD.closeConnection(conexionDelete);
            }
            //Comprobacion de borrado
            if (buscar(c.getCodigo()) == null) {
                borrado = true;
            }
            //Verificacion de borrado
            return encontrado == true && borrado == true;
        } catch (Exception e) {
            throw new ErrorClienteDAO_Exception("Error al borrar cliente:" + e.getMessage());
        }
    }

    public boolean modificar(Cliente c) {
        try {
            //Objetos y variables
            boolean encontrado = false, modificado = false;
            Cliente antiguo = buscar(c.getCodigo());
            //Borrado
            if (buscar(c.getCodigo()) != null && validarDni(c.getDni())) {
                encontrado = true;
                Connection conexionUpdate = ConexionBD.getConnection();
                //Select
                String sql = "update clientes set nombre_cliente=?," +
                        " apellidos_cliente=?," +
                        " dni_cliente=?, " +
                        "direccion_cliente=?" +
                        " where codigo_cliente=?";
                PreparedStatement statement = conexionUpdate.prepareStatement(sql);
                //DATOS ENTRADA
                statement.setString(1, String.valueOf(c.getNombre()));
                statement.setString(2, String.valueOf(c.getApellidos()));
                statement.setString(3, String.valueOf(c.getDni()));
                statement.setString(4, String.valueOf(c.getDireccion()));
                //Id Entrada
                statement.setInt(5, c.getCodigo());
                //Cierres
                statement.executeUpdate();
                statement.close();
                ConexionBD.closeConnection(conexionUpdate);
            }

            //Verificacion de difrencias
            if (antiguo != null && (antiguo.getCodigo() == (c.getCodigo()))
                    && (
                    !(antiguo.getDni().equals(c.getDni())) ||
                            !(antiguo.getApellidos().equals(c.getApellidos())) ||
                            !(antiguo.getNombre().equals(c.getNombre())) ||
                            !(antiguo.getDireccion().equals(c.getDireccion()))
            )) {
                modificado = true;
            }
            //Verificacion de cambio
            return encontrado && modificado;
            //Exception
        } catch (Exception e) {
            throw new ErrorClienteDAO_Exception("Error al modificar cliente:" + e.getMessage());
        }
    }

    public List<Cliente> obtenerListado() {
        try {
            //Objetos
            Connection conexionObtenerTodosLosClientes;
            List<Cliente> clientes = new ArrayList<>();
            //Conexion
            ConexionBD cdb = new ConexionBD();
            conexionObtenerTodosLosClientes = ConexionBD.getConnection();
            //Sentencia select
            String sql = "SELECT * FROM clientes";
            PreparedStatement statement = conexionObtenerTodosLosClientes.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                clientes.add(new Cliente(
                        resultSet.getInt("codigo_cliente"),
                        resultSet.getString("nombre_cliente"),
                        resultSet.getString("apellidos_cliente"),
                        resultSet.getString("dni_cliente"),
                        resultSet.getString("direccion_cliente")
                ));
            }
            //Cierres
            resultSet.close();
            statement.close();
            ConexionBD.closeConnection(conexionObtenerTodosLosClientes);
            //Regresar cliente.Cliente
            return clientes;
        } catch (Exception e) {
            throw new ErrorClienteDAO_Exception("Error al obtener listado de cliente:" + e.getMessage());
        }
    }

    @Override
    public boolean validarDni(String dni) {
        //LLamada a sql validar dni
        try {
            //Variables
            Connection conexionBusquedaID;
            String numero;
            char letra;
            char letra2 = 0;
            if (dni != null && dni.length() == 9) {
                numero = dni.substring(0, 8);
                letra = dni.toUpperCase().charAt(8);
                conexionBusquedaID = ConexionBD.getConnection();
                //Select
                String sql = "SELECT validar_dni(?) as dni";
                PreparedStatement statement = conexionBusquedaID.prepareStatement(sql);
                statement.setString(1, numero);
                ResultSet resultSet = statement.executeQuery();
                //No es necesario bucle

                while (resultSet.next()) {
                    letra2 = resultSet.getString("dni").charAt(0);
                }
                //Cierres
                resultSet.close();
                statement.close();
                ConexionBD.closeConnection(conexionBusquedaID);
                return letra2 == letra;
            }
        } catch (SQLException e) {
            throw new ErrorClienteDAO_Exception("Error al dni no valido" + e.getMessage());
        } catch (Exception e) {
            throw new ErrorClienteDAO_Exception("Error en validar dni:" + e.getMessage());
        }

        return false;
    }
}
