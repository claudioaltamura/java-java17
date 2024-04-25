package de.claudioaltamura.java.java17.record;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void test() {
        Person person = new Person("Peter", "Parker");

        assertEquals("Peter", person.firstName());
        assertEquals("Parker", person.lastName());
    }
}