package enums;
public enum Palo {
    CORAZONES(Color.ROJO),
    DIAMANTES(Color.AZUL),
    TREBOLES(Color.VERDE),
    PICAS(Color.NEGRO);
    private Color color;
    Palo(Color color) {
        this.color = color;
    }
}