package enums;
public enum Valor {
    J(10),
    Q(10),
    K(10),
    AS(11),
    DOS(2),
    TRES(3),
    CUATRO(4),
    CINCO(5),
    SEIS(6),
    SIETE(7),
    OCHO(8),
    NUEVE(9),
    DIEZ(10);
    private int valor;
    Valor(int valor) {
        this.valor = valor;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
}