public class Main {
    public static void main(String[] args) {

        //Rectangulo
        System.out.println("------------Rectangulo-------------");
        Rectangulo rectangulo1 = new Rectangulo(2, 3);
        System.out.println(rectangulo1.esCuadrado());
        System.out.println(rectangulo1.area());
        rectangulo1.duplicar();
        System.out.println(rectangulo1.multiplicar(2));
        rectangulo1.sumar(2,2);
        rectangulo1.sumar(rectangulo1);
        System.out.println(rectangulo1);

        //Triangulo
        System.out.println("-------------Triangulo--------------");
        Triangulo triangulo1 = new Triangulo(2, 3);
        System.out.println(triangulo1.area());
        triangulo1.duplicar();
        System.out.println(triangulo1.multiplicar(2));
        triangulo1.sumar(2,2);
        triangulo1.sumar(triangulo1);
        System.out.println(triangulo1);

        //Circulo
        System.out.println("---------------Circulo---------------");
        Circulo circulo1 = new Circulo(2);
        System.out.println(circulo1.area());
        System.out.println(circulo1.longitud());
        circulo1.duplicar();
        System.out.println(circulo1.multiplicar(2));
        circulo1.sumar(2);
        circulo1.sumar(circulo1);
        System.out.println(circulo1);

        //Piramide
        System.out.println("--------------Piramide----------------");
        Piramide piramide1 = new Piramide(rectangulo1, 3);
        System.out.println("perimetro: "+piramide1.perimetroBase());
        System.out.println("areapiramide: "+piramide1.area());
        System.out.println("volumnepiramide: "+piramide1.volumen());
        System.out.println("Es cuadrangular: "+piramide1.esCuadrangular());
        System.out.println(piramide1);

        Piramide piramide2 = new Piramide(4, 4, 3);
        System.out.println("perimetro: "+piramide2.perimetroBase());
        System.out.println("areapiramide: "+piramide2.area());
        System.out.println("volumnepiramide: "+piramide2.volumen());
        System.out.println("Es cuadrangular: "+piramide2.esCuadrangular());
        System.out.println(piramide2);


        //Tetraedro
        System.out.println("-------------Tetraedro----------------");
        Tetraedro tetraedro1= new Tetraedro(triangulo1,3);
        Tetraedro tetraedro2= new Tetraedro(2,3,3);
        System.out.println(tetraedro1.area());
        System.out.println(tetraedro1.areaBase());
        System.out.println(tetraedro1.volumen());
        System.out.println(tetraedro1);

        System.out.println(tetraedro2.area());
        System.out.println(tetraedro2.areaBase());
        System.out.println(tetraedro2.volumen());
        System.out.println(tetraedro2);

        //Cono
        System.out.println("---------------Cono-------------------");
        Cono cono1= new Cono(circulo1,3);
        Cono cono2= new Cono(2,3);
        System.out.println(cono1.area());
        System.out.println(cono1.areaBase());
        System.out.println(cono1.volumen());
        System.out.println(cono1);

        System.out.println(cono2.area());
        System.out.println(cono2.areaBase());
        System.out.println(cono2.volumen());
        System.out.println(cono2);

    }
}