public class TestEmpresa {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa("empresa1");

        Empleado empleado2 = new Empleado("a","a123","21-23-12",2,"1",4);
        Empleado empleado3 = new Empleado("b","C123","21-23-12",2,"2",6);
        Empleado empleado4 = new Empleado("C","b123","21-23-12",2,"2",10);

        //AÑADIR  EMPLEADOS
        System.out.println();
        System.out.println("Añadir empleados:");
        empresa1.añadirEmpleado(empleado4);
        empresa1.añadirEmpleado(empleado2);
        empresa1.añadirEmpleado(empleado3);

        // BORRA EMPLEADO
        System.out.println();
        empresa1.borrarPorDni("C123");

        //MOSTRAR EMPRESA
        System.out.println();
        System.out.println("Mostrar empresa: ");
        empresa1.mostrarEmpresa();

        //numero empleados
        System.out.println();
        System.out.println("Numero empleados: "+empresa1.numEmpleados());

        //filtrar por salario
        System.out.println();
        empresa1.filtrarEmpleados(2);

        //salario max,min y medio
        System.out.println();
        empresa1.salarioMaxMinMedio();

        System.out.println();
        System.out.println("Empleado salario max: "+empresa1.empleadoSlarioMax());

        System.out.println();
        System.out.println("Empleado salario min: "+empresa1.empleadoSlarioMin());

        //aumento salario
        System.out.println();
        empresa1.aumnetoSalario(5);

        //aumento salario por departamento
        System.out.println();
        empresa1.aumnetoSalarioDepartamento(10,"1");

        //MUESTRA EMPLEADOS DE DEPARTAMENTO
        System.out.println();
        empresa1.empleadosDepartamento("1");

        //BUSCA EMPLEADO
        System.out.println();
        empresa1.buscarPorDni("b123");

        // BORRA EMPLEADO
        System.out.println();
        empresa1.borrarPorDni("b123");

        //BUSCA EMPLEADO
        System.out.println();
        empresa1.buscarPorDni("b123");
        empresa1.buscarPorDni("a123");
    }
}