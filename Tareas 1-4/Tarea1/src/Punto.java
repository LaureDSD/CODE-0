public class Punto {

    //OBJETO
    private int x;
    private int y;


    //CONSTRUCTOR
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //GETETRS AND STETTERS

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    //METODO
    public void imprime() {
        System.out.println("["+this.x + "|" + this.y+"]");
    }

    public void desplaza(int dx, int dy){
        this.x=this.x+dx;
        this.y=this.y+dy;
    }

    public int distancia(Punto p){

        int ladoy = this.y-p.y;
        int ladox = this.x-p.x;
        int diag2=(ladox)*(ladox) + (ladoy)*(ladoy);
        return (int) Math.sqrt(diag2);
    }

    public static Punto creaPuntoAleatorio(){
        int x=(int) (Math.random()*200-100);
        int y=(int) (Math.random()*200-100);
        return new Punto(x,y);
    }
}
