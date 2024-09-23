package enums;
public enum Color {
    RESET("\u001B[0m"),
    ROJO("\u001B[31m"),
    AZUL("\u001B[34m"),
    VERDE("\u001B[32m"),
    NEGRO("\u001B[33m");
    private String color;
    Color(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}