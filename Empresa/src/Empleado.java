public class Empleado extends Persona {
    private int numEmpleado;
    private double salario;
    private String departamento;

    public Empleado(String persona, String dni, String fechaNacimiento, int numEmpleado,String departamento ,double salario) {
        super(persona, dni, fechaNacimiento);
        this.departamento = departamento;
        this.numEmpleado = numEmpleado;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return  super.toString() +
                " numEmpleado=" + numEmpleado +
                ", salario=" + salario +
                ", departamento=" + departamento +
                " }";
    }
    //G&S


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

}
