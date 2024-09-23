public class Main {
    public static void main(String[] args) {
        EmpleadoPorHora eo1 = new EmpleadoPorHora("123","eo1",12,5,2001);
        EmpleadoPorHora eo2 = new EmpleadoPorHora("124","eo2",12,5,2001);
        EmpleadoFijo ef1 = new EmpleadoFijo("ab12","ef1",120,20,1998);
        EmpleadoFijo ef2 = new EmpleadoFijo("ab13","ef2",120,20,1998);
        EmpleadoPorComision ec1 = new EmpleadoPorComision("1234","rr",04,1900,20);
        EmpleadoPorComision ec2 = new EmpleadoPorComision("4321","rfs",03,1900,10);

        System.out.println("epo1");
        System.out.println("Horas trabajadas= "+eo1.horasTrabajadas);
        System.out.println("Slario= "+eo1.calcularSalario());

        System.out.println("ef1");
        System.out.println("Antiguedad= "+ef1.antiguedad);
        System.out.println("Bono= "+ef1.calcularBono(3));
        System.out.println("Salario= "+ef1.calcularSalario());

        System.out.println("------------------ empresa --------------------");

        Empresa e1 = new Empresa();
        e1.añadirEmpleados(eo1);
        e1.añadirEmpleados(eo2);
        e1.añadirEmpleados(ef1);
        e1.añadirEmpleados(ef2);
        e1.añadirEmpleados(ec1);
        e1.añadirEmpleados(ec2);


        System.out.println("Mostrar uno y borrar");
        e1.mostrarEmpleado("124");
        e1.borrarPorDNI("124");

        System.out.println("Mostrar fijos");
        e1.mostrarEmpleadosFijos();

        System.out.println("Mostrar empleado hora");
        e1.mostrarEmpleadosPorHora();

        System.out.println("Mostrar empleados comision");
        e1.mostrarEmpleadosPorComision();

        System.out.println("Mostar todos");
        e1.mostrarEmpleados();

        System.out.println("Salarios totales: "+e1.importeSalariosTotal());

        System.out.println("Horas totoales por hora: "+e1.horasTotales());

        System.out.println("ventas totoales comision: "+e1.ventasTotales());

        e1.pagarSalarios();

        System.out.println("Mostar todos");
        e1.mostrarEmpleados();

    }
}