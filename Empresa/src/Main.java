public class Main {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa("empresa1");

        Empleado empleado2 = new Empleado("a","a123","21-23-12",2,"1",4);
        Empleado empleado3 = new Empleado("b","b123","21-23-12",2,"2",6);

        empresa1.añadirEmpleado(empleado2);
        empresa1.añadirEmpleado(empleado3);
        empresa1.mostrarEmpresa();
        System.out.println("Numero empleados: "+empresa1.numEmpleados());
        empresa1.filtrarEmpleados(2);
        empresa1.salarioMaxMinMedio();
        System.out.println("Empleado salario max: "+empresa1.empleadoSlarioMax());
        System.out.println("Empleado salario min: "+empresa1.empleadoSlarioMin());
        empresa1.aumnetoSalario(5);
        empresa1.aumnetoSalarioDepartamento(10,"1");
        empresa1.empleadosDepartamento("1");
    }
}