public class Articulo {

    //FIJOS
    //private final static double ivageneral = 21;
    //private final static double ivareducido = 10;
    //private final static double ivasuperreducido = 4;

    //OBJETO ATRIBUTOS
    private String nome;
    private double precio;
    private int cantidad;
    private IVA iva;
    //private double iva;

    //CONSTRUCTOR
    public Articulo(String nome, double precio, double cantidad, IVA iva) {
     //public Articulo(String nome, double precio, double cantidad, int iva) {
        if(cantidad>=0 && precio>=0){
            this.nome = nome;
            this.precio = precio;
            this.cantidad = (int) cantidad;
            this.iva = iva;
            //this.iva =  iva.getIva();
        }else{
            System.out.println("Datos no validos");
        }
    }


    //GETERS AND SETTERS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        if(precio>=0) {
            this.precio = precio;
        }else{
            System.out.println("error");
        }
    }
    public double getIva() {
        return  iva.getIva();
        //return iva;
    }

    public int getCantidad() {
            return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad>=0) {
            this.cantidad = cantidad;
        }else{
            System.out.println("error");
        }
    }

    //MUESTRA INFORMACION
    public void imprime(){
        System.out.println("Nombre:"+this.nome +" Cantidad:"+ this.cantidad +" Precio:"+ this.precio +" IVA:"+ this.iva);
    }

    //DEVUELVE PRECIO CON IVA

    //public double getPVP(){
     //   return ((this.precio/100)*this.ivageneral)+this.precio;
    //};
    public double getPVP(){
        return ((this.precio/100)* this.iva.getIva())+this.precio;
        //return ((this.precio/100)* this.iva)+this.precio;
    }

    //DEVUELVE PRECIO  CON UN DESCURENTO
    public double getPVPDescuento(int descuento){
        return getPVP()-((getPVP()/100)*descuento);
    }

    //DEVUELVE NUM ARTCULOS TRAS VENTA SI ES POSIBLE
    public void vender(int vender){
        if((this.cantidad-vender)<0){
            System.out.println("No hay suficientes existencias Total: " + this.cantidad);
        }else {
            System.out.print("Articulos restantes " );
            System.out.println(this.cantidad = this.cantidad - vender);
        }
    }

    //DEVUELVE SI SE PEUDE ALMACENAR BOOLEAN
    public boolean almacenar(int almacenar){
        if(almacenar<0){
            return false;
        }else{
            this.cantidad=this.cantidad+almacenar;
            return true;
        }
    }

}
