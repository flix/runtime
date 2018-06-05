package flix.runtime;

import java.util.Objects;

public final class RuleError extends FlixError {

    private ReifiedSourceLocation location;

    public RuleError(ReifiedSourceLocation location) {
        super("Integrity rule violation at " + location.format());
        this.location = location;
    }

    public ReifiedSourceLocation getLocation() {
        return location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RuleError ruleError = (RuleError) o;
        return Objects.equals(location, ruleError.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location);
    }

    @Override
    public String toString() {
        return "RuleError{" +
                "location=" + location +
                '}';
    }

}
