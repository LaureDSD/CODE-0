public abstract class Habitacion implements Comparable<Habitacion> {
    private int numeroHabitacion;
    private TipoHabitacion tipoHabitacion;
    private TipoCama cama;
    private double precio;
    private int capacidadMaxima;

    public Habitacion(int numeroHabitacion, TipoHabitacion tipo, TipoCama cama, double precio, int capacidadMaxima) {
        this.numeroHabitacion = numeroHabitacion;
        tipoHabitacion = tipo;
        this.cama = cama;
        this.precio = precio;
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public TipoCama getCama() {
        return cama;
    }

    public void setCama(TipoCama cama) {
        this.cama = cama;
    }
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "numeroHabitacion=" + numeroHabitacion +
                ", cama=" + cama +
                ", precio=" + precio +
                ", capacidadMaxima=" + capacidadMaxima +
                '}';
    }

    public int compareTo(Habitacion h){
        return Integer.compare(this.numeroHabitacion , h.numeroHabitacion);
    }
    public  double calcularPrecio(){
        return 0;
    }
}
