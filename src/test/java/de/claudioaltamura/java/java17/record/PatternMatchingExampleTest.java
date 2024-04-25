package de.claudioaltamura.java.java17.record;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatternMatchingExampleTest {

    @Test
    void string() {
        PatternMatchingExample example = new PatternMatchingExample();

        assertEquals("HELLO", example.toUppercase("hello"));
    }

    @Test
    void nonString() {
        PatternMatchingExample example = new PatternMatchingExample();

        assertEquals("", example.toUppercase(42));
    }
}