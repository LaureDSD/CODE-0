public enum Tipo_Enum {
    LIBRO(1),
    REVISTA(2),
    PERIODICO(3);

    //Variables de enum
    private final int codigo;

    Tipo_Enum(int valorEnu) {
        this.codigo = valorEnu;
    }

    public int getCodigo() {
        return codigo;
    }
}
