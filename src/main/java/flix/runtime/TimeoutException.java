package flix.runtime;

import java.time.Duration;

public final class TimeoutException extends FlixException {

    private Duration timeout;
    private Duration elapsed;

    public TimeoutException(Duration timeout, Duration elapsed) {
        super("Timeout. Elapsed: " + elapsed + ", limit: " + timeout);
        this.timeout = timeout;
        this.elapsed = elapsed;
    }
}
