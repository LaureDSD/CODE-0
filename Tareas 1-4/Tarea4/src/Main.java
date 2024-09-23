public class Main {
    public static void main(String[] args) {

        double precio;
        Articulo a1 = new Articulo("pijama",1,4,IVA.REDUCIDO);
        //* a1.nome = "pijama";
        //* a1.iva = 21 ;
        //* a1.precio = 10;
        //* a1.cantidad = 4;

        System.out.println("-----------------------Tipos de iva------------------");
        System.out.println("iva general "+ IVA.GENERAL.getIva());
        System.out.println("iva reducido "+ IVA.REDUCIDO.getIva());
        System.out.println("iva superred "+ IVA.SUPERREDUCIDO.getIva());


        System.out.println("--------------------producto y precio--------------");
        precio=((a1.getPrecio()/100)* a1.getIva())+a1.getPrecio();
        System.out.println(a1.getNome() +" - Precio:"+ a1.getPrecio()+"-IVA:"+ a1.getIva()+"%-PVP:"+precio+"€");


        System.out.println("--------------------Precio con iva y descuento--------------");
        a1.imprime();
        System.out.println("Precio de: " + a1.getPVP() );
        System.out.println("Precio con descuento a1: "+ a1.getPVPDescuento(10));


        System.out.println("--------------------Ventas y almacenamiento--------------");
        a1.vender(5);
        System.out.println(a1.almacenar(1));
    }

}
