package flix.runtime;

// TODO: Add source location information.

public abstract class FlixException extends RuntimeException {
    public FlixException(String message) {
        super(message);
    }
}
