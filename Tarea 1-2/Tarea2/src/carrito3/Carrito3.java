package carrito3;

import carrito2.Elemento2;

import java.util.HashMap;

public class Carrito3 {

    //Test
    private HashMap<Producto3,Double> carrito;
    private double importe=0;

    public Carrito3() {
        this.carrito = new HashMap<>();
    }

    public void agrega(String producto, Double precio,Double cantidad) {
        Producto3 productoComparar= new Producto3(producto,precio);
        if (this.carrito.containsKey(productoComparar)) {
            for (HashMap.Entry c: carrito.entrySet()) {
                if (c.getKey().equals(productoComparar)) {
                    c.setValue((double) c.getValue()+cantidad);
                    break;
                }
            }
        }else{
            this.carrito.put(productoComparar,cantidad);
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
