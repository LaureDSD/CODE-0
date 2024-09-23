public class Suite extends Habitacion{
    private boolean jacuzzi;

    public Suite(int numeroHabitacion, TipoCama cama, double precio, int capacidadMaxima, boolean jacuzzi) {
        super(numeroHabitacion,TipoHabitacion.SUITE, cama, precio, capacidadMaxima);
        this.jacuzzi = jacuzzi;
    }

    public boolean isJacuzzi() {
        return jacuzzi;
    }

    public void setJacuzzi(boolean jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    @Override
    public String toString() {
        return "Suite{" + super.toString() +
                "jacuzzi=" + jacuzzi +
                '}';
    }

    public  double calcularPrecio(){
        if(jacuzzi){
            return this.getPrecio()+30;
        }else{
            return this.getPrecio();
        }
    }
}
