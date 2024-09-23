package juegoCartas;
import juegoCartas.Palo;
import juegoCartas.Valor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;

public class Carta implements Comparable<Carta> {
     Valor valor;
     Palo palo;

     public Carta() {

          /*
          ArrayList<Valor> valores = new ArrayList<>();
          Collections.addAll(valores, Valor.values());
          this.valor = valores.get(a.nextInt(0,valores.size()));

          ArrayList<Palo> palos = new ArrayList<>();
          Collections.addAll(palos, Palo.values());
          this.palo = palos.get(a.nextInt(0,palos.size()));
          */
          // o
          Random a = new Random();
          this.valor=Valor.values()[a.nextInt(0,Valor.values().length)];
          this.palo=Palo.values()[a.nextInt(0,Palo.values().length)];

     }

     public Carta(Valor valor, Palo palo) {
          this.valor = valor;
          this.palo = palo;
     }

     public Valor getValor() {
          return valor;
     }

     public void setValor(Valor valor) {
          this.valor = valor;
     }

     public Palo getPalo() {
          return palo;
     }

     public void setPalo(Palo palo) {
          this.palo = palo;
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Carta carta = (Carta) o;
          return valor == carta.valor && palo == carta.palo;
     }

     @Override
     public int hashCode() {
          return Objects.hash(valor, palo);
     }


     public int compareTo(Carta g) {
          if(this.palo.equals(g.getPalo())) {
               return (this.valor).compareTo(g.getValor());
          }
          return (this.palo).compareTo(g.getPalo());


     }


     @Override
     public String toString() {
          return "Carta{" +
                  "valor=" + valor +
                  ", palo=" + palo +
                  '}';
     }
}
