public class Circulo extends FiguraGeometrica {
    double radio;
    String nombre = "Circulo";

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double area(){
        return Math.sqrt(Math.PI*this.radio);
    }

    public void dibujar(){
        System.out.println("Dibujando un ["+this.nombre+"] de color ["+getColor()+"] con un área de ["+area()+"] y [ radio= "+radio+"] ");
    }
}
