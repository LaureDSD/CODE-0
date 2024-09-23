package cliente;

import java.util.Objects;

public class Cliente implements Comparable<Cliente>{
    private int codigo;
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;

    // Completa constructores, getters, setters, toString

    public Cliente(int codigo, String nombre, String apellidos, String dni, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // y otros métodos necesarios

    public int compareTo(Cliente cliente) {
       if ( this.apellidos.equals(cliente.apellidos)) {
           if ( this.nombre.equals(cliente.nombre)) {
               return this.dni.compareTo(cliente.dni);
           }
           return this.nombre.compareTo(cliente.nombre);
       }
       return this.apellidos.compareTo(cliente.apellidos);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return  Objects.equals(dni, cliente.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombre, apellidos, dni, direccion);
    }

    @Override
    public String toString() {
        return "cliente.Cliente{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}

