public class Triangulo {

    //atributos
    private double base;
    private double altura;

    //constructores


    public Triangulo() {
        this.base = 0;
        this.altura = 0;
    }

    public Triangulo(double base, double altura) {
        if(base<=0 || altura<=0){
            this.base = 0;
            this.altura = 0;
        }else {
            this.base = base;
            this.altura = altura;
        }
    }

    //Getters and setters


    public double getBase() {
            return base;
    }

    public void setBase(double base) {
        if(base<=0){
            this.base = 0;
        }else {
            this.base = base;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
            if(altura<=0){
                this.altura = 0;
            }else {
                this.altura = altura;
            }
    }

    //metodos

    public double area(){
        return (this.altura*this.base)/2;
    }

    public void duplicar(){
        this.base=this.base*2;
        this.altura=this.altura*2;
    }

    public boolean multiplicar(double multiplicador){
        if(multiplicador<=0){
            return false;
        }else {
            this.base = this.base * multiplicador;
            this.altura = this.altura * multiplicador;
            return true;
        }
    }

    public void sumar (double saltura, double sbase){

        if(this.base+sbase<0){
            this.base=0;
        }else{
            this.base=this.base+sbase;
        }
        if(this.altura+saltura<0){
            this.altura=0;
        }else{
            this.altura=this.altura+saltura;
        }
    }

    public void sumar(Triangulo tri){
        this.base=this.base+ tri.base;
        this.altura=this.altura+tri.altura;
    }

    public String toString(){
        return "BaseTriangulo: "+this.base +"    AnchoTriangulo: " +this.altura;
    }

}
