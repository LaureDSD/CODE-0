package MuyCompleto;

public class ObjetoListsConExceptions extends AbsTract implements InterFaceEjemplo {
    private String atributoStringObj1;
    private int atributoNumObj1;
    private SubObjetoCompareTo[] listaSubobjetos;
    private static final int MAX_SUBOBJETOS = 10;
    private EnumEjemplo valorEnum;






    public ObjetoListsConExceptions(String atributoStringAbs, int atributoNumAbs, String atributoStringObj1, int atributoNumObj1, SubObjetoCompareTo objeto) {
        super(atributoStringAbs, atributoNumAbs);
        listaSubobjetos = new SubObjetoCompareTo[MAX_SUBOBJETOS];
        listaSubobjetos[0]=objeto;
        this.valorEnum= EnumEjemplo.ENUMEDEFAULT;
        this.atributoStringObj1 = atributoStringObj1;
        this.atributoNumObj1 = atributoNumObj1;
    }


    public boolean buscar (SubObjetoCompareTo o){


    }




    public StringBuilder testBuilder(){
        StringBuilder unirCadenas = new StringBuilder();
        unirCadenas.append("Cadena ").append("Texto");
        System.out.println(unirCadenas);
      return unirCadenas;
    };





    public void setListaSubobjetos(SubObjetoCompareTo[] listaSubobjetos) {
        this.listaSubobjetos = listaSubobjetos;
    }
    public EnumEjemplo getValorEnum() {
        return valorEnum;
    }
    public void setValorEnum(EnumEjemplo valorEnum) {
        this.valorEnum = valorEnum;
    }
    public String getAtributoStringObj1() {
        return atributoStringObj1;
    }
    public void setAtributoStringObj1(String atributoStringObj1) {
        this.atributoStringObj1 = atributoStringObj1;
    }
    public int getAtributoNumObj1() {
        return atributoNumObj1;
    }
    public void setAtributoNumObj1(int atributoNumObj1) {
        this.atributoNumObj1 = atributoNumObj1;
    }
    public SubObjetoCompareTo[] getListaSubobjetos() {
        return listaSubobjetos;
    }






    //Muy util
    public void setSubobjeto(SubObjetoCompareTo listaSubobjetos) {
        int i=0;
        while(i< MAX_SUBOBJETOS && this.listaSubobjetos[i]!=null) {
            i++;
        }
        if(i!=MAX_SUBOBJETOS) {
            this.listaSubobjetos[i] = listaSubobjetos;
        }else{
            System.out.println("Limite 10");
        }
        }





    //Metodo abstract heredado
    @Override
    public void restarAtributoNumAbs(int valorRestar) {
        //super.restarAtributoNumAbs(valorRestar);
        if(valorRestar> getIntAbstract()){
            System.out.println("Error Obj1");
        }else{
            setIntAbstract(getIntAbstract()-valorRestar);
            System.out.println("Correcto Obj2");
        }
    }





    //Metodo interface
    @Override
    public void mejora(int valor) {
        this.atributoNumObj1+=valor;
    }






    //Metodo interface obligatorio
    @Override
    public double sinUsar() {
        return 0;
    }





    //To string con stringbuilder
    @Override
    public String toString() {
        StringBuilder objet = new StringBuilder();
        objet.append("Objet1[ "+super.toString() +" SO1='" + atributoStringObj1 +'\''+" NO1=" + atributoNumObj1 +" SubObjetos[ ");
                for(SubObjetoCompareTo so : listaSubobjetos){
                    if(so!=null){
                        objet.append("\n"+so);
                    }
                }
                objet.append("\n ] VE=" + valorEnum+
                "]");
        return objet.toString();
    }
}
