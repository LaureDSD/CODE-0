package jugadores;

import java.util.Objects;

public class Jugador{
    private String nombre;
    private double saldo;

    public Jugador(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
