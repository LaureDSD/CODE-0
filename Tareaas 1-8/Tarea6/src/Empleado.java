public abstract class Empleado {
    private String dni ;
    private String nome;
    private double salarioBase;

    public Empleado(String dni, String nome, double salarioBase) {
        this.dni = dni;
        this.nome = nome;
        this.salarioBase = salarioBase;
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
}
