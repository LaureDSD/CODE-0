public class EmpleadoPorHora extends Empleado {
    int horasTrabajadas;

    public EmpleadoPorHora(String dni, String nome, double salarioBase, int horasTrabajadas) {
        super(dni, nome, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSalario(){
        return horasTrabajadas*getSalarioBase();
    }
}
