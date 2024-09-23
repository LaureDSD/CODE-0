package carrito1;

import java.util.ArrayList;
import java.util.HashMap;

public class Carrito {

    private ArrayList<Elemento> carrito ;


    public Carrito() {
        this.carrito = new ArrayList<>();
    }

    public void agrega(Elemento e) {
        this.carrito.add(e);
    }

    public int numeroDeElementos(){
        return this.carrito.size();
    }

    public double importeTotal(){
        double importe=0;
        for(Elemento e : this.carrito){
            importe += e.getPrecio() * Double.valueOf(e.getCantidad());
        }
        return importe;
    }

    @Override
    public String toString() {
        StringBuilder carritoMostrar = new StringBuilder();
        carritoMostrar.append("Contenide del carrito \n" +
                "====================================\n");
        for(Elemento e : this.carrito){
            carritoMostrar.append(e+"\n");
        }
        carritoMostrar.append("\n");
        return carritoMostrar.toString();
    }
}
