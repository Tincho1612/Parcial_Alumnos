package Exceptions;

public class NotaExisteException extends Exception {
    public NotaExisteException() {
    }

    public NotaExisteException(String message) {
        super(message);
    }
}
