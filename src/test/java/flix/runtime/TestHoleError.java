package flix.runtime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class TestHoleError {

    @Test
    void testEquals01() {
        ReifiedSourceLocation loc1 = new ReifiedSourceLocation("foo.flix", 1, 1, 1, 2);
        ReifiedSourceLocation loc2 = new ReifiedSourceLocation("foo.flix", 1, 1, 1, 2);
        HoleError ex1 = new HoleError("hole", loc1);
        HoleError ex2 = new HoleError("hole", loc2);
        assertEquals(ex1, ex2);
    }

    @Test
    void testNotEquals01() {
        ReifiedSourceLocation loc1 = new ReifiedSourceLocation("foo.flix", 1, 1, 1, 2);
        ReifiedSourceLocation loc2 = new ReifiedSourceLocation("bar.flix", 2, 1, 2, 2);
        HoleError ex1 = new HoleError("hole", loc1);
        HoleError ex2 = new HoleError("hole", loc2);
        assertNotEquals(ex1, ex2);
    }

}
