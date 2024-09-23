public class Libro {
    private String titulo;
    private String autor;
    private int anoPublicacion;

    private int ejemplares;

        Libro (String titulo, String autor, int anoPublicacion,int ejemplares){
        this.titulo= titulo;
        this.autor = autor;
        this.anoPublicacion= anoPublicacion;
        this.ejemplares = ejemplares;
        }

        Libro (String titulo, String autor, int anoPublicacion){
        this.titulo= titulo;
        this.autor = autor;
        this.anoPublicacion= anoPublicacion;
        this.ejemplares = 0;
        }

    Libro (){
        this.titulo= "";
        this.autor = "";
        this.anoPublicacion= 0;
        this.ejemplares = 0;
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

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

        void mostrar(){
                System.out.println(this.titulo +" "+ this.autor+" "+this.anoPublicacion);
        }

        boolean disponible(){
            if(this.ejemplares>0){
                return true;
            }else{
                return false;
            }

            // return this.ejemplares>0 ? true:false;

            // return this.ejemplares>0;

        }
}
