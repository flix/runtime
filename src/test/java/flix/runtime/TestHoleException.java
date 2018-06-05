package flix.runtime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestHoleException {

    @Test
    void testEquals01() {
        HoleException ex1 = new HoleException("msg1");
        HoleException ex2 = new HoleException("msg1");
        assertEquals(ex1, ex2);
    }

}
