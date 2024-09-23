public class Individual extends Habitacion{
    private boolean camaExtra;

    public Individual(int numeroHabitacion, TipoCama cama, double precio, int capacidadMaxima, boolean camaExtra) {
        super(numeroHabitacion, TipoHabitacion.INDIVIDUAL, cama, precio, capacidadMaxima);
        this.camaExtra = camaExtra;
    }

    public boolean isCamaExtra() {
        return camaExtra;
    }

    public void setCamaExtra(boolean camaExtra) {
        this.camaExtra = camaExtra;
    }

    @Override
    public String toString() {
        return "Individual{" + super.toString() +
                "camaExtra=" + camaExtra +
                '}';
    }

    public  double calcularPrecio(){
        if(camaExtra){
            return this.getPrecio()+10;
        }else{
            return this.getPrecio();
        }
    }
}
