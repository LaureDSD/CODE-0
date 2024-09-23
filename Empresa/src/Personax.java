public class Personax {
    private String persona ;
    private String dni;
    private String fechaNacimiento;

    public Personax(String persona, String dni, String fechaNacimiento) {
        this.persona = persona;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return " Nome='" + persona + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'';
    }


}
