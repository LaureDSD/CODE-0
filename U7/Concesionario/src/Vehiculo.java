import java.util.Objects;


public class Vehiculo implements Comparable<Vehiculo>{
    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehiculo)) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(marca.toLowerCase().trim(), vehiculo.marca.toLowerCase().trim())
                && Objects.equals(modelo.toLowerCase().trim(), vehiculo.modelo.toLowerCase().trim());
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, precio);
    }

    public int compareTo(Vehiculo v) {
       if (this.marca.equals(v.getMarca())) {
           if(this.modelo.equals(v.getModelo())){
               //precio
               return Double.compare(v.getPrecio(),this.precio);
           }
           //modelo
           return this.modelo.compareTo(v.getModelo());
       }
       //marca
       return (this.marca).compareTo(v.marca);
    }

    @Override
    public String toString() {
        return "marca='" + marca + '\'' + ", modelo='" + modelo + '\'' + ", precio=" + precio;
    }
}
