public class Main {
    public static void main(String[] args) {
        Libro quijote = new Libro("Don quijote", "Cerbantes", 1605, 5);
        Libro lazarillo = new Libro("Lazarillo de Tormes","Anonimo", 1552, 0);
        Libro outro = new Libro();

        /*  Libro lazarillo = new Libro();
        lazarillo.titulo ="Lazarillo de Tormes";
        lazarillo.autor="Anonimo";
        lazarillo.anoPublicacion = 1552;
        lazarillo.ejemplares = 0;  */

        System.out.println("Libro 1");
        //System.out.println(quijote.titulo + " - " + quijote.autor);

        System.out.println("Libro 2");
        ///System.out.println(lazarillo.titulo + " - " + quijote.autor);

        quijote.mostrar();
        lazarillo.mostrar();

        lazarillo.setEjemplares(7);

        if (!lazarillo.disponible()){
            System.out.println("No disponible");
        }else{
            System.out.println("Disponible");
        }
    }
}