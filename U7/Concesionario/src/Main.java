public class Main {
    public static void main(String[] args) {
        try {
            Concesionario concesionario = new Concesionario("Vehiculos San Mamede");
            Coche c1 = new Coche("Tesla", "Model 3", 52000, 5, Combustible.ELECTRICO);
            Coche c2 = new Coche("Audi", "A4", 38000, 4, Combustible.GASOLINA);
            Furgoneta f1 = new Furgoneta("Ford", "Transit", 26000, 6000);
            Furgoneta f2 = new Furgoneta("Mercedes", "Vito", 40500, 6500);

            concesionario.addVehiculo(c1);
            concesionario.addVehiculo(c2);
            concesionario.addVehiculo(f1);
            concesionario.addVehiculo(f2);

            concesionario.mostrarVehiculos();
            System.out.println("--------------");
            concesionario.ordenarVehiculos();
            concesionario.mostrarVehiculos();
            System.out.println("--------------");

            if (concesionario.eliminarVehiculo("FORD", "transit")) {
                System.out.println("Vehiculo eliminado");
            } else {
                System.out.println("Vehiculo no eliminado");
            }

            concesionario.mostrarCoches(Combustible.ELECTRICO, 5, 100000);

            concesionario.matricular("1234LXR", c1);
            concesionario.mostrarMatriculadosMarca("Tesla");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
