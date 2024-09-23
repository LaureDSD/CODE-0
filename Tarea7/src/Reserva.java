import java.time.LocalDate;

public class Reserva implements Comparable<Reserva> {
    private Cliente cliente;
    private Habitacion habitacion;
    private int numOcupantes;
    private LocalDate inicioReserva;
    private LocalDate finReserva;

    public Reserva(Cliente cliente, Habitacion habitacion, int numOcupantes, LocalDate inicioReserva, LocalDate finReserva) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.numOcupantes = numOcupantes;
        this.inicioReserva = inicioReserva;
        this.finReserva = finReserva;

    }



    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public int getNumOcupantes() {
        return numOcupantes;
    }

    public void setNumOcupantes(int numOcupantes) {
        this.numOcupantes = numOcupantes;
    }

    public LocalDate getInicioReserva() {
        return inicioReserva;
    }

    public void setInicioReserva(LocalDate inicioReserva) {
        this.inicioReserva = inicioReserva;
    }

    public LocalDate getFinReserva() {
        return finReserva;
    }

    public void setFinReserva(LocalDate finReserva) {
        this.finReserva = finReserva;
    }

    @Override
    public int compareTo(Reserva o) {
        return this.cliente.compareTo(o.cliente);
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "\n cliente=" + cliente +
                "\n habitacion=" + habitacion +
                "\n numOcupantes=" + numOcupantes +
                ", inicioReserva=" + inicioReserva +
                ", finReserva=" + finReserva +
                "\n}";
    }
}
