public class Banco {
    //VARIABLES
    private String nombre;
    private CuentaBancaria[] cuentas;
    private static final int NUM_MAX_CUENTAS = 10;

    //Contructor
    public Banco(String nombre) {
        this.nombre = nombre;
        this.cuentas = new CuentaBancaria[NUM_MAX_CUENTAS];
    }

    //G&S
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CuentaBancaria[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(CuentaBancaria cuentas) {
        for (int i = 0; i < this.cuentas.length; i++) {
            if (this.cuentas[i] == null) {
                this.cuentas[i] = cuentas;
                i = this.cuentas.length;
            } else {
                i++;
            }
        }
    }
    //METODOS

    //Crea un método que permita abrir una cuenta. Recibirá por parámetros un objeto de la clase “Cliente”
    // (será el titular de la cuenta) y un número que será el saldo de la cuenta.
    //Este método debe controlar que el número de cuenta sea diferente al del resto
    // de cuentas del banco.
    public void abrirCuenta(Cliente cliente, double saldo) {
        int i = 0;
        while (i < cuentas.length && cuentas[i] != null) {
            i++;
        }
        if (i < cuentas.length) {
            cuentas[i] = new CuentaBancaria(cliente, 1 + i + i * 2, saldo);
        }
    }
    //Crea un método que permita cerrar una cuenta. Recibirá por parámetro el “número de  la cuenta”
    // que se desea borrar. Retornará true si se ha podido cerrar, false en
    // caso contrario.
    public boolean borrarCuenta(int cuenta) {
        int i = 0;
        boolean borrada = false;
        while (i < cuentas.length && !borrada) {
            if (cuentas[i] != null && cuentas[i].getNumeroCuenta() == cuenta) {
                cuentas[i] = null;
                borrada = true;
            }
            i++;
        }
        return borrada;
    }
    //Crea un método que visualice en pantalla los datos de todas las cuentas bancarias.
    public void mostarCuentas() {
        for (CuentaBancaria c : cuentas) {
            if (c != null) {
                System.out.println(c);
            }
        }
    }
    //Crea un método que visualice en pantalla los datos de una cuenta bancaria, cuyo número
    // de cuenta se pasa por parámetro.

    public void mostarCuentas(int cuentaID) {
        for (CuentaBancaria c : cuentas) {
            if (c != null && c.getNumeroCuenta() == cuentaID) {
                System.out.println(c);
            }
        }
    }

    //Crea un método que visualice en pantalla todas las cuentas bancarias de un determinado
    // cliente, cuyo dni se pasa por parámetro´.
    public void mostarCuentas(String dni) {
        for (CuentaBancaria c : cuentas) {
            if (c != null) {
                for (Cliente cl : c.getTitular()) {
                    if (cl != null && cl.getDni().equals(dni)) {
                        System.out.println(cl);
                    }
                }
            }
        }
    }
    //Crea un método que retorne las cuentas con mayor saldo del banco. Puede haber varias
    // cuentas con el mismo saldo.

    public CuentaBancaria[] mayorSaldoBanco() {
        double saldoMayor = Double.MIN_VALUE;
        CuentaBancaria[] arraySaldoMayor = new CuentaBancaria[NUM_MAX_CUENTAS];

        for (CuentaBancaria c : cuentas) {
            if (c != null && c.getSaldo() > saldoMayor) {
                saldoMayor = c.getSaldo();
            }
        }
        int i = 0;
        for (CuentaBancaria c : cuentas) {
            if (c != null && c.getSaldo() == saldoMayor) {
                arraySaldoMayor[i] = c;
                i++;
            }
        }
        return arraySaldoMayor;
    }
    //Crea un método que retorne la cuenta con menor saldo del banco. Puede haber varias
    // cuentas con el mismo saldo.
    public CuentaBancaria[] menorSaldo() {
        double saldoMenor = Double.MAX_VALUE;
        CuentaBancaria[] arraySaldoMenor = new CuentaBancaria[NUM_MAX_CUENTAS];
        for (CuentaBancaria c : cuentas) {
            if (c != null && c.getSaldo() < saldoMenor) {
                saldoMenor = c.getSaldo();
            }
        }
        int i = 0;
        for (CuentaBancaria c : cuentas) {
            if (c != null && c.getSaldo() == saldoMenor) {
                arraySaldoMenor[i] = c;
                i++;
            }
        }
        return arraySaldoMenor;
    }
    //Crea un método que retorne el saldo total del banco (suma de los saldos de todas las cuentas).
    public double saldoTotal() {
        double total = 0;
        for (CuentaBancaria c : cuentas) {
            if (c != null) {
                total = c.getSaldo() + total;
            }
        }
        return total;
    }
    //Crea un método que retorne el saldo medio de las cuentas del banco.
    public double saldoMedioBanco() {
        double sumaMedia = 0;
        int cont = 0;
        for (CuentaBancaria c : cuentas) {
            if (c != null) {
                sumaMedia = c.getSaldo() + sumaMedia;
                cont++;
            }
        }
        sumaMedia = sumaMedia / cont;
        return sumaMedia;
    }

    //Crea un método que nos muestre los datos del cliente que tenga depositado más dinero en el banco.
    // Puede haber varios clientes con el mismo saldo.
    public Cliente[] clienteMayorSaldo() {
        //MAYOR
        double saldoMayor = Double.MIN_VALUE;
        //COMPARAR
        Cliente[] comparar = new Cliente[NUM_MAX_CUENTAS];
        double [] sumasaldo = new double[NUM_MAX_CUENTAS];




   //MI VERSION
        //Recorre cuentas
        for (CuentaBancaria bc : cuentas) {
            if (bc != null) {




                //Recorre titulares
                for (Cliente origen : bc.getTitular()) {
                //Recorre guardados
                for (int i=0;i<comparar.length;i++) {


                        if (origen != null) {
                            //Suma saldos
                            if (comparar[i]!=null && comparar[i].equals(origen)) {
                                sumasaldo[i] = sumasaldo[i] + bc.getSaldo();
                                System.out.println("acumula"+sumasaldo[i]);
                            }else{
                                //Guarda saldos y clientes
                                comparar[i] = origen;
                                System.out.println("guarda"+comparar[i]);
                                sumasaldo[i] = bc.getSaldo();
                                System.out.println("guarda"+bc.getSaldo());
                            }
                        }
                    }
                }
            }
        }
        saldoMayor = buscarMayor(sumasaldo);
        System.out.println(saldoMayor);

        //Limpiar lista
        for (int x = 0; x < comparar.length; x++) {
            if (sumasaldo[x]<saldoMayor) {
                comparar[x]=null;
            }
        }

        return comparar;


/*
//TONI
        int i=0;

        while(i < comparar.length && comparar[i] != null){
            for(CuentaBancaria c: cuentas){
                if(c!=null && c.esTitular(comparar[i])){
                    sumasaldo[i] += c.getSaldo();
                }
            }
            i++;
        }
        //metodo
        saldoMayor = buscarMayor(sumasaldo);
        for (int x = 0; x < comparar.length; x++) {
            if (sumasaldo[x]<saldoMayor) {
                comparar[x]=null;
            }
        }
        for(int x=0;x<comparar.length;x++){
            if(comparar[i]!=null && sumasaldo[i]==saldoMayor){
                System.out.println(comparar[i]);
            }
        }
         return comparar;
*/



        //PROGRAMA BASE
        /*
        for(CuentaBancaria c : cuentas){
            if(c!=null && c.getSaldo()<saldoMayor){
                saldoMayor=c.getSaldo();
            }
        }

        for(int i=0 ; i<cuentas.length ; i++){

            if(cuentas[i]!=null && cuentas[i].getSaldo()==saldoMayor){
              a[i]=cuentas[i].getTitular();
            }

        }
        return a;
        */
    }


    public double buscarMayor(double[] numero){
        double saldoMayor = Double.MIN_VALUE;
        for (int x = 0; x < numero.length; x++) {
            if (numero[x]>saldoMayor) {
                saldoMayor=numero[x];
            }
        }
        return saldoMayor;
    }
    //Crea un método que elimine un cliente, cuyo dni se pasa por parámetro. Retornará true si se ha eliminado,
    // false si el cliente no existe. Para eliminar un cliente, se deberán eliminar todas sus cuentas.
    public boolean eliminaClientePorDNI(String dni) {
        boolean borrado=false;

        //busqueda
        for (CuentaBancaria c : cuentas) {
            if (c != null) {
                for (Cliente cl : c.getTitular()) {
                    if (cl != null && cl.getDni().equals(dni)) {
                        cl = null;
                        //Borrado
                        if(detectarVacias(c)){
                            c=null;
                        }
                        borrado = true;
                    }
                }
            }
        }
        return borrado;
    }

    //COMPROBAR CUENTAS VACIAS Y BORRADO
    public boolean detectarVacias(CuentaBancaria c) {
        boolean borrar=true;
        //busqueda
        for (Cliente cl : c.getTitular()) {
            if (cl != null ) {
                return false;
            }
        }
        return borrar;
    }

}
