public class Departamento {
    private String nome;
    private Empleado[] empleados;
    private Empleado encaragado;

    public Departamento(String nome, Empleado[] trabajadore, Empleado encaragdo) {
        this.nome = nome;
        this.empleados = trabajadore;
        this.encaragado = encaragdo;
    }
}
