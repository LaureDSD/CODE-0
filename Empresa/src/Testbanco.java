public class Testbanco {
    public static void main(String[] args) {
        Banco b1 = new Banco("Arias");

        Cliente c1 = new Cliente("a1","123a","12-3-2079",1);
        Cliente c2 = new Cliente("b1","123b","11-2-2079",2);
        Cliente c3 = new Cliente("c1","123s","10-1-2079",3);
        Cliente c4 = new Cliente("aa1","123a","12-3-2079",4);
        Cliente c5 = new Cliente("bb1","123b","11-2-2079",5);
        Cliente c6 = new Cliente("cc1","123c","10-1-2079",6);

        b1.abrirCuenta(c1,100);
        b1.abrirCuenta(c2,100);
        b1.abrirCuenta(c3,1000);
        b1.abrirCuenta(c3,1000);
        b1.abrirCuenta(c4,100);
        b1.abrirCuenta(c5,100);
        b1.abrirCuenta(c6,1000);



        System.out.println("Mostrar cuentas");
        b1.mostarCuentas();

        System.out.println("Mostrar cuentas numero:");
        b1.mostarCuentas(1);

        System.out.println("Borrar cuenta");
        System.out.println(b1.borrarCuenta(4));

        System.out.println("Mostrar cuentas dni:");
        b1.mostarCuentas("123s");

        System.out.println("Mostrar cuentas ID");
        b1.mostarCuentas(2);

        System.out.println("Mostrar cuentas DNI");
        b1.mostarCuentas("123c");

        System.out.println("Mostrar mayor saldo");
        for(CuentaBancaria c : b1.mayorSaldoBanco()){
            if(c!=null) {
                System.out.println(c);
            }
        }

        System.out.println("Mostrar menor saldo");
        b1.menorSaldo();

/*
        for(int i=0 ; i<b1.menorSaldo().length ; i++){
            if(b1.menorSaldo()[i]!=null) {
                System.out.println(b1.menorSaldo()[i]);
            }
        }

 */
        for(CuentaBancaria c : b1.menorSaldo()){
            if(c!=null) {
                System.out.println(c);
            }
        }

        System.out.println("Mostrar saldo total");
        System.out.println(b1.saldoTotal());

        System.out.println("Saldo Medio");
        System.out.println(b1.saldoMedioBanco());



        System.out.println("--------------------------------------------------");
        System.out.println("Cliente Mayor Saldo Total");
        b1.clienteMayorSaldo();
        for(Cliente c : b1.clienteMayorSaldo()){
            if(c!=null) {
                System.out.println(c);
            }
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Mostrar cuentas:");
        b1.mostarCuentas();

        System.out.println("Borra por dni");
        System.out.println(b1.eliminaClientePorDNI("123b"));

        System.out.println("Mostrar cuentas:");
        b1.mostarCuentas();
    }
}
