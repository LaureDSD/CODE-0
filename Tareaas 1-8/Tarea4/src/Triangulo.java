public class Triangulo extends FiguraGeometrica{
    double base;
    double altura;
    String nombre ="Triangulo";

    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area(){
        return this.base*this.altura/2;
    }

    public void dibujar(){
        System.out.println("Dibujando un ["+this.nombre+"] de color ["+getColor()+"] con un área de ["+area()+"] y [ medidas= "+base+" x "+altura+"] ");
    }
}
