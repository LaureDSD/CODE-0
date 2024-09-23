public abstract class Vehiculo {
    String marca;
    String modelo;
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    public abstract void encender();
}
