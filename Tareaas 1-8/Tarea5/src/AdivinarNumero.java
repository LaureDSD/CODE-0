import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero implements Juego {
    private int numeroSecreto;
    private boolean acertado;

    public void iniciar() {
        Random aleatorio = new Random();
        numeroSecreto = aleatorio.nextInt(0, 11);
        acertado =false;
    }

    public void jugar() {
        Scanner teclado = new Scanner(System.in);
        int intentos = 3, numeroIntroducido;

        do {
            System.out.println("Adivina el número: ");
            numeroIntroducido = teclado.nextInt();
           if(numeroIntroducido==numeroSecreto){
               acertado=true;
           }else{
               intentos--;
           }
        } while (!acertado && intentos > 0);
        //teclado.close();
    }

    public void finalizar() {
        if (acertado) {
            System.out.println("Victoria");
        } else {
            System.out.println("Derrota");
        }
    }
}
