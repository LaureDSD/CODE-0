public class Cliente extends Persona {
    //VARIABLES
    private int numeroCliente;
    //CONSTRUCTOR
    public Cliente(String persona, String dni, String fechaNacimiento, int numeroCliente) {
        super(persona, dni, fechaNacimiento);
        this.numeroCliente = numeroCliente;
    }


    @Override
    public String toString() {
        return super.toString() +" numeroCliente=" + numeroCliente + "]\n" ;
    }
    //G&S
    public int getNumeroCliente() {
        return numeroCliente;
    }
    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    /* METODOS */


}