public class Automovil extends Vehiculo{
    int puertas;

    public Automovil(String marca, String modelo ,int puertas) {
        super(marca,modelo);
        this.puertas = puertas;
    }

    public void encender(){
        System.out.println("El automóvil marca ["+this.marca+"] modelo ["+this.modelo+"] ha sido encendido.");
    }
    public void conducir(){
        System.out.println("El automóvil marca ["+this.marca+"] modelo ["+this.modelo+"] está siendo conducido");
    }
}
