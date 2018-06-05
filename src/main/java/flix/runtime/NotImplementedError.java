package flix.runtime;

import java.util.Objects;

public final class NotImplementedError extends FlixError {

    private ReifiedSourceLocation location;

    public NotImplementedError(ReifiedSourceLocation location) {
        super("Implementation missing at " + location.format());
        this.location = location;
    }

    public ReifiedSourceLocation getLocation() {
        return location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotImplementedError that = (NotImplementedError) o;
        return Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location);
    }

    @Override
    public String toString() {
        return "NotImplementedError{" +
                "location=" + location +
                '}';
    }

}
