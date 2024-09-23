public class Rectangulo {

    //FIJO

    private static final int min = 0;

    private static final int max = 100;


    //OBJETO
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    //CONSTRUCTOR
    public Rectangulo(int x1, int y1, int x2, int y2) {
        if((x1<x2&&y1<y2)&&(x1<=100&&x1>=0)&&(y1<=100&&y1>=0)&&(x2<=100&&x1>=0)&&(y2<=100&&y2>=0)){
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
       }else{System.out.println("Error ,no se gurada valor");
       }
    }


    //GETTERS AND SETTERS
    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        if((this.x1<this.x2)&&(x1<=100 && x1>=0)) {
            this.x1 = x1;
        }else{
            System.out.println("Error");
        }
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        if((this.x1>this.x2)&&(x2<=100 && x2>=0) ) {
            this.x2 = x2;
        }else{
            System.out.println("error");
        }
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        if((this.y1>this.y2)&&(y1<=100 && y1>=0)){
        this.y1 = y1;
        }else{
            System.out.println("error");
        }
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        if((this.y1<this.y2)&&(y2<=100 && y2>=0)) {
            this.y2 = y2;
        }else{
            System.out.println("error");
        }
    }
    public void setX1Y1(int x1, int y1){
        this.x1 = x1;
        this.y1 = y1;
    }
    public void setX2Y2(int x2, int y2){
        this.x2 = x2;
        this.y2 = y2;
    }
    public void setAll(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }



    //METODOS
    public int getPerimetro() {
        return Math.abs((x1-x2)*2 + (y1-y2)*2);
    }
    public int getArea(){
        return (x1 - x2 )*(y1 - y2);
    }
    public void imprime(){
        System.out.println("[ x1: "+this.x1 +"| y1: "+ this.y1 +"] [ x2: "+ this.x2 +"| y2: "+ this.y2+"]");
    }
    public static Rectangulo creaRectanguloAleatorio(){

                int x1 =(int) (Math.random() * 99);
                int x2;
                do{
                    x2 =(int) (Math.random() * 100);
                }while(x2<x1);

                int y1 =(int) (Math.random() * 99);
                int y2;
                 do{
                    y2 =(int) (Math.random() * 100);
                }while(y2<y1)
        return new Rectangulo(x1,y1,x2,y2);
    }

}
