public class EmpleadoFijo extends Empleado{

    int antiguedad;

    public EmpleadoFijo(String dni, String nome, double salarioBase, int antiguedad, int añoNacimiento) {
        super(dni, nome, salarioBase,añoNacimiento);
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double calcularSalario(){
        return getSalarioBase()*8*30;
    }

    double calcularBono (double porcentaje){
        return getSalarioBase()*porcentaje*antiguedad/100*8*30;
    };

    @Override
    public String toString() {
        return super.toString()+"antiguedad de anos= "+antiguedad+" ";
    }
}
