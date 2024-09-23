import juego.BlackJack;
import jugadores.Jugador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Jugadores
        Jugador j1 = new Jugador("Pepe",10);
        Jugador j2 = new Jugador("Maria",100);
        Jugador j3 = new Jugador("Suso",1000);

        do{
            System.out.println("XXXXXXX CASINO XXXXXXX");

            //Iniciar partida
            BlackJack partida1 = new BlackJack();

            //Añadir
            System.out.println("Anadir");
            System.out.println(partida1.getApuestas());
            System.out.println(partida1.getManos());

            partida1.añadirJugador(j1);
            System.out.println(partida1.getApuestas());
            partida1.apostar(j1,9);

            partida1.añadirJugador(j2);
            partida1.apostar(j2,5);
            System.out.println(partida1.getApuestas());

            partida1.añadirJugador(j3);
            partida1.apostar(j3,5);
            System.out.println(partida1.getApuestas());

            //Jugar partida
            System.out.println("Pedir");
            partida1.pedir(j1);
            partida1.pedir(j2);
            partida1.pedir(j3);
            partida1.pedir(j3);
            partida1.mostrarCartas(j1);
            partida1.mostrarCartas(j2);
            partida1.mostrarCartas(j3);

            System.out.println("Abandonar");
            System.out.println(partida1.getManos());
            partida1.abandonar(j2);
            System.out.println(partida1.getManos());
            partida1.plantarse(j1);
            System.out.println(partida1.getPlantados());
            partida1.plantarse(j3);
            System.out.println(partida1.getPlantados());
            partida1.abandonar(j3);

            //Resultados
            System.out.println("Resultado Partida");
            if(partida1.todosPlantan()){
                if(partida1.finPartida()){
                    System.out.println("Crupier Gana");
                }
            }
            System.out.println(j1);
            System.out.println(j2);
            System.out.println(j3);

            //Reiniciar
            System.out.println("Jugar de nuevo?");
        }while (false);
    }
}