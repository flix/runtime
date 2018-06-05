package flix.runtime;

import java.util.Objects;

public final class MatchError extends FlixError {

    private ReifiedSourceLocation location;

    public MatchError(ReifiedSourceLocation location) {
        super("Non-exhaustive match at " + location.format());
        this.location = location;
    }

    public ReifiedSourceLocation getLocation() {
        return location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatchError that = (MatchError) o;
        return Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location);
    }

    @Override
    public String toString() {
        return "MatchError{" +
                "location=" + location +
                '}';
    }

}
