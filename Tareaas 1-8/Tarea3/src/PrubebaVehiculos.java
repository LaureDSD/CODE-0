public class PrubebaVehiculos {
    public static void main(String[] args) {
        Automovil a1 = new Automovil("a1","a12",3);
        Motocicleta m1 = new Motocicleta("m2","m23",0);
        a1.encender();
        a1.conducir();
        m1.encender();
        m1.conducir();
    }
}