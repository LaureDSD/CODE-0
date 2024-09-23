package coleccionMusical;

public class Disco implements Comparable<Disco> {
    private int codigo;
    private String titulo;
    private String autor;
    private String anoPublicacion;
    private Genero genero;
    public Disco(int codigo, String titulo, String autor, String anoPublicacion, Genero genero) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.genero = genero;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAnoPublicacion() {
        return anoPublicacion;
    }
    public void setAnoPublicacion(String anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int compareTo(Disco g) {
        return this.getAutor().compareTo(g.getAutor());
    }
}
