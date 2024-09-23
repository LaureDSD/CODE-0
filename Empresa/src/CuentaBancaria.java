import java.util.Arrays;

public class CuentaBancaria {
    //VARIABLES
    private Cliente[] titular;
    private int numeroCuenta ;
    private double saldo ;
    private static final int NUM_MAX_TITULARES =3;




















    //Contructor

    public CuentaBancaria(Cliente titular,int numeroCuenta, double saldo) {
        this.titular = new Cliente[NUM_MAX_TITULARES];
        this.titular[0] = titular;
        /*for(int t=0;t<this.titular.length;t++){
            if(this.titular[t]==null) {
                this.titular[t] = titular;
                t=this.titular.length;
                }
            }*/
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    //G&S
    public Cliente[] getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        for(int t=0;t<this.titular.length;t++){
            if(this.titular[t]==null) {
                this.titular[t] = titular;
                t=this.titular.length;
            }
        }
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "NumeroCuenta=" + numeroCuenta+ ", saldo=" + saldo +" :"+ "\n" +
                "titular" + Arrays.toString(titular)+"\n";
    }

    //METODOS

    public void ingresar(double ingreso){
        this.saldo=ingreso;
    }

    public boolean retirar(double retirar){
        if(this.saldo>retirar){
            this.saldo=this.saldo-retirar;
            return true;
        }
        return false;
    }

    public boolean añadirTitular(Cliente c){
        for(Cliente e: titular){
            if(e==null){
                e=c;
                return true;
            }
        }
        return false;
    }

    public boolean borrarTitularDNI(String dni){
        for(Cliente e: titular){
            if(e!=null && dni.equals(e.getDni())){
                e=null;
                return true;
            }
        }
        return false;
    }

    public boolean borrarTitularNumero(int numero){
        for(Cliente e: titular){
            if(e!=null && numero==(e.getNumeroCliente())){
                e=null;
                return true;
            }
        }
        return false;
    }

    public boolean esTitular(Cliente c){
        int i=0;
        while (i<titular.length && c!=titular[i]){
        i++;
        }
        return i<titular.length;
    }

    public void mostrarCuenta(){
        System.out.println("Numero de cuenta: "+this.numeroCuenta+" Saldo:"+this.saldo);
    }
}
