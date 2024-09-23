package MuyCompleto;

public enum EnumEjemplo {
    //Listado
    ENUM1(1,2),
    ENUM2(2,3),
    ENUM3(3,4),
    ENUMEDEFAULT(4,5);



    //Variables de enum
    private final int valorEnu;
    private final int valorEnu2;



    //Constructor
    EnumEjemplo(int enu, int enu2) {
        this.valorEnu = enu;
        this.valorEnu2 = enu2;
    }



    //Getters
    public int getValorEnu() {
        return valorEnu;
    }
    public int getValorEnu2() {
        return valorEnu2;
    }
}
