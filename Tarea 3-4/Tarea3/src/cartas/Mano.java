package cartas;
import enums.Valor;
import java.util.ArrayList;
public class Mano {
    //VARIABLES
    private ArrayList<Carta> cartas;
    //CONSTRUCTOR
    public Mano() {
        this.cartas = new ArrayList<>();
    }
    //G&S
    public ArrayList<Carta> getCartas() {
        return cartas;
    }
    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
    //METODOS
    public void añadirCartaMano(Carta c){
            this.cartas.add(c);
    }
    public void quitarCartaMano(Carta c){
        this.cartas.remove(c);
    }
}