package flix.runtime.value;

public final class Unit {

    private static Unit INSTANCE = new Unit();

    private Unit() {
        /* private constructor */
    }

    public static Unit getInstance() {
        return INSTANCE;
    }

    @Override
    public String toString() {
        return "()";
    }

}
