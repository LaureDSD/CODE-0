public class Piramide {
    //Atributos

    private Rectangulo base;
    private double altura;

    //Constructores

    public Piramide() {
        this.base = new Rectangulo(0,0);
        this.altura = 0;
    }
    public Piramide(double largo ,double ancho, double altura) {


        if(altura<0||ancho<0||largo<0){
            this.base = new Rectangulo(0,0);
            this.altura=0;
        }else{
            this.base = new Rectangulo(largo,ancho);
            this.altura = altura;}
        }
    public Piramide(Rectangulo base, double altura) {
        this.base = base;
        if(altura<0) {
            this.altura = 0;
        }else{
            this.altura = altura;
        }
    }
    //Getters and setters

    public Rectangulo getBase() {
        return base;
    }

    public void setBase(Rectangulo base) {
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura<0){
            this.altura=0;
        }else{
            this.altura = altura;}
    }

    //Metodos
    public double perimetroBase(){
        return 2*(this.base.getAncho()+this.base.getLargo());
    }

    public double area(){
        double num1 = Math.pow((this.base.getLargo()/4),2);
        double areat1 = this.base.getLargo()*Math.sqrt(num1+Math.pow(this.altura,2));
        double num2 = Math.pow((this.base.getAncho()/4),2);
        double areat2 = this.base.getAncho()*Math.sqrt(num2+Math.pow(this.altura,2));
        return this.base.area() + areat1 + areat2;
    }

    public double volumen(){
        return this.base.area()*this.altura/3;
    }

    public boolean esCuadrangular(){
        return this.base.getAncho() == this.base.getLargo();
    }

    public String toString(){
        return "Altura: " +this.altura+"    "+this.base;
    }
}
