import java.util.ArrayList;

public class Hotel {


    private String nombre;
    private String direccion;
    private String telefono;
    private ArrayList<Cliente> clientes;
    private ArrayList<Habitacion> habitacines ;
    private ArrayList<Reserva> reservas ;
    private ArrayList<Reserva> habitacinesOcupadas ;


    //////////////////////////////////////////////CONSTRUCTOR////////////////////////////////////////////////////////

    public Hotel(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.clientes = new ArrayList<>();
        this.habitacines = new ArrayList<>();
        this.reservas = new ArrayList<>();
        this.habitacinesOcupadas = new ArrayList<>();
    }

    //////////////////////////////////////////////G&S////////////////////////////////////////////////////////

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Habitacion> getHabitacines() {
        return habitacines;
    }

    public void setHabitacines(ArrayList<Habitacion> habitacines) {
        this.habitacines = habitacines;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public ArrayList<Reserva> getHabitacinesOcupadas() {
        return habitacinesOcupadas;
    }

    public void setHabitacinesOcupadas(ArrayList<Reserva> habitacinesOcupadas) {
        this.habitacinesOcupadas = habitacinesOcupadas;
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    //////////////////////////////////////////////AÑADIR_DATOS////////////////////////////////////////////////////////
    public void añadirHabitacion(Habitacion h){
        habitacines.add(h);
    }
    public void añadirCliente(Cliente c){
        clientes.add(c);
    }
    //////////////////////////////////////////////CONVERSOR////////////////////////////////////////////////////////
    private Cliente dniToCliente(String dni){
        for(Cliente cli :clientes){
            if(cli.getDni().equals(dni)){
                System.out.println(cli);
                return cli;
            }
        }
        return null;
    }
    private Habitacion numeroToHabitacion(int numero){
        for(Habitacion hab :habitacines){
            if(hab.getNumeroHabitacion()==numero){
                return hab;
            }
        }
        return null;
    }
    //////////////////////////////////////////////RESERVA////////////////////////////////////////////////////////
    public boolean reservarHabitacion(Reserva res){
        //reserva la habitacion
        //valida qque exista habitacion
        //valida que no esta en rservas com fechas coincidentes
        //valida que no este ocupada hasta la fecha de inicio de reserva
           if(habitacines.contains(res.getHabitacion()) && validaRservas(res) && validaOcupada(res)){
               reservas.add(res);
               return true;
           }
            return false;
    }
    private boolean validaOcupada(Reserva res){
        //valida que no este ocupada hasta la fecha de inicio de reserva
        for(Reserva r:habitacinesOcupadas){
            if(r.getHabitacion().equals(res.getHabitacion())
                    && r.getInicioReserva().isAfter(res.getInicioReserva())
                    && r.getFinReserva().isBefore(res.getFinReserva())){
                return false;
            }
        }
        return true;
    }
    private boolean validaRservas(Reserva res){
        //valida que no esta en rservas com fechas coincidentes
        for(Reserva r:reservas){
            if(r.getHabitacion().equals(res.getHabitacion())
                    && r.getInicioReserva().isAfter(res.getInicioReserva())
                    && r.getFinReserva().isBefore(res.getFinReserva())){
                return false;
            }
        }
        return true;
    }
    //////////////////////////////////////////////CHECK_IN////////////////////////////////////////////////////////
    public boolean check_in(Reserva res){
        //marca como ocupada la reserva indicada
        if(reservas.contains(res)){
                    reservas.remove(res);
                    habitacinesOcupadas.add(res);
                    return true;
                }
        return false;
    }
    //////////////////////////////////////////////CHECK_OUT////////////////////////////////////////////////////////
    public boolean check_out(Reserva res){
        //habitaciones ocupadas se eliminan
           if(habitacinesOcupadas.contains(res)){
                    habitacinesOcupadas.remove(res);
                    return true;
                }
        return false;
    }
    //////////////////////////////////////////////CANCELAR_RESERVA////////////////////////////////////////////////////////
    public boolean cancelarReserva(Reserva res){
        //cancelar reservas.
          if(reservas.contains(res)){
                    reservas.remove(res);
                    return true;
                }
        return false;
    }

    //////////////////////////////////////////////LISTADOS////////////////////////////////////////////////////////

}
