import java.util.Objects;

public abstract class Publicacion_Objeto implements Comparable<Publicacion_Objeto> {
    protected String titulo;
    protected String autor;
    protected String isbn;

    public Publicacion_Objeto(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }


    @Override
    public int compareTo(Publicacion_Objeto p) {
        return this.titulo.equals(p.getTitulo()) ? this.autor.compareTo(p.getAutor()): this.titulo.compareTo(p.getTitulo());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publicacion_Objeto publicacion = (Publicacion_Objeto) o;
        return Objects.equals(isbn, publicacion.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
