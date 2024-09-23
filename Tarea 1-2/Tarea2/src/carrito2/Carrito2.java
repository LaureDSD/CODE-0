package carrito2;

import java.util.HashMap;

public class Carrito2 {

    private HashMap<Integer, Elemento2> carrito;


    public Carrito2() {
        this.carrito = new HashMap<Integer, Elemento2>();
    }

    public void agrega(int ref, Elemento2 e) {

        if (!this.carrito.containsKey(ref)) {
            this.carrito.put(ref,e);
        }else{
            int cantidad = this.carrito.get(ref).getCantidad()+e.getCantidad();
            this.carrito.put(ref,new Elemento2(e.getNombre(),e.precio,cantidad));
        }
    }

    public int numeroDeElementos(){
        return this.carrito.size();
    }

    public double importeTotal(){
        double importe=0;
            for (HashMap.Entry e: carrito.entrySet()) {
                Elemento2 s = (Elemento2) e.getValue();
                System.out.println();
                importe+=s.getCantidad()*s.getPrecio();
        }
        return importe;
    }

    @Override
    public String toString() {
        StringBuilder carritoMostrar = new StringBuilder();
        carritoMostrar.append("Contenide del carrito \n" +
               "====================================\n");
        for (HashMap.Entry e: carrito.entrySet()) {
            carritoMostrar.append(e.getValue()+"\n");
        }
        carritoMostrar.append("\n");
        return carritoMostrar.toString();
    }
}
