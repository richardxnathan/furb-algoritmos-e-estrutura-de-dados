package exception;

public class FilaCheiaException extends RuntimeException {

    public FilaCheiaException() {
        super("A fila está cheia.");
    }
    
}