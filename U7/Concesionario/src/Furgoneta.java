
public class Furgoneta extends Vehiculo{
    private int capacidadCarga;

    public Furgoneta(String marca, String modelo, double precio, int capacidadCarga) {
        super(marca, modelo, precio);
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return super.toString()+ " ,capacidadCarga=" + capacidadCarga;
    }
}
