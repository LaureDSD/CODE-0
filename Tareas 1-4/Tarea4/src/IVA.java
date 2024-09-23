public enum IVA {
    GENERAL(21),
    REDUCIDO(10),
    SUPERREDUCIDO(4);
    private final int iva;
    IVA(int iva) {
        this.iva = iva;
    }
    public int getIva() {
        return iva;
    }
}
