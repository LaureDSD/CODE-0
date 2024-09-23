public class Persona {
    private String persona ;
    private String dni;
    private String fechaNacimiento;

    public Persona(String persona, String dni, String fechaNacimiento) {
        this.persona = persona;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return " Nome='" + persona + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'';
    }
}
