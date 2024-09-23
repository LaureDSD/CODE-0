
public class Coche extends Vehiculo {
    private int numeroPuertas;
    private Combustible combustible;

    public Coche(String marca, String modelo, double precio, int numeroPuertas, Combustible combustible) {
        super(marca, modelo, precio);
        this.numeroPuertas = numeroPuertas;
        this.combustible = combustible;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return super.toString() + " ,numeroPuertas=" + numeroPuertas + ", combustible=" + combustible ;
    }
}
