package flix.runtime;

public abstract class FlixError extends RuntimeException {

    public FlixError(String message) {
        super(message);
    }

}
