package personas;

public class Persona implements Comparable<Persona>{

    public String nome;
    public int edad;

    public Persona(String nome, int edad) {
        this.nome = nome;
        this.edad = edad;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Personas.Persona{" +
                "nome='" + nome + '\'' +
                ", edad=" + edad +
                '}';
    }


    public int compareTo(Persona p){
        return Integer.compare(this.edad,p.edad);
        //return (this.nome).compareTo(p.getNome());
    }
}
