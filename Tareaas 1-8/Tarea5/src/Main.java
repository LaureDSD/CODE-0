public class Main {
    public static void main(String[] args) {
        AdivinarNumero juego1 = new AdivinarNumero();
        Dados juego2 = new Dados();

        // Lógica para iniciar, jugar y finalizar el juego
        juego1.iniciar();
        juego1.jugar();
        juego1.finalizar();

        juego2.iniciar();
        juego2.jugar();
        juego2.finalizar();
    }
}


