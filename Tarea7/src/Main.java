import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Hotel
        Hotel h1 = new Hotel("Frega","Calle Greto n3","765-432-889");

        //Habitaciones Individuales
        h1.añadirHabitacion(new Individual(1,TipoCama.Individual,12,1,false));
        h1.añadirHabitacion(new Individual(2,TipoCama.Individual,12,2,true));
        h1.añadirHabitacion(new Individual(3,TipoCama.Matrimonio,12,2,false));
        h1.añadirHabitacion(new Individual(4,TipoCama.Matrimonio,12,2,true));
        //Habitaciones Dobles
        for (Doble doble : Arrays.asList(
                new Doble(5, TipoCama.Individual, 22, 2, false),
                new Doble(6, TipoCama.Individual, 22, 2, true),
                new Doble(7, TipoCama.Matrimonio, 22, 4, false),
                new Doble(8, TipoCama.Matrimonio, 22, 4, true))) {
            h1.añadirHabitacion(doble);
        }
        //Habitaciones Suit
        for (Suite suite : Arrays.asList(
                new Suite(9, TipoCama.King, 32, 2, true),
                new Suite(10, TipoCama.King, 32, 2, false),
                new Suite(11, TipoCama.Queen, 32, 2, true),
                new Suite(12, TipoCama.Queen, 32, 2, false))) {
            h1.añadirHabitacion(suite);
        }
        //Clientes
        h1.añadirCliente(new Cliente("Pepe","123-123-123","ppepe123@g.cd","12345678G"));
        h1.añadirCliente( new Cliente("Laura","123-123-124","laur123@g.cd","12345672F"));
        h1.añadirCliente( new Cliente("Sara","123-123-125","sa123@g.cd","12345478H"));
        h1.añadirCliente( new Cliente("Fel","123-123-126","fel123@g.cd","12378678K"));
        h1.añadirCliente( new Cliente("Aro","123-123-127","alort123@g.cd","12348978Ñ"));
        //Bienvenida
        System.out.println("Hotel Campos");
        new Reserva(h1.getClientes().get(1),h1.getHabitacines().get(1), 2, LocalDate.of(2024,3, 3),LocalDate.of(2025,3,3));
        //Menu
        MenuHotel menuInicial = new MenuHotel("Menu1",6);
        //selccion de servicio
        menuInicial.guardarOpcion( "Ver resrvas y habitaciones" ,1);
        menuInicial.guardarOpcion( "Hacer reserva" ,2);
        menuInicial.guardarOpcion( "Cancelaciones" ,3);
        menuInicial.guardarOpcion( "Checks_In" ,4);
        menuInicial.guardarOpcion( "Checks_Out" ,5);
        menuInicial.guardarOpcion( "Salir" ,0);
        int opcion;
        do {
            menuInicial.mostrar();
            opcion = menuInicial.leerOpcion();
            switch (opcion) {
                case 1 -> {
                    informacion(h1);
                }
                case 2 -> {
                    generarReservar(h1);
                }
                case 3 -> {
                    cancelaciones(h1);
                }
                case 4 -> {
                    checksIN(h1);
                }
                case 5 -> {
                    checksOUT(h1);
                }
            }
        } while (opcion != 0);
    }
    public static void informacion(Hotel h1){
        //Informacion de los datos
        MenuHotel menu = new MenuHotel("Informacion",5);
        //selccion de servicio
        menu.guardarOpcion( "Ver habitaciones" ,1);
        menu.guardarOpcion( "Ver habitaciones reservas" ,2);
        menu.guardarOpcion( "Ver habitaciones ocupadas" ,3);
        menu.guardarOpcion( "Ver reservas" ,4);
        menu.guardarOpcion( "Ver ocupacines" ,5);
        menu.guardarOpcion( "Regresar" ,0);
        int opcion;
        do {
            menu.mostrar();
            opcion = menu.leerOpcion();
            switch (opcion) {
                case 1 -> {
                    listarHabitaciones(h1);
                }
                case 2 -> {
                    listarHabitacionesReservadas(h1);
                }
                case 3 -> {
                    listarHabitacionesOcupadas(h1);
                }
                case 4 -> {
                    listarReservas(h1);
                }
                case 5 -> {
                    listarOcupadas(h1);
                }
            }
        } while (opcion != 0);
    }
    public static void generarReservar(Hotel h1){
        //Hacer reserva
        if(h1.reservarHabitacion( introducirDatosReserva(h1) )){
            System.out.println("Se creo correctamente");
        }else{
            System.out.println("Error,No se aplicaron cambios");
        }
    }
    public static Reserva introducirDatosReserva(Hotel h1){
        //Aplicar filtros y hacer reserva
        System.out.println("Selecciona una opcion \n" +
                "1- Tipo de habitacion \n" +
                "2- Precio \n" +
                "3- Fecha Inicio \n" +
                "3- Fecha Fin \n" +
                "3- Extras \n" +
                "4- Salir\n");
        MenuHotel menu = new MenuHotel("Reserva",5);
        //selccion de servicio
        menu.guardarOpcion( "DNI/Cliente" ,1);
        menu.guardarOpcion( "Numero/Habitacion" ,2);
        menu.guardarOpcion( "F_Inicio" ,3);
        menu.guardarOpcion( "F_Fin" ,4);
        menu.guardarOpcion( "Regresar" ,0);
        //Variables
        Cliente cliente = null;
        Habitacion habitacion = null;
        int ocupantes = 0;
        LocalDate inicio = LocalDate.now();
        LocalDate fin = LocalDate.now();
        Reserva reservaCreada;
        //Seleccion
        int opcion;
        do {
            menu.mostrar();
            opcion = menu.leerOpcion();
            switch (opcion) {
                case 1 -> {
                    //Cliente
                    System.out.println("Selecciona cliente");
                    cliente = seleccionarUsuario(h1);
                }
                case 2 -> {
                    //Habitacion
                    System.out.println("Selecciona habitación");
                    habitacion = seleccionarHabitacion(h1);
                }
                case 4 -> {
                    //Fecha 1
                    System.out.println("Introduce ocupantes");
                    ocupantes = introducirNumero();
                }
                case 5 -> {
                    //Fecha 1
                    System.out.println("Fecha de entrada");
                    inicio = introducirFecha();
                }
                case 6 -> {
                    //Fecha 2
                    System.out.println("Fecha de salida");
                    fin = introducirFecha();
                }
            }
        reservaCreada =new Reserva(cliente,habitacion,ocupantes,inicio,fin);
        } while (opcion != 0);
        return reservaCreada;
    }
    public static Habitacion seleccionarHabitacion(Hotel h1) {
        Scanner teclado = new Scanner(System.in);
            listarHabitaciones(h1);
            System.out.println("Indica numero de habitacion");
            int i = 0;
            while (i < h1.getHabitacines().size() && h1.getHabitacines().get(i).getNumeroHabitacion() == teclado.nextInt()) {
                i++;
            }
            if (i == h1.getHabitacines().size()) {
                System.out.println("Habitacion no existe");
            } else {
                return h1.getHabitacines().get(i);
            }
        return null;
    }
    public static Cliente seleccionarUsuario(Hotel h1){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indica DNI");
        int i = 0;
        while(i<h1.getClientes().size() && h1.getClientes().get(i).getDni().equals(teclado.nextLine())){
            i++;
        }
        if(i==h1.getClientes().size()) {
            System.out.println("Usuario no existe");
        }else {
            return h1.getClientes().get(i);
        }
        return null;
    }
    public static int introducirNumero(){
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }
    public static LocalDate introducirFecha(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indica año");
        int ano = teclado.nextInt();
        System.out.println("Indica mes");
        int mes = teclado.nextInt();
        System.out.println("Indica año");
        int dia = teclado.nextInt();
        return LocalDate.of(ano,mes,dia);
    };
    public static void checksIN(Hotel h1){
        //Hacer check_IN
        if(h1.check_in(seleccionReserva(h1))){
            System.out.println("Se borro correctamente");
        }else{
            System.out.println("Error,No se aplicaron cambios");
        }
    }
    public static void checksOUT(Hotel h1){
        //Hacer check_OUT
        if(h1.check_out(seleccionReserva(h1))){
            System.out.println("Se borro correctamente");
        }else{
            System.out.println("Error,No se aplicaron cambios");
        }
    }
    public static void cancelaciones(Hotel h1){
        //Hacer cancelacion
        if(h1.cancelarReserva(seleccionReserva(h1))){
            System.out.println("Se borro correctamente");
        }else{
            System.out.println("Error,No se aplicaron cambios");
        }
    }
    public static Reserva seleccionReserva(Hotel h1){
        //Seleccion de reserva
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indica dni del cliente:");
        String dni = teclado.nextLine();
        listarReservasDni(h1,dni);
        System.out.println("Introduce datos de reserva:");
        Habitacion h = seleccionarHabitacion(h1);
        System.out.println("Introducir fecha inicio");
        LocalDate in = introducirFecha();
        System.out.println("Introducir fecha final");
        LocalDate f = introducirFecha();
        int i = 0;
        while (i < h1.getReservas().size()
                && h1.getReservas().get(i).getCliente().getDni().equals(dni)
                && h1.getReservas().get(i).getHabitacion().equals(h)
                && h1.getReservas().get(i).getInicioReserva().equals(in)
                && h1.getReservas().get(i).getFinReserva().equals(f)
        ) {
            i++;
        }
        if (i == h1.getHabitacines().size()) {
            System.out.println("Reserva no existe");
        } else {
            return h1.getReservas().get(i);
        }
        return null;
        //return new Reserva(h1.getClientes().get(1),h1.getHabitacines().get(1), 2, LocalDate.of(2024,3, 3),LocalDate.of(2025,3,3));
    }
    public static void listarHabitaciones(Hotel ho){
        TipoHabitacion tipo = seleccionTipoHabitacion();
        for(Habitacion h: ho.getHabitacines()){
            if(tipo == TipoHabitacion.TODAS || h.getTipoHabitacion()==tipo) {
                System.out.println(h);
            }
        }
    }
    public static void listarHabitacionesOcupadas(Hotel ho){
        TipoHabitacion tipo = seleccionTipoHabitacion();
        for(Reserva r: ho.getHabitacinesOcupadas()){
            if(tipo == TipoHabitacion.TODAS || r.getHabitacion().getTipoHabitacion()==tipo) {
                System.out.println(r.getHabitacion());
            }
        }
    }
    public static void listarHabitacionesReservadas(Hotel ho){
        TipoHabitacion tipo = seleccionTipoHabitacion();
        for(Reserva r: ho.getReservas()){
            if(tipo == TipoHabitacion.TODAS || r.getHabitacion().getTipoHabitacion()==tipo) {
                System.out.println(r.getHabitacion());
            }
        }
    }
    private static TipoHabitacion seleccionTipoHabitacion(){
        MenuHotel menu = new MenuHotel("Habitaciones",5);
        menu.guardarOpcion( "Ver Todas" ,1);
        menu.guardarOpcion( "Ver Individuales" ,2);
        menu.guardarOpcion( "Ver Suits" ,3);
        menu.guardarOpcion( "Ver Dobles" ,4);
        menu.guardarOpcion( "Regresar" ,0);
        int opcion;
        do {
            menu.mostrar();
            opcion = menu.leerOpcion();
            switch (opcion) {
                case 1 -> {
                    return TipoHabitacion.TODAS;
                }
                case 2 -> {
                    return TipoHabitacion.INDIVIDUAL;
                }
                case 3 -> {
                    return TipoHabitacion.DOBLE;
                }
                case 4 -> {
                    return TipoHabitacion.SUITE;
                }
            }
        } while (opcion != 0);
        return null;
    }
    public static void listarReservas(Hotel ho){
        for(Reserva r: ho.getReservas()){
                System.out.println(r);
        }
    }
    public static void listarReservasDni(Hotel ho, String dni){
        for(Reserva r: ho.getReservas()){
            if(dni.equals(r.getCliente().getDni())) {
                System.out.println(r);
            }
        }
    }
    public static void listarOcupadas(Hotel ho){
        for(Reserva r: ho.getHabitacinesOcupadas()){
                System.out.println(r);
        }
    }
}