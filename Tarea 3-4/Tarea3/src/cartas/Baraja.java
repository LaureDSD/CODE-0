package cartas;
import enums.Palo;
import enums.Valor;

import java.util.ArrayList;
import java.util.Random;

public class Baraja {
    private ArrayList<Carta> cartas ;
    public Baraja() {
        this.cartas = new ArrayList<>();
    }
    public ArrayList<Carta> getCartas() {
        return cartas;
    }
    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
    public void mostrarCartas(){
        for(Carta c : this.cartas){
            System.out.println(c.toString());
        }
    }
    public void anadirBaraja(){
        //Generar cartas.Baraja
        for(Palo p:Palo.values()){
            for(Valor v:Valor.values()){
                cartas.add(new Carta(v,p));
            }
        }
    }
    public void barajarCartas(){
        Random a = new Random();
        for(int i=0 ; i< a.nextInt(0,50) ; i++) {
            int al = a.nextInt(0, cartas.size());
            Carta c = cartas.get(al);
            cartas.add(c);
            cartas.remove(al);
        }
    }
    @Override
    public String toString() {
        StringBuilder baraja = new StringBuilder();
        baraja.append("cartas.Baraja:\n");
        for(Carta c : this.cartas){
            baraja.append(c+"\n");
        }
        return baraja.toString();
    }
}
