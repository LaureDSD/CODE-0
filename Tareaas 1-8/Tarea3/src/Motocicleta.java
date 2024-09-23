public class Motocicleta extends Vehiculo{
    int cilindrada;

    public Motocicleta(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    public void encender(){
        System.out.println("La motocicleta marca ["+this.marca+"] modelo ["+this.modelo+"] ha sido encendida.");
    };
    public void conducir(){
        System.out.println("La motocicleta marca ["+this.marca+"] modelo ["+this.modelo+"] está siendo conducida.");
    }
}
