package MuyCompleto;

public class ObjetoGenerico<S,E> extends AbsTract {
    private S tipodato1;
    private E tipodato2;





    public ObjetoGenerico(String atributoStringAbs, int atributoNumAbs, S tipodato1, E tipodato2) {
        super(atributoStringAbs, atributoNumAbs);
        this.tipodato1 = tipodato1;
        this.tipodato2 = tipodato2;

    }




    public S getTipodato1() {
        return tipodato1;
    }
    public void setTipodato1(S tipodato1) {
        this.tipodato1 = tipodato1;
    }
    public E getTipodato2() {
        return tipodato2;
    }
    public void setTipodato2(E tipodato2) {
        this.tipodato2 = tipodato2;
    }





    public void restarAtributoNumAbs(int valorRestar){
        //super.restarAtributoNumAbs(valorRestar);
        if(valorRestar<getIntAbstract()){
            System.out.println("Error Obj2");
        }else{
            setIntAbstract(getIntAbstract()-valorRestar);
            System.out.println("Correcto obj2");
        }
    }




    @Override
    public String toString() {
        return "Objet2{" +
                super.toString()+
                " tipodato1=" + tipodato1 +
                ", tipodato2=" + tipodato2 +

                '}';
    }



}
