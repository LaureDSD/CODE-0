public class EmpleadoPorComision extends Empleado {

    private int ventas;

    public EmpleadoPorComision(String dni, String nome, double salarioBase, int añoNacimiento, int ventas) {
        super(dni, nome, salarioBase, añoNacimiento);
        this.ventas = ventas;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase()*ventas;
    }

    @Override
    public String toString() {
        return super.toString()+"ventas= "+this.ventas+" ";
    }
}
