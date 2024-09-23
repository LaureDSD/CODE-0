public class Doble extends Habitacion{
    private boolean balcon;
    public Doble(int numeroHabitacion, TipoCama cama, double precio, int capacidadMaxima, boolean balcon) {
        super(numeroHabitacion,TipoHabitacion.DOBLE ,cama, precio, capacidadMaxima);
        this.balcon = balcon;
    }

    public boolean isBalcon() {
        return balcon;
    }

    public void setBalcon(boolean balcon) {
        this.balcon = balcon;
    }

    @Override
    public String toString() {
        return "Doble{" + super.toString() +
                "balcon=" + balcon +
                '}';
    }

    public  double calcularPrecio(){
        if(balcon){
            return this.getPrecio()+15;
        }else{
            return this.getPrecio();
        }
    }
}
