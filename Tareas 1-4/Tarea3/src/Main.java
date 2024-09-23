
public class Main {
    public static void main(String[] args) {

        int area, perimetro;

        Rectangulo r1 =new Rectangulo(1,2,2,3);
        //* esquina1 rectangulo1
        //* r1.x1 = 0;
        //* r1.y1 = 0;
        //* esquina2 rectangulo1
        //* r1.x2 = 5;
        //* r1.y2 = 5;
        r1.imprime();

        Rectangulo r2 =new Rectangulo(1,1,6,6);
        //* esquina1 rectangulo1
        //* r2.x1 = 6;
        //* r2.y1 = 6;
        //* esquina2 rectangulo1
        //* r2.x2 = 10;
        //* r2.y2 = 10;
        r2.imprime();

        Rectangulo r3 =Rectangulo.creaRectanguloAleatorio();
        r3.imprime();

        System.out.println("coords triangulo 1");
        System.out.println("("+ r1.getX1() +","+ r1.getY1()+ ")"+"("+ r1.getX2() +","+ r1.getY2()+ ")"  );
        perimetro = (r1.getX1() - r1.getX2())*2 + (r1.getY1() - r1.getY2())*2;

        System.out.println("perimetro" + perimetro);
        area = (r1.getX1() - r1.getX2())*(r1.getY1() - r1.getY2());

        System.out.println("area" + area);

        System.out.println("coords triengulo 2");
        System.out.println("("+ r2.getX1() +","+ r2.getY1()+ ")"+"("+ r2.getX2() +","+ r2.getY2()+ ")"  );
        perimetro = (r2.getX1() - r2.getX2())*2 + (r2.getY1() - r2.getY2())*2;

        System.out.println("perimetro" + perimetro);
        area = (r2.getX1() - r2.getX2())*(r2.getY1() - r2.getY2());

        System.out.println("area" + area);



        System.out.println("------------------------------------------new-------------------------------");

        r1.imprime();
        r2.imprime();
        System.out.println("Despues");
        r1.setAll(1,1,2,2);
        r2.setX1Y1(1,1);
        r2.setX2Y2(4,4);
        r1.imprime();
        r2.imprime();
        System.out.println("Perimetro: " + r1.getPerimetro());
        System.out.println("Perimetro: " +r2.getPerimetro());
        System.out.println("Area: " + r1.getArea());
        System.out.println("Area: " +r2.getArea());


    }

}