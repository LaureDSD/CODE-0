import java.util.Random;
import java.util.Scanner;

public class Dados implements Juego{
    private String jugador1,jugador2;
    private int dado1,dado2;
    public void iniciar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre de los jugadores:");
        jugador1 = teclado.next();
        jugador2 = teclado.next();
        }
    public void jugar() {
        Random aleatorio = new Random();
        dado1 = aleatorio.nextInt(0, 7);
        dado2 = aleatorio.nextInt(0, 7);
        System.out.println(jugador1+" obtiene:"+dado1);
        System.out.println(jugador2+" obtiene:"+dado2);
    }
    public void finalizar(){
        if(dado1>dado2){
            System.out.println("Ganador jugador "+jugador1+" con:"+dado1);
        }else if(dado2>dado1){
            System.out.println("Ganador jugador "+jugador2+" con:"+dado2);
        }else{
            System.out.println("Empate");
        }
    }
}
