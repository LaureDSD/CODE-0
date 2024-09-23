public class EmpleadoPorHora extends Empleado {
    int horasTrabajadas;

    public EmpleadoPorHora(String dni, String nome, double salarioBase, int horasTrabajadas,int añoNacimiento) {
        super(dni, nome, salarioBase,añoNacimiento);
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

    @Override
    public String toString() {
        return super.toString() +"horasTrabajadas= " + horasTrabajadas +" ";
    }
}
