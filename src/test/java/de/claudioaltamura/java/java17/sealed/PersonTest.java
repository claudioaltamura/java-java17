package de.claudioaltamura.java.java17.sealed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void test() {
        Person person = new Person("Peter", 28, new Male());

        assertEquals("Peter", person.name());
        assertEquals(new Male(), person.gender());
    }
}
