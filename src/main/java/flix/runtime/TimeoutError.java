package flix.runtime;

import java.time.Duration;
import java.util.Objects;

public final class TimeoutError extends FlixError {

    private Duration timeout;
    private Duration elapsed;

    public TimeoutError(Duration timeout, Duration elapsed) {
        super("Timeout exceeded: " + timeout);
        this.timeout = timeout;
        this.elapsed = elapsed;
    }

    public Duration getTimeout() {
        return timeout;
    }

    public Duration getElapsed() {
        return elapsed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeoutError that = (TimeoutError) o;
        return Objects.equals(timeout, that.timeout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeout);
    }

    @Override
    public String toString() {
        return "TimeoutError{" +
                "timeout=" + timeout +
                ", elapsed=" + elapsed +
                '}';
    }

}
