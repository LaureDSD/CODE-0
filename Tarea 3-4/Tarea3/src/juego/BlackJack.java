package juego;
import cartas.Mano;
import cartas.Baraja;
import cartas.Carta;
import enums.Valor;
import jugadores.Crupier;
import jugadores.Jugador;
import java.util.*;

public class BlackJack {
    private Baraja baraja;

    //private HashMap<Jugador, Perfil> apuestas;
    //Perfil, clase que contiene apuesta, mano y estado
    private HashMap<Jugador, Double> apuestas;
    private HashMap<Jugador, Mano> manos;
    private HashMap<Jugador,Boolean> plantados;
    private Crupier crupier;
    private Mano manoCrupier;


    ////////////////////////////////////INICIO/////////////////////////////////////////////////
    public BlackJack() {
        this.baraja = new Baraja();
        this.apuestas = new HashMap<>();
        this.manos = new HashMap<>();
        for (int i = 0; i < 6; i++) {
            baraja.anadirBaraja();
        }
        baraja.barajarCartas();
        this.plantados = new HashMap<>();
        //this.crupier = new Crupier();
        this.manoCrupier = new Mano();
    }
    ////////////////////////////////////////GETTERS Y SETTERS //////////////////////////////////////////////
    public Baraja getBaraja() {
        return baraja;
    }

    public void setBaraja(Baraja baraja) {
        this.baraja = baraja;
    }

    public HashMap<Jugador, Double> getApuestas() {
        return apuestas;
    }

    public void setApuestas(HashMap<Jugador, Double> apuestas) {
        this.apuestas = apuestas;
    }

    public HashMap<Jugador, Mano> getManos() {
        return manos;
    }

    public void setManos(HashMap<Jugador, Mano> manos) {
        this.manos = manos;
    }

    public HashMap<Jugador, Boolean> getPlantados() {
        return plantados;
    }
    public void setPlantados(HashMap<Jugador, Boolean> plantados) {
        this.plantados = plantados;
    }

    ////////////////////////////////////////ANADIR JUGADOR//////////////////////////////////////////////
    public boolean añadirJugador(Jugador j) {
        if (!apuestas.containsKey(j) && !manos.containsKey(j)) {
            apuestas.put(j, (double) 0);
            manos.put(j, new Mano());
            pedir(j);
            pedir(j);
            return true;
        } else {
            return false;
        }
    }
    ////////////////////////////////////////APOSTAR//////////////////////////////////////////////
    public boolean apostar(Jugador j, double cantidad) {
        if (apuestas.containsKey(j)) {
            if (j.getSaldo() > cantidad) {
                j.setSaldo(j.getSaldo() - cantidad);
                apuestas.put(j, cantidad);
                plantados.put(j,false);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    /////////////////////////////////////////PEDIR CARTAS/////////////////////////////////////////////////
    public boolean pedir(Jugador j) {

        Random posicion = new Random();
        int p = posicion.nextInt(0, baraja.getCartas().size());
        Carta carta = baraja.getCartas().get(p);
        baraja.getCartas().remove(p);

        if (j instanceof Crupier) {
            manoCrupier.añadirCartaMano(carta);
            return true;
        } else {
            manos.get(j).añadirCartaMano(carta);
            if (valorCartas(j) > 21) {
                //Abandona Derrota
                return false;
            } else {
                return true;
            }
        }
    }
    /////////////////////////////////////////////MOSTRAR CARTAS/////////////////////////////////////////////
    public void mostrarCartas(Jugador j) {

        if (j instanceof Crupier) {
            for (Carta m : manoCrupier.getCartas()) {
                System.out.println("Carta Crupier" + m);
            }
        } else {
            mostrarCartasOcultas(j);
        }
    }

    public void mostrarCartasOcultas(Jugador j) {
        Iterator leer = manos.get(j).getCartas().iterator();
        while (leer.hasNext()) {
            Carta c = (Carta) leer.next();
            System.out.println(c.toString());
        }
    }
    ///////////////////////////////////////////ABANDONAR///////////////////////////////////////////////
    public void abandonar(Jugador j) {
        if (valorCartas(j) > 21) {
            apuestas.remove(j);
            manos.remove(j);
            plantados.remove(j);
        } else {
            j.setSaldo(j.getSaldo() + apuestas.get(j));
            apuestas.remove(j);
            manos.remove(j);
            plantados.remove(j);
        }
    }
    /////////////////////////////////////////PLANTARSE/////////////////////////////////////////////////
    public void plantarse(Jugador j) {
        plantados.put(j,true);
    }

    /////////////////////////////////////////VALOR/////////////////////////////////////////////////
    public int valorCartas(Jugador j) {
        return calcularValorManoCartas(manos.get(j));
    }

    private int calcularValorManoCartas(Mano man) {
        int contadorAS = 0;
        int suma = 0;
        for (Carta c : man.getCartas()) {
            if (c.getValor().equals(Valor.AS)) {
                contadorAS += 1;
            }
            suma = suma + c.getValor().getValor();
            while (suma > 21 && contadorAS > 0) {
                suma -= 10;
            }
        }
        return suma;
    }
    //////////////////////////////////////////////////////////////////////////////////////////

/*
        crupier:
        si crupier saca 17 o 21 se planta
        si crupier tiene menos de 16 pide
        si crupier supera 21 y algun jugador tiene menos de 22 pierde

        si jugador gana , recive 3:2 de lo apostado
        si jugador supera 21 pierde o saca menos que crupier,abandona la partida

*/
    public boolean todosPlantan(){
     if(plantados.containsValue(false)){
         return false;
     }else{
        return  true;
     }
    }

    public boolean finPartida() {

        int valorCartaCrupier = calcularValorManoCartas(manoCrupier);
        System.out.println("Resultado");
        //Validar jugadores
        if (!manos.isEmpty()) {
            //Jugada de crupier
            //Pedir
            while (calcularValorManoCartas(manoCrupier) <= 16) {
                pedir(crupier);
                valorCartaCrupier = calcularValorManoCartas(manoCrupier);
            }
            //Plantarse
            if (valorCartaCrupier == 17 || valorCartaCrupier == 21) {
                System.out.println("Crupier se planta");
            }
            victoriasDerrotas(valorCartaCrupier);
            if(manos.isEmpty()){
                return true;
            }
        } else {
            System.out.println("Gana crupier");
            return true;
        }
        return false;
    }


    private void victoriasDerrotas(int valorManoCrupier) {
        System.out.println("Final");
        //Recorrer jugadores validar partida
        for (Map.Entry<Jugador, Mano> j : manos.entrySet()) {
            int valorCartaJugador = calcularValorManoCartas(j.getValue());

            //Derrota
            if (valorManoCrupier < 22 && valorCartaJugador < valorManoCrupier) {
                //Empate
            } else if (valorManoCrupier == 21 && valorCartaJugador == valorManoCrupier) {
                System.out.println("Empate" + j.getKey());
                System.out.println(" Apostado : "+ apuestas.get(j.getKey() ));
                j.getKey().setSaldo( j.getKey().getSaldo() + (apuestas.get( j.getKey()))      );
                System.out.println("Nuevo saldo: "+j.getKey().getSaldo());
                //Jugadot gana
            } else if (valorManoCrupier > 21 && valorCartaJugador < 22) {
                System.out.println("Victoria" + j.getKey());
                System.out.println(" Apostado : "+ apuestas.get(j.getKey() ));
                j.getKey().setSaldo( j.getKey().getSaldo() + (apuestas.get( j.getKey())+apuestas.get( j.getKey())/2)      );
                System.out.println("Nuevo saldo: "+j.getKey().getSaldo());
            }
            abandonar(j.getKey());
        }
    }
}
