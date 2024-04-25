package de.claudioaltamura.java.java17.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TeeingExampleTest {

    @Test
    void mean() {
        assertEquals(3.0d, TeeingExample.mean(Stream.of(1, 2, 3, 4, 5)));
    }
}