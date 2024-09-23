public class Circulo {

    //atributos
    private double radio;

    //constructores

    public Circulo() {
    }

    public Circulo(double radio) {
        if(radio<=0){
            this.radio = 0;
        }else {
            this.radio = radio;
        }
    }

    //setters and getters

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if(radio<=0){
            this.radio = 0;
        }else {
            this.radio = radio;
        }
    }

    //metodos

    public double area(){
        return (this.radio*this.radio)*3.14;
    }

    public double  longitud(){
        return 2*3.14*this.radio;
    }

    public void duplicar(){
        this.radio=this.radio*2;
    }

    public boolean multiplicar(double multiplicador){
        if(multiplicador<=0){
            return false;
        }else {
            this.radio = this.radio * multiplicador;
            return true;
        }
    }
    public void sumar ( double sradio){
        if(this.radio+sradio<0){
            this.radio=0;
        }else{
            this.radio=this.radio+sradio;
        }
    }
    public void sumar(Circulo rad){
        this.radio=this.radio+ rad.radio;
    }

    public String toString(){
        return "RadioCirculo: "+this.radio;
    }

}
