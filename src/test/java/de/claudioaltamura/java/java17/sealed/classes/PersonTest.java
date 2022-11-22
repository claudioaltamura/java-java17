package de.claudioaltamura.java.java17.sealed.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void test() {
        Person person = new Person("Peter", 28, new Male());

        assertEquals("Peter", person.name());
        assertTrue(person.gender() instanceof Male);
    }
}
