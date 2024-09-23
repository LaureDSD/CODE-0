public class Tetraedro {
    //Atributos
    private Triangulo base;
    private double altura;

    //Constructores

    public Tetraedro() {
        this.base = new Triangulo(0,0);
        this.altura = 0;
    }

    public Tetraedro(double base,double alturabase, double altura) {
        if(alturabase<0||base<0||altura<0){
            this.base = new Triangulo(0,0);
            this.altura = 0;
        }else {
            this.base = new Triangulo(base, altura);
            this.altura = altura;
        }
    }

    public Tetraedro(Triangulo base, double altura) {
        this.base = base;
        if(altura<0){
            this.altura=0;
        }else {
            this.altura = altura;
        }
    }

    //Getters and setters

    public Triangulo getBase() {
        return base;
    }

    public void setBase(Triangulo base) {
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
        double num=Math.sqrt(3) * (3*this.altura/Math.sqrt(6));
        return Math.pow(num,2);
    }

    public double areaBase(){
        return this.base.area();
    }

    public double volumen(){
         double num = Math.sqrt(12)/12;
         double num2=(this.altura*3)/(Math.sqrt(6));
         return Math.pow((num*num2),3);

    }

    public String toString(){
        return "Altura: " +this.altura+ "   " +this.base;
    }
}
