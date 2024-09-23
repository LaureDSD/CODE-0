package MuyCompleto;

public abstract class AbsTract {

    //Atributos
    private String stringAbstract;
    private int intAbstract;

    //Contructor
    public AbsTract(String atributoStringAbs, int atributoNumAbs) {
        this.stringAbstract = atributoStringAbs;
        this.intAbstract = atributoNumAbs;
    }

    //Getters y setters
    public String getStringAbstract() {
        return stringAbstract;
    }
    public void setStringAbstract(String stringAbstract) {
        this.stringAbstract = stringAbstract;
    }
    public int getIntAbstract() {
        return intAbstract;
    }
    public void setIntAbstract(int intAbstract) {
        this.intAbstract = intAbstract;
    }

    //Metodo normal
    public void aumentarAtributoNumAbs(int valorSumar) {
        this.intAbstract += valorSumar;
        System.out.println("se sumo valor a valorNumAbs con atribto string"+ stringAbstract);
    }

    //Metodo abstracto
    public void restarAtributoNumAbs(int valorRestar){}

    @Override
    public String toString() {
        return "MuyCompleto.AbsTract{"+"SA='" + stringAbstract +'\''+",NA="+intAbstract+'}';
    }

}
