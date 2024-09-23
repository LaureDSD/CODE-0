public class Persona {

    //FIJO
    private static final int mayoriaEdad=18;

    //OBJETO
    private String nome;
    private String apellidos;
    private final String dni ;
    private int edad;

    //CONSTRUCTOR
    public Persona(String nome, String apellidos, String dni, int edad) {
        this.nome = nome;
        this.apellidos = apellidos;
        this.edad = edad;
        if (validarDNI(dni)){
            this.dni = dni;
        }else{
            this.dni= null;
        }
    }

    //GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getDni() {
        return dni;
    }
    //public void setDni(String dni) {
    //    this.dni = dni;
    //}
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //METODOS
    public void imprime(){
        System.out.println("-dni: "+ this.dni +" -nome: "+ this.nome +" -apellidos: "+ this.apellidos +" -edad: "+ this.edad);
    }
    public boolean esMayorEdad(){
        return edad >= mayoriaEdad;
    }
    public boolean esJubilado(){
        return edad >= 65;
    }
    public int diferenciaEdad(Persona p){
        if (this.edad>p.edad){
            return this.edad - p.edad;
        }else{
            return p.edad - this.edad;
        }
    }
    static boolean validarDNI(String dni){
        return dni.matches("\\d{8,}-[a-zA-Z]");
    }


}
