public class Pruebas {
    public static void main(String[] args) {
        try {
            Concesionario con = new Concesionario("Prueba");

            Vehiculo v1test = new Coche("test1", "Model test1", 52000, 5, Combustible.ELECTRICO);
            Vehiculo v3test = new Coche("test1", "Model test3", 52001, 5, Combustible.GASOLINA);
            Vehiculo v2test = new Furgoneta("test2", "Model test2", 52000, 5);
            Vehiculo v4test = new Furgoneta("test4", "Model test4", 52001, 5);

            System.out.println("agrgar");
            System.out.println(con.addVehiculo(v1test));
            System.out.println(con.addVehiculo(v2test));
            System.out.println(con.addVehiculo(v3test));
            System.out.println(con.addVehiculo(v4test));
            System.out.println();
            System.out.println("Mostra");
            con.mostrarVehiculos();
            System.out.println(con.eliminarVehiculo("test2", "Model test2"));
            System.out.println("Mostra");
            con.mostrarVehiculos();
            con.ordenarVehiculos();
            System.out.println("Mostra");
            con.mostrarVehiculos();
            System.out.println("Mostrar vehiculos");
            con.mostrarCoches(Combustible.ELECTRICO,5, 52000);
            System.out.println("Cargar");
            con.cargarVehiculos("src/vehiculos.txt");

            System.out.println("Mostra");
            con.mostrarCoches2(Combustible.ELECTRICO,5, 52000);




        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
