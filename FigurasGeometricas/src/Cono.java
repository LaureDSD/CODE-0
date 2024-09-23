public class Cono {
    //Atributos
    private Circulo base;
    private double altura;

    //Constructores

    public Cono() {
        this.altura=0;
    }

    public Cono(double radio, double altura) {
        if(radio<0||altura<0) {
            this.base = new Circulo(0);
            this.altura = 0;
        }else {
            this.base = new Circulo(radio);
            this.altura = altura;
        }
    }

    public Cono(Circulo base, double altura) {
        this.base = base;
        if(altura<0){
            this.altura=0;
        }else {
            this.altura = altura;
        }
    }
    //Getters and setters

    public Circulo getBase() {
        return base;
    }

    public void setBase(Circulo base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura<0){
            this.altura=0;
        }else {
            this.altura = altura;
        }
    }


    //Metodos

    public double area(){
        //PI * radio * ( radio + sqrt( radio^2 + altura^2 ) )
        double num =Math.pow(this.base.getRadio(),2);
        double num2 =Math.pow(this.altura,2);
        return Math.PI * this.base.getRadio() * (this.base.getRadio() + Math.sqrt(num + num2));
    }

    public double areaBase(){
        return this.base.area();
    }

    public double volumen(){
        int rad = (int) this.base.getRadio();
        return (Math.PI*(Math.pow(this.base.getRadio(),2))*this.altura)/3;
    }

    public String toString(){
        return "Altura: " +this.altura+ "   " +this.base;
    }

}
