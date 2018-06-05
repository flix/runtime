package flix.runtime;

import java.util.Objects;

public final class SwitchError extends FlixError {

    private ReifiedSourceLocation location;

    public SwitchError(ReifiedSourceLocation location) {
        super("Non-exhaustive switch at " + location.format());
        this.location = location;
    }

    public ReifiedSourceLocation getLocation() {
        return location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SwitchError that = (SwitchError) o;
        return Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location);
    }

    @Override
    public String toString() {
        return "SwitchError{" +
                "location=" + location +
                '}';
    }

}
