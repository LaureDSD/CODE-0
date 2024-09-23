public abstract class Empleado {
    private String dni ;
    private String nome;
    private double salarioBase;

    private int añoNacimiento;

    public Empleado(String dni, String nome, double salarioBase,int añoNacimiento) {
        this.dni = dni;
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.añoNacimiento = añoNacimiento;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Empleado: " +
                "dni='" + dni + '\'' +
                ", nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                ", añoNacimiento=" + añoNacimiento +
                " ";
    }
}
