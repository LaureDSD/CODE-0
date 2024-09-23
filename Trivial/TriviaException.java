import java.io.FileNotFoundException;
import java.io.IOException;

public class TriviaException extends FileNotFoundException {
    public TriviaException(String mensaje) {
        super(mensaje);
    }
}
