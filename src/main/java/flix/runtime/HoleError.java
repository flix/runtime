package flix.runtime;

import java.util.Objects;

public final class HoleError extends FlixError {

    private String hole;
    private ReifiedSourceLocation location;

    public HoleError(String hole, ReifiedSourceLocation location) {
        super("Hole '" + hole + "' at " + location.format());
        this.hole = hole;
        this.location = location;
    }

    public String getHole() {
        return hole;
    }

    public ReifiedSourceLocation getLocation() {
        return location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HoleError holeError = (HoleError) o;
        return Objects.equals(hole, holeError.hole) &&
                Objects.equals(location, holeError.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hole, location);
    }

    @Override
    public String toString() {
        return "HoleError{" +
                "hole='" + hole + '\'' +
                ", location=" + location +
                '}';
    }

}
