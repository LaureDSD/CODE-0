

public class Main {
    public static void main(String[] args) {

        Punto p1 = new Punto(5,0);
        //p1.x = 5;
        //p1.y = 0;
        Punto p2 = new Punto(10,10);
        //p2.x = 10;
        //p2.y = 10;
        Punto p3 = new Punto(3,7);
        //p3.x = -3;
        //p3.y = 7;
        Punto p4 = Punto.creaPuntoAleatorio();


//---------------------------------------------
        p1.imprime();
        p2.imprime();
        p3.imprime();
        System.out.println("--------");



        p1.setXY(3,3);
        p2.setXY(2,2);
        p3.setXY(1,1);
        p1.imprime();
        p2.imprime();
        p3.imprime();
        System.out.println("--------");



        p1.desplaza(1,1);
        p2.desplaza(4,4);
        p3.desplaza(7,7);
        p1.imprime();
        p2.imprime();
        p3.imprime();
        System.out.println("--------");

        System.out.println(p1.distancia(p2));
        System.out.println(p2.distancia(p3));

        System.out.println("--------");

        p4.imprime();
    }
}