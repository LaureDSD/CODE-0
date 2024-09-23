

// Clase Libro que implementa la interfaz Comparable para comparar por título
class Libro_SubObjeto extends Publicacion_Objeto implements Leible_Interfaz{

    int ejemplares = 0;
    public Libro_SubObjeto(String titulo, String autor, String isbn) {
        super(titulo, autor, isbn);
        ejemplares=+ejemplares+1;
    }

/*
    public int compareTo(SubObjetoCompareTo c) {
        return this.valorStringSub.equals(c.getValorStringSub()) ? Integer.compare(this.numSub, c.getNumSub()): this.valorStringSub.compareTo(c.getValorStringSub());
    }
 */

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public void leer(){
        System.out.println("leeible");
    };

}
