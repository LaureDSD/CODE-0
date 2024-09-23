public class Main {
    public static void main(String[] args) {
        Circulo cir1 = new Circulo("Rojo",2);
        Rectangulo rec1 = new Rectangulo("Azul",2,3);
        Triangulo tri1 = new Triangulo("Negro",2,5);

        cir1.dibujar();
        System.out.println(cir1.area());
        rec1.dibujar();
        System.out.println(rec1.area());
        tri1.dibujar();
        System.out.println(tri1.area());
    }
}