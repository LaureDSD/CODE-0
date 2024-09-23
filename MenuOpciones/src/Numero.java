import java.util.Random;
public class Numero {

    //Atributos
    private int valor;

    //Constructores
    public Numero() {
        Random aleatorio = new Random();
        this.valor = aleatorio.nextInt(-10000,10000);
    }
    public Numero(int valor) {
        this.valor = valor;
    }

    //G&S
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

    //Metodos
    public boolean esPar (){
        if(this.valor%2==0){
            return true;
        }else{
            return false;
        }
    }
    public boolean esPositivo (){
        if(this.valor>=0){
            return true;
        }else{
            return false;
        }
    }
    public boolean esPrimo (){
        int a=2;

        while (a <= Math.sqrt(valor)) {
            if (valor % a == 0) {
                return false;
            }
            a++;
        }
        return true;
    }
    private int sumaDivisores(){
        int sumadivididos = 0;
        for(int a=1 ;a<this.valor;a++){
            if(this.valor%a==0){
                sumadivididos +=1;
            }
        }
        return sumadivididos;
    }
    public boolean esPerfecto (){
        if(6==this.valor||28==this.valor||496==this.valor||8128==this.valor){
        //if(sumaDivisores()==this.valor){
            return true;
        }else{
            return false;
        }
    }
    boolean esAmigo (Numero n){
        boolean amigo;
        if (this.valor==n.sumaDivisores()) {
            if(n.valor== sumaDivisores()){
                amigo = true;
            }else{
                amigo = false;
            }
        }else{
            amigo = false;
        }
        return amigo;
    }
    public void mostrarInformacion (){
        System.out.println("Numero: "+ this.valor
                +"  Es par: "+this.esPar()
                +"  Es positivo: "+this.esPositivo()
                +"  Es Pimo: "+this.esPrimo());
    }
}
