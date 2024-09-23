import java.util.Collections;

public class Persona implements Comparable<Persona> {
    String nombre;
    String apellido;
    int nacimiento;

    public Persona(String nombre, String apellido, int nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
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

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    /*
    public int compareTo(Persona g) {
        return (this.apellido).compareTo(g.getApellido());
    }
*/
    public int compareTo(Persona o) {
        return convertir(this.apellido).equals(convertir(o.getApellido())) ? convertir(this.nombre).compareTo(convertir(o.getNombre())) : convertir(this.apellido).compareTo(convertir(o.getApellido()));
    }

    private static String convertir(String linea) {
        String conTilde = "áàäéèëíìïóòöúùuñÁÀÄÉÈËÍÌÏÓÒÖÚÙÜÑçÇ";
        String sinTilde = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC";
        String cambiada = linea;
        for (int i=0; i<conTilde.length(); i++) {
            cambiada = cambiada.replace(conTilde.charAt(i), sinTilde.charAt(i));
        }
        return cambiada;
    }

    @Override
    public String toString() {
        return  nombre+","+apellido+","+nacimiento;
    }
}
