package by.bsu.lab3.exception;

public class LenghtNumbException extends Exception {
    public LenghtNumbException() {
    }

    public LenghtNumbException(String message) {
        super(message);
    }

    public LenghtNumbException(String message, Throwable cause) {
        super(message, cause);
    }

    public LenghtNumbException(Throwable cause) {
        super(cause);
    }

    public LenghtNumbException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
