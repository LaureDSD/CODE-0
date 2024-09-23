public class Rectangulo {
    //Atributos
    private double largo;
    private double ancho;
    // constructores
    public Rectangulo() {
        this.largo = 0;
        this.ancho = 0;
    }
    public Rectangulo(double largo, double ancho) {
        if (largo<=0 || ancho<=0){
            this.largo = 0;
            this.ancho = 0;
        }else {
            this.largo = largo;
            this.ancho = ancho;
        }
    }
    //Getter and setters
    public double getLargo() {
        return largo;
    }
    public void setLargo(double largo) {
        if(largo<=0) {
            this.largo = 0;
        }else {
            this.largo = largo;
        }
    }
    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        if(ancho<=0){
            this.ancho = 0;
        }else {
            this.ancho = ancho;
        }
    }
    //Metodos
    public boolean esCuadrado(){
        return this.ancho != this.largo;
    }
    public double area(){
        return this.ancho*this.largo;
    }
    public double perimetro(){
        return (this.ancho*2)+(this.largo*2);
    }
    public void duplicar(){
        this.ancho=this.ancho*2;
        this.largo=this.largo*2;
    }
    public boolean multiplicar(double multiplicador){
        if(multiplicador<=0){
            return false;
        }else{
            this.ancho=this.ancho*multiplicador;
            this.largo=this.largo*multiplicador;
            return true;
        }
    }

    public void sumar (double slargo, double sancho){

        if(this.ancho+sancho<0){
            this.ancho=0;
        }else{
            this.ancho=this.ancho+sancho;
        }
        if(this.largo+slargo<0){
            this.largo=0;
        }else{
            this.largo=this.largo+slargo;
        }
    }

    public void sumar(Rectangulo rec){
        this.ancho=this.ancho+ rec.ancho;
        this.largo=this.largo+rec.largo;
    }

    public String toString(){
        return "AnchoRectangulo: "+this.ancho +"   LargoRectangulo: "+ this.largo;
    }
}
