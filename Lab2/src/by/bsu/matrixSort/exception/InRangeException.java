package by.bsu.matrixSort.exception;

public class InRangeException extends Exception {
    public InRangeException() {
    }

    public InRangeException(String message) {
        super(message);
    }

    public InRangeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InRangeException(Throwable cause) {
        super(cause);
    }

    public InRangeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
