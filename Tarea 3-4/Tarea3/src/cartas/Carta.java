package cartas;
import enums.Palo;
import enums.Valor;

import java.util.Objects;
public class Carta implements Comparable<Carta>{
    private Palo palo;
    private Valor valor;
    public Carta(Valor valor, Palo palo) {
        this.valor = valor;
        this.palo = palo;
    }
    public Palo getPalo() {
        return palo;
    }
    public void setPalo(Palo palo) {
        this.palo = palo;
    }
    public Valor getValor() {
        return valor;
    }
    public void setValor(Valor valor) {
        this.valor = valor;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carta carta = (Carta) o;
        return palo == carta.palo && valor == carta.valor;
    }
    @Override
    public int hashCode() {
        return Objects.hash(palo, valor);
    }

    @Override
    public int compareTo(Carta o) {
        return this.palo.equals(o.getPalo()) ? this.valor.compareTo(o.getValor()) : this.palo.compareTo(o.getPalo());
    }
    @Override
    public String toString() {
        return "enums.Palo=" + palo + " enums.Valor=" + valor;
    }
}
