public class Persona implements Comparable<Persona> {

    String nombre;
    String apellido;
    int edad;

    public Persona(String nombre, String apellido, int edad) throws EdadNoValidaException {

            this.nombre = nombre;
            this.apellido = apellido;
        if(edad>0) {
            this.edad = edad;
        }else{
            throw new EdadNoValidaException("Edad inferior a 0");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public int compareTo(Persona otraPersona) {
        int lastNameComparison = this.apellido.compareTo(otraPersona.getApellido());
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }
        int firstNameComparison = this.nombre.compareTo(otraPersona.getNombre());
        if (firstNameComparison != 0) {
            return firstNameComparison;
        }
        return Integer.compare(otraPersona.getEdad(), this.edad);
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre='" + nombre + '\'' + ", apellido='" + apellido + '\'' + ", edad=" + edad + '}';
    }
}
