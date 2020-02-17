package flix.runtime;

public final class JvmOps {

    /**
     * Returns the `null` value.
     */
    public static Object getNull() {
        return null;
    }

    /**
     * Throws a `RuntimeException` with the given `message`.
     */
    public static void throwRuntimeException(String message) {
        throw new RuntimeException(message);
    }

}
