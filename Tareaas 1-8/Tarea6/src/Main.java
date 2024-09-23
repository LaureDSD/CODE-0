public class Main {
    public static void main(String[] args) {
        EmpleadoPorHora eo1 = new EmpleadoPorHora("123","aaa",12,5);
        EmpleadoFijo ef1 = new EmpleadoFijo("321","bb",123,3);

        System.out.println("epo1");
        System.out.println(eo1.horasTrabajadas);
        System.out.println(eo1.calcularSalario());

        System.out.println("ef1");
        System.out.println(ef1.antiguedad);
        System.out.println(ef1.calcularBono(3));
        System.out.println(ef1.calcularSalario());
    }
}