package coleccionMusical;

import java.util.ArrayList;
public class ColeccionDiscos{
    private ArrayList<Disco> listaDiscos;
    private int numeroDiscos = 0;
    public ColeccionDiscos() {
        this.listaDiscos = new ArrayList<>();
    }
/*
    public ColeccionMusical.ColeccionDiscos(int codigo, String titulo,String autor,String ano, ColeccionMusical.Genero genero) {
        this.listaDiscos = new ArrayList<>();
        this.listaDiscos.add(new ColeccionMusical.Disco(codigo,titulo,autor,ano,genero));
    }
*/
    public int getNumeroDiscos() {
        return numeroDiscos;
    }
    public ArrayList<Disco> getListaDiscos() {
        return listaDiscos;
    }
    public void setListaDiscos(ArrayList<Disco> listaDiscos) {
        this.listaDiscos = listaDiscos;
    }
    public void listarDiscos(){
        System.out.println("Discos[");
        for (Disco listaDiscos : this.listaDiscos) {
                System.out.println("[Codigo:"+listaDiscos.getCodigo()+"] [Titulo:"+listaDiscos.getTitulo()+"] [Autor:"+listaDiscos.getAutor()+"] [Ano:"+listaDiscos.getAnoPublicacion()+"] [ColeccionMusical.Genero:"+listaDiscos.getGenero()+"]");
        }
        System.out.println("]");
    }
    public void añadirDisco(int codigo,String titulo, String autor, String ano, Genero genero){
        listaDiscos.add(new Disco(codigo,titulo,autor,ano,genero));
        numeroDiscos++;
    }
    public void borrarDiscosPosicion(int posicion){
        listaDiscos.remove(posicion);
    }
    public boolean borrarDiscosCodigo(int codigo){
       return listaDiscos.removeIf(disco -> disco.getCodigo()==codigo);
    }
    public boolean modificarDiscos(int codigo,String titulo,String autor,String ano, Genero genero){
        for(int i = 0 ; i<listaDiscos.size() ; i++) {
            if (listaDiscos.get(i).getCodigo() == codigo) {
                listaDiscos.set(i, new Disco(codigo,titulo,autor,ano,genero));
                return true;
            }
        }
        return false;
    }
    public boolean mostrarDiscosAutor(String autor){
        boolean encontrado=false;
        System.out.println("Discos[");
        for (Disco recorrer : listaDiscos) {
            if(recorrer.getAutor().equals(autor)){
                System.out.println("[Codigo:"+recorrer.getCodigo()+"] [Titulo:"+recorrer.getTitulo()+"]" +
                        " [Autor:"+recorrer.getAutor()+"] [Ano:"+recorrer.getAnoPublicacion()+"] [ColeccionMusical.Genero:"+recorrer.getGenero()+"]");
                encontrado=true;
            }
        }
        if(!encontrado){
            System.out.println("No encontrado");
        }
        System.out.println("]");
        return encontrado;

    }
    public boolean mostraDiscosGenero(Genero genero){
        boolean encontrado=false;
        System.out.println("Discos[");
        for (Disco recorrer : listaDiscos) {
            if(recorrer.getGenero().equals(genero)){
                System.out.println("[Codigo:"+recorrer.getCodigo()+"] [Titulo:"+recorrer.getTitulo()+"]" +
                        " [Autor:"+recorrer.getAutor()+"] [Ano:"+recorrer.getAnoPublicacion()+"] [ColeccionMusical.Genero:"+recorrer.getGenero()+"]");
                encontrado=true;
            }
        }
        if(!encontrado){
            System.out.println("No encontrado");
        }
        System.out.println("]");
        return encontrado;
    }
}
