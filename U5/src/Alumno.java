import java.util.ArrayList;

public class Alumno implements Comparable<Alumno> {
    String nombre;
    String apellido;
    ArrayList<Integer> notas;
    int media;

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notas = new ArrayList<>();
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

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public void añadirNota(int nota){
        notas.add(nota);
        int total = 0;
        for(Integer n:notas) {
            total += n;
        }
        media = total / notas.size();
    }

    @Override
    public int compareTo(Alumno o) {
        return Integer.compare(o.media,media);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", notas=" + notas +
                " media="+ media +"}";
    }
}
